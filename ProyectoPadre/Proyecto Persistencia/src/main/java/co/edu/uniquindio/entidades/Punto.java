package co.edu.uniquindio.entidades;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Punto
 *
 */
public class Punto implements Serializable {

	@EmbeddedId
	private PuntoPK llave;
	
	private String nombre;
	private static final long serialVersionUID = 1L;

	public Punto() {
		super();
	}
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
