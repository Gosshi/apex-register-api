package gosshi.apexregisterapi.repository;


import gosshi.apexregisterapi.domain.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResultsRepository extends JpaRepository<Results, Long> {
}

