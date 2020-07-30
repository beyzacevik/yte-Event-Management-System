package yte.test.EMS.web.dto;


import lombok.Getter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;
import lombok.Setter;
import yte.test.EMS.model.Event;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantDto {

    private String name;
    private String surname;
    private Long tcno;
    private List<Event> events;
}

