package ma.xproce.conf.dto;

import jakarta.persistence.OneToMany;
import lombok.*;
import ma.xproce.conf.dao.entities.Commentaire;
import ma.xproce.conf.dao.entities.TypeGenre;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class ParticipantDto {
    private String nom;
    private String email;
    private String photo;
    private TypeGenre genre;
    private List<CommentaireDto> commentaires;
}
