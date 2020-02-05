package examen.nba.controlador;

import java.util.List;

import examen.nba.modelo.Estadistica;
import examen.nba.modelo.Jugador;
import examen.nba.persistencia.dao.EquipoDAO;
import examen.nba.persistencia.dao.GenericDAO;
import examen.nba.persistencia.dao.JugadorDAO;
import examen.nba.persistencia.dao.impl.EquipoDAOImplJpa;
import examen.nba.persistencia.dao.impl.GenericDAOImplJpa;
import examen.nba.persistencia.dao.impl.JugadorDAOImplsJpa;

public class JugadorController {

	JugadorDAO jugadorDAO;
	GenericDAO genericDAO;
	
	public JugadorController() {
		jugadorDAO = new JugadorDAOImplsJpa();
		genericDAO = new GenericDAOImplJpa();
	}
	
	public void ejercicio5() {
		Jugador jugador = jugadorDAO.ejercicio1("Greg Buckner");
		System.out.println("Nombre del jugador: "+jugador.getNombre());
		System.out.println("Equipo del jugador: " +jugador.getEquipo().getNombre());
		
		List<Estadistica> est = jugador.getEstadisticas();
		
		for(Estadistica estadisticas: est) {
			System.out.println(estadisticas.getTemporada() +"    "+ estadisticas.getPuntosPorPartido() +"    "+ estadisticas.getAsistenciasPorPartido() +"    "+  estadisticas.getTaponesPorPartido() +"    "+ estadisticas.getRebotesPorPartido());
			
		}
	}
	
	
	public void ejercicio7() {
		List<Object[]> jugadores = jugadorDAO.ejercicio7();
		
		for(Object[] jugador: jugadores) {
		System.out.println(jugador[0]);
		System.out.println(jugador[1]);
		}
	}

	public void ejercicio8() {
		
		
		
	}

	public void ejercicio10() {
		Jugador jugador = jugadorDAO.ejercicio1("Kobe Bryant");
		
		Estadistica est1 = new Estadistica();
		Estadistica est2 = new Estadistica();
		
		est1.setJugador(jugador);
		est1.setTemporada("14/15");
		est1.setPuntosPorPartido((float) 22.3);
		est1.setRebotesPorPartido((float) 5.7);
		
		est2.setJugador(jugador);
		est1.setTemporada("15/16");
		est1.setPuntosPorPartido((float) 17.6);
		est1.setRebotesPorPartido((float) 2.8);
		
		genericDAO.merge(jugador);
		
		
		
		
		
	}
}
