package gosshi.apexregisterapi.domain;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "BAD_POINTS")
public class BadPoints {

    private Long badPointsId;

    private String bad_PointsName;

    private Long accountId;

    private Boolean deleteFlag;
}
