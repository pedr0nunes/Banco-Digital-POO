public abstract class Account implements IAccount {
    private static int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 0;

    protected int agency;
    protected int numberAccount;
    protected double balance;
    protected Client client;

    public Account(Client client){
        this.agency = DEFAULT_AGENCY;
        this.numberAccount = SEQUENTIAL++;
        this.client = client;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    private void verifyIfValueIsNegative(double value) {
        if (value < 0)
            throw new RuntimeException("Invalid value: is negative");
    }

    private void verifyIfAmountIsUnavaiable(double value) {
        if(value > this.balance)
            throw new ArithmeticException("Amount unavailable in your account");
    }

    private void printBalance() {
        System.out.println(String.format("Balance of %s's account is %.2f", this.getClient().getName(), this.getBalance()));
    }

    @Override
    public void withdraw(double value) {
        this.verifyIfValueIsNegative(value);
        this.verifyIfAmountIsUnavaiable(value);
        this.balance -= value;
        this.printBalance();

    }

    @Override
    public void deposit(double value) {
        this.verifyIfValueIsNegative(value);
        this.balance += value;
        this.printBalance();

    }

    @Override
    public void transfer(Account destinationAccount, double value) {
       this.verifyIfValueIsNegative(value);
       this.verifyIfAmountIsUnavaiable(value);
       this.withdraw(value);
       destinationAccount.deposit(value);
    }


    protected void printAccountInfos() {
        System.out.println(String.format("Owner: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number account: %d", this.numberAccount));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
