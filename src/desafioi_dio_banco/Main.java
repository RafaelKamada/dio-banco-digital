package desafioi_dio_banco;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		try {
			Cliente rafael = new Cliente();
			rafael.setNome("Rafael");
			rafael.setTelefone(123456789);
			rafael.setEndereco("Rua Teste, 12");
			rafael.setIdade(14);
		
			Cliente paulo = new Cliente();
			paulo.setNome("Paulo");
			paulo.setIdade(11);
			paulo.setTelefone(123456776);
			paulo.setEndereco("Rua Dois, 2");
			
			Banco banco = new Banco();
			Conta cc = new ContaCorrente(rafael);
			Conta poupanca = new ContaPoupanca(paulo);
			List<Conta> contas = Arrays.asList(cc, poupanca);
			banco.setContas(contas);
			
			cc.depositar(100);
			cc.transferir(poupanca, 100);
			
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
			
			banco.listarClientes();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}
}
