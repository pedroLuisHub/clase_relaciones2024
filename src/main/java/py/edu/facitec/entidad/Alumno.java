package py.edu.facitec.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Identificar a la tabla
public class Alumno {

	
	
	@Id   // ID clave primaria
	
	 //GENERAR AUTOMATICO del id.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	private String nombre;
	
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	public Alumno(Integer codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
}
