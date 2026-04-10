import java.util.*;

class ResourceManager {
    private HashMap<Integer, Employee> employees = new HashMap<>();
    private HashMap<Integer, Task> tasks = new HashMap<>();
}
public void addEmployee(Employee e) {
    employees.put(e.getId(), e);
}

public void addTask(Task t) {
    tasks.put(t.getId(), t);
}
public void assignTask(int taskId, int empId) {
    Task task = tasks.get(taskId);
    Employee emp = employees.get(empId);

    if (task == null || emp == null) {
        System.out.println("Invalid Task or Employee ID");
        return;
    }

    if (!emp.canTakeTask()) {
        System.out.println("Employee overloaded!");
        return;
    }

    if (task.getAssignedTo() != null) {
        System.out.println("Task already assigned!");
        return;
    }

    emp.assignTask();
    task.assign(emp.getName());

    System.out.println("Task assigned successfully");
}
public void completeTask(int taskId) {
    Task task = tasks.get(taskId);

    if (task == null) {
        System.out.println("Task not found");
        return;
    }

    if (task.isCompleted()) {
        System.out.println("Task already completed");
        return;
    }

    task.markCompleted();

    for (Employee e : employees.values()) {
        if (e.getName().equals(task.getAssignedTo())) {
            e.completeTask();
            break;
        }
    }

    System.out.println("Task marked as completed");
}
public void viewEmployees() {
    for (Employee e : employees.values()) {
        System.out.println(e);
    }
}

public void viewTasks() {
    for (Task t : tasks.values()) {
        System.out.println(t);
    }
}
public void searchTask(String keyword) {
    for (Task t : tasks.values()) {
        if (t.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println(t);
        }
    }
}
public void showStats() {
    int totalTasks = tasks.size();
    int completed = 0;

    for (Task t : tasks.values()) {
        if (t.isCompleted()) completed++;
    }

    System.out.println("Total Tasks: " + totalTasks);
    System.out.println("Completed Tasks: " + completed);
    System.out.println("Pending Tasks: " + (totalTasks - completed));
}
public void tasksByEmployee(String empName) {
    for (Task t : tasks.values()) {
        if (empName.equals(t.getAssignedTo())) {
            System.out.println(t);
        }
    }
}