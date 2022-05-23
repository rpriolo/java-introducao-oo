public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso! Seu saldo agora é de R$ " + this.saldo);
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso! Seu saldo agora é de R$ " + this.saldo);
			return true;
		}
		System.out.println("Saldo insuficiente para realizar essa transação.");
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			System.out.println("Transferência realizada com sucesso! Seu saldo agora é de R$ " + this.saldo);
			return true;
		}
		System.out.println("Saldo insuficiente para realizar essa transação.");
		return false;
	}
}