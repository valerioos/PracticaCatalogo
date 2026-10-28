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

import Entity.EntityProducto;
import Service.ServiceProducto;

@RestController
@RequestMapping
public class ControllerProducto {
	
	@Autowired
	private ServiceProducto serviceProducto;
	
	@GetMapping
	public List<EntityProducto> obtenerTodos(){
		return serviceProducto.obtenerTodos();		
	}
	
	@GetMapping ("/{id}")
	public Optional<EntityProducto> obtenerPorId(@PathVariable Long id){
		return serviceProducto.obtenerPorId(id);
	}
	
	@PostMapping
	public EntityProducto guardarProducto(@RequestBody EntityProducto EntityProveedor) {
		return serviceProducto.guardar(EntityProveedor);
	}
	
	@DeleteMapping
	public void eliminarProducto (@PathVariable Long id) {
		serviceProducto.eliminar(id); 
	}

}
