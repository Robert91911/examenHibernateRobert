package examen.nba.controlador;

import java.util.List;

import examen.nba.modelo.Estadistica;
import examen.nba.modelo.Jugador;
import examen.nba.persistencia.dao.JugadorDAO;
import examen.nba.persistencia.dao.impl.JugadorDAOImplsJpa;

public class JugadorController {

	JugadorDAO jugadorDAO;
	
	public JugadorController() {
		jugadorDAO = new JugadorDAOImplsJpa();
	}
	
	public void ejercicio1() {
		Jugador jugador = jugadorDAO.ejercicio1("Greg Buckner");
		System.out.println("Nombre del jugador: "+jugador.getNombre());
		System.out.println("Equipo del jugador: " +jugador.getEquipo().getNombre());
		List<Estadistica> est = jugador.getEstadisticas();
		
		for(Estadistica estadisticas: est) {
			System.out.println(estadisticas.getTemporada() +"    "+ estadisticas.getPuntosPorPartido() +"    "+ estadisticas.getAsistenciasPorPartido() +"    "+  estadisticas.getTaponesPorPartido() +"    "+ estadisticas.getRebotesPorPartido());
			
		}
	}
}
