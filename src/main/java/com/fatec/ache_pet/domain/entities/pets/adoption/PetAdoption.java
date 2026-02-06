package com.fatec.ache_pet.domain.entities.pets.adoption;

import com.fatec.ache_pet.domain.entities.pets.Pet;
import com.fatec.ache_pet.domain.enums.pets.EStatusDelivery;
import com.fatec.ache_pet.domain.enums.pets.EStatusPet;
import com.fatec.ache_pet.domain.enums.pets.EVaccinationStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PET_ADOPTION")
public class PetAdoption extends Pet {

    @Column(name = "NOME", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "DISPONIVEL_ENTREGA")
    private EStatusDelivery deliveryStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private EVaccinationStatus vaccinationStatus;
    public PetAdoption(){
        this.setStatus(EStatusPet.ADOPTION);
        this.vaccinationStatus = EVaccinationStatus.UNKNOWN;
        this.deliveryStatus = EStatusDelivery.NO;
    }
}
