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