package gosshi.apexregisterapi.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Map {
    @Id
    @Column(name = "map_id", nullable = false)
    private Long map_id;


    private String mapName;

    private Boolean deleteFlag;

    public Long getMap_id() {
        return map_id;
    }

    public void setMap_id(Long map_id) {
        this.map_id = map_id;
    }


}
