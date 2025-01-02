package ma.xproce.conf.dto;

import jakarta.persistence.OneToMany;
import lombok.*;
import ma.xproce.conf.dao.entities.Session;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ModerateurDto extends ParticipantDto{
    private String specialite;
    private List<SessionDto> sessions;
}
