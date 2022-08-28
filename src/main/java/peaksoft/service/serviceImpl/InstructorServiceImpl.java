package peaksoft.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.entity.Instructor;
import peaksoft.repository.InstructorRepository;
import peaksoft.service.InstructorService;


import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;
    @Autowired
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }
    @Override
    public void saveInstructor(Instructor instructor) {
        instructorRepository.saveInstructor(instructor);
    }
    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.getAllInstructors();
    }
    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepository.getInstructorById(id);
    }
    @Override
    public void deleteInstructorById(Long id) {
        instructorRepository.deleteInstructorById(id);
    }
    @Override
    public void updateInstructor(Long id, Instructor instructor) {
        instructorRepository.updateInstructor(instructor);
    }

    @Override
    public void assignInstructorToCourse(Long InstructorId, Long CourseId) {

    }
}
