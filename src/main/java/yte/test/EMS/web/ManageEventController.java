
package yte.test.EMS.web;



import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import yte.test.EMS.mapper.EventMapper;
import yte.test.EMS.model.Event;
import yte.test.EMS.model.Participant;
import yte.test.EMS.service.ManageEventService;
import yte.test.EMS.web.dto.EventDto;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ManageEventController {

    private final ManageEventService manageEventService;
    private final EventMapper eventMapper;
    @GetMapping("/events")
    public List<EventDto> listAllEvents(){

        List<Event> events = manageEventService.listAllEvents();
        return eventMapper.mapToDto(events);

    }

    @PostMapping("/events")
    public EventDto addEvent(@RequestBody EventDto eventDto){

        Event event = eventMapper.mapToEntity(eventDto);
        Event addedEvent = manageEventService.addEvent(event);
        return eventMapper.mapToDto(addedEvent);

    }


    @PutMapping("/events/{id}")
    public EventDto updateStudent(@PathVariable Long id,  @RequestBody EventDto eventDto) {
        Event event = eventMapper.mapToEntity(eventDto);
        Event updatedStudent = manageEventService.updateEvent(event, id);
        return eventMapper.mapToDto(updatedStudent);
    }








}
