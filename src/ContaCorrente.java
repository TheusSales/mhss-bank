
public class ContaCorrente extends Conta {

public ContaCorrente(int numero, int agencia, float saldo) {
	super(numero, agencia, saldo);	
}

@Override
public void saca(double valor) {
//Contas corrente cobram a taxa de 2% sobre o valor do saque
	if ((double)this.saldo >= valor*1.02) {
		this.saldo -= valor*1.02;
	}
	else {
		System.out.println("Saldo insuficiente! Não foi possível efetuar o saque");
	}
	
}

}