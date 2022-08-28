package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import peaksoft.entity.Task;
import peaksoft.repository.TaskRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
//@EnableTransactionManagement
public class TaskRepositoryImpl implements TaskRepository {
    @PersistenceContext
    private  EntityManager entityManager;
    @Override
    public void saveTask(Task task) {
        entityManager.persist(task);
    }
    @Override
    public List<Task> getAllTasks() {
        return entityManager.createQuery("SELECT t FROM Task t", Task.class).getResultList();
    }
    @Override
    public Task getTaskById(Long id) {
        return entityManager.find(Task.class,id);
    }
    @Override
    public void deleteTaskById(Long id) {
        entityManager.remove(entityManager.find(Task.class,id));
    }
    @Override
    public void updateTask(Task task) {
        entityManager.merge(task);
    }
}
