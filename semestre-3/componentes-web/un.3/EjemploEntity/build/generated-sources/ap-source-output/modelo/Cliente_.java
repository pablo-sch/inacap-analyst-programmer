package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Devolucion;
import modelo.Prestamos;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-06-28T17:21:36")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> clifono;
    public static volatile SingularAttribute<Cliente, Integer> clirut;
    public static volatile SingularAttribute<Cliente, String> cliapaterno;
    public static volatile SingularAttribute<Cliente, String> cliamaterno;
    public static volatile CollectionAttribute<Cliente, Prestamos> prestamosCollection;
    public static volatile SingularAttribute<Cliente, String> clidireccion;
    public static volatile SingularAttribute<Cliente, String> cliemail;
    public static volatile SingularAttribute<Cliente, Character> clisexo;
    public static volatile CollectionAttribute<Cliente, Devolucion> devolucionCollection;
    public static volatile SingularAttribute<Cliente, String> clinombres;

}