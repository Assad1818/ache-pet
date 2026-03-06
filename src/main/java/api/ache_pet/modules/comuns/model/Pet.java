package api.ache_pet.modules.comuns.model;

import api.ache_pet.modules.comuns.enuns.EStatusPet;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(of = "id")
@Table (name = "PET")
@Entity
public abstract class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SPECIE", nullable = false, length = 255)
    private String species;

    @Column(name = "BREED", length = 255)
    private String breed;

    @Column(name = "SIZE", nullable = false, length = 255)
    private String size;

    @Column(name = "COLOR", nullable = false, length = 255)
    private String color;

    @Column(name ="REGISTER_DATE", nullable = false)
    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_PET", nullable = false)
    private EStatusPet statusPet;

    @PrePersist
    public void prePersist(){
        this.date = LocalDateTime.now();
    }
}
