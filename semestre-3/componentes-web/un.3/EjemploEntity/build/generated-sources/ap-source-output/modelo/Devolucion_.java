package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Libro;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-06-28T17:21:36")
@StaticMetamodel(Devolucion.class)
public class Devolucion_ { 

    public static volatile SingularAttribute<Devolucion, Cliente> clirut;
    public static volatile SingularAttribute<Devolucion, Date> devhora;
    public static volatile SingularAttribute<Devolucion, Long> devnumero;
    public static volatile SingularAttribute<Devolucion, Date> devfecha;
    public static volatile CollectionAttribute<Devolucion, Libro> libroCollection;

}