package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Libro;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-06-28T17:21:36")
@StaticMetamodel(Materias.class)
public class Materias_ { 

    public static volatile SingularAttribute<Materias, String> matnombre;
    public static volatile SingularAttribute<Materias, Integer> matcodigo;
    public static volatile CollectionAttribute<Materias, Libro> libroCollection;

}