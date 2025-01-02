package ma.xproce.conf.dto;

import jakarta.persistence.OneToOne;
import lombok.*;
import ma.xproce.conf.dao.entities.Session;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class SalleDto {
    private String nom;
    private SessionDto session;
}
