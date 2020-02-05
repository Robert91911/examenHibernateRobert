package examen.nba;

import javax.persistence.EntityManager;

import examen.nba.controlador.EquipoController;
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
        EquipoController equipo = new EquipoController();
        
        
        jugador.ejercicio5();
//        equipo.ejercicio6();
//        jugador.ejercicio7();
//        jugador.ejercicio8();
//        jugador.ejercicio10();
        
        
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
