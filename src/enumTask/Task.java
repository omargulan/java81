package enumTask;

public class Task {

     // добавьте переменную priority с приоритетом задачи
    private TaskPriority priority;
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}