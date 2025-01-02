package ma.xproce.conf.dto;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import ma.xproce.conf.dao.entities.Conference;
import ma.xproce.conf.dao.entities.Inscription;
import ma.xproce.conf.dao.entities.Moderateur;
import ma.xproce.conf.dao.entities.Salle;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class SessionDto {
    private String nom;
    private ModerateurDto moderateur;
    private List<InscriptionDto> inscriptions;
    private SalleDto salle;
}
