package peaksoft.repository;

import org.springframework.stereotype.Repository;
import peaksoft.entity.Lesson;

import java.util.List;
@Repository
public interface LessonRepository {
    void saveLesson(Lesson lesson);

    List<Lesson> getAllLessons();

    Lesson getLessonById(Long id);

    void deleteLessonById(Long id);

    void updateLesson(Lesson lesson);
}
