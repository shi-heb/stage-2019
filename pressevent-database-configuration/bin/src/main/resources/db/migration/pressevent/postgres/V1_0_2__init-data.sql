INSERT INTO public.profession (id, nom) VALUES (1, 'Chargé clientèle');
INSERT INTO public.profession (id, nom) VALUES (2, 'Dévelopeur');
INSERT INTO public.profession (id, nom) VALUES (3, 'Responsable qualité');

INSERT INTO public.contact (id, created_by, created_date, last_modified_by, last_modified_date, adresse, code_postale, complement_adresse, num_rue, pays_id, ligne_id, ville, pays, birth_date, civility, email, landline, mobile, nom, picture, prenom, profession_id, pdv, level) VALUES (5, 'system', '2018-12-11 10:59:53.965', 'superadmin', '2018-12-11 10:59:53.965', '', '', '', '', 1, 1, '', NULL, NULL, 1, 'contact@itpeac.com', '', '', 'Super', NULL, 'Admin', 2, '1', '4');
INSERT INTO public.contact (id, created_by, created_date, last_modified_by, last_modified_date, adresse, code_postale, complement_adresse, num_rue, pays_id, ligne_id, ville, pays, birth_date, civility, email, landline, mobile, nom, picture, prenom, profession_id, pdv, level) VALUES (4, 'system', '2017-04-12 16:00:00', 'dorothee.gruel', '2018-12-11 14:28:30.354', ' rue Henri Ste Claire Deville', '92563', '', '7', 1, 3, 'Rueil-Malmaison', NULL, NULL, 1, 'lacherif@clcg.fr', '+33 23.23.23.23.23', '+33 12.12.12.12.12', 'Dorothee', NULL, 'Gruel', 1, '010106R', '4');

INSERT INTO public.langue (id, code, defaut) VALUES (1, 'FR', true);
INSERT INTO public.langue (id, code, defaut) VALUES (2, 'IT', true);

INSERT INTO public.ligne (id, libelle, code) VALUES (1, 'citroen', '412pf414');
INSERT INTO public.ligne (id, libelle, code) VALUES (2, 'peugeot', '412pl596');
INSERT INTO public.ligne (id, libelle, code) VALUES (3, 'ds', '451ng589');
INSERT INTO public.ligne (id, libelle, code) VALUES (4, 'opel', '625li855');
INSERT INTO public.ligne (id, libelle, code) VALUES (5, 'collab', '8526hr41');

INSERT INTO public.pays (id, code, libelle, langue_id) VALUES (1, '412pf414', 'FR', 1);
INSERT INTO public.pays (id, code, libelle, langue_id) VALUES (2, '412pl596', 'BE', 2);
INSERT INTO public.pays (id, code, libelle, langue_id) VALUES (3, '451ng589', 'IT', 1);
INSERT INTO public.pays (id, code, libelle, langue_id) VALUES (4, '625li855', 'FR', 2);
INSERT INTO public.pays (id, code, libelle, langue_id) VALUES (5, '8526hr41', 'FR', 1);

INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (1, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.263', 'Une très longue description, Une très longue description, Une très longue description, Une très longue description.', 'User', 'Create');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (2, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.429', NULL, 'User', 'Edit');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (3, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.445', NULL, 'User', 'delete');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (4, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.445', NULL, 'User', 'Export_Excel');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (5, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profile', 'delete');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (6, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profile', 'Search');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (7, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profile', 'Edit');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (8, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.479', 'profile create description', 'Profile', 'Create');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (9, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profile', 'view');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (10, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profile', 'select');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (11, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profile', 'Export_Excel');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (12, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Permission', 'select');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (13, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'User', 'search');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (14, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'User', 'view');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (15, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'User', 'select');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (16, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'User', 'create');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (17, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'reporting', 'reports');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (18, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'reporting', 'dashboard');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (19, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.445', NULL, 'contact', 'create');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (20, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'contact', 'search');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (21, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'contact', 'view');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (22, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'contact', 'select');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (23, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.429', NULL, 'contact', 'Edit');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (24, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.445', NULL, 'contact', 'delete');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (31, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profession', 'view');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (32, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profession', 'select');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (33, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.429', NULL, 'Profession', 'Edit');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (34, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.445', NULL, 'Profession', 'delete');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (35, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.462', NULL, 'Profession', 'create');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (119, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.263', 'description', 'USERPROFIL', 'VIEW');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (120, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.263', 'description', 'Annonce', 'CHANGE_LANGUAGE');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (121, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.263', 'description', 'Annonce', 'CHANGE_LIGNE');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (122, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.263', 'description', 'Annonce', 'CHANGE_PAYS');
INSERT INTO public.permission (permission_id, created_by, created_date, last_modified_by, last_modified_date, description, entity, role) VALUES (123, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:16.263', 'description', 'Annonce', 'VIEW');

INSERT INTO public.profile (profile_id, created_by, created_date, last_modified_by, last_modified_date, codemetier, description) VALUES (2, 'system', '2018-04-12 17:00:00', 'system', '2018-02-27 21:53:17.013', 'Reporting', '');
INSERT INTO public.profile (profile_id, created_by, created_date, last_modified_by, last_modified_date, codemetier, description) VALUES (3, 'system', '2018-12-03 18:18:00.535', 'system', '2018-12-03 18:18:00.535', 'pointDeVente', '');
INSERT INTO public.profile (profile_id, created_by, created_date, last_modified_by, last_modified_date, codemetier, description) VALUES (1, 'system', '2018-04-12 17:00:00', 'system', '2018-12-14 15:48:39.304', 'Gestion d''utilisateurs', 'Ajout / Modification / Suppression d''utilisateurs');

INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 1);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 3);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 2);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 4);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 5);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 6);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 7);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 8);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 9);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 10);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 11);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 12);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 13);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 14);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 15);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 16);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 18);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 19);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 20);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 21);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 22);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 23);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 24);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (2, 17);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (2, 18);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 31);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 32);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 33);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 34);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 35);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 119);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 120);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 121);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 122);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (1, 123);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (3, 119);
INSERT INTO public.profile_permission (profile_id, permission_id) VALUES (3, 18);


