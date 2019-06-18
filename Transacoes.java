public class Transacoes {
	
	static private long ID = 0;
	String categoria;
	String Data; //(dd/mm/yyyy)
	
	double valor;
	
	long id; //Id identifica a transacao
	int parcelas; //Numero de parcelas
	int Receita = -1; //Indica se e receita ou despesa
	
	//Construtor
	public Transacoes(String cat, String data, double Valor, int par, int Rec) {
		this.categoria = cat;
		this.Data = data;
		this.valor = Valor;
		this.id = Transacoes.ID;
		this.parcelas = par;
		this.Receita = Rec;
		ID++;
	}
	
	//Setter and Getters
	public void setCategoria (String novaCategoria) {
		this.categoria = novaCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	
	public void setData (String novaData) {
		this.Data = novaData;
	}
	public String getData() {
		return Data;
	}
	
	public void setValor (double novoValor) {
		this.valor = novoValor;
	}
	public double getValor() {
		return valor;
	}
	
	public void setId (long novoId) {
		this.id= novoId;
	}
	public long getId() {
		return id;
	}
	
	public void setParcelas(int nroParcelas) {
		this.parcelas = nroParcelas;
	}
	public int getParcelas() {
		return parcelas;
	}
	
	public void setReceita (int Rec) {
		this.Receita = Rec;
	}
	public int getReceita() {
		return Receita;
	}
}
