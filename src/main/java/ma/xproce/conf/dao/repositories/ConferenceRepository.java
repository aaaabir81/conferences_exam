package ma.xproce.conf.dao.repositories;

import ma.xproce.conf.dao.entities.Conference;
import ma.xproce.conf.dao.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
    List<Conference> findBySpeaker(Speaker speaker);
}
