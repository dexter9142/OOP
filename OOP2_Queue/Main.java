package OOP2_Queue;

public class Main {
    public static void main(String[] args) {
        queue Queue1 = new queue(6);
        queue Queue2 = new queue();
        Queue1.push(5);
        Queue1.push(3);
        Queue1.push(7);
        Queue1.push(10);
        Queue1.show();
        Queue1.pop();
        System.out.println("\n After Pop: ");
        Queue1.show();
        System.out.println("\n No parameter queue: \n");
        Queue2.push(6);
        Queue2.push(10);
        Queue2.push(9);
        Queue2.show();
        Queue2.pop();
        System.out.println("\n After Pop: ");
        Queue2.show();
    }
}
