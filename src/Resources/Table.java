package Resources;

import java.util.HashMap;

public class Table {

	private HashMap<String, Symbol> tab;

	public Table() {

		this.tab = new HashMap<String, Symbol>();

	}

	public boolean inclui(Symbol _simb) {

		if (this.tab.containsKey(_simb.getNome()))

			return false;

		else {

			this.tab.put(_simb.getNome(), _simb);

			return true;

		}

	}

	public int consultaReferencia(String _chave) {

		return ((Symbol) this.tab.get(_chave)).getReferencia();

	}

	public boolean isExiste(String _chave) {

		return this.tab.containsKey(_chave);

	}

	public String toString() {

		return this.tab.toString();

	}

}
