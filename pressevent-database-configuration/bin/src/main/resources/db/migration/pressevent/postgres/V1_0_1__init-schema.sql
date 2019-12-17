SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

CREATE TABLE public.contact (
    id bigint NOT NULL,
    adresse character varying(255),
    code_postale character varying(255),
    complement_adresse character varying(255),
    num_rue character varying(255),
    pays_id bigint NOT NULL,
    ligne_id bigint NOT NULL,
    ville character varying(255),
    pays character varying(255),
    birth_date date,
    civility integer,
    email character varying(80) NOT NULL,
    landline character varying(50),
    mobile character varying(50),
    nom character varying(50) NOT NULL,
    picture bytea,
    prenom character varying(50) NOT NULL,
    profession_id bigint,
    pdv character varying(50),
    level character varying(50),
    created_by character varying(50) NOT NULL,
    created_date timestamp without time zone NOT NULL,
    last_modified_by character varying(50),
    last_modified_date timestamp without time zone
);


CREATE SEQUENCE public.contact_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


CREATE TABLE public.langue (
    id bigint NOT NULL,
    code character varying(256) NOT NULL,
    defaut boolean NOT NULL
);

CREATE TABLE public.ligne (
    id bigint NOT NULL,
    libelle character varying(256) NOT NULL,
    code character varying(256) NOT NULL
);

CREATE TABLE public.password_reset_token (
    id bigint NOT NULL,
    expiry_date timestamp without time zone,
    token character varying(255),
    user_id bigint NOT NULL,
    created_by character varying(50) NOT NULL,
    created_date timestamp without time zone NOT NULL,
    last_modified_by character varying(50),
    last_modified_date timestamp without time zone
);


CREATE SEQUENCE public.password_reset_token_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public.pays (
    id bigint NOT NULL,
    code character varying(256) NOT NULL,
    libelle character varying(256) NOT NULL,
    langue_id bigint NOT NULL
);

CREATE TABLE public.permission (
    permission_id bigint NOT NULL,
    description character varying(256),
    entity character varying(255) NOT NULL,
    role character varying(255) NOT NULL,
    created_by character varying(50) NOT NULL,
    created_date timestamp without time zone NOT NULL,
    last_modified_by character varying(50),
    last_modified_date timestamp without time zone
);


CREATE SEQUENCE public.permission_permission_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public.profession (
    id bigint NOT NULL,
    nom character varying(50) NOT NULL
);


CREATE SEQUENCE public.profession_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


CREATE TABLE public.profile (
    profile_id bigint NOT NULL,
    codemetier character varying(255) NOT NULL,
    description character varying(256),
    created_by character varying(50) NOT NULL,
    created_date timestamp without time zone NOT NULL,
    last_modified_by character varying(50),
    last_modified_date timestamp without time zone
);

CREATE TABLE public.profile_permission (
    profile_id bigint NOT NULL,
    permission_id bigint NOT NULL
);

CREATE SEQUENCE public.profile_profile_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public.saved_search (
    id integer NOT NULL,
    form_classname character varying(256) NOT NULL,
    form_content oid,
    name character varying(128) NOT NULL,
    user_id bigint
);


CREATE SEQUENCE public.saved_search_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE public."user" (
    id bigint NOT NULL,
    enabled boolean NOT NULL,
    login character varying(50) NOT NULL,
    nb_attempts integer,
    non_locked boolean NOT NULL,
    password character varying(64) NOT NULL,
    contact_id bigint NOT NULL,
    profile_id bigint,
    created_by character varying(50) NOT NULL,
    created_date timestamp without time zone NOT NULL,
    last_modified_by character varying(50),
    last_modified_date timestamp without time zone
);

CREATE SEQUENCE public.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

    
CREATE TABLE public.METADATA( 
      id BIGINT NOT NULL,
     ENTITYNAME character varying(256) NOT NULL,
     TYPEATTR character varying(256) NOT NULL,
     NOMATTR character varying(256) NOT NULL,
    KEYLABEL character varying(256) NOT NULL ,
    COLUMN_NAME character varying(255),
     created_by character varying(50) NOT NULL,
    created_date timestamp without time zone NOT NULL,
    last_modified_by character varying(50),
    last_modified_date timestamp without time zone
);

