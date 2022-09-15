package school.hei.myProject.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Manager implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private String id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    //@Email(message = "Email must be valid")
    private String email;

    //@NotBlank(message = "Reference is mandatory")
    private String ref;


    @Enumerated(EnumType.STRING)
    private Status status;

    //@NotBlank(message = "Phone number is mandatory")
    private String phone;

    private LocalDate birthDate;
    private Instant entranceDatetime;


    @Enumerated(EnumType.STRING)
    private Sex sex;

    //@NotBlank(message = "Address is mandatory")
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Manager user = (Manager) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public enum Sex {
        M, F
    }

    public enum Status {
        ENABLED, DISABLED
    }
}
