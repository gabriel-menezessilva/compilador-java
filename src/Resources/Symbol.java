package Resources;

public class Symbol {

	private String nome; // nome do identificador

	private char tipo; // tipo de dado

	private int referencia; // é uma referência usada na geração do código destino

	private static int marcador = 1; // armazena a última referência incluída na tabela

	public Symbol(String nome, char tipo) {

		this.nome = nome;

		this.tipo = tipo;

		this.referencia = setReferencia(tipo);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	private static int setReferencia(char tipo) {

		int _marcadorAnterior = Symbol.marcador;

		if (tipo == 'N') {
			Symbol.marcador += 2;
		} else if (tipo == 'S') {
			Symbol.marcador += 1;
		}

		return _marcadorAnterior;
	}

	@Override
	public String toString() {
		return "Symbol [nome=" + this.nome + ", tipo=" + this.tipo + ", referencia=" + this.referencia + "]";
	}

}
