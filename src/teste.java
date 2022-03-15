
public class teste {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(10,100,200);
		
		//conta.saca(10);
		//System.out.println(conta.getSaldo());
		
		ContaPoupanca conta1 = new ContaPoupanca(10,101,200);
		conta1.transfere(10, conta, conta1);
		System.out.println(conta.getSaldo());
		System.out.println(conta1.getSaldo());
	} 

}