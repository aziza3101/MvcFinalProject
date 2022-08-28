package peaksoft.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import peaksoft.entity.Course;

import java.util.List;
@Repository
public interface CourseRepository {
    void saveCourse(Course course);

    List<Course> getAllCourses(Long companyId);

    Course getCourseById(Long id);

    void deleteCourseById(Long id);

    void updateCourse(Course course);
}
