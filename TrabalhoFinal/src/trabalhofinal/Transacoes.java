package trabalhofinal;

public class Transacoes {
	
	static private long ID = 0;
	String categoria;
	String Data; //Procurar se tem uma variavel data (yy/mm/dd)
	
	double valor;
	
	long id; //Id identifica a transacao
	int parcelas;
	
	//Construtor
	public Transacoes(String cat, String data, double Valor, int par) {
		this.categoria = cat;
		this.Data = data;
		this.valor = Valor;
		this.id = Transacoes.ID;
		this.parcelas = par;
		ID++;
	}
	
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
}