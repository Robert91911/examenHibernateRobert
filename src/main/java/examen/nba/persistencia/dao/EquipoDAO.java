package examen.nba.persistencia.dao;

import java.util.List;

import examen.nba.modelo.Equipo;

public interface EquipoDAO extends GenericDAO<Equipo, Integer> {
	
	public List<Object[]> ejercicio6();

}
