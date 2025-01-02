package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Conference;
import ma.xproce.conf.dto.ConferenceDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConferenceMapper {
    private final ModelMapper mapper = new ModelMapper();

    public ConferenceDto toDto(Conference conference) {
        return mapper.map(conference, ConferenceDto.class);
    }
    public Conference toEntity(ConferenceDto conferenceDto) {
        return mapper.map(conferenceDto, Conference.class);
    }

}
