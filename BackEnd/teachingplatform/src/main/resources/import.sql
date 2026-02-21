INSERT INTO tb_user (name, email, password) VALUES ('Maria Brown', 'maria@gmail.com', '$2a$10$8QJM4.Cyk/hrLM.VKP4N9egsgNOOLwlDX.oHH7j94RUqvLvhp2H.C');
INSERT INTO tb_user (name, email, password) VALUES ('Alex Green', 'alex@gmail.com', '$2a$10$8QJM4.Cyk/hrLM.VKP4N9egsgNOOLwlDX.oHH7j94RUqvLvhp2H.C');
INSERT INTO tb_user (name, email, password) VALUES ('Willian', 'willian@gmail.com', '$2a$10$8QJM4.Cyk/hrLM.VKP4N9egsgNOOLwlDX.oHH7j94RUqvLvhp2H.C');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name, img_Uri, img_Gray_Uri) VALUES ('JAVA','https://education.oracle.com/file/general/p-80-java.png', 'https://cdn-icons-png.flaticon.com/512/121/121152.png');