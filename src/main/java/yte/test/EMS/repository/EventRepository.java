package yte.test.EMS.repository;




import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import yte.test.EMS.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface EventRepository  extends JpaRepository<Event, Long> {

    @Query(value = "select e from Event e where :now < e.endDate ")
    List<Event> findByEndDateBefore(@Param("now") Date now);


}
