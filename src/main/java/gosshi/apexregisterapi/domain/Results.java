package gosshi.apexregisterapi.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Results {
    @Id
    @Column(name = "results_id", nullable = false)
    private Long results_id;


    private Long damage;

    private Long kills;

    private Long assists;

    private Long rankPoints;

    private Long accountId;

    private Long modeId;

    private Long rankId;

    private Long legendsId;

    private Long badPointsId;

    private boolean deleteFlag;

    private LocalDateTime datetime;

    public Long getResults_id() {
        return results_id;
    }

    public void setResults_id(Long results_id) {
        this.results_id = results_id;
    }

}
