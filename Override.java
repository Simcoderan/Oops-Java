//Method overriding //polymorphism



public class Override {

    public static void main(String[] args) 
    {
        //A obj=new A();
          B obj=new B();  //method overriding
          obj.say();



        
    }



    
}

class A{
    public void say()
    {
        System.out.println("hello from A");

    }

}

class B extends A{


    public void say()
    {
        System.out.println("Hello from B");
    }


}

