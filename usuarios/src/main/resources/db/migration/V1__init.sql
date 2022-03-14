

CREATE TABLE usuarios (
	usuario_id varchar(255),
	nombre varchar(255) NULL,
	primer_apellido varchar(255) NULL,
	segundo_apellido varchar(255) NULL,
	contrasena varchar(255) NULL,
	username varchar(255) NULL,
	CONSTRAINT pk_users PRIMARY KEY (usuario_id)
);

insert into usuarios(usuario_id, nombre, primer_apellido, segundo_apellido, username,contrasena)
VALUES('3faaa23b-f7c6-4fb0-958c-d4c552a3b557','Yorbin','Nunez','Martinez','ynunez','1234');

CREATE TABLE publicacion (
        publicacion_id varchar(255),
	usuario_id varchar(255),
	mensaje varchar(255) NULL,
	CONSTRAINT pk_publica PRIMARY KEY (publicacion_id)
);

insert into publicacion(publicacion_id,usuario_id,mensaje)
VALUES('3fabb23b-f7c6-4fb0-958c-d4c552a3b557','3faaa23b-f7c6-4fb0-958c-d4c552a3b557','publicacion de pruebas');

CREATE TABLE comentarios (
        comentario_id varchar(255),
	usuario_id varchar(255),
	publicacion_id varchar(255),
	mensaje varchar(255) NULL,
	CONSTRAINT pk_comentario PRIMARY KEY (comentario_id)
);

CREATE TABLE mensajes (
        mensaje_id varchar(255),
	usuario_id_emisor varchar(255),
	usuario_id_receptor varchar(255),
	mensaje varchar(255) NULL,
	CONSTRAINT pk_msg PRIMARY KEY (mensaje_id)
);

CREATE TABLE noticias (
        noticia_id varchar(255),
	titulo varchar(255),
	mensaje varchar(255),
	
	CONSTRAINT pk_noticia PRIMARY KEY (noticia_id)
);




