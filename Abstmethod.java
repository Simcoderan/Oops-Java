public class Abstmethod {
        public static void main(String[] args) {

            //X obj=new X();  cant create the instance,only refference 
            X obj= new Y();
            obj.say();
            obj.magic();



        
    }
    
}

abstract class X {                     //mention it here-abstract class

    public void say() 
    {

        System.out.println("hello world");

    }

    public abstract void magic();    //any method only declared not defined
     


    
}
class Y extends X 
{
    public void magic()  //implement here in subclass
    
    {

        System.out.println("magic");  //overridding

    }

}
