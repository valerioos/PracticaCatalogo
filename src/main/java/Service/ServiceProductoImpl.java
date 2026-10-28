package Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.EntityProducto;
import Repository.RepositoryProducto;

@Service
public class ServiceProductoImpl implements ServiceProducto {
	
	@Autowired
	private RepositoryProducto repositoryProducto;

	@Override
	public List<EntityProducto> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositoryProducto.findAll();
	}

	@Override
	public Optional<EntityProducto> obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public EntityProducto guardar(EntityProducto EntityProducto) {
		// TODO Auto-generated method stub
		return repositoryProducto.save(EntityProducto);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
