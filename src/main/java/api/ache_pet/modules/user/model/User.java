package api.ache_pet.modules.user.model;


import api.ache_pet.modules.comuns.enuns.ESituation;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME", nullable = false, length = 255)
    private String name;

    @Column(name = "CPF", unique = true, nullable = false)
    private int cpf;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PHONE", nullable = false, length = 11)
    private String phone;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "DATE_REGISTER", nullable = false)
    private LocalDateTime  dateRegister;

    @Enumerated(EnumType.STRING)
    @Column(name = "SITUATION")
    private ESituation situation;

    @PrePersist
    public void prePersist(){
        this.dateRegister = LocalDateTime.now();
    }

    public User(){
        this.situation = ESituation.ACTIVE;
    }
    aaaaaaaaaaaaaaaaaaaaaaa

}
