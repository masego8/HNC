package ATM;

public class User {
    /****/
    private String name;
    private int bankCard;
    private int pinNumber;
    private int checkingAccount;
    private int savingAccount;

    /****/
    public User(String name, int bankCard, int pinNumber, int checkingAccount, int savingAccount) {
        this.name = name;
        this.bankCard = bankCard;
        this.pinNumber = pinNumber;
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;
    }

    /****/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBankCard() {
        return bankCard;
    }
    public void setBankCard(int bankCard) {
        this.bankCard = bankCard;
    }
    public int getPinNumber() {
        return pinNumber;
    }
    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
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
    public void balance() {}
    public void deposit(int amount) {}
    public void withdraw(int amount) {}
    public void transfer(int amount) {}


}
