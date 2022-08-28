package peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "instructors")
@Getter @Setter
@NoArgsConstructor
public class Instructor {
    @Id
    @SequenceGenerator(name = "instructor_gen",
    sequenceName = "instructor_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String specialization;

    public Instructor(String firstName, String lastName, int phoneNumber, String email, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.specialization = specialization;
    }

    @ManyToMany(cascade = {DETACH, REFRESH, PERSIST, MERGE})
    @JoinTable
    private List<Course> courses;

    @ManyToOne(cascade = {DETACH, REFRESH, PERSIST, MERGE})
    private Company company;

    public void addCourse(Course course){
        if (courses == null){
            courses = new ArrayList<>();
        }
        courses.add(course);
    }
    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
