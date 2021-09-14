package gosshi.apexregisterapi.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Rank {
    @Id
    @Column(name = "rank_id", nullable = false)
    private Long rank_id;

    private String rankName;

    private Boolean deleteFlag;

    public Long getRank_id() {
        return rank_id;
    }

    public void setRank_id(Long rank_id) {
        this.rank_id = rank_id;
    }


}
