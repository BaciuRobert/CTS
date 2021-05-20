package cts.Baciu.Robert.g1093.pattern.Factory;

public abstract class BankAccount {
    double balance;
    String id;

    public BankAccount(double Balance, String Id) {
        balance = Balance;
        id = Id;
    }
    
    public BankAccount() {}
}