package user.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import user.UserApplication;

@Entity
@Table(name = "User_table")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String userid;

    private String age;

    private Country country;

    public static UserRepository repository() {
        UserRepository userRepository = UserApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }
}
