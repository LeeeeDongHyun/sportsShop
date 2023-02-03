package project.sportsshop.repository;


        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.http.ResponseEntity;
        import org.springframework.stereotype.Repository;
        import project.sportsshop.dto.UserFormDto;
        import project.sportsshop.entity.User;

        import java.util.List;
        import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String>{



        Optional<User> findById(String id);

        List<User> findAll();
}
