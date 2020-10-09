package OOP2_Queue;

import java.util.LinkedList;

public class queue {
            LinkedList<Integer> queue = new LinkedList<>();
            int maxsize;



        public queue(int size){
        this.maxsize = size;
            System.out.println("queue cu param size: " + size);
        }

         public queue(){
        this.maxsize = -1;
             System.out.printf("Maximum size of second queue= " + maxsize +"\n");
        }

        public boolean isEmpty(){
            if(queue.size() == 0)
                return true;
            else
                return false;
        }

        public boolean isFull(){
            if(queue.size() == maxsize) return true;
            else return false;
        }

        public void push(int a){
            if(!isFull()) {
                queue.add(a);

            }
            else System.out.println("Queue full.");
        }

        public void pop(){
            queue.remove();
        }

    public void show(){
            if(!isEmpty()) {
                for (Integer i : queue)
                    System.out.print(i + "\t");
            } else System.out.println("Queue is empty.");

    }
}
