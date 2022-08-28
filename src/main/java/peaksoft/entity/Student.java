package peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "students")
@Getter @Setter
@NoArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name = "student_gen",
    sequenceName = "student_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private StudyFormat studyFormat;

    public Student(String firstName, String lastName, int phoneNumber, String email, StudyFormat studyFormat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.studyFormat = studyFormat;
    }

    @ManyToOne(cascade = {DETACH,MERGE,PERSIST,REFRESH})
    private Course course;

    @ManyToOne(cascade = {DETACH, PERSIST, MERGE, REFRESH})
    private Company company;
}
