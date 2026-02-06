package com.fatec.ache_pet.domain.entities.pets.found;

import com.fatec.ache_pet.domain.entities.pets.Pet;
import com.fatec.ache_pet.domain.enums.pets.EStatusPet;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name= "PET_FOUND")
@Entity
public class PetFound extends Pet {

    @Column(name = "DATA_ENCONTRADO", nullable = false)
    private LocalDateTime dateFound;

    public PetFound(){
        this.setStatus(EStatusPet.FOUND);
    }
}
