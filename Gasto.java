public class Gasto {
	
	//Adicionar funcoes set e gets
	String categoria;
	String data; //Procurar se tem uma variavel data (yy/mm/dd)
	
	double valor;
	
	int id;
	int parcelas;

	//SETS E GETS
	public void setCategoria(String novaCategoria){
		this.categoria = novaCategoria;
	}

	public String getCategoria(){
		return categoria;
	}

	public void setData(String novaData){
		this.data = novaData;
	}

	public String getData(){
		return data;
	}

	public void setValor(String novoValor){
		this.valor = novoValor;
	}

	public double getValor(){
		return valor;
	}

	public void setId(String novoId){
		this.id = novoId;
	}

	public int getId(){
		return id;
	}

	public void setParcelas(String novoParcelas){
		this.parcelas = novoParcelas;
	}

	public int getParcelas(){
		return parcelas;
	}
}

//Criar grupo do git