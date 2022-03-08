public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("Statement of your savings account:");
        super.printAccountInfos();
    }
}
