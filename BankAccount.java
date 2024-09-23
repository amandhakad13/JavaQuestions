public class BankAccount {
    String depositorName;
    int accountNumber;
    String accountType;
    float balanceAmount;

    BankAccount(String Type) {
        depositorName = "Aman Dhakad";
        accountNumber = 1234567890;
        accountType = Type;
        balanceAmount = 10000;
    }

    void deposit(int money) {
        System.out.println("Deposit Section:-");
        System.out.println("Before deposit money is : "+balanceAmount);
        System.out.println("Enter deposit money is : "+money);
        balanceAmount = balanceAmount + money;
        System.out.println("After deposit money is : "+balanceAmount);
    }

    void withdraw(float withdrawAmount) {
        System.out.println();
        System.out.println("Withdraw Section:-");
        System.out.println("Balance Amount is : "+balanceAmount);
        System.out.println("Enter withdraw money : "+withdrawAmount);
        balanceAmount = balanceAmount - withdrawAmount;
        System.out.println("After withdraw money is : "+balanceAmount);
    }

    void showUserData() {
        System.out.println();
        System.out.println("Bank Account Details:-");
        System.out.println("Name is : "+depositorName);
        System.out.println("Balance amount is : "+balanceAmount);
    }

    public static void main(String[] args) {
        System.out.println("Bank Account System");
        System.out.println();
        BankAccount b1 = new BankAccount("Current Account");
        b1.deposit(10000);
        b1.withdraw(5000);
        b1.showUserData();
    }
}
