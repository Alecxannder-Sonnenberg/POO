import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

//Compara id de elementos para um Sort
class SortbyId implements Comparator<Transacoes> {
	
	public int compare (Transacoes a, Transacoes b) {
		return (int) (a.getId() - b.getId());
	}
}

//Essa funcao usa parsing para transformar as string no formato data desejadoe em seguida organiza por data
class SortbyDate implements Comparator<Transacoes> {
	
	DateFormat f = new SimpleDateFormat("dd/MM/yyyy"); 
	
	public int compare (Transacoes a, Transacoes b) {
		String s1 = a.getData();	
		String s2 = b.getData();
		try {
			return -(f.parse(s1).compareTo(f.parse(s2)));
		} catch (ParseException e) {
			throw new IllegalArgumentException(e);
		}
	}
}

//Fluxo de fato
public class Fluxo {
	
	ArrayList<Transacoes> dados; //Uma lista que contem todas transações
	double saldo = 0; //Vai receber o saldo total
	double despesa= 0; //Vai receber a despesa total
	double receita = 0; //Vai receber receita total
	
	//Construtor
	public Fluxo() {
		this.dados = new ArrayList<Transacoes>();
		this.saldo = 0; 
		this.despesa = 0; 
		this.receita = 0; 
	}
	
	//Setter and Getters
	public void setDados (ArrayList<Transacoes> d) {
		dados = d;
	}
	public ArrayList<Transacoes> getDados(){
		return dados;
	}
	
