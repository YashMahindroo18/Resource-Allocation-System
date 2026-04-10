import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ResourceManager rm = new ResourceManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Employee 2.Add Task 3.Assign Task");
            System.out.println("4.Complete Task 5.View Employees 6.View Tasks");
            System.out.println("7.Search Task 8.Stats 9.Tasks by Employee 10.Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int eid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String ename = sc.nextLine();
                    System.out.print("Max Tasks: ");
                    int max = sc.nextInt();

                    rm.addEmployee(new Employee(eid, ename, max));
                    break;

                case 2:
                    System.out.print("Enter Task ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Title: ");
                    String title = sc.nextLine();

                    rm.addTask(new Task(tid, title));
                    break;

                case 3:
                    System.out.print("Task ID: ");
                    int t1 = sc.nextInt();
                    System.out.print("Employee ID: ");
                    int e1 = sc.nextInt();

                    rm.assignTask(t1, e1);
                    break;

                case 4:
                    System.out.print("Task ID: ");
                    int t2 = sc.nextInt();

                    rm.completeTask(t2);
                    break;

                case 5:
                    rm.viewEmployees();
                    break;

                case 6:
                    rm.viewTasks();
                    break;

                case 7:
                    System.out.print("Keyword: ");
                    String key = sc.nextLine();

                    rm.searchTask(key);
                    break;

                case 8:
                    rm.showStats();
                    break;

                case 9:
                    System.out.print("Employee Name: ");
                    String emp = sc.nextLine();

                    rm.tasksByEmployee(emp);
                    break;

                case 10:
                    System.exit(0);
            }
        }
    }
}