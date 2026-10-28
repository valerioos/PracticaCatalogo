package Service;

import java.util.List;
import java.util.Optional;
import Entity.EntityProveedor;

public interface ServiceProveedor {
	List<EntityProveedor> obtenerTodos();
	Optional<EntityProveedor> obtenerPorId(Long id);
	EntityProveedor guardar (EntityProveedor EntityProveedor);
	void eliminar (Long id);
}
