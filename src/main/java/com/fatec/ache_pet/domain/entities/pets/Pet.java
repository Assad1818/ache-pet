package com.fatec.ache_pet.domain.entities.pets;

import com.fatec.ache_pet.domain.enums.pets.EStatusPet;
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

    @Column(name = "ESPECIE", nullable = false)
    private String species;

    @Column(name = "RACA")
    private String breed;

    @Column(name = "PORTE", nullable = false)
    private String size;

    @Column(name = "COR", nullable = false)
    private String color;

    @Column(name ="DATA_CADASTRO", nullable = false)
    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    private EStatusPet status;

    @PrePersist
    public void prePersist(){
        this.date = LocalDateTime.now();
    }
}
