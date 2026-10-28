package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.EntityProveedor;

@Repository
public interface RepositoryProveedor extends JpaRepository<EntityProveedor, Long> {

}
