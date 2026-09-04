import java.util.*;
public class MyQueue {
    static Stack<Integer> st1=new Stack<>();
    static Stack<Integer> st2=new Stack<>();
    static void enqueue(int ele){
        if(st1.isEmpty()){
            while (!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        st1.push(ele);
    }
    static int dequeue(){
        if(st1.isEmpty()&&st2.isEmpty()){
            return -1;
        }
        if(!st1.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        enqueue(60);
        System.out.println(dequeue());
        System.out.println(dequeue());
        enqueue(80);
        System.out.println(dequeue());

    }
}
