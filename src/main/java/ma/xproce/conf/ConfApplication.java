package ma.xproce.conf;

import ma.xproce.conf.dao.entities.Speaker;
import ma.xproce.conf.dao.entities.TypeGenre;
import ma.xproce.conf.dao.repositories.ConferenceRepository;
import ma.xproce.conf.dao.repositories.SpeakerRepository;
import ma.xproce.conf.dao.entities.Conference;
import ma.xproce.conf.dto.SpeakerDto;
import ma.xproce.conf.mapper.SpeakerMapper;
import ma.xproce.conf.service.ConferenceManager;
import ma.xproce.conf.service.IConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class ConfApplication implements CommandLineRunner {

    @Autowired
    private IConferenceService conferenceService;

    @Autowired
    private SpeakerRepository speakerRepository;

    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private SpeakerMapper speakerMapper;

    public static void main(String[] args) {
        SpringApplication.run(ConfApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Speaker speaker = new Speaker();
        speaker.setNom("Aabir");
        speaker.setEmail("aabir@example.com");
        speaker.setLien_profil_pro("url");
        speaker.setGenre(TypeGenre.Femme);
        speaker.setLien_profil_pro("urll");

        speakerRepository.save(speaker);


        Conference Conference1 = new Conference();
        Conference1.setTitre("Conférence sur les technologies JEE");
        Conference1.setDate(LocalDateTime.of(2025, 5, 10, 10, 0));
        Conference1.setDescription("Une conférence approfondie sur les technologies JEE modernes.");
        Conference1.setSpeaker(speaker);

        Conference Conference2 = new Conference();
        Conference2.setTitre("Conférence sur Spring Boot");
        Conference2.setDate(LocalDateTime.of(2025, 5, 12, 14, 0));
        Conference2.setDescription("Une conférence pratique sur le développement d'applications avec Spring Boot.");
        Conference2.setSpeaker(speaker);

        conferenceRepository.save(Conference1);
        conferenceRepository.save(Conference2);

        System.out.println("Conferences ajoutées avec succès !");


    }
}