/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     28/06/2019 14:27:44                          */
/*==============================================================*/


drop table if exists ARRIENDO;

drop table if exists ARRIENDO_COPIA;

drop table if exists AUTOR;

drop table if exists BOLETA;

drop table if exists CATEGORIA;

drop table if exists CLIENTE;

drop table if exists COMPRA;

drop table if exists COMPRA_COPIA;

drop table if exists COPIA;

drop table if exists CORREO_CLIENTE;

drop table if exists CORREO_TRABAJADOR;

drop table if exists DIRECCION_CLIENTE;

drop table if exists DIRECCION_TRABAJADOR;

drop table if exists DISTRIBUIDOR;

drop table if exists EDITORIAL;

drop table if exists ESTADO;

drop table if exists FACTURA;

drop table if exists IDIOMA;

drop table if exists LIBRO;

drop table if exists LIBRO_AUTOR;

drop table if exists LIBRO_CATEGORIA;

drop table if exists LIBRO_IDIOMA;

drop table if exists METODO_PAGO;

drop table if exists TELEFONO_CLIENTE;

drop table if exists TELEFONO_TRABAJADOR;

drop table if exists TRABAJADOR;

drop table if exists VENTA;

drop table if exists VENTA_COPIA;

/*==============================================================*/
/* Table: ARRIENDO                                              */
/*==============================================================*/
create table ARRIENDO
(
   IDARRIENDO           int not null,
   IDCLIENTE            int not null,
   FECHA_ARRIENDO       char(10),
   FECHA_DEV_ESTIMADA   char(10),
   FECHA_DEV_REAL       char(10),
   DIAS_RETRASO         int,
   COSTO_ARRIENDO       int,
   COSTO_MULTA          int,
   COSTO_TOTAL          int,
   primary key (IDARRIENDO)
);

/*==============================================================*/
/* Table: ARRIENDO_COPIA                                        */
/*==============================================================*/
create table ARRIENDO_COPIA
(
   IDARRIENDO_COPIA     int not null auto_increment,
   ISSN_COPIA           int not null,
   IDARRIENDO           int not null,
   primary key (IDARRIENDO_COPIA)
);

/*==============================================================*/
/* Table: AUTOR                                                 */
/*==============================================================*/
create table AUTOR
(
   IDAUTOR              int not null,
   NOMAUTOR             varchar(30) not null,
   APATERNOAUT          varchar(30) not null,
   AMATERNOAUT          varchar(30) not null,
   primary key (IDAUTOR)
);

/*==============================================================*/
/* Table: BOLETA                                                */
/*==============================================================*/
create table BOLETA
(
   IDBOLETA             int not null,
   IDMETODO_PAGO        int not null,
   IDTRABAJADOR         int not null,
   PRECIO_IVA           decimal,
   COSTO_IVA            decimal,
   NETO                 decimal,
   FECHA_VENTA          char(10),
   HORA_VENTA           char(10),
   primary key (IDBOLETA)
);

/*==============================================================*/
/* Table: CATEGORIA                                             */
/*==============================================================*/
create table CATEGORIA
(
   IDCATEGORIA          int not null,
   DESCCATEGORIA        longtext not null,
   primary key (IDCATEGORIA)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   IDCLIENTE            int not null,
   NOMBRE_CLIENTE       varchar(30),
   APATERNOCLI          varchar(30),
   AMATERNOCLI          varchar(30),
   FECHA_NACIMIENTO     char(10),
   primary key (IDCLIENTE)
);

/*==============================================================*/
/* Table: COMPRA                                                */
/*==============================================================*/
create table COMPRA
(
   IDCOMPRA             int not null,
   IDDISTRIBUIDOR       int not null,
   IDFACTURA            int not null,
   primary key (IDCOMPRA)
);

/*==============================================================*/
/* Table: COMPRA_COPIA                                          */
/*==============================================================*/
create table COMPRA_COPIA
(
   IDCOMPRA_COPIA       int not null auto_increment,
   ISSN_COPIA           int not null,
   IDCOMPRA             int not null,
   primary key (IDCOMPRA_COPIA)
);

