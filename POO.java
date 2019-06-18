public class POO {
	public static void main (String[] args) {
		
		//int op;
		
		Fluxo f = new Fluxo();
		
		Transacoes [] t = new Transacoes[10];
		t[0] = new Transacoes ("Comida", "17/06/2019", 15.50, 1, 1);
		t[1] = new Transacoes ("Comidaa", "16/06/2019", 17.50, 1, 0);
		t[2] = new Transacoes ("Roupaa", "15/06/2019", 317.50, 1, 0);
		t[3] = new Transacoes ("Vendas", "18/06/2018", 1215.50, 1, 1);
		t[4] = new Transacoes ("Vendas", "17/06/2018", 12115.50, 1, 1);
		
		f.insereLista(t[0]);
		f.insereLista(t[1]);
		f.insereLista(t[2]);
		f.insereLista(t[3]);
		f.insereLista(t[4]);
		
		//f.exibeTransacoes(0);
		f.exibeReceita(3);
		//f.exibeDespesas(0);
	}
}
