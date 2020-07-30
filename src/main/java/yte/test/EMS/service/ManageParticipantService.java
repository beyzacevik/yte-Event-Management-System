package yte.test.EMS.service;

import yte.test.EMS.model.Participant;
import yte.test.EMS.repository.ParticipantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManageParticipantService {


    private final ParticipantRepository participantRepository;

    public Participant addParticipant(Participant participant) {

        return participantRepository.save(participant);
    }


}
