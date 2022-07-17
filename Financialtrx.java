import java.util.Scanner;
class Account{
    int amount = 10000;
    
    public void debit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to withdraw : ");
        int n = sc.nextInt();
        if(n < amount){
            System.out.println("Withdrawing " + n);
            amount = amount - n;
            System.out.println("");
            System.out.println("Remaining Account Balance is " + amount);
        }
        else{
            System.out.println("Debit amount exceeded account balance... Your account balance is " + amount );
        }
    }
}

public class Financialtrx{
    public static void main(String[] args) {
        
        Account obj = new Account();
        obj.debit();
    }
}