public class BankAccount {

    public static void main(String[] args) {

        // starting balance
        float BobAcc = (float) 2175.37;

        // x - 302.50
        BobAcc -= 302.50;

        // x + 50.03
        BobAcc += 50.03;

        // (x / 2) + 20.00
        BobAcc /= 2;
        BobAcc += 20.00;

        // x - 1
        BobAcc -= 1;

        // x * 2
        BobAcc *= 2;

        // x + 1
        BobAcc += 1;



        System.out.println("Bob ramain balance is of : " + BobAcc);
    }
}
