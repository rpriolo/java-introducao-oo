
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(0001, 8881634);
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		conta.setAgencia(1362);
		System.out.println(conta.getAgencia());

		conta.setNumero(348163);
		System.out.println(conta.getNumero());
		
		conta.deposita(500);
		System.out.println(conta.getSaldo());

		Cliente cliente = new Cliente();
				
		// conta.setTitular(new Cliente());
		conta.setTitular(cliente);		
		cliente.setNome("renato priolo");
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
	
		System.out.println(Conta.getTotal());
	
	}
}
