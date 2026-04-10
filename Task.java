class Task {
    private int id;
    private String title;
    private boolean isCompleted;
    private String assignedTo;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
        this.assignedTo = null;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return isCompleted; }
    public String getAssignedTo() { return assignedTo; }

    public void assign(String employeeName) {
        this.assignedTo = employeeName;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return id + " - " + title +
                (isCompleted ? " [Completed]" : " [Pending]") +
                (assignedTo != null ? " (Assigned to " + assignedTo + ")" : "");
    }
}