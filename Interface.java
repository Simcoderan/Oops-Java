//java interface solves multiple inheritance problem
//by giving  much of polymorphic benefits

interface Atm {

    public abstract void atm();
}

class Card implements Atm {       //if no method then class becomes abstract class Card implements Atm {}

    public void atm() {
        System.out.println("ATM");
    }


}




public class Interface {
    public static void main (String a[])
    {
        Atm obj =   new Card();                    //cant create object of interfse as well
        obj.atm();


    }
    
}

