package Principal;

public class Comando {
	private char tipo;

	private Object ref1;

	private Object ref2;

	public Comando(char _tipo, Object _ref1, Object _ref2) {

		this.tipo = _tipo;

		this.ref1 = _ref1;

		this.ref2 = _ref2;

	}

	public char getTipo() {

		return this.tipo;

	}

	public Object getRef1() {

		return this.ref1;

	}

	public Object getRef2() {

		return this.ref2;

	}

	public String toString() {

		return this.tipo + "/" + this.ref1.toString() + "/" + this.ref2.toString();

	}
}
