package examen.nba.persistencia.dao;

import java.util.List;

import examen.nba.modelo.Jugador;

public interface JugadorDAO extends GenericDAO<Jugador, Integer> {

	public Jugador ejercicio1(String nombre);
	public List<Object[]> ejercicio7();

}
