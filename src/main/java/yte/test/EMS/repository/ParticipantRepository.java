package yte.test.EMS.repository;



import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import yte.test.EMS.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@EnableJpaRepositories
@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {


}
