package peaksoft.service;

import org.springframework.stereotype.Service;
import peaksoft.entity.Course;

import java.util.List;
@Service
public interface CourseService {
    void saveCourse(Course course);
    List<Course> getAllCourses(Long courseId);
    Course getCourseById(Long id);
    void updateCourse(Long id, Course course);
    void deleteCourseById(Long id);

}
