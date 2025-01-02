package ma.xproce.conf.service;

import ma.xproce.conf.dao.entities.Conference;
import ma.xproce.conf.dao.entities.Speaker;
import ma.xproce.conf.dao.repositories.*;
import ma.xproce.conf.dto.ConferenceDto;
import ma.xproce.conf.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConferenceManager implements IConferenceService{
    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private SpeakerRepository speakerRepository;

    @Autowired
    private ConferenceMapper conferenceMapper;

    @Autowired
    private SpeakerMapper speakerMapper;

    @Override
    public ConferenceDto ajouterConference(ConferenceDto conferenceDto) {
        Conference conference = conferenceMapper.toEntity(conferenceDto);
        Conference savedConference = conferenceRepository.save(conference);

        return conferenceMapper.toDto(savedConference);
    }

    @Override
    public List<ConferenceDto> getConferences(){
        List<Conference> conferences = conferenceRepository.findAll();
        return conferences.stream().map(conferenceMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public List<ConferenceDto> trouverConferencesParSpeaker(Integer speakerId){
        Speaker speaker = speakerRepository.findById(speakerId)
                .orElseThrow(() -> new RuntimeException("Speaker non trouvé"));
        List<Conference> conferences = conferenceRepository.findBySpeaker(speaker);

        return conferences.stream()
                .map(conferenceMapper::toDto)
                .collect(Collectors.toList());
    }
}
