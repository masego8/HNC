package ATM;

public class Bank {
    /****/
    /****/
    private int branchName;
    private int checkingAccount;
    private int savingAccount;

    /****/
    public Bank(int branchName, int checkingAccount, int savingAccount) {
        this.branchName = branchName;
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;
    }

    /****/
    public int getBranchName() {
        return branchName;
    }
    public void setBranchName(int branchName) {
        this.branchName = branchName;
    }
    public int getCheckingAccount() {
        return checkingAccount;
    }
    public void setCheckingAccount(int checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
    public int getSavingAccount() {
        return savingAccount;
    }
    public void setSavingAccount(int savingAccount) {
        this.savingAccount = savingAccount;
    }

    /****/
    public void maintenanceAccount() {

    }
}
