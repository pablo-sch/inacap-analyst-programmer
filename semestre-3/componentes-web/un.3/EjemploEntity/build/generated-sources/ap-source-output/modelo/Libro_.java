package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Devolucion;
import modelo.Inventario;
import modelo.LibroPK;
import modelo.Materias;
import modelo.Prestamos;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-06-28T17:21:36")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, String> libeditorial;
    public static volatile SingularAttribute<Libro, String> libtitulo;
    public static volatile SingularAttribute<Libro, Integer> libcodbarra;
    public static volatile CollectionAttribute<Libro, Prestamos> prestamosCollection;
    public static volatile SingularAttribute<Libro, LibroPK> libroPK;
    public static volatile SingularAttribute<Libro, String> libautor;
    public static volatile SingularAttribute<Libro, Character> libestado;
    public static volatile CollectionAttribute<Libro, Devolucion> devolucionCollection;
    public static volatile SingularAttribute<Libro, Materias> matcodigo;
    public static volatile CollectionAttribute<Libro, Inventario> inventarioCollection;

}