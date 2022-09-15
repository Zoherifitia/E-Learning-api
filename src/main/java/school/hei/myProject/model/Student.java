package school.hei.myProject.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private String id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String ref;


    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    private String phone;

    private LocalDate birthDate;
    private Instant entranceDatetime;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @NotNull
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Student student = (Student) o;
        return id != null && Objects.equals(id, student.id);
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
