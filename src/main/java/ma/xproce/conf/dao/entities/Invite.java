package ma.xproce.conf.dao.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Invite extends Participant{
    private String affiliation;

    @ManyToOne
    private Inscription inscription;
}
