package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Usuarios;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-06-28T17:21:36")
@StaticMetamodel(Privilegios.class)
public class Privilegios_ { 

    public static volatile CollectionAttribute<Privilegios, Usuarios> usuariosCollection;
    public static volatile SingularAttribute<Privilegios, String> prinombre;
    public static volatile SingularAttribute<Privilegios, Short> pricodigo;

}