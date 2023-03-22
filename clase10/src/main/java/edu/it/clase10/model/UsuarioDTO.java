package edu.it.clase10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class UsuarioDTO {
	@Id
	public String id;
    public String nombre;
    public String apellido;
    public String calle;
    @Column(name="calle_numero")
    public String calleNumero;
    public String estado;
    public String pais;
    
	public UsuarioDTO(String id, String nombre, String apellido, String calle, String calleNumero, String estado,
			String pais) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.calle = calle;
		this.calleNumero = calleNumero;
		this.estado = estado;
		this.pais = pais;
	}

	public UsuarioDTO() {
	}

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", calle=" + calle
				+ ", calleNumero=" + calleNumero + ", estado=" + estado + ", pais=" + pais + "]";
	}
}
