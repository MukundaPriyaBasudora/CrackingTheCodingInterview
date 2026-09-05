import java.util.*;
class Animal{

}
class Dog extends Animal{
    public Dog(){

    }
}
class Cat extends Animal{
    public Cat(){

    }
}
public class AnimalShelter {
   LinkedList<Animal> q=new LinkedList<>();
   public void enqueue(Animal a){
       q.add(a);
   }
   public Animal dequeueAny(){
       System.out.println("removing first");
       return q.removeFirst();
   }
   public Animal dequeueDog(){
       Iterator<Animal> it= q.iterator();
       while (it.hasNext()){
           Animal a= it.next();
           if(a instanceof Dog){
                it.remove();
               System.out.println("removing dog");
               return a;
           }
       }
       return  null;
   }
    public Animal dequeueCat(){
        Iterator<Animal> it= q.iterator();
        while (it.hasNext()){
            Animal a= it.next();
            if(a instanceof Cat){
                it.remove();
                System.out.println("removing cat");
                return a;
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        AnimalShelter a=new AnimalShelter();
        a.enqueue(new Dog());
        a.enqueue(new Dog());
        a.enqueue(new Cat());
        a.enqueue(new Cat());
        a.dequeueAny();
        a.enqueue(new Dog());
        a.enqueue(new Cat());
        a.dequeueCat();
        a.dequeueDog();
        System.out.println(a.q.size() );
    }

}

