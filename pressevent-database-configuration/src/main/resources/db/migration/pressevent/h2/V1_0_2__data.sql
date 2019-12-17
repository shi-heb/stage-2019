INSERT INTO PERMISSION(PERMISSION_ID, CREATED_BY, CREATED_DATE, LAST_MODIFIED_BY, LAST_MODIFIED_DATE, DESCRIPTION, ENTITY, ROLE) VALUES 
(1, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.263', STRINGDECODE('Une tr\u00e8s longue description, Une tr\u00e8s longue description, Une tr\u00e8s longue description, Une tr\u00e8s longue description.'), 'User', 'Create'), 
(2, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429', NULL, 'User', 'Edit'), 
(3, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.445', NULL, 'User', 'delete'), 
(4, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.445', NULL, 'User', 'Export_Excel'), 
(5, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profile', 'delete'), 
(6, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profile', 'Search'), 
(7, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profile', 'Edit'), 
(8, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.479', 'profile create description', 'Profile', 'Create'),
(9, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profile', 'view'), 
(10, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profile', 'select'),
(11, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profile', 'Export_Excel'),
(12, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Permission', 'select'),
(13, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'User', 'search'),
(14, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'User', 'view'),
(15, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'User', 'select'),
(16, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'User', 'create'),
(17, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'reporting', 'reports'),
(18, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'reporting', 'dashboard'),
(19, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.445', NULL, 'contact', 'create'),
(20, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'contact', 'search'),
(21, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'contact', 'view'),
(22, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'contact', 'select'),
(23, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429', NULL, 'contact', 'Edit'), 
(24, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.445', NULL, 'contact', 'delete'),
(31, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profession', 'view'),
(32, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profession', 'select'),
(33, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.429', NULL, 'Profession', 'Edit'), 
(34, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.445', NULL, 'Profession', 'delete'), 
(35, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.462', NULL, 'Profession', 'create');
INSERT INTO PROFILE(PROFILE_ID, CREATED_BY, CREATED_DATE, LAST_MODIFIED_BY, LAST_MODIFIED_DATE, CODEMETIER, DESCRIPTION) VALUES 
(1, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.752', 'Gestion d''utilisateurs', ''), 
(2, 'wafa.mlika', TIMESTAMP '2018-04-12 17:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:17.013', 'Reporting', '');

INSERT INTO PROFILE_PERMISSION(PROFILE_ID, PERMISSION_ID) VALUES 
(1, 1), 
(1, 3), 
(1, 2),
(1, 4),
(1, 5),  
(1, 6), 
(1, 7), 
(1, 8), 
(1, 9), 
(1, 10),
(1, 11),
(1, 12),  
(1, 13), 
(1, 14), 
(1, 15),
(1, 16),
(1, 18),
(1, 19),
(1, 20),
(1, 21),
(1, 22),
(1, 23),
(1, 24),
(2, 17),
(2, 18),
(1, 31),
(1, 32),
(1, 33),
(1, 34),
(1, 35);

INSERT INTO USER(ID, CREATED_BY, CREATED_DATE, LAST_MODIFIED_BY, LAST_MODIFIED_DATE,LOGIN, PASSWORD) VALUES 
(1, 'wafa.mlika', TIMESTAMP '2017-04-12 16:00:00.0', 'wafa.mlika', TIMESTAMP '2018-02-27 21:53:16.479', 'admin.itpeac', '$2a$10$S0XqpzP5XlR/T3kY.KaghebiRp6dyAtKmOiNKcxDNO5HPevMeF6fy');


INSERT INTO USER_PROFILE(PROFILE_ID, USER_ID) VALUES  
(2, 1);