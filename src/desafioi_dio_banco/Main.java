package desafioi_dio_banco;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente rafael = new Cliente();
		rafael.setNome("Rafael");
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		
		Conta cc = new ContaCorrente(rafael);
		Conta poupanca = new ContaPoupanca(paulo);
		List<Conta> contas = Arrays.asList(cc, poupanca);
		banco.setContas(contas);
		
		cc.depositar(100);
		cc.transferir(poupanca, 100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		banco.listarClientes();
	}
}
