
public class ContaPoupanca extends Conta{

public ContaPoupanca(int numero, int agencia, float saldo) {
	super(numero, agencia, saldo);
}

@Override
public void transfere(float valor, Conta c1, Conta c2) {
//Transferências com origem em contas poupanças são taxadas em 2% no valor total da transferência, independente da conta destino
	if(c1.getSaldo()>= valor*1.02) {
		c1.saca(valor*1.02);
		c2.deposita(valor);	
	}
	else {
		System.out.println("Saldo insuficiente! Não foi possível efetuar a transferência");
	}
	
}

}
