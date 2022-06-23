package Resources;

public class Item {
	private char tipo;
	private String valor;

	public Item(char tipo, String valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "Tipo: " + this.tipo + " Valor: " + this.valor + " ";
	}

}
