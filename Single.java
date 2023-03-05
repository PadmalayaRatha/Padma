import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class Single {
    static Node Starter;

    public static int get() {
        Scanner ss = new Scanner(System.in);
        return ss.nextInt();
    }

    public static int count() {
        if (Starter == null) {
            return 0;
        } else {
            int count = 0;
            Node temp;
            temp = Starter;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    void create() {
        System.out.println("Enter number of nodes you want to create");
        int n = get();
        if (n > 0) {
            Node temp = new Node();
            Starter = temp;
            System.out.println("Enter the data");
            temp.data = get();
            for (int i = 1; i < n; i++) {
                temp.next = new Node();
                temp = temp.next;//to locate the particular node
                System.out.println("Enter the data");
                temp.data = get();
            }
            temp = null;
            System.out.println("Total nodes are:" + count());
        }
    }

    public static void main(String[] args) {
        Single ss2 = new Single();
        while (true) {
            System.out.println("\t\t****Single LinkedList Application.****");
            System.out.println("\t\t****Enter your choice****");
            System.out.println("\t\t1>Create Nodes.");
            System.out.println("\t\t2.Quit.");
            int choice = get();
            switch (choice) {
                case 1:
                    ss2.create();
                    break;
                case 2:
                    System.out.println("\t\t****Thank you for using my application.****");
                    System.exit(0);
                default:
                    System.out.println("!!!!Invalid Choice.!!!!");
                    break;

            }

        }
    }
}
