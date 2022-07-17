import java.util.Scanner;

class StockAccount{

    int tataqty = 20;
    int dmartqty = 30;
    int briqty = 25;
    void intro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Stocks to buy :\n TATA \n DMart \n Britannia ");
        System.out.println("");
        System.out.print("Do you want to buy any stock (Y/N) : ");
        String input = sc.nextLine();
        System.out.println("");
       System.out.println(" Quantity available of TATA : " + tataqty);
       System.out.println(" Quantity available of DMart : " + dmartqty);
       System.out.println(" Quantity available of Britannia : " + briqty);
       System.out.println("");
    }
    void buy(){
        intro();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stock to buy : ");
        String name = sc.nextLine();
        System.out.print("Enter quantity to buy : ");
        int qty = sc.nextInt();
        System.out.println("Purchased " + qty + " qty of " + name);
        if(name == "TATA"){
            tataqty = tataqty - qty;
        }
        else if(name == "DMart"){
            tataqty = tataqty - qty;
        }
        else if(name == "Britannia"){
            tataqty = tataqty - qty;
        }
    }
    void sell(int n, String s){
        System.out.println("Sold " + n + " qty of " + s);
        if(s == "TATA"){
            tataqty = tataqty + n;
        }
        else if(s == "DMart"){
            dmartqty = dmartqty + n;
        }
        else if(s == "Britannia"){
            briqty = briqty + n;
        }
    }

    void PrintReport(){
        System.out.println("");
       System.out.println(" Quantity available of TATA : " + tataqty);
       System.out.println(" Quantity available of DMart : " + dmartqty);
       System.out.println(" Quantity available of Britannia : " + briqty);
       System.out.println("");
    }
}

public class Stock_account_management{
    public static void main(String[] args) {
        
        StockAccount obj = new StockAccount();
        obj.buy();
        obj.PrintReport();
    }
}