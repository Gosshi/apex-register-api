package gosshi.apexregisterapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountid")
    Long accountId;

    @Column(name = "accountname")
    String accountName;

    String password;

    @Column(name = "administerflag")
    Boolean administerFlag;

    @Column(name = "deleteflag")
    Boolean deleteFlag;


}
