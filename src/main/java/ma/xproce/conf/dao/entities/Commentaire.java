package ma.xproce.conf.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime date;
    private String contenu;
    private Integer nb_likes;

    @ManyToOne
    private Participant participant;

    @ManyToOne
    private Conference conference;

}
