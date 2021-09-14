package gosshi.apexregisterapi.repository;


import gosshi.apexregisterapi.domain.BadPoints;
import gosshi.apexregisterapi.domain.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BadPointsRepository extends JpaRepository<BadPoints, Long> {
}
