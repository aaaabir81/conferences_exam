package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Inscription;
import ma.xproce.conf.dto.InscriptionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InscriptionMapper {

    private final ModelMapper mapper = new ModelMapper();

    public InscriptionDto FromInscriptiontoInscriptionDto(Inscription inscription) {
        return mapper.map(inscription, InscriptionDto.class);
    }

    public Inscription FromInscriptionDtoToInscription(InscriptionDto inscriptionDto) {
        return mapper.map(inscriptionDto, Inscription.class);
    }
}
