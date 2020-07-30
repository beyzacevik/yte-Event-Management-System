package yte.test.EMS.model;




import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "START_DATE")
    @JsonFormat(pattern="yyyyMMdd")
    private Date startDate;
    @JsonFormat(pattern="yyyyMMdd")
    @Column(name = "END_DATE")
    private Date endDate;
    @Column(name = "quota")
    private Integer quota;


    @ManyToOne( cascade = CascadeType.PERSIST)
    private Users user;





    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(name = "event_participant",
            joinColumns =  @JoinColumn(name = "event_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id", referencedColumnName = "id") )
    private List<Participant> participants;




}
