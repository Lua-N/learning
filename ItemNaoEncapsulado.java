package PktPrincipal;

public class ItemNaoEncapsulado { // classe
	
	private int id; // atributos estão encapsulados
	private double preco_unit;
	private double desconto;
	private int quantidade;
	private String descricao;
	private double maxDesconto = 0.20;
	// construtor, método, tem o mesmo nome da Classe. 
	public ItemNaoEncapsulado(int identif, String dsc, double preco) { //argumentos
		this.setId(identif); //atribuo cada um para propriedades diferentes da minha classe
		this.setDescricao(dsc);
		this.setPreco_unit(preco);
	}
	
	private void setDescricao(String dsc) {
		// TODO Auto-generated method stub
		
	}

	private void setId(int identif) {
		// TODO Auto-generated method stub
		
	}

	public double buscaPrecoAjustado() { //método para aplicar desconto
		return preco_unit - (preco_unit * this.getDesconto());
	}
	public double getPreco_unit() {
		return preco_unit;
	}
	public void setPreco_unit(double preco_unit) {
		this.preco_unit = preco_unit;
	}
	public double getDesconto() { //retorna o desconto normalmente
		return desconto;
	}
	public void setDesconto(double desconto) { //regra
		if (desconto > maxDesconto)
			this.desconto = maxDesconto;
		else 
			this.desconto = desconto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	
}
