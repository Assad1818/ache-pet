package api.ache_pet.modules.adoption.model;

import api.ache_pet.modules.comuns.model.Pet;
import api.ache_pet.modules.comuns.enuns.EStatusDelivery;
import api.ache_pet.modules.comuns.enuns.EStatusPet;
import api.ache_pet.modules.comuns.enuns.EVaccinationStatus;
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
