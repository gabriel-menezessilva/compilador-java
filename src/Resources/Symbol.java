package Resources;

public class Symbol {

	private String nome; // nome do identificador

	private char tipo; // tipo de dado

	private int referencia; // é uma referência usada na geração do código destino

	private static int marcador = 1; // armazena a última referência incluída na tabela

	public Symbol(String _nome, char _tipo) {

		this.nome = _nome;

		this.tipo = _tipo;

		this.referencia = setMarcador(_tipo);

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

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	private static int setMarcador(char _tipo) {

		int _marcadorAnterior = Symbol.marcador;

		if (_tipo == 'N') {
			Symbol.marcador += 2;
		} else if (_tipo == 'S') {
			Symbol.marcador += 1;
		}

		return _marcadorAnterior;
	}

	@Override
	public String toString() {
		return "Symbol [nome=" + this.nome + ", tipo=" + this.tipo + ", referencia=" + this.referencia + "]";
	}

}
