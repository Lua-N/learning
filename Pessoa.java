package Padrao;

public class Pessoa { // a classe tem 6 atributos, 3 construtores e 1 método
	
	public int identificador;
	public String CPF;
	public String nome;
	public double altura;
	public double peso;
	public int ano_nascimento;
	//primeiro construtor criado
	public Pessoa (int id) { //construtor com o mesmo nome da classe e sem retorno. Receb o arg id
		identificador = id; //esse id, quando chegar no construtor, eu vou passá-lo para a minha propriedade chamada identificador
	}
	//segundo construtor
	public Pessoa (int id, String CPF, String nome) {
		identificador = id;
		this.CPF = CPF; //o this. refere à propriedade da classe, e não ao atributo
		this.nome = nome;
		
		//vou carregar três propriedades
	}
	//terceiro construtor
	public Pessoa (int id, String CPF, String nome, double altura, double peso) {
		this.identificador = id;
		this.CPF = CPF;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		
	}
	//método para imprimir os dados, vai retornar uma String
	public String imprimeDados() {
		return "Identificador: " + this.identificador + "\n" +
				"CPF: " + this.CPF + "\n" +
				"Nome: " + this.nome + "\n" +
				"Altura: " + this.altura + "\n" +
				"Peso: " + this.peso;
	}

}
