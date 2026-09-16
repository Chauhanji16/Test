public class PaymentSystem {
    public static void main(String[] args) {
        CraditCardPayment c= new CraditCardPayment();
        c.pay(4000);
        UPIPayment u= new UPIPayment();
        u.pay(5000);
    }
}
 interface  payment{
    void pay(double amount);
          
}
class CraditCardPayment implements payment{
   public  void pay(double amount){
        System.out.println(amount+" Paid by Cradit Card ");
    }
}
class UPIPayment implements  payment{
    public void pay(double amount){
        System.out.println(amount+" Paid by UPI");
    }
}
