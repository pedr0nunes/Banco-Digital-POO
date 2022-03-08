public class StudentAccount extends Account {
    public StudentAccount(Client client) {
        super(client);
    }

    @Override
    public void withdraw(double value) {
        if (value <= 500)
            super.withdraw(value);
        else
            throw new ArithmeticException("Can't withdraw this amount");
    }

    @Override
    public void printStatement() {
        System.out.println("Statement of your student account:");
        super.printAccountInfos();
    }
}
