package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import peaksoft.entity.Lesson;
import peaksoft.repository.LessonRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
//@EnableTransactionManagement
public class LessonRepositoryImpl implements LessonRepository {
    @PersistenceContext
    private  EntityManager entityManager;

    @Override
    public void saveLesson(Lesson lesson) {
        entityManager.persist(lesson);
    }
    @Override
    public List<Lesson> getAllLessons() {
        return entityManager.createQuery("SELECT l FROM Lesson l", Lesson.class).getResultList();
    }
    @Override
    public Lesson getLessonById(Long id) {
        return entityManager.find(Lesson.class,id);
    }
    @Override
    public void deleteLessonById(Long id) {
        entityManager.remove(entityManager.find(Lesson.class,id));
    }
    @Override
    public void updateLesson(Lesson lesson) {
        entityManager.merge(lesson);
    }
}
