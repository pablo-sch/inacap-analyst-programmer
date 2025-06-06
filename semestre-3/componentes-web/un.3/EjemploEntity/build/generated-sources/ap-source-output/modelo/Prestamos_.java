package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Libro;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-06-28T17:21:36")
@StaticMetamodel(Prestamos.class)
public class Prestamos_ { 

    public static volatile SingularAttribute<Prestamos, Cliente> clirut;
    public static volatile SingularAttribute<Prestamos, Date> prestfecha;
    public static volatile SingularAttribute<Prestamos, Long> prestnumero;
    public static volatile SingularAttribute<Prestamos, Date> presthora;
    public static volatile SingularAttribute<Prestamos, Date> prestfechadevolucion;
    public static volatile CollectionAttribute<Prestamos, Libro> libroCollection;

}