package ma.xproce.conf.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Speaker extends Participant{
    private String lien_profil_pro;

    @OneToMany(mappedBy = "speaker")
    private List<Conference> conferences;
}
