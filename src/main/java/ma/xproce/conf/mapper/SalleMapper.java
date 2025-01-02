package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Salle;
import ma.xproce.conf.dto.SalleDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SalleMapper {
    private final ModelMapper mapper = new ModelMapper();

    public SalleDto toDto (Salle salle) {
        return mapper.map(salle, SalleDto.class);
    }

    public Salle toEntity (SalleDto salleDto) {
        return mapper.map(salleDto, Salle.class);
    }
}
