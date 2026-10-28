package Service;

import java.util.List;
import java.util.Optional;
import Entity.EntityCliente;

public interface ServiceCliente {
	List<EntityCliente> obtenerTodos(); //
	Optional<EntityCliente> obtenerPorId(Long id);
	EntityCliente guardar(EntityCliente EntityCliente);
	void eliminar (Long id);
	

}
