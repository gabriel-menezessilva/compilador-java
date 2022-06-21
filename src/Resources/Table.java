package Resources;

import java.util.HashMap;

public class Table {

	private HashMap<String, Symbol> tab;

	public Table() {

		this.tab = new HashMap<String, Symbol>();

	}

	public boolean inclui(Symbol _simb) throws CompilerException {

		if (this.tab.containsKey(_simb.getNome())) {

			throw new CompilerException("A variavel " + _simb.getNome() + " já foi declarada!");

		}

		this.tab.put(_simb.getNome(), _simb);

		return true;

	}

	public int consultaReferencia(String _chave) {

		return ((Symbol) this.tab.get(_chave)).getReferencia();

	}

	public void isExiste(String _chave) throws CompilerException {

		if(!this.tab.containsKey(_chave)) {
			throw new CompilerException("A variavel " + _chave +" não foi declarada!");
		}
	}

	public String toString() {

		return this.tab.toString();

	}

}
