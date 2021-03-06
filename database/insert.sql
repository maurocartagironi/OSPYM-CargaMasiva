INSERT INTO tramites_online.MOTIVOS VALUES ('Agradecimientos');
INSERT INTO tramites_online.MOTIVOS VALUES ('Reclamos');
INSERT INTO tramites_online.MOTIVOS VALUES ('Preguntas');
INSERT INTO tramites_online.MOTIVOS VALUES ('Pedidos');
INSERT INTO tramites_online.MOTIVOS VALUES ('observaciones');

INSERT INTO tramites_online.CATEGORIAS VALUES ('Prestadores');
INSERT INTO tramites_online.CATEGORIAS VALUES ('Personal Oficina');
INSERT INTO tramites_online.CATEGORIAS VALUES ('Medicos');

INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (1,1,'MAIL_1-1@MAIL.COM');
INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (1,2,'MAIL_1-2@MAIL.COM');
INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (1,3,'MAIL_1-3@MAIL.COM');
INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (2,1,'MAIL_2-1@MAIL.COM');
INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (2,2,'MAIL_2-2@MAIL.COM');
INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (2,3,'MAIL_2-3@MAIL.COM');
INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (3,NULL,'MAIL_3-NULL@MAIL.COM');
INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (4,1,'MAIL_4-1@MAIL.COM');
INSERT INTO tramites_online.MOTIVOS_CATEGORIAS VALUES (5,NULL,'MAIL_5-NULL@MAIL.COM');

INSERT INTO tramites_online.CONTACTO_SEQ VALUES(0);

INSERT INTO tramites_online.PLAN_SECCIONES VALUES ('Beneficios Adicionales','');
INSERT INTO tramites_online.PLAN_SECCIONES VALUES ('Coseguros','El afiliado debe abonar los siguientes valores a su cargo (Coseguros) para el acceso a las <a href="">Prestaciones Cubiertas</a>');

INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Cobertura de Medicamentos Ambulatorios','50 %', 1, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Subsidio por Adopci�n','$ 900', 1, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Subsidio por Fallecimiento del Titular','$ 3300', 1, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Protesis Odontol�gica','Aranceles Preferenciales con Profesionales integrantes de la <a href="">Red Nacional de Odont�logos</a>', 1, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Ortodoncia','Aranceles Preferenciales con Profesionales integrantes de la <a href="">Red Nacional de Ortodoncistas</a>', 1, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('�ptica','Aranceles Preferenciales en <a href="">Red Nacional de �pticas</a>', 1, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Turismo Social y Recreaci�n','Servicio de Reservas y Precios Preferenciales', 1, null, 1);                               
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Consulta en consultorio Equipo Base de Atenci�n Primaria','S/C', 2, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Consulta Ambulatoria Especializada','S/C', 2, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Atenci�n Domiciliaria','', 2, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Consulta Diurna (C�digo Verde)','$ 310', 2, 10, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Consulta Nocturna (C�digo Verde)','S/C', 2, 10, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('C�digo Rojo/Emergencia','Exento', 2, 10, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Mayores de 65 a�os(C�digo Verde - diurna/nocturna)','$ 124', 2, 10, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Placas de Laboratorio','', 2, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('En ambulatorio','S/C', 2, 15, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('Estudios y Pr�cticas de diagn�stico de baja complejidad (*)','', 2, null, 1);
INSERT INTO tramites_online.PLAN_ITEMS VALUES ('En ambulatorio','S/C', 2, 17, 1);

INSERT INTO tramites_online.AUTORIZACION_SEQ VALUES(0);

INSERT INTO tramites_online.ESPECIALIDADES VALUES ('Cl�nica m�dica');
INSERT INTO tramites_online.ESPECIALIDADES VALUES ('Odontolog�a');

INSERT INTO tramites_online.PRESTACIONES VALUES ('Medicamentos');
INSERT INTO tramites_online.PRESTACIONES VALUES ('Protesis');
INSERT INTO tramites_online.PRESTACIONES VALUES ('Cirug�a');

INSERT INTO tramites_online.ESPEC_PREST VALUES (1,1,'MAIL_1-1@MAIL.COM');
INSERT INTO tramites_online.ESPEC_PREST VALUES (1,3,'MAIL_1-1@MAIL.COM');
INSERT INTO tramites_online.ESPEC_PREST VALUES (2,2,'MAIL_1-1@MAIL.COM');
INSERT INTO tramites_online.ESPEC_PREST VALUES (2,1,'MAIL_1-1@MAIL.COM');

INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (1, 'Receta 1');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (2, 'Receta 2');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (3, 'Receta 3');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (4, 'Receta 4');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (1, 'Receta 5');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (2, 'Receta 6');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (3, 'Receta 7');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (1, 'Receta 8');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (2, 'Receta 9');
INSERT INTO tramites_online.AUTORIZACIONES_DOC (ID_ESPEC_PREST, DOCUMENTACION) VALUES (1, 'Receta 10');