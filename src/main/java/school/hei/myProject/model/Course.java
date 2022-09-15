package school.hei.myProject.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private String id;

    @NonNull
    private String ref;
    @NonNull
    private String name;
    @NonNull
    @Column(nullable = false)
    private Integer credit;

    private Integer total_hour;
}
