package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Entity.EntityProveedor;
import Repository.RepositoryProveedor;

@Service
public class ServiceProveedorImpl implements ServiceProveedor {
	
	@Autowired
	private RepositoryProveedor repositoryProveedor;

	@Override
	public List<EntityProveedor> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositoryProveedor.findAll();
	}

	@Override
	public Optional<EntityProveedor> obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public EntityProveedor guardar(EntityProveedor EntityProveedor) {
		// TODO Auto-generated method stub
		return repositoryProveedor.save(EntityProveedor);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
