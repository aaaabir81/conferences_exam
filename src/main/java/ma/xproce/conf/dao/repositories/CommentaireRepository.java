package ma.xproce.conf.dao.repositories;

import ma.xproce.conf.dao.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {
}
