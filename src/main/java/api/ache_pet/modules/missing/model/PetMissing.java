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

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private String age;

    @Enumerated(EnumType.STRING)
    @Column(name = "CASTRED")
    private ECastred castred;

    @Column(name="MISSING_DATE")
    private LocalDateTime missingDate;

    public PetMissing(){
        this.setStatus(EStatusPet.MISSING);
        this.castred = ECastred.NO;
    }
}
