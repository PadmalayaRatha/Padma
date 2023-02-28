import java.util.Scanner;
public class Stack {
    int size = 5;
    int[] arr = new int[size];
    int top = -1;
    int choice;

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full\n");
        } else {
            top++;
            Scanner sc = new Scanner(System.in);
            System.out.println(arr[size]);

            String element= sc.nextLine();
            System.out.println("Element is:"+element);

        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack is empty so pop operation not possible.");
        }
        else{

            System.out.println("Delete element successfully.\n");
            top--;
        }
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty. ");
        }
        else{
            System.out.println("Top of the peek element is:\n");
        }
    }
    void display(){
        for(int i = 0;i <= 5;i++){
            System.out.println("Your stack elements are:\n");
            System.out.println(arr[i]);
        }
    }
    void isEmpty(){
        if(top == -1){
            System.out.println("Stack is empty.\n");
        }
        else{
            System.out.println("Stack is full.\n");
        }
    }
    void isFull(){
        if(top == size-1){
            System.out.println("Stack is full.\n");
        }
        else{
            System.out.println("stack is empty.\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your choice\n1.push\n2.pop\n3.peek\n4.display\n5.isEmpty\n6.isFull");
        Stack ss = new Stack();
        if (ss.choice == 1) {
            System.out.println("Enter the choice to push into stack.");
            ss.push(10);
        } else if (ss.choice == 2) {
            ss.pop();
        } else if (ss.choice == 3) {
            ss.peek();
        } else if (ss.choice == 4) {
            ss.display();
        } else if (ss.choice == 5) {
            ss.isEmpty();
        } else if(ss.choice == 6) {
            ss.isFull();
        }
        else{

        }

    }
}
