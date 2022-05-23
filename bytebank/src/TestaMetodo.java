
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoRenato = new Conta();
	
		contaDoRenato.saldo = 100;
		contaDoRenato.deposita(50);
		//System.out.println(contaDoRenato.saldo);
	
		contaDoRenato.saca(25);
	
		Conta contaDaPatricia = new Conta();
		contaDaPatricia.deposita(2000);
		//System.out.println(contaDaPatricia.saldo);
		
		contaDaPatricia.transfere(500, contaDoRenato);
		System.out.println(contaDoRenato.saldo);
		System.out.println(contaDaPatricia.saldo);
	
	}
	
}
