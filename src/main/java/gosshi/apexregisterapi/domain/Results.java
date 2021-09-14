package gosshi.apexregisterapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "results")
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resultsid", nullable = false)
    Long resultsId;

    Long damage;

    Long kills;

    Long assists;

    @Column(name = "rankpoints")
    Long rankPoints;

    @Column(name = "accountid")
    Long accountId;

    @Column(name = "modeid")
    Long modeId;

    @Column(name = "rankid")
    Long rankId;

    @Column(name = "legendsid")
    Long legendsId;

    @Column(name = "badpointsid")
    Long badPointsId;

    @Column(name = "deleteflag")
    boolean deleteFlag;

    LocalDateTime datetime;


}
