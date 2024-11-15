public class Encap {
    public static void main(String a[]) {

        Student s1 =new Student ();
        s1.setRollno(5);
        s1.setSname("simran");
        System.out.println(s1.getSname());

    }
}

class Student {
    private int rollno;
    private String sname;


    public void setRollno(int r){
        rollno=r;

    }
    public void setSname(String name){
       sname = name;
        
    }
    public String getSname()
    {
        return sname;
    }
    public int  getRollno()
    {
        return rollno;
    }
}