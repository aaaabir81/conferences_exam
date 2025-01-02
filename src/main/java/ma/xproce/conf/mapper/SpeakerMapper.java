package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Speaker;
import ma.xproce.conf.dto.SpeakerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SpeakerMapper {
    private static final ModelMapper mapper = new ModelMapper();

    public static SpeakerDto toDto(Speaker speaker) {
        return mapper.map(speaker, SpeakerDto.class);
    }

    public Speaker toSpeaker(SpeakerDto speakerDto) {
        return mapper.map(speakerDto, Speaker.class);
    }

}
