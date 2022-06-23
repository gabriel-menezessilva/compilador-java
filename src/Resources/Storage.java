package Resources;

import java.util.LinkedList;

public class Storage {

	private LinkedList<Item> itens;
	
	public Storage() {
		this.itens = new LinkedList<Item>();
	}
	
	public void Incluir(Item item) {
		this.itens.add(item);
	}
	
	public String toString() {
		return this.itens.toString();
	}
	
}
