public class Encapsulation {
    public static void main(String args[]){
        BankAccount account = new BankAccount();
        account.deposite(7000);
        System.out.println(account.getbalance());
    }
}

class BankAccount {
    private double balance;

    public void deposite(double ammount){
        if (ammount > 0 ){
            balance = balance + ammount;
        }
    }

    public double getbalance(){
        return balance;
    }
}