	public void setSaldo (double sal) {
		this.saldo = sal;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setDespesa (double des) {
		this.despesa = des;
	}
	public double getDespesa() {
		return despesa;
	}
	
	public void setReceita (double rec) {
		this.receita = rec;
	}
	public double getReceita() {
		return receita;
	}
	
	//Organiza a lista por data, de acordo com a função SortbyDate
	public void sortListabyDate() {
		dados.sort(new SortbyDate());
	}

	//Insere a nova transação na lista fluxo
	public void insereLista(Transacoes trans) {
		//Funcao que recebe dados da interface 
		dados.add(trans); //Adiciona o dado a lista
		
		//Se for uma receita
		if (trans.Receita == 1) { 
			this.receita += trans.valor;
			this.saldo += trans.valor;
		}
		//Se for uma despesa
		else if (trans.Receita == 0) {
			this.despesa += trans.valor;
			this.saldo -= trans.valor;
		}
	}
	
	//Duvida atual já remove direto, mas preciso atualizar saldo/receita/despesa
	public void removeLista (long idTransacao) {
		dados.removeIf(find -> (find.id == idTransacao));
	}
	
	//imprime os dados relevantes da transaçao
	public void imprime(Transacoes t) {
		System.out.print("Categoria: "+ t.getCategoria() + "\n");
		System.out.print("Valor: " + t.getValor() + "\n");
		System.out.println("Data: " + t.getData() + "\n");
		//System.out.println("Parcelas: " + t.getParcelas() + "\n");
	}
	
	//Exibe todas transacoes ordenadas por data (acho que crescente da mais antiga para a mais nova)
	public void exibeTodasTransacoes() {
		
		this.sortListabyDate();//Organiza a lista por data
		for (Transacoes t: dados){
			this.imprime(t);
		}
	}
	
	//Exibe somente as receitas
	public void exibeTodasReceitas() {
		
		this.sortListabyDate(); //Organiza a lista por data
		for (Transacoes t: dados){
			if (t.Receita == 1) {
				this.imprime(t);
			}
		}
	}
	
	//Exibe somente as despesas
	public void exibeTodasDespesas() {
		
		this.sortListabyDate(); //Organiza a lista por data
		for (Transacoes t: dados){
			if (t.Receita == 0) {
				this.imprime(t);
			}
		}
	}
	
	//Uma funcao que com base no tempo atual e em um intervalo de dias  retorna um array com a data que é o limite
	//inferior de tempo. Utilizada na impressão em intervalos de 30 dias, 90 dias, 180 dias e dependendo do ano 365/366 dias
	public int [] funcaodaoradetempo(int dias) {
		
		DateFormat f = new SimpleDateFormat ("dd/MM/yyyy");
		Date date = new Date();
		
		String data [];
		int DMY [] = new int [3]; //Um array para guardar os valores inteiros do dia, mes e ano respectivamente
		
		String base = f.format(date).toString(); //Da data atual;
		
		data = base.split("/"); //Faz um split da string
		for (int i = 0; i < 3; i++) {
			DMY[i] = Integer.parseInt(data[i]); //Faz um parsing para inteiro
		}
		
		//Se for um periodo(dias) de um ano (poderia ser dentro do while para n anos)
		if (dias >= 365) {
			//Se for ano bissexto
			if (DMY[2] % 4 == 0) dias -= 366;
			else dias -= 365;
			DMY[2]--;
		}
		
		while (dias != 0) {
			if (dias >= DMY[0]){
				dias -= DMY[0]; //Reduz o numero de dias
				//Se tiver mais tempo do que o mes possui
				if (DMY[1] == 1 || DMY[1] == 3 || DMY[1] == 5 || DMY[1] == 7 || DMY[1] == 8 ||DMY[1] == 10 || DMY[1] == 12) {
					//Janeiro (Mes especial)
					if (DMY[1] == 1) {
						DMY[2]--;
						DMY[1] = 12;
						DMY[0] = 31;
					}
					//Março (Mes especial)
					else if (DMY[1] == 3) {
						DMY[1]--; //Reduz um mes
						if (DMY[2] % 4 != 0) DMY[0] = 28;
						else DMY[0] = 29;
					}
					//Maio - Julho - Outubro - Dezembro (Meses com mesma estrutura)
					else if (DMY[1] == 5 || DMY[1] == 7 || DMY[1] == 10 || DMY[1] == 12) {
						DMY[1]--; 
						DMY[0] = 30;
					}
					//Agosto (Mes especial)
					else if (DMY[1] == 8) {
						DMY[1]--;
						DMY[0] = 31;
					}
				}
				//Caso seja outro mes e hajam dias para um mes
				else if ((DMY[1] == 4 || DMY[1] == 6 || DMY[1] == 9 || DMY[1] == 11)) {
					//Abril - Junho - Setembro - Novembro
					if (DMY[1] == 4 || DMY[1] == 6 || DMY[1] == 9 || DMY[1] == 11) {
						DMY[1]--;
						DMY[0] = 31;
					}
				}

				//Fevereiro (Mes especial)
				else if (DMY[1] == 2) {
					DMY[1] = 1;
					DMY[0] = 31; //Primeiro dia de fevereiro
				}
			}
			else {
				DMY[0] -= dias;
				dias = 0;
			}
		}
		
		return DMY;
	}
	
	public void print_if_valid(int [] LDMY, int []TDMY, int[] HDMY, Transacoes t) {
		
		if (LDMY[2] <= TDMY[2] && TDMY[2] <= HDMY[2])
		{
			if (TDMY[2] == LDMY[2]) {
				if (TDMY[1] >= LDMY[1]) {
					if (TDMY[1] == LDMY[1]) {
						if (TDMY[0] >= LDMY[0]) {
							this.imprime(t);
						}
					}
					else this.imprime(t);
				}
			}
			else this.imprime(t);
		}
	}
	
	public void exibeTransacoes(int op) {
		int [] HDMY = this.funcaodaoradetempo(0); //Pega o dia atual
		
		//Determina a range de dias que devem ser exibidos
		int dias = 0;
		if (op == 0) dias = 30;
		else if (op == 1) dias = 90;
		else if (op == 2) dias = 180;
		else if (op == 3 && (HDMY[2] % 4 == 0)) dias = 366;
		else if (op == 3 && (HDMY[2] % 4 != 0)) dias = 365;
		
		//Comparar com a data em string da transação
		int [] LDMY = this.funcaodaoradetempo(dias); //Pega op dias atras
		
		String data [];
		int [] TDMY = new int [3];
			
		this.sortListabyDate();
		for (Transacoes t: dados ) {
			data = t.Data.split("/");
			for (int i = 0; i < 3; i++) {
				TDMY[i] = Integer.parseInt(data[i]);
			}
			this.print_if_valid(LDMY, TDMY, HDMY, t);
		}
	}
	
	public void exibeReceita(int op) {
		int [] HDMY = this.funcaodaoradetempo(0); //Pega o dia atual
		
		//Determina a range de dias que devem ser exibidos
		int dias = 0;
		if (op == 0) dias = 30;
		else if (op == 1) dias = 90;
		else if (op == 2) dias = 180;
		else if (op == 3 && (HDMY[2] % 4 == 0)) dias = 366;
		else if (op == 3 && (HDMY[2] % 4 != 0)) dias = 365;
		
		//Comparar com a data em string da transação
		int [] LDMY = this.funcaodaoradetempo(dias); //Pega op dias atras
		
		String data [];
		int [] TDMY = new int [3];
			
		this.sortListabyDate();
		for (Transacoes t: dados ) {
			if (t.Receita == 1) {
				
				data = t.Data.split("/");
				for (int i = 0; i < 3; i++) {
					TDMY[i] = Integer.parseInt(data[i]);
				}
				this.print_if_valid(LDMY, TDMY, HDMY, t);
			}
		}
	}
	
	public void exibeDespesas(int op) {	
		int [] HDMY = this.funcaodaoradetempo(0); //Pega o dia atual
	
		//Determina a range de dias que devem ser exibidos
		int dias = 0;
		if (op == 0) dias = 30;
		else if (op == 1) dias = 90;
		else if (op == 2) dias = 180;
		else if (op == 3 && (HDMY[2] % 4 == 0)) dias = 366;
		else if (op == 3 && (HDMY[2] % 4 != 0)) dias = 365;
		
		//Comparar com a data em string da transação
		int [] LDMY = this.funcaodaoradetempo(dias); //Pega op dias atra
		
		String data [];
		int [] TDMY = new int [3];
			
		this.sortListabyDate();
		for (Transacoes t: dados ) {
			if (t.Receita == 0) {
				
				data = t.Data.split("/");
				for (int i = 0; i < 3; i++) {
					TDMY[i] = Integer.parseInt(data[i]);
				}
				this.print_if_valid(LDMY, TDMY, HDMY, t);
			}
		}
	}
}
