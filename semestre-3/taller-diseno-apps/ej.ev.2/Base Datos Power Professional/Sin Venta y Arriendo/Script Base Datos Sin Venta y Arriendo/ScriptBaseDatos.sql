/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     16/05/2019 17:22:41                          */
/*==============================================================*/


drop table if exists AUTOR;

drop table if exists AUTOR_LIBRO;

drop table if exists CATEGORIA;

drop table if exists COMPRAS;

drop table if exists COPIA_LIBRO;

drop table if exists DISTRIBUIDORES;

drop table if exists EDITORIAL;

drop table if exists ESTADO;

drop table if exists FACTURA;

drop table if exists IDIOMA;

drop table if exists IDIOMA_LIBRO;

drop table if exists LIBRO;

drop table if exists LIBRO_CATEGORIA;

drop table if exists METODO_PAGO;

/*==============================================================*/
/* Table: AUTOR                                                 */
/*==============================================================*/
create table AUTOR
(
   IDAUTOR              int not null,
   NOMBRE               longtext not null,
   APELLIDO_PATERNO     longtext not null,
   APELLIDO_MATERNO     longtext not null,
   primary key (IDAUTOR)
);

/*==============================================================*/
/* Table: AUTOR_LIBRO                                           */
/*==============================================================*/
create table AUTOR_LIBRO
(
   IDAUTOR_LIBRO        int not null auto_increment,
   ISSN_LIBRO           int not null,
   IDAUTOR              int not null,
   primary key (IDAUTOR_LIBRO)
);

/*==============================================================*/
/* Table: CATEGORIA                                             */
/*==============================================================*/
create table CATEGORIA
(
   IDCATEGORIA          int not null,
   DESCRIPCION          char(80) not null,
   primary key (IDCATEGORIA)
);

/*==============================================================*/
/* Table: COMPRAS                                               */
/*==============================================================*/
create table COMPRAS
(
   IDCOMPRA             int not null,
   RUT                  varchar(10) not null,
   IDFACTURA            int not null,
   primary key (IDCOMPRA)
);

/*==============================================================*/
/* Table: COPIA_LIBRO                                           */
/*==============================================================*/
create table COPIA_LIBRO
(
   ISSN_COPIA           int not null,
   IDCOMPRA             int not null,
   ISSN_LIBRO           int not null,
   IDESTADO             int not null,
   primary key (ISSN_COPIA)
);

/*==============================================================*/
/* Table: DISTRIBUIDORES                                        */
/*==============================================================*/
create table DISTRIBUIDORES
(
   RUT                  varchar(10) not null,
   NOMBRE_EMPRESA       longtext not null,
   ANO_INICIO           int not null,
   DIRECCION            varchar(120) not null,
   TELEFONO             int not null,
   primary key (RUT)
);

/*==============================================================*/
/* Table: EDITORIAL                                             */
/*==============================================================*/
create table EDITORIAL
(
   IDEDITORIAL          int not null,
   DESCRIPCION          char(80) not null,
   primary key (IDEDITORIAL)
);

/*==============================================================*/
/* Table: ESTADO                                                */
/*==============================================================*/
create table ESTADO
(
   IDESTADO             int not null,
   DESCRIPCION          char(80),
   primary key (IDESTADO)
);

/*==============================================================*/
/* Table: FACTURA                                               */
/*==============================================================*/
create table FACTURA
(
   IDFACTURA            int not null,
   IDMETODO             int not null,
   RUT                  varchar(10) not null,
   PRECIOIVA            decimal not null,
   COSTOIVA             decimal not null,
   FECHACOMPRA          int not null,
   HORACOMPRA           int not null,
   primary key (IDFACTURA)
);

/*==============================================================*/
/* Table: IDIOMA                                                */
/*==============================================================*/
create table IDIOMA
(
   IDIDIOMA             int not null,
   DESCRIPCION          char(80),
   primary key (IDIDIOMA)
);

