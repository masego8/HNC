package ATM;

public class Machine {
    /****/
    private int bankAccount;
    private int logIn;
    private int logOut;
    private int bankBranch;

    /****/
    public Machine(int bankAccount, int logIn, int logOut, int bankBranch) {
        this.bankAccount = bankAccount;
        this.logIn = logIn;
        this.logOut = logOut;
        this.bankBranch = bankBranch;
    }

    /****/
    public int getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }
    public int getLogIn() {
        return logIn;
    }
    public void setLogIn(int logIn) {
        this.logIn = logIn;
    }
    public int getLogOut() {
        return logOut;
    }
    public void setLogOut(int logOut) {
        this.logOut = logOut;
    }
    public int getBankBranch() {
        return bankBranch;
    }
    public void setBankBranch(int bankBranch) {
        this.bankBranch = bankBranch;
    }

    /****/
    public void readCard() {}
    public void printReceipt() {}
    public void dispenseCash() {}
    public void acceptCash() {}
    public void calculateFunds() {}
}
