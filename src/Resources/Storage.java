package Resources;

import java.util.LinkedList;
import java.util.ArrayList;

public class Storage {

	private LinkedList<Item> itens;

	public Storage() {
		this.itens = new LinkedList<Item>();
	}

	public void Incluir(Item item) {

		if (item.getTipo() != 'O') {
			this.itens.add(item);
		} else {
			VerificarNumericos();
			this.itens.add(item);
		}
	}

	public boolean VerificarNumericos() {
		int lastIndex = this.itens.size() - 1;

		// Verifica se tem o tamanho necessário
		if (lastIndex >= 2) {
			ArrayList<Integer> listAux = new ArrayList<Integer>();

			for (int i = lastIndex; i > this.itens.size() - 4; i--) {
				if (this.itens.get(lastIndex).getTipo() == 'N') {
					listAux.add(i);
				}
			}

			// Está correto e pode efetuar o calculo
			if (listAux.size() == 3) {
				double resultado = 0;
				int ultimoIndex = listAux.get(0);
				Item ultimoElemento = this.itens.remove(ultimoIndex);

				int operadorIndex = listAux.get(1);
				Item operadorElemento = this.itens.remove(operadorIndex);

				int primeiroIndex = listAux.get(2);
				Item primeiroElemento = this.itens.remove(primeiroIndex);

				switch (operadorElemento.getValor()) {
				case "X": {
					resultado = Double.parseDouble(primeiroElemento.getValor())
							* Double.parseDouble(ultimoElemento.getValor());
					break;
				}
				case "/": {
					resultado = Double.parseDouble(primeiroElemento.getValor())
							/ Double.parseDouble(ultimoElemento.getValor());
					break;
				}
				case "+": {
					resultado = Double.parseDouble(primeiroElemento.getValor())
							+ Double.parseDouble(ultimoElemento.getValor());
					break;
				}
				case "-": {
					resultado = Double.parseDouble(primeiroElemento.getValor())
							- Double.parseDouble(ultimoElemento.getValor());
					break;
				}
				}

				this.itens.add(new Item('N', String.valueOf(resultado)));
				return true;
			}

		}

		return false;
	}

	public String toString() {
		return this.itens.toString();
	}

}