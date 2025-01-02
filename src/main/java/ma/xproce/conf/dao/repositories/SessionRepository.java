package ma.xproce.conf.dao.repositories;

import ma.xproce.conf.dao.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Integer> {
}
