package gosshi.apexregisterapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "game_mode")
public class Mode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modeid", nullable = false)
    private Long mode_id;

    @Column(name = "modename")
    private String modeName;

    @Column(name = "deleteflag")
    private Boolean deleteFlag;

}
