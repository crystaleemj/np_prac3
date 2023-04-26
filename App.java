package sg.edu.nus.iss;


public class App 
{
    public static void main( String[] args )
    {
        CashCard c1 = new CashCard("ceemj", 0);
        c1.topUp(100);
        System.out.println(c1);
        c1.deduct(50);
        System.out.println(c1);
        c1.deduct(500);
        System.out.println(c1);
        
    }
}
