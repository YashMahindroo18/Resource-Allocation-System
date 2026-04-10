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