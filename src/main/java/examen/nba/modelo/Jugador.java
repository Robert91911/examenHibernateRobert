package examen.nba.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the jugador database table.
 * 
 */
@Entity
@Table(name="jugador")
@NamedQuery(name="Jugador.findAll", query="SELECT j FROM Jugador j")
public class Jugador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String altura;

	private String nombre;

	private int peso;

	private String posicion;

	private String procedencia;

	//bi-directional many-to-one association to Estadistica
	@OneToMany(mappedBy="jugador")
	private List<Estadistica> estadisticas;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="equipoId")
	private Equipo equipo;

	public Jugador() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAltura() {
		return this.altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getProcedencia() {
		return this.procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public List<Estadistica> getEstadisticas() {
		return this.estadisticas;
	}

	public void setEstadisticas(List<Estadistica> estadisticas) {
		this.estadisticas = estadisticas;
	}

	public Estadistica addEstadistica(Estadistica estadistica) {
		getEstadisticas().add(estadistica);
		estadistica.setJugador(this);

		return estadistica;
	}

	public Estadistica removeEstadistica(Estadistica estadistica) {
		getEstadisticas().remove(estadistica);
		estadistica.setJugador(null);

		return estadistica;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}