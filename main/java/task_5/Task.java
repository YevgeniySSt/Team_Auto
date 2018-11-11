package task_5;

public class Task {
    String name;
    String priority ;//enum
    String severity;//enum
    int duration;

    public Task(String name, String priority, String severity) {
        this.name = name;

        this.priority = priority;
        this.severity = severity;

        if (severity.equals("Сложная")){
            this.duration = 4;
        } else if (severity.equals("Средняя")){
            this.duration = 2;
        } else if (severity.equals("Легкая")){
            this.duration = 1;
        } else this.duration = 0;
    }
}
