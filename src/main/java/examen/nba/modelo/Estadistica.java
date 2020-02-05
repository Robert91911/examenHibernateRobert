package examen.nba.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the estadistica database table.
 * 
 */
@Entity
@Table(name="estadistica")
@NamedQuery(name="Estadistica.findAll", query="SELECT e FROM Estadistica e")
public class Estadistica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private float asistenciasPorPartido;

	private float puntosPorPartido;

	private float rebotesPorPartido;

	private float taponesPorPartido;

	private String temporada;

	//bi-directional many-to-one association to Jugador
	@ManyToOne
	@JoinColumn(name="jugadorId")
	private Jugador jugador;

	public Estadistica() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAsistenciasPorPartido() {
		return this.asistenciasPorPartido;
	}

	public void setAsistenciasPorPartido(float asistenciasPorPartido) {
		this.asistenciasPorPartido = asistenciasPorPartido;
	}

	public float getPuntosPorPartido() {
		return this.puntosPorPartido;
	}

	public void setPuntosPorPartido(float puntosPorPartido) {
		this.puntosPorPartido = puntosPorPartido;
	}

	public float getRebotesPorPartido() {
		return this.rebotesPorPartido;
	}

	public void setRebotesPorPartido(float rebotesPorPartido) {
		this.rebotesPorPartido = rebotesPorPartido;
	}

	public float getTaponesPorPartido() {
		return this.taponesPorPartido;
	}

	public void setTaponesPorPartido(float taponesPorPartido) {
		this.taponesPorPartido = taponesPorPartido;
	}

	public String getTemporada() {
		return this.temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public Jugador getJugador() {
		return this.jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

}