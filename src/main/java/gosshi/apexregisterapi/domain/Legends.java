package gosshi.apexregisterapi.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Legends")
public class Legends {
    @Id
    @Column(name = "legends_id", nullable = false)
    private Long legends_id;


    private String legendsName;

    private Boolean deleteFlag;

    public Long getLegends_id() {
        return legends_id;
    }

    public void setLegends_id(Long legends_id) {
        this.legends_id = legends_id;
    }


}
