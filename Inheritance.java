public class Inheritance {

    public static void main (String a[])
    {
        Calc obj= new Calc();
        obj.setValues(4,3);
        obj.sub();
        obj.showResult();

    }
    
}

class Add {
    int i,j,k;
    public void setValues (int a,int b){
        i=a;
        j=b;
    }
    public void sum(){
        k=i+j;
    }

    public void showResult()
    {
        System.out.println(k);
    }
}
class Calc extends Add

 {

    
    public void sub()
    {
        k=i-j;

    }

   
}
