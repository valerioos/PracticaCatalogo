package Service;

import java.util.List;
import java.util.Optional;
import Entity.EntityProducto;

public interface ServiceProducto {
	List<EntityProducto> obtenerTodos();
	Optional<EntityProducto> obtenerPorId(Long id);
	EntityProducto guardar(EntityProducto EntityProducto);
	void eliminar(Long id);
}
