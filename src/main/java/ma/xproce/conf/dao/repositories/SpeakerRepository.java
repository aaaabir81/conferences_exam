package ma.xproce.conf.dao.repositories;

import ma.xproce.conf.dao.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {

    Speaker findByNom(String name);
}
