package yte.test.EMS.mapper;




import yte.test.EMS.model.Event;
import yte.test.EMS.web.dto.EventDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDto mapToDto(Event event);

    List<EventDto> mapToDto(List<Event> eventList);

    Event mapToEntity(EventDto eventDto);
    List<Event> mapToEntity(List<EventDto> eventDtoList);

}

