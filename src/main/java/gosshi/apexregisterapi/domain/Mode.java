package gosshi.apexregisterapi.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Mode {
    @Id
    @Column(name = "mode_id", nullable = false)
    private Long mode_id;

    private String modeName;

    private Boolean deleteFlag;

    public Long getMode_id() {
        return mode_id;
    }

    public void setMode_id(Long mode_id) {
        this.mode_id = mode_id;
    }


}
