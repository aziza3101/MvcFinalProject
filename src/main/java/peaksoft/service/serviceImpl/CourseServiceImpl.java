package peaksoft.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.entity.Course;
import peaksoft.repository.CourseRepository;
import peaksoft.service.CourseService;


import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    @Autowired

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @Override
    public void saveCourse(Course course) {
        courseRepository.saveCourse(course);
    }

    @Override
    public List<Course> getAllCourses(Long companyId) {
        return courseRepository.getAllCourses(companyId);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.getCourseById(id);
    }
    @Override
    public void deleteCourseById(Long id) {
        courseRepository.deleteCourseById(id);
    }
    @Override
    public void updateCourse(Long id, Course course) {
        courseRepository.updateCourse(course);
    }
}
