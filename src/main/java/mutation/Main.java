package mutation;

import java.util.Arrays;

public class Main {
    static void main() throws CloneNotSupportedException {
        int[] numbers = {21, 43, 29, 18, 17};
//        int[] copiedNumbers = numbers
//        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
        int[] copiedNumbers = numbers.clone();

//        System.out.println("Copied numbers: " + Arrays.toString(copiedNumbers));

        copiedNumbers[copiedNumbers.length - 1] = 10;

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Copied numbers: " +  Arrays.toString(copiedNumbers));

        BankAccount myBankAccount = new BankAccount(500);

        System.out.println("My balance is " + myBankAccount.balance);

        // Problem as myOtherBankAccount is a reference to myBankAccount
        BankAccount myOtherBankAccount = myBankAccount;

        // Changes both balances
        myBankAccount.balance = -100;

        System.out.println("My balance is " + myBankAccount.balance);
        System.out.println("My other balance is " + myOtherBankAccount.balance);

        // See code below and CloneableBankAccount class for most basic implementation of the clone() method
        CloneableBankAccount cloneableBankAccount = new CloneableBankAccount(500);
        System.out.println("The balance is: " + cloneableBankAccount.balance);
        CloneableBankAccount otherCloneableBankAccount = cloneableBankAccount.clone();
        otherCloneableBankAccount.balance = -100;

        System.out.println("Original balance: " + cloneableBankAccount.balance);
        System.out.println("Cloned balance: " + otherCloneableBankAccount.balance);
    }
}
