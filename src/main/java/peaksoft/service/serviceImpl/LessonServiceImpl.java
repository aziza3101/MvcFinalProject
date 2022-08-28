package peaksoft.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.entity.Lesson;
import peaksoft.repository.LessonRepository;
import peaksoft.service.LessonService;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class LessonServiceImpl implements LessonService {
    private final LessonRepository lessonRepository;
    @Autowired
    public LessonServiceImpl(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }
    @Override
    public void saveLesson(Lesson lesson) {
        lessonRepository.saveLesson(lesson);
    }
    @Override
    public List<Lesson> getAllLessons() {
        return lessonRepository.getAllLessons();
    }
    @Override
    public Lesson getLessonById(Long id) {
        return lessonRepository.getLessonById(id);
    }
    @Override
    public void deleteLessonById(Long id) {
        lessonRepository.deleteLessonById(id);
    }
    @Override
    public void updateLesson(Long id, Lesson lesson) {
        lessonRepository.updateLesson(lesson);
    }
}
