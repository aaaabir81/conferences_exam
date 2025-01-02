package ma.xproce.conf.dao.repositories;

import ma.xproce.conf.dao.entities.Invite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InviteRepository extends JpaRepository<Invite, Integer> {
}
