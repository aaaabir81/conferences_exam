package ma.xproce.conf.dto;

import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.xproce.conf.dao.entities.Inscription;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class InviteDto extends  ParticipantDto {
    private String affiliation;

    private InscriptionDto inscription;
}
