package OOP2_Queue;

import java.util.Queue;
import java.util.LinkedList;

public class queue {
            Queue<Integer> Queue = new LinkedList<>();
            int maxsize;



        public queue(int size){
        this.maxsize = size;
        }

         public queue(){
        this.maxsize = 2147483647;
        }

        public boolean isEmpty(){
            if(Queue.size() == 0)
                return true;
            else
                return false;
        }

        public boolean isFull(){
            if(Queue.size() == maxsize) return true;
            else return false;
        }

        public void push(int a){
            if(!isFull())
            Queue.add(a);
            else System.out.println("Queue full.");
        }

        public void pop(){
            Queue.remove();
        }

    public void show(){
            if(!isEmpty()) {
                for (Integer i : Queue)
                    System.out.print(i + "\t");
            } else System.out.println("Queue is empty.");

    }



}
