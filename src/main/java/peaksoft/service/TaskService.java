package peaksoft.service;

import org.springframework.stereotype.Service;
import peaksoft.entity.Task;

import java.util.List;
@Service
public interface TaskService {
    void saveTask(Task task);

    List<Task> getAllTasks();
    Task getTaskById(Long id);

    void updateTask(Long id, Task task);

    void deleteTaskById(Long id);

}
