package banco;
import cliente.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato banco.Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}