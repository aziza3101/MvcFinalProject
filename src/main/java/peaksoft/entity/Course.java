package peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
@Entity
@Table(name = "courses")
@Getter @Setter
@NoArgsConstructor
public class Course {
    @Id
    @SequenceGenerator(name = "course_gen",
            sequenceName = "course_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "course_name")
    private String courseName;
    private LocalDate dateOfStart;
    private String duration;
    private String image;
    private String description;

    public Course(String courseName, LocalDate dateOfStart, String duration, String image, String description) {
        this.courseName = courseName;
        this.dateOfStart = dateOfStart;
        this.duration = duration;
        this.image = image;
        this.description = description;
    }

    @ManyToMany(cascade = {DETACH, REFRESH, PERSIST, MERGE}, mappedBy = "courses")
    private List<Instructor> instructors = new ArrayList<>();

    @OneToMany(cascade = ALL, mappedBy = "course")
    private List<Student> students;

    @OneToMany(cascade = ALL, mappedBy = "courses")
    private List<Lesson> lessons;

    @ManyToOne(cascade = {DETACH, REFRESH, PERSIST, MERGE})
    private Company company;

    public void addInstructors(Instructor instructor) {
        if (instructors == null) {
            instructors = new ArrayList<>();
        }
        instructors.add(instructor);
    }
    public void addStudents(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
    }
    public void addLessons(Lesson lesson) {
        if (lessons == null) {
            lessons = new ArrayList<>();
        }
        lessons.add(lesson);
    }
}