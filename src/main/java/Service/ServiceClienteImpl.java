package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Entity.EntityCliente;
import Repository.RepositoryCliente;

@Service
public class ServiceClienteImpl implements ServiceCliente {
	
	@Autowired
	private RepositoryCliente repositoryCliente;

	@Override
	public List<EntityCliente> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositoryCliente.findAll();
	}

	@Override
	public Optional<EntityCliente> obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public EntityCliente guardar(EntityCliente EntityCliente) {
		// TODO Auto-generated method stub
		return repositoryCliente.save(EntityCliente);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
