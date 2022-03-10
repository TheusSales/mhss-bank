
public class teste {

	public static void main(String[] args) {
		Conta conta = new Conta(10,100,200);
		System.out.println("Agencia: "+conta.getAgencia()+" Nr_Conta: " + conta.getNumero()+" Saldo: "+conta.getSaldo());
		Conta conta1 = new Conta(10,101,200);
		conta.saca(10);
		System.out.println(conta.getSaldo());
		conta.deposita(10);
		System.out.println(conta.getSaldo());
		conta.transfere(10, conta, conta1);
		System.out.println(conta.getSaldo());
		System.out.println(conta1.getSaldo());
	} 

}
