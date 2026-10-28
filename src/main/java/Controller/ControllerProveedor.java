package Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.EntityProveedor;
import Service.ServiceProveedor;

@RestController
@RequestMapping
public class ControllerProveedor {
	
	@Autowired
	private ServiceProveedor serviceProveedor;
	
	@GetMapping
	public List<EntityProveedor> obtenerTodos(){
		return serviceProveedor.obtenerTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<EntityProveedor> obtenerPorId (@PathVariable Long id){
		return serviceProveedor.obtenerPorId(id);
	}
	
	@PostMapping
	public EntityProveedor guardarCliente (@RequestBody EntityProveedor EntityProveedor) {
		return serviceProveedor.guardar(EntityProveedor);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarProveedor (@PathVariable Long id) {
		serviceProveedor.eliminar(id);
	}

}
