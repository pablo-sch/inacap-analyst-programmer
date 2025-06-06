/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

/**
 *
 * @author Cesar
 */
import java.util.ArrayList;
import java.util.List;
import modelo.Materias;
import modelo.MateriasFacade;
import javax.ejb.EJB;
public class listado {
    @EJB
    MateriasFacade mat;
    
    public listado()
    {
    }
    
    public List listar()
    {
        List<Materias> lista;
        lista=mat.findAll();
        for(int i=0;i<lista.size();i++)
        {
            System.out.println(lista.get(i).getMatcodigo());
        }
        return lista;
    }
}
