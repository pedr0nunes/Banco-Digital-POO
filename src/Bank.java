import java.util.HashSet;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void printCLients() {
        HashSet<String> setOfClients = new HashSet<>();
        for(int i = 0; i < accounts.size(); i++)
            setOfClients.add(this.getAccounts().get(i).getClient().getName());

        System.out.print(String.format("Client(s) of %s Bank is/are: %s", this.getName(), setOfClients));
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }
}
