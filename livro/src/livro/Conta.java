package livro;

public class Conta {
	
	String nome;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;
	
	void saca (double valor) {
		double novoValor = this.saldo - valor;
		valor = novoValor;
	}
	
	void deposita (double valor) {
		double novoValor = this.saldo + valor;
		valor = novoValor;
	}
	double calculaRendimento(Conta conta) {
		double rendimento = this.saldo * 0.1;
		return rendimento;
		
	}
}
