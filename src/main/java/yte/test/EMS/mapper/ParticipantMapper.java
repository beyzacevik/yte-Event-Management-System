package yte.test.EMS.mapper;


import yte.test.EMS.model.Event;
import yte.test.EMS.model.Participant;
import yte.test.EMS.web.dto.EventDto;
import yte.test.EMS.web.dto.ParticipantDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParticipantMapper {


    ParticipantDto mapToDto(Participant Participant);

    List<ParticipantDto> mapToDto(List<Participant> participantList);

    Participant mapToEntity(ParticipantDto participantDto);

    List<Participant> mapToEntity(List<ParticipantDto> participantDtoList);

}
