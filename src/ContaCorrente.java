
public class ContaCorrente extends Conta {

public ContaCorrente(int numero, int agencia, float saldo) {
	super(numero, agencia, saldo);	
}

@Override
public void saca(double valor) {
//Contas corrente cobram a taxa de 2% sobre o valor do saque
	this.saldo -= valor*1.02;
}

}