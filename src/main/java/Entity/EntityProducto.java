package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name= "Productos")
public class EntityProducto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	private String nombre;
	private String precio;
	private String stock;
	
	public EntityProducto() {}
	
	public EntityProducto(String nombre, String precio, String stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	public Long getId () {return id;}
	public void setId(Long id) {this.id = id;}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String precio () {return precio;}
	public void setPrecio (String precio) {this.precio = precio;}
	
	public String getStock() {return stock;}
	public void setStock(String stock) {this.stock =stock;}

}
