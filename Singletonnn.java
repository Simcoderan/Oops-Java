//instanciate the class only onces
//singleton class doesnt allow user to create more than one class

public class Singletonnn {
    public static void main(String[] args) {

        // S obj= new S();
        S obj = S.getInstance();
        obj.i = 5;
        obj.shows();

    }

}

class S {
    int i;
    private static S obj = new S(); // for atleast one obj

    private S() // make r constructor privatw
    {

    }

    public static S getInstance() // create getinstance method
    {
        return obj;

    }

    public void shows() {
        System.out.println("In show" + i);

    }

}
