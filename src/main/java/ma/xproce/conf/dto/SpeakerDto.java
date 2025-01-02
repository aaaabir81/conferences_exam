package ma.xproce.conf.dto;

import jakarta.persistence.OneToMany;
import lombok.*;
import ma.xproce.conf.dao.entities.Conference;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class SpeakerDto extends ParticipantDto{
    private String lien_profil_pro;
}
