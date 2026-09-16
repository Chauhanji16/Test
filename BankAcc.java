public class BankAcc {
    public static void main(String[] args) {
        System.out.println("Saving Account Detail");
        SavingAccount s=new SavingAccount();
        s.accountNumber=12345678;
        s.Balance=100000;
        s.calulateIntrest();
        System.out.println();
         
        System.out.println("Current Account Detail");
        CurrentAccount c= new CurrentAccount();
        c.accountNumber=27887255;
        c.Balance=300000;
        c.calulateIntrest();

    }
}
abstract class BankAccount{
int accountNumber;
double  Balance;
abstract void  calulateIntrest();
}
class SavingAccount extends BankAccount{
    double intrest ;
    void calulateIntrest(){
        intrest= (Balance*4)/100;
        System.out.println("AccountNumber: "+accountNumber);
        System.out.println("Balance: "+Balance);
        System.out.println("Intrest: "+intrest);
        
    }
}
class CurrentAccount extends BankAccount{
    
            double intrest ;
    void calulateIntrest(){
        intrest= (Balance*0)/100;
        System.out.println("AccountNumber: "+accountNumber);
        System.out.println("Balance: "+Balance);
        System.out.println("Intrest: "+intrest);
        
    }

}
