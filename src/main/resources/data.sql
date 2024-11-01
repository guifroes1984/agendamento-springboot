INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-992231122', 'Ana Maria');
INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-991234567', 'Pedro Silva');
INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-981234567', 'Marco Nunes');
INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-971234567', 'Marcelo Silva');
INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-961234567', 'Fernanda Cruz');
INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-951234567', 'Lucia Gomes');
INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-941234567', 'Murilio Aparecido');
INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-931234567', 'João Antunes da Cruz');
INSERT INTO TBL_PESSOA (TELEFONE, NOME) VALUES ('15-921234567', 'Marcos Santos Rosea');

INSERT INTO TBL_CLIENTE (DATA_DE_NASCIMENTO, PESSOA_ID) VALUES ('2000-08-02', 1);
INSERT INTO TBL_CLIENTE (DATA_DE_NASCIMENTO, PESSOA_ID) VALUES ('1998-01-22', 2);
INSERT INTO TBL_CLIENTE (DATA_DE_NASCIMENTO, PESSOA_ID) VALUES ('1998-01-22', 3);

INSERT INTO TBL_PROFISSIONAL (ATIVO, PESSOA_ID) VALUES (TRUE, 4);
INSERT INTO TBL_PROFISSIONAL (ATIVO, PESSOA_ID) VALUES (TRUE, 5);
INSERT INTO TBL_PROFISSIONAL (ATIVO, PESSOA_ID) VALUES (TRUE, 6);

INSERT INTO TBL_USUARIO (EMAIL, PASSWORD, PESSOA_ID) VALUES ('murilo@gmail.com', '123456', 7);
INSERT INTO TBL_USUARIO (EMAIL, PASSWORD, PESSOA_ID) VALUES ('joao@gmail.com', '123456', 8);
INSERT INTO TBL_USUARIO (EMAIL, PASSWORD, PESSOA_ID) VALUES ('marcos@gmail.com', '123456', 9);

INSERT INTO TBL_ROLE(ROLE) VALUES ('ROLE_ADMIN');
INSERT INTO TBL_ROLE(ROLE) VALUES ('ROLE_OPERADOR');

INSERT INTO TBL_USUARIO_ROLE(ROLE_ID, USUARIO_ID) VALUES (1, 7);
INSERT INTO TBL_USUARIO_ROLE(ROLE_ID, USUARIO_ID) VALUES (2, 7);
INSERT INTO TBL_USUARIO_ROLE(ROLE_ID, USUARIO_ID) VALUES (2, 8);
INSERT INTO TBL_USUARIO_ROLE(ROLE_ID, USUARIO_ID) VALUES (2, 9);

INSERT INTO TBL_AREA (NOME) VALUES ('Fisioterapia');
INSERT INTO TBL_AREA (NOME) VALUES ('Terapia Ocupacional');
INSERT INTO TBL_AREA (NOME) VALUES ('Clínica Médica');

INSERT INTO TBL_AREA_PROFISSIONAL (AREA_ID, PROFISSIONAL_ID) VALUES (1, 4);
INSERT INTO TBL_AREA_PROFISSIONAL (AREA_ID, PROFISSIONAL_ID) VALUES (1, 5);
INSERT INTO TBL_AREA_PROFISSIONAL (AREA_ID, PROFISSIONAL_ID) VALUES (2, 5);
INSERT INTO TBL_AREA_PROFISSIONAL (AREA_ID, PROFISSIONAL_ID) VALUES (2, 6);
INSERT INTO TBL_AREA_PROFISSIONAL (AREA_ID, PROFISSIONAL_ID) VALUES (3, 6);
INSERT INTO TBL_AREA_PROFISSIONAL (AREA_ID, PROFISSIONAL_ID) VALUES (3, 4);

INSERT INTO TBL_TRABALHO_CRONOGRAMA_ITEM (DIA_DA_SEMANA, HORARIO_INICIO, HORARIO_TERMINO, ATENDIMENTOS, DURACAO_ATENDIMENTOS, PROFISSIONAL_ID) VALUES (1, '08:00:00', '12:00:00', 8, 30, 4);
INSERT INTO TBL_TRABALHO_CRONOGRAMA_ITEM (DIA_DA_SEMANA, HORARIO_INICIO, HORARIO_TERMINO, ATENDIMENTOS, DURACAO_ATENDIMENTOS, PROFISSIONAL_ID) VALUES (1, '14:00:00', '18:00:00', 8, 30, 4);