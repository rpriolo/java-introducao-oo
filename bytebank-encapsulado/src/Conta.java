public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.01;
		System.out.println("Conta criada!");
		System.out.println("Agência: " + this.agencia + " / Número: " + this.numero);
		Conta.total++;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
		//System.out.println("Depósito realizado com sucesso! Seu saldo agora é de R$ " + this.saldo);
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			//System.out.println("Saque realizado com sucesso! Seu saldo agora é de R$ " + this.saldo);
			return true;
		}
		//System.out.println("Saldo insuficiente para realizar essa transação.");
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			//System.out.println("Transferência realizada com sucesso! Seu saldo agora é de R$ " + this.saldo);
			return true;
		}
		//System.out.println("Saldo insuficiente para realizar essa transação.");
		return false;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}