package ma.xproce.conf.dto;

import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.xproce.conf.dao.entities.Conference;
import ma.xproce.conf.dao.entities.Participant;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class CommentaireDto {

    private LocalDateTime date;
    private String contenu;
    private Integer nb_likes;
    private ParticipantDto participant;
}
