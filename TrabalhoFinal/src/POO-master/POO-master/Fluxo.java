import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortbyId implements Comparator<Transacoes> {
	
	public int compare (Transacoes a, Transacoes b) {
		return (int) (a.getId() - b.getId());
	}
}
//Acabar isso
class SortbyDate implements Comparator<Transacoes> {
	
	public int compare (Transacoes a, Transacoes b) {
		String s1 = a.getData();	
	}
}

public class Fluxo {
	
	ArrayList<Transacoes> dados;
	double saldo = 0;
	double despesa= 0;
	double receita = 0;
	
	public Fluxo() {
		dados = new ArrayList<Transacoes>();
		saldo = 0;
		despesa = 0;
		receita = 0;
	}
	
	public void sortListabyDate() {
		dados.sort(new SortbyDate());
	}
	//Perguntar terça para o Claudinei/Mizael se isso dá certo
	public void insereLista(Transacoes trans) {
		//Funcao que recebe dados da interface 
		dados.add(trans); //Adiciona o dado a lista
	}
	
	public void removeLista (long idTransacao) {
		dados.removeIf(find -> (find.id == idTransacao));
	}
	
	public void exibeTransacoes() {
		for(Transacoes t : Transacoes) {
			System.out.println("Categoria:"+ t.getCategoria() + "\n");
			System.out.println("Valor: " + t.getValor() + "\n");
			System.out.println("Data:" + t.getData() + "\n");
		}
	}
	
}
