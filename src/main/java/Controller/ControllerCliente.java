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
import Entity.EntityCliente;
import Service.ServiceCliente;

@RestController
@RequestMapping ("api/clientes")
public class ControllerCliente {

	@Autowired
	private ServiceCliente serviceCliente;
		
	@GetMapping
	public List<EntityCliente> obtenerTodos(){ //se coloca una lista para q devuelva los elementos ordenados, y se coloca la entidad.
		return serviceCliente.obtenerTodos();
	}
	
	@GetMapping("/{id}")
	public Optional<EntityCliente> obtenerPorId (@PathVariable Long id){
		return serviceCliente.obtenerPorId(id);
	}
	
	@PostMapping
	public EntityCliente guardarCliente(@RequestBody EntityCliente EntityCliente) {
		return serviceCliente.guardar(EntityCliente);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		serviceCliente.eliminar(id);
	}
}