/*==============================================================*/
/* Table: COPIA                                                 */
/*==============================================================*/
create table COPIA
(
   ISSN_COPIA           int not null auto_increment,
   ISSN_LIBRO           int not null,
   IDESTADO             int not null,
   primary key (ISSN_COPIA)
);

/*==============================================================*/
/* Table: CORREO_CLIENTE                                        */
/*==============================================================*/
create table CORREO_CLIENTE
(
   IDCORREOCCLI         int not null,
   IDCLIENTE            int not null,
   CORREOCLI            varchar(20) not null,
   primary key (IDCORREOCCLI)
);

/*==============================================================*/
/* Table: CORREO_TRABAJADOR                                     */
/*==============================================================*/
create table CORREO_TRABAJADOR
(
   IDCORREO2            int not null,
   IDTRABAJADOR         int not null,
   CORREOTRAB           varchar(20) not null,
   primary key (IDCORREO2)
);

/*==============================================================*/
/* Table: DIRECCION_CLIENTE                                     */
/*==============================================================*/
create table DIRECCION_CLIENTE
(
   IDDIRECCIONCLI       int not null,
   IDCLIENTE            int not null,
   DIRECCIONCLI         longtext not null,
   primary key (IDDIRECCIONCLI)
);

/*==============================================================*/
/* Table: DIRECCION_TRABAJADOR                                  */
/*==============================================================*/
create table DIRECCION_TRABAJADOR
(
   IDDIRECCIONTRAB      int not null,
   IDTRABAJADOR         int not null,
   DIRECCIONTRAB        longtext not null,
   primary key (IDDIRECCIONTRAB)
);

/*==============================================================*/
/* Table: DISTRIBUIDOR                                          */
/*==============================================================*/
create table DISTRIBUIDOR
(
   IDDISTRIBUIDOR       int not null,
   NOM_DISTRIBUIDOR     varchar(30) not null,
   ANO_INICIO           int not null,
   DIRECCIONDIS         longtext not null,
   TELEFONODIS          int not null,
   primary key (IDDISTRIBUIDOR)
);

/*==============================================================*/
/* Table: EDITORIAL                                             */
/*==============================================================*/
create table EDITORIAL
(
   IDEDITORIAL          int not null,
   DESCEDITORIAL        longtext not null,
   primary key (IDEDITORIAL)
);

/*==============================================================*/
/* Table: ESTADO                                                */
/*==============================================================*/
create table ESTADO
(
   IDESTADO             int not null,
   DESCESTADO           longtext not null,
   primary key (IDESTADO)
);

/*==============================================================*/
/* Table: FACTURA                                               */
/*==============================================================*/
create table FACTURA
(
   IDFACTURA            int not null,
   IDMETODO_PAGO        int not null,
   IDDISTRIBUIDOR       int not null,
   PRECIOIVA            decimal,
   COSTOIVA             decimal,
   NETO                 decimal,
   FECHACOMPRA          char(10),
   HORACOMPRA           char(10),
   primary key (IDFACTURA)
);

/*==============================================================*/
/* Table: IDIOMA                                                */
/*==============================================================*/
create table IDIOMA
(
   IDIDIOMA             int not null,
   DESCIDIOMA           longtext not null,
   primary key (IDIDIOMA)
);

/*==============================================================*/
/* Table: LIBRO                                                 */
/*==============================================================*/
create table LIBRO
(
   ISSN_LIBRO           int not null,
   IDEDITORIAL          int not null,
   ISBN_LIBRO           int not null,
   TITULO               longtext not null,
   NUM_PAG              int not null,
   PREC_REF             int not null,
   ANO_PUBL             int not null,
   primary key (ISSN_LIBRO)
);

