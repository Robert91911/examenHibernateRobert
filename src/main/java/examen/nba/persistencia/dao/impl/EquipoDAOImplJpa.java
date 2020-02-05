package examen.nba.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import examen.nba.modelo.Equipo;
import examen.nba.persistencia.dao.EquipoDAO;
import examen.nba.persistencia.jpa.Utilidades;

public class EquipoDAOImplJpa extends GenericDAOImplJpa<Equipo,Integer> implements EquipoDAO {

	public List<Object[]> ejercicio6() {
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		@SuppressWarnings("unchecked")
		List<Object[]> lista =  (List<Object[]>) em.createQuery(
				"select E " +
				"from Estadistica E ")
				.getResultList();
				
		return lista;
	}
}
