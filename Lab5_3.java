import java.util.*;
abstract class Conversion
{
    double amount;
    abstract void MoneyConversion();
}
class RupeetoDollar extends Conversion
{
    RupeetoDollar(double amount)
    {
        this.amount=amount;
    }

    double c1;
    void MoneyConversion()
    {
        c1=amount*0.012;
        System.out.println("Rs."+amount+" = "+c1+"$");
    }
}
class RupeetoEuro extends Conversion
{
    RupeetoEuro(double amount)
    {
        this.amount=amount;
    }
    double c1;
    void MoneyConversion()
    {
        c1=amount*0.011;
        System.out.println("Rs."+amount+" = "+c1+"Euro");
    }
}
public class Lab5_3
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double amt;
        System.out.println("Enter amount");
        amt=Double.parseDouble(sc.next());
        RupeetoDollar ob1= new RupeetoDollar(amt);
        ob1.MoneyConversion();

        RupeetoEuro ob2= new RupeetoEuro(amt);
        ob2.MoneyConversion();
    }
    
}
   