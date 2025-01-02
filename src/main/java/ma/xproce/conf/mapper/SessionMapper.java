package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Session;
import ma.xproce.conf.dto.SessionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SessionMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Session toEntity (SessionDto sessiondto) {
        return mapper.map(sessiondto, Session.class);
    }

    public SessionDto toDto (Session session) {
        return mapper.map(session, SessionDto.class);
    }

}
