/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Cesar
 */
@Stateless
public class MateriasFacade extends AbstractFacade<Materias> implements MateriasFacadeLocal {

    @PersistenceContext(unitName = "BDatos")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MateriasFacade() {
        super(Materias.class);
    }
    public List<Materias> findbyNombre(String nombre)
    {
       Query q=em.createQuery("SELECT m FROM Materias m WHERE m.matnombre = :matnombre");
       q.setParameter("matnombre", nombre);
       return q.getResultList();
    }
    public List<Materias> findbyLike(String nombre)
    {
       nombre=nombre+"%";
       Query q=em.createQuery("SELECT m FROM Materias m WHERE m.matnombre like :nombre");
       q.setParameter("nombre", nombre);
       return q.getResultList();
    }
    
   public List<Materias> findbyRange(int inicio,int fin)
    {
       
       Query q=em.createQuery("SELECT m FROM Materias m WHERE m.matcodigo >=:inicio and m.matcodigo<=:fin");
       //Query q=em.createQuery("SELECT m FROM Materias m WHERE m.matcodigo BETWEEN :inicio and fin");
       q.setParameter("inicio", inicio);
       q.setParameter("fin",fin);
       return q.getResultList();
    }
}
