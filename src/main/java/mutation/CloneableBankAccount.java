package mutation;

public class CloneableBankAccount implements Cloneable{
    int balance;

    public CloneableBankAccount(int balance) {
        this.balance = balance;
    }

    public CloneableBankAccount clone() throws CloneNotSupportedException {
        return (CloneableBankAccount) super.clone();

    }
}
