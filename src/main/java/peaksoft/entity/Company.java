package peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
public class Company {
    @Id
    @SequenceGenerator(name = "company_gen",
    sequenceName = "company_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "company_name")
    private String companyName;
    private String locatedCountry;
    public Company(String companyName, String locatedCountry) {
        this.companyName = companyName;
        this.locatedCountry = locatedCountry;
    }
    @OneToMany(cascade = ALL, mappedBy = "company")
    private List<Course> courses = new ArrayList<>();

    @OneToMany(cascade = ALL, mappedBy = "company")
    private List<Instructor> instructors;

    @OneToMany(cascade = ALL, mappedBy = "company")
    private List<Student> students = new ArrayList<>();

    public void addCourse(Course course){
        if (courses == null){
            courses = new ArrayList<>();
        }
        courses.add(course);
    }
    public void addStudent(Student student){
        if (students == null){
            students = new ArrayList<>();
        }
        students.add(student);
    }
    public void addInstructor(Instructor instructor){
        if (instructors == null){
            instructors = new ArrayList<>();
        }
        instructors.add(instructor);
    }
}
