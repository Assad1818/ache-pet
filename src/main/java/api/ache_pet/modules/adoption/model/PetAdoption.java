package api.ache_pet.modules.adoption.model;

import api.ache_pet.modules.comuns.enuns.ECastred;
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

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column (name = "AGE")
    private String age;

    @Enumerated(EnumType.STRING)
    @Column(name = "DELIVERY")
    private EStatusDelivery deliveryStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "VACCINE")
    private EVaccinationStatus vaccineStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "CASTRED")
    private ECastred castred;

    public PetAdoption(){
        this.setStatus(EStatusPet.ADOPTION);
        this.vaccineStatus = EVaccinationStatus.UNKNOWN;
        this.deliveryStatus = EStatusDelivery.NO;
        this.castred = ECastred.NO;
    }
}
