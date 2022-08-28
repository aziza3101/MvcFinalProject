package peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.MERGE;

@Entity
@Table(name = "tasks")
@Getter @Setter
@NoArgsConstructor
public class Task {
    @Id
    @SequenceGenerator(name = "task_gen",
    sequenceName = "task_seq",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String taskName;
    private String taskText;
    private LocalDate deadline;

    public Task(String taskName, String taskText, LocalDate deadline) {
        this.taskName = taskName;
        this.taskText = taskText;
        this.deadline = deadline;
    }

    @ManyToOne (cascade = {DETACH, REFRESH, PERSIST, MERGE})
    private Lesson lessons;
}
