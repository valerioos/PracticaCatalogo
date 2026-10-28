package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class EntityProveedor {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String empresa;
	private String contacto;
	private String categoria;
	
	public EntityProveedor() {}
	
	public EntityProveedor(String empresa, String contacto, String categoria) {
		this.empresa = empresa;
		this.contacto = contacto;
		this.categoria = categoria;
	}
	
	public String getEmpresa() {return empresa;}
	public void setEmpresa (String empresa) {this.empresa =empresa;}
	
	public String getContacto() {return contacto;}
	public void setContacto(String contacto) {this.contacto = contacto;}
	
	public String getCategoria () {return categoria;}
	public void setCategoria (String categoria) {this.categoria=categoria;}
}
