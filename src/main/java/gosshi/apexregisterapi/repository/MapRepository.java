package gosshi.apexregisterapi.repository;

import gosshi.apexregisterapi.domain.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MapRepository extends JpaRepository<Map, Long> {
}

