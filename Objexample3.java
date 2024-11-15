public class Objexample3 {

    public static void main (String a[])
    {
        Add obj = new  Add();
        obj.setValues(5, 6);
         obj.sum(); //obj.sub
         obj.showResult();
       
        

    }
    static class Add {
        int num1;
        int num2;
        int result;
        public void setValues(int n1,int n2)
        {
            num1 =n1;
            num2=n2;

        }

        public void sum()
        {
        
             result = num1+num2;
            
         } 

         public void sub()
         {
            result = num2- num1;
         }



         public void showResult()
         {
            System.out.println("Result is :"+ result);
         }

        }
    
}
    

