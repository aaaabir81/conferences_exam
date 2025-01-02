package ma.xproce.conf.dto;


import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import ma.xproce.conf.dao.entities.Commentaire;
import ma.xproce.conf.dao.entities.Session;
import ma.xproce.conf.dao.entities.Speaker;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class ConferenceDto {
    private String titre;
    private LocalDateTime date;
    private LocalDateTime heure_debut;
    private LocalDateTime heure_fin;
    private String description;
    private SessionDto session;
    private SpeakerDto speaker;
    private List<CommentaireDto> commentaires;
}
