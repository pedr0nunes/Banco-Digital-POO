import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client pedro = new Client("Pedro");
        Client gabriel = new Client("Gabriel");

        Account contaCorrentePedro = new CheckingAccount(pedro);
        Account contaPoupancaPedro = new SavingsAccount(pedro);
        Account contaCorrenteGabriel = new CheckingAccount(gabriel);
        Account contaUniveristariaGabriel = new StudentAccount(gabriel);

        contaCorrenteGabriel.deposit(100);
        contaCorrenteGabriel.transfer(contaCorrentePedro, 40);
        System.out.println();
        contaCorrenteGabriel.printStatement();
        System.out.println();
        contaCorrentePedro.printStatement();

        List<Account> listaDeContas = new ArrayList<>();
        listaDeContas.add(contaCorrenteGabriel);
        listaDeContas.add(contaCorrentePedro);
        listaDeContas.add(contaPoupancaPedro);
        listaDeContas.add(contaUniveristariaGabriel);
        Bank blue = new Bank("Blue");
        blue.setAccounts(listaDeContas);
        blue.printCLients();
    }
}
