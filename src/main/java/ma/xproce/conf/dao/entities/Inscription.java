package ma.xproce.conf.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime date;
    private TypeStatut statut;

    @ManyToOne
    private Session session;

    @OneToMany(mappedBy = "inscription")
    private List<Invite> invites;
}


