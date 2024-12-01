//Method Overloading



public class Overload {
    

    public static void main(String[] args)
     
    {
        Bcd obj=new Bcd();
        obj.show();
        obj.show(5);
        obj.show(9.66);
        
    }


}

class Bcd {
        public void show()
        {
              System.out.println("In default show");
         }

         public void show(int a)
         
         {
                 System.out.println("Same name but no error becz of method overloeading");
         }

         public void show(double d)
         {
                  System.out.println("with different parameter");

         }
         

}
