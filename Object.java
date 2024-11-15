public class Object {

    public static void main (String a[])
    {
        Add obj = new  Add();
        obj.num1=5;
        obj.num2=6;
        obj.sum();
        System.out.println("Result is : "+ obj.result );
        

    }
    static class Add {
        int num1;
        int num2;
        int result;
        public void sum()
        {
             result = num1+num2;
         }   
   }
    
}
