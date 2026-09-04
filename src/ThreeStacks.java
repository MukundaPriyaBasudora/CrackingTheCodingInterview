import java.util.*;
public class ThreeStacks {
    public class Stacks{
        int[] arr;
        int[] next;
        int[] top;
        int freeTop;
        public Stacks(int n,int k){
            arr=new int[n];
            next=new int[n];
            top=new int[k];
            freeTop=0;
            Arrays.fill(top,-1);
            for(int i=0;i<n-1;i++){
                next[i]=i+1;
            }
            next[n-1]=-1;
        }
        public void push(int ele,int i){
            if(freeTop==-1){
                System.out.println("stack overflow");
                return;
            }
            int idx=freeTop;
            freeTop=next[idx];
            arr[idx]=ele;
            next[idx]=top[i];
            top[i]=idx;
        }
        public int pop(int i){
            if(top[i]==-1){
                System.out.println("stack underflow");
                return -1;
            }
            int idx=top[i];
            top[i]=next[idx];
            next[idx]=freeTop;
            freeTop=idx;
            return arr[idx];
        }
    }

    public static void main(String[] args) {
        ThreeStacks obj = new ThreeStacks();
        Stacks st = obj.new Stacks(6, 3);
        st.push(10, 0);
        st.push(20, 0);
        st.push(30,0);
        st.push(40,0);
        st.push(50,0);
        st.push(60,0);
//        st.push(70,0);
        System.out.println(st.pop(0));// 20
        st.push(100,1);
        System.out.println(st.pop(1));
//        System.out.println(st.pop(1));
    }

}