/*==============================================================*/
/* Table: LIBRO_AUTOR                                           */
/*==============================================================*/
create table LIBRO_AUTOR
(
   IDLIBRO_AUTOR        int not null auto_increment,
   IDAUTOR              int not null,
   ISSN_LIBRO           int not null,
   primary key (IDLIBRO_AUTOR)
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
/* Table: LIBRO_IDIOMA                                          */
/*==============================================================*/
create table LIBRO_IDIOMA
(
   IDLIBRO_IDIOMA       int not null auto_increment,
   ISSN_LIBRO           int not null,
   IDIDIOMA             int not null,
   primary key (IDLIBRO_IDIOMA)
);

/*==============================================================*/
/* Table: METODO_PAGO                                           */
/*==============================================================*/
create table METODO_PAGO
(
   IDMETODO_PAGO        int not null,
   DESCMETODOPAGO       longtext not null,
   primary key (IDMETODO_PAGO)
);

/*==============================================================*/
/* Table: TELEFONO_CLIENTE                                      */
/*==============================================================*/
create table TELEFONO_CLIENTE
(
   IDTELEFONOCLI        int not null,
   IDCLIENTE            int not null,
   TELEFONOCLI          int not null,
   primary key (IDTELEFONOCLI)
);

/*==============================================================*/
/* Table: TELEFONO_TRABAJADOR                                   */
/*==============================================================*/
create table TELEFONO_TRABAJADOR
(
   IDTELEFONO2          int not null,
   IDTRABAJADOR         int not null,
   TELEFONOTRAB         int not null,
   primary key (IDTELEFONO2)
);

/*==============================================================*/
/* Table: TRABAJADOR                                            */
/*==============================================================*/
create table TRABAJADOR
(
   IDTRABAJADOR         int not null,
   NOMTRABAJADOR        varchar(30) not null,
   APATERNOTRAB         varchar(30) not null,
   AMATERNOTRAB         varchar(30) not null,
   FECHA_CONTRATO       char(10) not null,
   primary key (IDTRABAJADOR)
);

/*==============================================================*/
/* Table: VENTA                                                 */
/*==============================================================*/
create table VENTA
(
   IDVENTA              int not null,
   IDBOLETA             int not null,
   IDCLIENTE            int not null,
   IDTRABAJADOR         int not null,
   primary key (IDVENTA)
);

/*==============================================================*/
/* Table: VENTA_COPIA                                           */
/*==============================================================*/
create table VENTA_COPIA
(
   IDVENTA_COPIA        int not null auto_increment,
   ISSN_COPIA           int not null,
   IDVENTA              int not null,
   primary key (IDVENTA_COPIA)
);

alter table ARRIENDO add constraint FK_CLIENTE_______ARRIENDO foreign key (IDCLIENTE)
      references CLIENTE (IDCLIENTE) on delete restrict on update restrict;

alter table ARRIENDO_COPIA add constraint FK_ARRIENDO_______COPIA2 foreign key (IDARRIENDO)
      references ARRIENDO (IDARRIENDO) on delete restrict on update restrict;

alter table ARRIENDO_COPIA add constraint FK_COPIA______ARRIENDO_COPIA foreign key (ISSN_COPIA)
      references COPIA (ISSN_COPIA) on delete restrict on update restrict;

alter table BOLETA add constraint FK_METODO_PAGO______BOLETA foreign key (IDMETODO_PAGO)
      references METODO_PAGO (IDMETODO_PAGO) on delete restrict on update restrict;

alter table BOLETA add constraint FK_TRABAJADOR______BOLETA foreign key (IDTRABAJADOR)
      references TRABAJADOR (IDTRABAJADOR) on delete restrict on update restrict;

alter table COMPRA add constraint FK_DISTRIBUIDOR______COMPRA foreign key (IDDISTRIBUIDOR)
      references DISTRIBUIDOR (IDDISTRIBUIDOR) on delete restrict on update restrict;

alter table COMPRA add constraint FK_FACTURA______COMPRA foreign key (IDFACTURA)
      references FACTURA (IDFACTURA) on delete restrict on update restrict;

alter table COMPRA_COPIA add constraint FK_COMPRA_______COPIA2 foreign key (IDCOMPRA)
      references COMPRA (IDCOMPRA) on delete restrict on update restrict;

alter table COMPRA_COPIA add constraint FK_COPIA______COMPRA_COPIA foreign key (ISSN_COPIA)
      references COPIA (ISSN_COPIA) on delete restrict on update restrict;

alter table COPIA add constraint FK_ESTADO______COPIA foreign key (IDESTADO)
      references ESTADO (IDESTADO) on delete restrict on update restrict;

alter table COPIA add constraint FK_LIBRO______LIBRO foreign key (ISSN_LIBRO)
      references LIBRO (ISSN_LIBRO) on delete restrict on update restrict;

alter table CORREO_CLIENTE add constraint FK_CLIENTE______CORREO_CLIENTE foreign key (IDCLIENTE)
      references CLIENTE (IDCLIENTE) on delete restrict on update restrict;

alter table CORREO_TRABAJADOR add constraint FK_TRABAJADOR______CORREO_TRABAJADOR foreign key (IDTRABAJADOR)
      references TRABAJADOR (IDTRABAJADOR) on delete restrict on update restrict;

alter table DIRECCION_CLIENTE add constraint FK_CLIENTE______DIRECCION_CLIENTE foreign key (IDCLIENTE)
      references CLIENTE (IDCLIENTE) on delete restrict on update restrict;

alter table DIRECCION_TRABAJADOR add constraint FK_TRABAJADOR______DIRECCION_TRABAJADOR foreign key (IDTRABAJADOR)
      references TRABAJADOR (IDTRABAJADOR) on delete restrict on update restrict;

alter table FACTURA add constraint FK_DISTRIBUIDOR______FACTURA foreign key (IDDISTRIBUIDOR)
      references DISTRIBUIDOR (IDDISTRIBUIDOR) on delete restrict on update restrict;

alter table FACTURA add constraint FK_METODO_PAGO______FACTURA foreign key (IDMETODO_PAGO)
      references METODO_PAGO (IDMETODO_PAGO) on delete restrict on update restrict;

alter table LIBRO add constraint FK_EDITORIAL______LIBRO foreign key (IDEDITORIAL)
      references EDITORIAL (IDEDITORIAL) on delete restrict on update restrict;

alter table LIBRO_AUTOR add constraint FK_AUTOR______LIBRO_AUTOR foreign key (IDAUTOR)
      references AUTOR (IDAUTOR) on delete restrict on update restrict;

alter table LIBRO_AUTOR add constraint FK_LIBRO_______AUTOR2 foreign key (ISSN_LIBRO)
      references LIBRO (ISSN_LIBRO) on delete restrict on update restrict;

alter table LIBRO_CATEGORIA add constraint FK_CATEGORIA______LIBRO_CATEGORIA foreign key (IDCATEGORIA)
      references CATEGORIA (IDCATEGORIA) on delete restrict on update restrict;

alter table LIBRO_CATEGORIA add constraint FK_LIBRO_______CATEGORIA2 foreign key (ISSN_LIBRO)
      references LIBRO (ISSN_LIBRO) on delete restrict on update restrict;

alter table LIBRO_IDIOMA add constraint FK_IDIOMA______LIBRO2 foreign key (IDIDIOMA)
      references IDIOMA (IDIDIOMA) on delete restrict on update restrict;

alter table LIBRO_IDIOMA add constraint FK_LIBRO______LIBRO_IDIOMA foreign key (ISSN_LIBRO)
      references LIBRO (ISSN_LIBRO) on delete restrict on update restrict;

alter table TELEFONO_CLIENTE add constraint FK_CLIENTE_______TELEFONO_CLIENTE foreign key (IDCLIENTE)
      references CLIENTE (IDCLIENTE) on delete restrict on update restrict;

alter table TELEFONO_TRABAJADOR add constraint FK_TRABAJADOR______TELEFONO_TRABAJADOR foreign key (IDTRABAJADOR)
      references TRABAJADOR (IDTRABAJADOR) on delete restrict on update restrict;

alter table VENTA add constraint FK_BOLETA______VENTA foreign key (IDBOLETA)
      references BOLETA (IDBOLETA) on delete restrict on update restrict;

alter table VENTA add constraint FK_CLIENTE______VENTA foreign key (IDCLIENTE)
      references CLIENTE (IDCLIENTE) on delete restrict on update restrict;

alter table VENTA add constraint FK_TRABAJADOR______VENTA foreign key (IDTRABAJADOR)
      references TRABAJADOR (IDTRABAJADOR) on delete restrict on update restrict;

alter table VENTA_COPIA add constraint FK_COPIA______VENTA_COPIA foreign key (ISSN_COPIA)
      references COPIA (ISSN_COPIA) on delete restrict on update restrict;

alter table VENTA_COPIA add constraint FK_VENTA_______COPIA2 foreign key (IDVENTA)
      references VENTA (IDVENTA) on delete restrict on update restrict;

