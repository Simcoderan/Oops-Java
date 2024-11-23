public class Anonymousobj {

    public static void main(String[] args) {
        //only way to call any method is to create an obj
        //Abc obj=new Abc();
        //obj.show();

        //we can write in same line as well
        new Abc().show();   //can be used only onces

        
        
    }
    
}
class Abc {

    public Abc(){
        System.out.println("In constructor Abc");
    }

    //method
    public  void show(){            //since its not staic we need an instance obj  to call
        System.out.println("hello");
    }


}
