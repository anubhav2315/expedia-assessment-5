package userjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import userjpa.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Using the named query
    List<User> findByUsername(@Param("username") String username);

    // Alternatively, you can use the following JPQL query directly in the method
    // @Query("SELECT u FROM User u WHERE u.username = :username")
    // List<User> findByUsername(@Param("username") String username);
}

