package api.ache_pet.modules.missing.model;

import api.ache_pet.modules.comuns.enuns.ECastred;
import api.ache_pet.modules.comuns.enuns.EStatusPet;
import api.ache_pet.modules.comuns.model.Pet;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name="PET_MISSING")
public class PetMissing extends Pet {

    @Column(name = "NAME", nullable = false, length = 255)
    private String missingPetName;

    @Column(name = "AGE", length = 20)
    private String missingPetAge;

    @Enumerated(EnumType.STRING)
    @Column(name = "CASTRED", nullable = false)
    private ECastred castred;

    @Column(name="MISSING_DATE")
    private LocalDateTime missingDate;

    public PetMissing(){
        this.setStatusPet(EStatusPet.MISSING);
        this.castred = ECastred.NO;
    }
}
