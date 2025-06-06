package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Libro;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-06-28T17:21:36")
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Long> invnumero;
    public static volatile SingularAttribute<Inventario, Date> invfecha;
    public static volatile CollectionAttribute<Inventario, Libro> libroCollection;

}