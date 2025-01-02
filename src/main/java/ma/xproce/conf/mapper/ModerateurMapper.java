package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Moderateur;
import ma.xproce.conf.dto.ModerateurDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModerateurMapper {

    private final ModelMapper mapper = new ModelMapper();

    public ModerateurDto toDto(Moderateur moderateur) {

        return mapper.map(moderateur, ModerateurDto.class);
    }

    public Moderateur toEntity(ModerateurDto moderateurDto) {
        return mapper.map(moderateurDto, Moderateur.class);
    }
}
