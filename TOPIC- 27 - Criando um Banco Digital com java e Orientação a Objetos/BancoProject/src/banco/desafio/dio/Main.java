package banco.desafio.dio;

public class Main {

	public static void main(String[] args) {
		Cliente william = new Cliente();
		william.setNome("William");
		
		Conta cc = new ContaCorrente(william);
		Conta poupanca = new ContaPoupanca(william);
		
		cc.depositar(100);
		cc.transferir(95, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
