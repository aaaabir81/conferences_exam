package ma.xproce.conf.dto;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import ma.xproce.conf.dao.entities.Invite;
import ma.xproce.conf.dao.entities.Session;
import ma.xproce.conf.dao.entities.TypeStatut;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class InscriptionDto {
    private LocalDateTime date;
    private TypeStatut statut;
    private SessionDto session;
    private List<InviteDto> invites;
}
