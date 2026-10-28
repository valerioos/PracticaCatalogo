package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Clientes")
public class EntityCliente {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column()
	private String nombre;
	private String correo;
	private Integer telefono;
	
	public EntityCliente() {}
	
	public EntityCliente(String nombre, String correo, Integer telefono) {
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String getCorreo() {return correo;}
	public void setCorreo(String correo) {this.correo = correo;}
	
	public Integer getTelefono() {return telefono;}
	public void setTelefono(Integer telefono) {this.telefono = telefono;
	}
	
}
