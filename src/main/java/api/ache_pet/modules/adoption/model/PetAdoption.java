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

        @Column(name = "NAME", nullable = false, length = 255)
        private String adoptionPetName;

        @Column (name = "AGE", nullable = false, length = 20)
        private String adoptionPetAge;

        @Enumerated(EnumType.STRING)
        @Column(name = "DELIVERY", nullable = false)
        private EStatusDelivery deliveryStatus;

        @Enumerated(EnumType.STRING)
        @Column(name = "VACCINE", nullable = false)
        private EVaccinationStatus vaccineStatus;

        @Enumerated(EnumType.STRING)
        @Column(name = "CASTRED", nullable = false)
        private ECastred castred;

        public PetAdoption(){
            this.setStatusPet(EStatusPet.ADOPTION);
            this.vaccineStatus = EVaccinationStatus.UNKNOWN;
            this.deliveryStatus = EStatusDelivery.NO;
            this.castred = ECastred.NO;
        }
    }
