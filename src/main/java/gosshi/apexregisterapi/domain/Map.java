package gosshi.apexregisterapi.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "map")
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mapid", nullable = false)
    Long mapId;

    @Column(name = "mapname")
    String mapName;

    @Column(name = "deleteflag")
    Boolean deleteFlag;

}
