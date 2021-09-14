package gosshi.apexregisterapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ranked")
public class Rank {
    @Id
    @Column(name = "rankid", nullable = false)
    Long rankId;

    @Column(name = "rankname")
    String rankName;

    @Column(name = "deleteflag")
    Boolean deleteFlag;

}
