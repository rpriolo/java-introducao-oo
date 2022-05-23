
public class TesteClienteConta {
	
	public static void main(String[] args) {
		Conta contaDaPatricia = new Conta();
	
		contaDaPatricia.titular = new Cliente();
		contaDaPatricia.titular.nome = "Patricia Guedes";
		System.out.println(contaDaPatricia.titular.nome);
	
	}
	
}
