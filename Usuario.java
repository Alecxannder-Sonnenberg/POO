public class Usuario {
	
	int idUsuario;
	String nome;
	String email;
	String telefone;
	String emprego;
	
	String dataSalario; //Procurar se tem uma variavel data (yy/mm/dd)
	
	double rendaFixa;


	//SETS E GETS
	public void setNome(String novoNome){
		this.nome = novoNome;
	}

	public String getNome(){
		return nome;
	}

	public void setEmail(String novoEmail){
		this.email = novoEmail;
	}

	public String getEmail(){
		return email;
	}

	public void setTelefone(String novoTelefone){
		this.telefone = novoTelefone;
	}

	public String getTelefone(){
		return telefone;
	}

	public void setEmprego(String novoEmprego){
		this.emprego = novoEmprego;
	}

	public String getEmprego(){
		return emprego;
	}

	public void setDataSalario(String novoDataSalario){
		this.dataSalario= novoDataSalario;
	}

	public String getDataSalario(){
		return dataSalario;
	}

	public void setRendaFixa(double novaRenda){
		this.rendaFixa = novaRenda;
	}

	public double getRendaFixa(){
		return rendaFixa;
	}
}