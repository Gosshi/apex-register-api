package gosshi.apexregisterapi.repository;


import gosshi.apexregisterapi.domain.Mode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeRepository extends JpaRepository<Mode, Long> {
}