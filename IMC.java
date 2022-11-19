package Padrao;

public class IMC {
	
	public double altura; // atributo público
	public double peso; //atributo público
	
	public IMC (double altura, double peso) { //construtor que receb dois args
		this.altura = altura;
		this.peso = peso;
		
	}
	
	public double calculaIMC() { //método
		return this.peso / (this.altura * this.altura);
	}
	
	public String verificaClassificacaoIMC() { //método
		
		if (this.calculaIMC() < 18.5)
			return "Magreza";
		else if(this.calculaIMC() >= 18.5 && this.calculaIMC() <= 24.9)
			return "Peso normal";
		else if(this.calculaIMC() >= 25 && this.calculaIMC() <= 29.9)
			return "Sobrepeso";
		else if(this.calculaIMC() >= 18.5 && this.calculaIMC() <= 34.9)
			return "Obesidade Grau I";
		else if(this.calculaIMC() >= 35 && this.calculaIMC() <= 40)
			return "Obesidade Grau II";
		else
			return "Obesidade Grau III";
		
	}

}
