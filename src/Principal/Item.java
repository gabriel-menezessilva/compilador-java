package Principal;

public class Item {
	private char tipo;
	private String valor;
	
	public Item(char _tipo, String _valor) {

		this.tipo = _tipo;

		this.valor = _valor;

	}

	public char getTipo() {

		return this.tipo;

	}

	public String getvalor() {

		return this.valor;

	}

	public String toString() {

		return this.tipo + "-" + this.valor;

	}
}
