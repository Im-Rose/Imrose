class Wallet {
    private double amount;

    public void addMoney(double money) {
        if (money > 0) amount += money;
    }

    public double getAmount() {
        return amount;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.addMoney(300);
        System.out.println(myWallet.getAmount());
    }
}