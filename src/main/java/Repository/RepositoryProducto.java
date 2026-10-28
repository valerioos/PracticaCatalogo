package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Entity.EntityProducto;

@Repository
public interface RepositoryProducto extends JpaRepository<EntityProducto, Long>{

}
