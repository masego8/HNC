package ATM;

public class Main {
    public static void main(String[] args) {

        /****/
        Bank bank = new Bank(101, 1001, 2002);
        Machine machine = new Machine(1001, 1, 0, 101);
        User user = new User("Gordon",3402,2040,654872,654882);

        /****/
        user.balance();
        user.withdraw();
        user.deposit();
        user.transfer();

        machine.readCard();
        machine.dispenseCash();
        machine.printReceipt();
        machine.calculateFunds();

        bank.maintenanceAccount();

    }
}
