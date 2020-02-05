package examen.nba.controlador;

import java.util.List;

import examen.nba.persistencia.dao.EquipoDAO;
import examen.nba.persistencia.dao.GenericDAO;
import examen.nba.persistencia.dao.impl.EquipoDAOImplJpa;
import examen.nba.persistencia.dao.impl.GenericDAOImplJpa;

public class EquipoController {
	
	EquipoDAO equipoDAO;
	GenericDAO genericDAO;
	
	public EquipoController() {
		genericDAO = new GenericDAOImplJpa();
		equipoDAO = new EquipoDAOImplJpa();
	}
	public void ejercicio6() {
		List<Object[]> equipos = equipoDAO.ejercicio6();
		
		for(Object[] equipo: equipos) {
			//System.out.println(equipo[0]);
		}
	}
}
