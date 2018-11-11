package task_5;

import Utils.Reader;

import java.io.IOException;
import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) throws IOException {
        ArrayList<Task> tasks = new ArrayList<Task>();
        String s = "";

        //reading data
        while (!s.equals("run")) {
            System.out.println("Введите название задачи:");
            String name = Reader.readlineFromConsole();
            System.out.println("Введите приоритет:");
            String priority = Reader.readlineFromConsole();
            System.out.println("Введите сложность:");
            String severity = Reader.readlineFromConsole();

            Task task = new Task(name, priority, severity);
            tasks.add(task);

            System.out.println("Чтобы продолжить нажмите Enter, чтобы рассчитать введите run");
            s = Reader.readlineFromConsole();
        }
        //подсчет времени выполнения
        int hours = 0;
        for (Task task : tasks) {
            hours += task.duration;
        }
        System.out.println("Общее время выполнения: " + hours);

        //список задач согласно приоритету
        System.out.println("Введите приоритет:");
        String pr = Reader.readlineFromConsole();
        System.out.println("Задачи с приоритетом " + pr + ":");
        for (Task task : tasks) {
            if (task.priority.equalsIgnoreCase(pr))
                System.out.println(task.name);
        }

        //список задач которые можно сделать за N дней с учетом приоритета
        System.out.println("Введите количество дней:");
        int n = Integer.parseInt(Reader.readlineFromConsole());
        int totalHours = n * 24;

        int requiredHours = 0;

        ArrayList<Task> tasksWithHighPriority = new ArrayList<Task>();
        ArrayList<Task> tasksWithMiddlePriority = new ArrayList<Task>();
        ArrayList<Task> tasksWithLowPriority = new ArrayList<Task>();

        for (Task task : tasks) {
            if (task.priority.equalsIgnoreCase("Высокий")) {
                tasksWithHighPriority.add(task);
            } else if (task.priority.equalsIgnoreCase("Средний")) {
                tasksWithMiddlePriority.add(task);
            } else if (task.priority.equalsIgnoreCase("Низкий")) {
                tasksWithLowPriority.add(task);
            }

        }

        //список от задач от высокого до низкого приоритета
        ArrayList<Task> tasksSorted = new ArrayList<Task>();
        tasksSorted.addAll(tasksWithHighPriority);
        tasksSorted.addAll(tasksWithMiddlePriority);
        tasksSorted.addAll(tasksWithLowPriority);

        //задачи которые можно выполнить//
        ArrayList<Task> tasksThatCouldBeDone = new ArrayList<Task>();

        for (Task task : tasksSorted) {

            if ((requiredHours + task.duration) <=totalHours){
                tasksThatCouldBeDone.add(task);
                requiredHours +=task.duration;
            }

        }
        for (Task task : tasksThatCouldBeDone) {
            System.out.println(task.name);
        }


    }


}
