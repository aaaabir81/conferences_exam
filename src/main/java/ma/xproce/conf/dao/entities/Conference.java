package ma.xproce.conf.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private LocalDateTime date;
    private LocalDateTime heure_debut;
    private LocalDateTime heure_fin;
    private String description;

    @ManyToOne
    private Session session;

    @ManyToOne
    private Speaker speaker;

    @OneToMany(mappedBy = "conference")
    private List<Commentaire> commentaires;

}
