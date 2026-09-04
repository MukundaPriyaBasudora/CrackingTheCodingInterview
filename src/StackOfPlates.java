import java.util.*;
public class StackOfPlates {
    static class Dupst{
        int thres;
        List<List<Integer>> stack;
        public Dupst(int thres){
            this.thres=thres;
            stack=new ArrayList<>();
        }
        public void push(int ele){
            if(stack.size()==0){
                stack.add(new ArrayList<>());
            }
            if(stack.get(stack.size()-1).size()==thres){
                stack.add(new ArrayList<>());
            }
            stack.get(stack.size()-1).add(ele);
        }
        public int pop(){
            if(stack.size()==0){
                System.out.println("underflow stack");
                return -1;
            }
            List<Integer> finals=stack.get(stack.size()-1);
            int popped=finals.remove(finals.size()-1);
            if(finals.size()==0){
                stack.remove(stack.size()-1);
            }
            return popped;
        }
        public int popAt(int i){
            if(i<0||i>=stack.size())return -1;
            List<Integer> curList = stack.get(i);

            if(curList.size() == 0) {
                return -1;
            }

            int popped = curList.remove(curList.size() - 1);

            if(curList.size() == 0) {
                stack.remove(i);
            }
            return  popped;
        }
    }

    public static void main(String[] args) {
        Dupst st=new Dupst(4);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.pop());
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);
        st.push(110);
        st.push(120);
        System.out.println(st.popAt(1));
    }
}
