package examen.nba.persistencia.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;


import examen.nba.modelo.Jugador;
import examen.nba.persistencia.dao.JugadorDAO;
import examen.nba.persistencia.jpa.Utilidades;

public class JugadorDAOImplsJpa extends GenericDAOImplJpa<Jugador,Integer> implements JugadorDAO {

	@Override
	public Jugador ejercicio1(String nombre) {
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		Jugador jugador =  (Jugador) em.createQuery(
				"select J " +
				"from Jugador J " +
				"where J.nombre like : nombre ")
				.setParameter("nombre", nombre)
				.getSingleResult();
				
		return jugador;
	}

}
