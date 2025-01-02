package ma.xproce.conf.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @ManyToOne
    private Moderateur moderateur;

    @OneToMany(mappedBy = "session")
    private List<Conference> conferences;

    @OneToMany(mappedBy = "session")
    private List<Inscription> inscriptions;

    @OneToOne
    private Salle salle;
}
