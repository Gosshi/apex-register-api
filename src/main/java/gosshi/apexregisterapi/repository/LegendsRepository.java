package gosshi.apexregisterapi.repository;

import gosshi.apexregisterapi.domain.Legends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LegendsRepository extends JpaRepository<Legends, Long> {
}
