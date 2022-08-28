package peaksoft.repository;

import org.springframework.stereotype.Repository;
import peaksoft.entity.Instructor;

import java.util.List;
@Repository
public interface InstructorRepository {
    void saveInstructor(Instructor instructor);

    List<Instructor> getAllInstructors();

    Instructor getInstructorById(Long id);

    void deleteInstructorById(Long id);

    void updateInstructor(Instructor instructor);
    void assignInstructorToCourse(Long InstructorId, Long CourseId);
}
