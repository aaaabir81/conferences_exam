package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Commentaire;
import ma.xproce.conf.dto.CommentaireDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CommentaireMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Commentaire fromCommentaireDtotoCommentaire(CommentaireDto commentaireDto) {
        Commentaire commentaire = mapper.map(commentaireDto, Commentaire.class);
        return commentaire;
    }

    public CommentaireDto fromCommentairetoCommentaireDto(Commentaire commentaire) {
        CommentaireDto commentaireDto = new CommentaireDto();
        return commentaireDto;
    }

}
