package gosshi.apexregisterapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bad_points")
public class BadPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "badpointsid")
    private Long badPointsId;

    @Column(name = "badpointsname")
    private String badPointsName;

    @Column(name = "deleteflag")
    private Boolean deleteFlag;
}
