package gosshi.apexregisterapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "legends")
public class Legends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "legendsid")
    Long legendsId;

    @Column(name = "legendsname")
    String legendsName;

    @Column(name = "deleteflag")
    Boolean deleteFlag;

}
