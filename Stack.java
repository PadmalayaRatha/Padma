import java.util.Scanner;

public class Stack {
    int size = 5;
    int[] arr = new int[size];
    int top = -1;

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full\n");
            System.exit(0);
        } else {
            top++;
            arr[top] = data;
            System.out.println("your  element is " + data);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty so pop operation not possible.");
        } else {
            top--;
            System.out.println("Delete element successfully.\n");
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty. ");
        } else {
            System.out.println("Top of the peek element is:\n");
            arr[top] = size - 1;
        }
    }

    void display() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Your stack elements are:\n");
            System.out.println(arr[i]);
        }
    }

    void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty.\n");
        } else {
            System.out.println("Stack is full.\n");
        }
    }

    void isFull() {
        if (top == size - 1) {
            System.out.println("Stack is full.\n");
        } else {
            System.out.println("stack is empty.\n");
        }
    }

    public static void main(String[] args) {
        Stack ss = new Stack();
        System.out.println("Enter your choice\n1.push\n2.pop\n3.peek\n4.display\n5.isEmpty\n6.isFull");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("Enter your data:");
                    int data = scanner.nextInt();
                    ss.push(data);
                    break;
                case 2:
                    System.out.println("Remove your data:");
                    ss.pop();
                    break;
                case 3:
                    ss.peek();
                    break;
                case 4:
                    ss.display();
                    break;
                case 5:
                    ss.isFull();
                    break;
                case 6:
                    ss.isEmpty();
                    break;

            }
        }
    }
}