CREATE TABLE public.EXPORT_CONFIGURATION(
     id BIGINT NOT NULL,
     code character varying(50),
     cible character varying(50),
     pays character varying(20),
     ligne character varying(20),
     rules text, 
     sqlfilters text,
     jobname character varying(50),
     filename character varying(80),
     created_by character varying(50) NOT NULL,
     created_date timestamp without time zone NOT NULL,
     last_modified_by character varying(50),
     last_modified_date timestamp without time zone
);

CREATE SEQUENCE public.export_configuration_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE ONLY public.contact ALTER COLUMN id SET DEFAULT nextval('public.contact_id_seq'::regclass);

ALTER TABLE ONLY public.password_reset_token ALTER COLUMN id SET DEFAULT nextval('public.password_reset_token_id_seq'::regclass);

ALTER TABLE ONLY public.permission ALTER COLUMN permission_id SET DEFAULT nextval('public.permission_permission_id_seq'::regclass);

ALTER TABLE ONLY public.profession ALTER COLUMN id SET DEFAULT nextval('public.profession_id_seq'::regclass);

ALTER TABLE ONLY public.profile ALTER COLUMN profile_id SET DEFAULT nextval('public.profile_profile_id_seq'::regclass);

ALTER TABLE ONLY public.saved_search ALTER COLUMN id SET DEFAULT nextval('public.saved_search_id_seq'::regclass);

ALTER TABLE ONLY public."user" ALTER COLUMN id SET DEFAULT nextval('public.user_id_seq'::regclass);

ALTER TABLE ONLY public.export_configuration ALTER COLUMN ID set default nextval('public.export_configuration_id_seq'::regclass);

ALTER TABLE ONLY public.contact ADD CONSTRAINT contact_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.password_reset_token
    ADD CONSTRAINT password_reset_token_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.permission
    ADD CONSTRAINT permission_pkey PRIMARY KEY (permission_id);

ALTER TABLE ONLY public.profession
    ADD CONSTRAINT profession_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.profile
    ADD CONSTRAINT profile_pkey PRIMARY KEY (profile_id);

ALTER TABLE ONLY public.saved_search
    ADD CONSTRAINT saved_search_pkey PRIMARY KEY (id);


ALTER TABLE ONLY public.profile_permission ADD CONSTRAINT pk_idx_profile_permission UNIQUE (profile_id, permission_id);

ALTER TABLE ONLY public.profession ADD CONSTRAINT uk_profession_nom UNIQUE (nom);

ALTER TABLE ONLY public.profile ADD CONSTRAINT uk_profile_codemetier UNIQUE (codemetier);

ALTER TABLE ONLY public.contact ADD CONSTRAINT uk_contact_email UNIQUE (email);

ALTER TABLE ONLY public."user" ADD CONSTRAINT pk_user_id PRIMARY KEY (id);

ALTER TABLE ONLY public.password_reset_token ADD CONSTRAINT fk_password_reset_token_user_id FOREIGN KEY (user_id) REFERENCES public."user"(id);

ALTER TABLE ONLY public.profile_permission ADD CONSTRAINT fk_profile_permission_profile_id FOREIGN KEY (profile_id) REFERENCES public.profile(profile_id);

ALTER TABLE ONLY public."user" ADD CONSTRAINT fk_user_profile_id FOREIGN KEY (profile_id) REFERENCES public.profile(profile_id);

ALTER TABLE ONLY public.profile_permission ADD CONSTRAINT fk_profile_permission_permission_id FOREIGN KEY (permission_id) REFERENCES public.permission(permission_id);

ALTER TABLE ONLY public."user" ADD CONSTRAINT fk_contact_user_contact_id FOREIGN KEY (contact_id) REFERENCES public.contact(id);

ALTER TABLE ONLY public.contact ADD CONSTRAINT fk_contact_profession_id FOREIGN KEY (profession_id) REFERENCES public.profession(id);

ALTER TABLE ONLY public.saved_search ADD CONSTRAINT fk_saved_search_user_id FOREIGN KEY (user_id) REFERENCES public."user"(id);
