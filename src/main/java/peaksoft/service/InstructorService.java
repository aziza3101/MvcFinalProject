package peaksoft.service;

import org.springframework.stereotype.Service;
import peaksoft.entity.Instructor;

import java.util.List;
@Service
public interface InstructorService {
    void saveInstructor(Instructor instructor);
    List<Instructor> getAllInstructors();
    Instructor getInstructorById(Long id);
    void deleteInstructorById(Long id);
    void updateInstructor(Long id, Instructor instructor);
    void assignInstructorToCourse(Long InstructorId, Long CourseId);
}
