package examen.nba;

import javax.persistence.EntityManager;

import examen.nba.controlador.JugadorController;
import examen.nba.persistencia.jpa.Utilidades;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManager em = null;
    	try {
    	em = Utilidades.getEntityManagerFactory().createEntityManager();
        JugadorController jugador = new JugadorController();
        
        
        jugador.ejercicio1();
        
        
    	} catch (Exception e) {
            if (em != null) {
                System.out.println("Se va a hacer rollback de la transacción");
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        Utilidades.closeEntityManagerFactory();
    }
}
