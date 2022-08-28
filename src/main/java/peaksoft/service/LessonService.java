package peaksoft.service;

import org.springframework.stereotype.Service;
import peaksoft.entity.Lesson;

import java.util.List;
@Service
public interface LessonService {
    void saveLesson(Lesson lesson);
    List<Lesson> getAllLessons();
    Lesson getLessonById(Long id);
    void updateLesson(Long id, Lesson lesson);
    void deleteLessonById(Long id);
}