INSERT INTO public."user" (id, created_by, created_date, last_modified_by, last_modified_date, enabled, login, nb_attempts, non_locked, password, contact_id, profile_id) VALUES (1, 'system', '2018-12-11 10:59:54.12', 'system', '2018-12-11 23:12:24.415', true, 'superadmin', 0, true, '$2a$10$lM7pe3k.YF5IptYKZl/JteunJ/MCgZbAbJ5Nids182R6x/7KKS8.y', 5, 1);
INSERT INTO public."user" (id, created_by, created_date, last_modified_by, last_modified_date, enabled, login, nb_attempts, non_locked, password, contact_id, profile_id) VALUES (2, 'system', '2017-04-12 16:00:00', 'system', '2018-02-27 21:53:16.479', true, 'dorothee.gruel', 0, true, '$2a$10$S0XqpzP5XlR/T3kY.KaghebiRp6dyAtKmOiNKcxDNO5HPevMeF6fy', 4, 1);

INSERT INTO public.password_reset_token (id, created_by, created_date, last_modified_by, last_modified_date, expiry_date, token, user_id) VALUES (1, 'anonymousUser', '2018-12-11 13:18:12.089', 'anonymousUser', '2018-12-11 13:18:12.089', '2018-12-11 13:33:12.082', '3b570d54-63c4-4f53-9852-655772748350', 1);
INSERT INTO public.password_reset_token (id, created_by, created_date, last_modified_by, last_modified_date, expiry_date, token, user_id) VALUES (2, 'anonymousUser', '2018-12-11 14:35:41.833', 'anonymousUser', '2018-12-11 14:35:41.833', '2018-12-11 14:50:41.826', '411e5594-da36-4ab3-a8c0-21d3c07b4d35', 2);

INSERT INTO public.METADATA(ID,ENTITYNAME, TYPEATTR, NOMATTR, KEYLABEL, created_by, created_date, last_modified_by, last_modified_date) VALUES 
(1, 'annocevoes', 'java.lang.Integer','ao_age', 'Age', 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429'),
(2, 'annocevoes', 'java.lang.String','ao_marque', 'Marque', 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429'),
(3, 'annocevoes', 'java.lang.String','ao_version', 'Version', 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429'),
(4, 'annocevoes', 'java.lang.String','ao_accidente', 'Etat', 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429'),
(5, 'annocevoes', 'java.lang.Integer','ao_km','Km', 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429'),
(6, 'annocevoes', 'java.lang.String','ao_originVehicule', 'Origin', 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429'),
(7, 'annocevoes', 'java.lang.String','ao_modele', 'LigneProduit', 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429'),
(8, 'annocevoes', 'java.lang.Integer','ao_fre', 'FRE', 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429');


SELECT pg_catalog.setval('public.contact_id_seq', 8, true);

SELECT pg_catalog.setval('public.password_reset_token_id_seq', 3, true);

SELECT pg_catalog.setval('public.permission_permission_id_seq', 36, false);

SELECT pg_catalog.setval('public.profession_id_seq', 4, true);

SELECT pg_catalog.setval('public.profile_profile_id_seq', 3, true);

SELECT pg_catalog.setval('public.saved_search_id_seq', 1, false);

SELECT pg_catalog.setval('public.user_id_seq', 3, true);
