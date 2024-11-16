public class Inheritancemultilevel {
    
    public static void main (String a[])
    {
        AddSubMul obj= new AddSubMul();
        obj.setValues(4,3);
        obj.sub();
        obj.showResult();

    }
    
}

class Add {                       //Base,Parent,Super
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
class AddSub extends Add          //Derived Class,Child,Sub

 {

    
    public void sub()
    {
        k=i-j;

    }

   
}

class AddSubMul extends AddSub {

    public void  mul() {
        k=i*j;
    }

}

//MULTIPLE INHERITANCE NOT IN JAVA
    

