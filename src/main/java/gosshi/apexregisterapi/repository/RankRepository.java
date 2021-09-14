package gosshi.apexregisterapi.repository;


import gosshi.apexregisterapi.domain.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RankRepository extends JpaRepository<Rank, Long> {
}
