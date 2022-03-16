
public class Conta {

private int numero;
private int agencia;
protected float saldo;

public Conta(int numero, int agencia, float saldo) {
	this.numero = numero;
	this.agencia = agencia;
	this.saldo = saldo;
}

public void saca(double valor) {
	if(this.saldo > valor) {
		this.saldo -= valor;
	}
	else {
		System.out.println("Saldo insuficiente! Não foi possível efetuar o saque");
	}
}

public void deposita(float valor) {
	this.saldo += valor;
}

public void transfere(float valor,Conta c1,Conta c2 ) {
	if(c1.getSaldo() >= valor) {
		c1.saca(valor);
		c2.deposita(valor);
	}
	else {
		System.out.println("Saldo insuficiente! Não foi possível fazer o saque");
	}
}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public float getSaldo() {
	return saldo;
}
public void setSaldo(float saldo) {
	this.saldo = saldo;
}

}
