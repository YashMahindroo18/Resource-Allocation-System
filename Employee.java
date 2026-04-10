class Employee {
    private int id;
    private String name;
    private int maxTasks;
    private int currentTasks;

    public Employee(int id, String name, int maxTasks) {
        this.id = id;
        this.name = name;
        this.maxTasks = maxTasks;
        this.currentTasks = 0;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getCurrentTasks() { return currentTasks; }
    public int getMaxTasks() { return maxTasks; }

    public boolean canTakeTask() {
        return currentTasks < maxTasks;
    }

    public void assignTask() {
        currentTasks++;
    }

    public void completeTask() {
        if (currentTasks > 0) currentTasks--;
    }

    @Override
    public String toString() {
        return id + " - " + name +
                " (Tasks: " + currentTasks + "/" + maxTasks + ")";
    }
}