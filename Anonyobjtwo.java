public class Anonyobjtwo {
    public static void main(String[] args) {


       // Anony   obj =new Anony ();
        //obj.i=7;
       // obj.show();

        //or we can in better way write..
        new Anony().i=7;  //ebverytime it creates new object 
        new Abc().show(); //new object  //output-0  
    //use anonymous object only onces when u specifically need to call an constructor


        
    }
    
}
class Anony {
    int i;
    public void show(){
        System.out.println(i);
    }
}