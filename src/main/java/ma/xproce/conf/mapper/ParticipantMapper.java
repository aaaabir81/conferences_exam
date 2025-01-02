package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Participant;
import ma.xproce.conf.dto.ParticipantDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ParticipantMapper {

    private final ModelMapper mapper = new ModelMapper();

    public ParticipantDto toDto(Participant participant) {
        return mapper.map(participant, ParticipantDto.class);
    }


    public Participant toEntity(ParticipantDto participantdto) {
        return mapper.map(participantdto, Participant.class);
    }
}
