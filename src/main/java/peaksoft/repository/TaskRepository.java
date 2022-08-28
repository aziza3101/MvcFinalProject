package peaksoft.repository;

import org.springframework.stereotype.Repository;
import peaksoft.entity.Task;

import java.util.List;
@Repository
public interface TaskRepository {
    void saveTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    void deleteTaskById(Long id);

    void updateTask(Task task);
}
