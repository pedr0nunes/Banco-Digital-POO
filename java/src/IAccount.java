public interface IAccount {
    void withdraw(double value);
    void deposit(double value);
    void transfer(Account destinationAccount, double value);
    void printStatement();
}
