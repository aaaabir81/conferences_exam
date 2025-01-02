package ma.xproce.conf.service;

import ma.xproce.conf.dto.ConferenceDto;

import java.util.List;

public interface IConferenceService {
    ConferenceDto ajouterConference(ConferenceDto conferenceDto);
    List<ConferenceDto> trouverConferencesParSpeaker(Integer speakerId);
    List<ConferenceDto> getConferences();

}
