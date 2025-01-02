package ma.xproce.conf.mapper;

import ma.xproce.conf.dao.entities.Invite;
import ma.xproce.conf.dto.InviteDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InviteMapper {

    private final ModelMapper mapper = new ModelMapper();

    public InviteDto fromInvitetoInviteDto(Invite invite) {
        return mapper.map(invite, InviteDto.class);
    }

    public Invite fromInviteDtotoInvite(InviteDto inviteDto) {
        return mapper.map(inviteDto, Invite.class);
    }
}
