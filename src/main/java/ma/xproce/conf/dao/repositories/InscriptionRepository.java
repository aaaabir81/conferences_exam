package ma.xproce.conf.dao.repositories;

import ma.xproce.conf.dao.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {
}
