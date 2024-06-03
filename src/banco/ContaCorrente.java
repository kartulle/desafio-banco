package banco;
import cliente.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato banco.Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}