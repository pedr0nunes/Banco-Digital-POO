public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("Statement of your checking account:");
        super.printAccountInfos();
    }
}
