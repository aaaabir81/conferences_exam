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
public class Moderateur extends Participant {
    private String specialite;

    @OneToMany(mappedBy = "moderateur")
    private List<Session> sessions;
}
