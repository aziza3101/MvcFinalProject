package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.entity.Course;
import peaksoft.service.CourseService;

import java.util.List;

@Controller
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService  courseService;
    @Autowired

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @ModelAttribute("courseList")
    public List<Course> allCourses(Long CompanyId){
        return courseService.getAllCourses(CompanyId);
    }
    public String getAll(){
        return "coursePage";
    }
}
