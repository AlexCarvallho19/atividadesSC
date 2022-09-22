package figurinhas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import figurinhas.demo.models.Figurinha;

@Repository
public interface FigurinhaRepository extends JpaRepository<Figurinha, Long> {
	
}