/*==============================================================*/
/* Table: IDIOMA_LIBRO                                          */
/*==============================================================*/
create table IDIOMA_LIBRO
(
   IDIDIOMA_LIBRO       int not null auto_increment,
   ISSN_LIBRO           int not null,
   IDIDIOMA             int not null,
   primary key (IDIDIOMA_LIBRO)
);

/*==============================================================*/
/* Table: LIBRO                                                 */
/*==============================================================*/
create table LIBRO
(
   ISSN_LIBRO           int not null,
   IDEDITORIAL          int not null,
   ISBN                 int not null,
   TITULO               longtext not null,
   NUM_PAGINAS          int not null,
   PREC_REF             int not null,
   ANO_PUBL             int not null,
   primary key (ISSN_LIBRO)
);

/*==============================================================*/
/* Table: LIBRO_CATEGORIA                                       */
/*==============================================================*/
create table LIBRO_CATEGORIA
(
   IDLIBRO_CATEGORIA    int not null auto_increment,
   IDCATEGORIA          int not null,
   ISSN_LIBRO           int not null,
   primary key (IDLIBRO_CATEGORIA)
);

/*==============================================================*/
/* Table: METODO_PAGO                                           */
/*==============================================================*/
create table METODO_PAGO
(
   IDMETODO             int not null,
   DESCRIPCION          char(80),
   primary key (IDMETODO)
);

alter table AUTOR_LIBRO add constraint FK_AUTOR_LIBRO foreign key (ISSN_LIBRO)
      references LIBRO (ISSN_LIBRO) on delete restrict on update restrict;

alter table AUTOR_LIBRO add constraint FK_AUTOR_LIBRO2 foreign key (IDAUTOR)
      references AUTOR (IDAUTOR) on delete restrict on update restrict;

alter table COMPRAS add constraint FK_DISTRIBUIDORES_COMPRAS foreign key (RUT)
      references DISTRIBUIDORES (RUT) on delete restrict on update restrict;

alter table COMPRAS add constraint FK_FACTURA_COMPRA foreign key (IDFACTURA)
      references FACTURA (IDFACTURA) on delete restrict on update restrict;

alter table COPIA_LIBRO add constraint FK_COMPRA_COPIA foreign key (IDCOMPRA)
      references COMPRAS (IDCOMPRA) on delete restrict on update restrict;

alter table COPIA_LIBRO add constraint FK_ESTADO_LIBRO foreign key (IDESTADO)
      references ESTADO (IDESTADO) on delete restrict on update restrict;

alter table COPIA_LIBRO add constraint FK_LIBRO_COPIA foreign key (ISSN_LIBRO)
      references LIBRO (ISSN_LIBRO) on delete restrict on update restrict;

alter table FACTURA add constraint FK_DISTRIBUIDORES_FACTURA foreign key (RUT)
      references DISTRIBUIDORES (RUT) on delete restrict on update restrict;

alter table FACTURA add constraint FK_METODODEPAGO_FACTURA foreign key (IDMETODO)
      references METODO_PAGO (IDMETODO) on delete restrict on update restrict;

alter table IDIOMA_LIBRO add constraint FK_IDIOMA_LIBRO foreign key (ISSN_LIBRO)
      references LIBRO (ISSN_LIBRO) on delete restrict on update restrict;

alter table IDIOMA_LIBRO add constraint FK_IDIOMA_LIBRO2 foreign key (IDIDIOMA)
      references IDIOMA (IDIDIOMA) on delete restrict on update restrict;

alter table LIBRO add constraint FK_EDITORIAL_LIBRO foreign key (IDEDITORIAL)
      references EDITORIAL (IDEDITORIAL) on delete restrict on update restrict;

alter table LIBRO_CATEGORIA add constraint FK_LIBRO_CATEGORIA foreign key (IDCATEGORIA)
      references CATEGORIA (IDCATEGORIA) on delete restrict on update restrict;

alter table LIBRO_CATEGORIA add constraint FK_LIBRO_CATEGORIA2 foreign key (ISSN_LIBRO)
      references LIBRO (ISSN_LIBRO) on delete restrict on update restrict;

