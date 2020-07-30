package yte.test.EMS.web;

import yte.test.EMS.mapper.EventMapper;
import yte.test.EMS.mapper.ParticipantMapper;
import yte.test.EMS.model.Event;
import yte.test.EMS.model.Participant;
import yte.test.EMS.service.ManageEventService;
import yte.test.EMS.service.ManageParticipantService;
import yte.test.EMS.web.dto.EventDto;
import yte.test.EMS.web.dto.ParticipantDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequiredArgsConstructor
public class ManageParticipantController {


    private final ManageParticipantService manageParticipantService;
    private final ParticipantMapper participantMapper;

    @Transactional
    @PostMapping("/participate")
    public ParticipantDto addParticipant(@RequestBody ParticipantDto participantDto){

        Participant participant = participantMapper.mapToEntity(participantDto);
        Participant addedParticipant = manageParticipantService.addParticipant(participant);
        return participantMapper.mapToDto(addedParticipant);
    }


}
