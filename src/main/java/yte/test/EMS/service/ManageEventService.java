package yte.test.EMS.service;




import org.springframework.beans.factory.annotation.Autowired;
import yte.test.EMS.model.Event;
import yte.test.EMS.model.Participant;
import yte.test.EMS.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ManageEventService {


    private final EventRepository eventRepository;


    @SneakyThrows
    public List<Event> listAllEvents() {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String formattedDateTime = now.format(formatter);
        Date dt = new SimpleDateFormat("yyyyMMdd").parse(formattedDateTime);
        System.out.println(dt);
        return eventRepository.findByEndDateBefore(dt);
    }


    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    @Transactional
    public Event updateEvent(Event event, Long id) {
        Optional<Event> eventOptional = eventRepository.findById(id);
        if (eventOptional.isPresent()) {
            updateEventFromDB(event, eventOptional.get());
            return eventRepository.save(event);
        } else {
            throw new EntityNotFoundException();
        }

    }


    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }


    private void updateEventFromDB(Event event, Event eventFromDB) {

        eventFromDB.setName(event.getName());
        eventFromDB.setStartDate(event.getStartDate());
        eventFromDB.setEndDate(event.getEndDate());
        eventFromDB.setQuota(event.getQuota());

    }

}