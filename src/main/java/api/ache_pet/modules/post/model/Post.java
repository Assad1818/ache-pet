package api.ache_pet.modules.post.model;


import api.ache_pet.modules.comuns.enuns.ESituation;
import api.ache_pet.modules.comuns.enuns.EStatusPet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "SITUATION")
    private ESituation situation;

}
