public class Constructor {
    public static void main(String[] args) {
        
        Abc obj =new Abc(5);
    }
    
}
class Abc
{
    //how much memory needed is defined by constructor-jvm gives default constructor
    //signature of that constructor is- 
    public Abc(int i )    //special kind of method
    {                    //it never returns anything so need of void 
        System.out.println("In Constructor Abc");



    }


}
