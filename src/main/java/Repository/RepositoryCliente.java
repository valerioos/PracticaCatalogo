package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.EntityCliente;

@Repository
public interface RepositoryCliente extends JpaRepository<EntityCliente, Long>{ //<entidad, id>

}
