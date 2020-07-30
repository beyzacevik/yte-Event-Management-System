package yte.test.EMS.model;





import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    private String password;
    @Column(name = "tcno")
    private Long tcno;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)


    private Collection<Role> roles;


    

    @OneToMany

    private Set<Event> events;
    


    public <T> Users(String name, String surname, String username, String encode, Long tcno, Collection<Role> role_user) {

        this.name = name;
        this.surname = surname;
        this.username = username;
        this.tcno = tcno;
        this.password = password;
    }

    @OneToMany(mappedBy = "user")

    private Collection<Event> event;
    

  
}
