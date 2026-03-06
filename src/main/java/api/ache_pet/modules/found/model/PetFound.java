package api.ache_pet.modules.found.model;
import api.ache_pet.modules.comuns.enuns.EStatusDelivery;
import api.ache_pet.modules.comuns.enuns.EStatusPet;
import api.ache_pet.modules.comuns.model.Pet;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name= "PET_FOUND")
@Entity
public class PetFound extends Pet {

    @Column(name = "FOUND_DATE")
    private LocalDateTime dateFound;

    @Enumerated(EnumType.STRING)
    @Column(name = "DELIVERY")
    private EStatusDelivery statusDelivery;
    public PetFound(){
        this.setStatusPet(EStatusPet.FOUND);
        this.statusDelivery = EStatusDelivery.NO;
    }
}