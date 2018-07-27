package exemplo2;

public class TestaContaCorrente {

	public static void main(String[] args) {
		
		Cliente natan = new Cliente("Natan", "123.456.789-12", 25);
		ContaCorrente contaNatan = new ContaCorrente();
		contaNatan.setCliente(natan);
		contaNatan.setAgencia("1234-5");
		contaNatan.setNumero("123-2");
		contaNatan.setSaldo(2000f);
		
		Cliente jackson = new Cliente("Jackson", "787.456.122-23", 55);
		ContaCorrente contaJackson = new ContaCorrente();
		contaJackson.setCliente(jackson);
		contaJackson.setAgencia("9876-5");
		contaJackson.setNumero("258-85");
		contaJackson.setSaldo(3000f);
		
		//ContaNatan.deposita(600f);
		//contaJackson.saca(500f);
		
		contaJackson.transfere(-500f,contaNatan);
		//contaNatan.transfere(200f, contaJackson);
		
		System.out.println(contaNatan);
		System.out.println(contaJackson);
		
		

	}

}
