package yte.test.EMS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import yte.test.EMS.model.Users;

@Repository

public interface UserRepository extends JpaRepository<Users, Long> {
    Users  findByUsername(String username);
}
