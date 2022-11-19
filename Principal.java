package Padrao;

public class Principal {

	public static void main(String[] args) { //método para começar o programa
		Pessoa pes1 = new Pessoa (0001); //usei apenas 1 argumento, id
		pes1.CPF = "102.554.667-90"; //ao criar o objeto pes1, eu posso começar a passar valores para ele
		pes1.nome = "Luana Nogueira";
		pes1.altura = 1.60;
		pes1.peso = 98;
		System.out.println(pes1.imprimeDados());
		
		IMC objIMC = new IMC(pes1.altura, pes1.peso);
		System.out.println("IMC:" + objIMC.calculaIMC() + "\n" +
							"Classificacao: " + objIMC.verificaClassificacaoIMC() + "\n");
		
		Pessoa pes2 = new Pessoa (0002, "105.001.027-24", "Monique Nogueira");
		pes2.altura = 1.62;
		pes2.peso = 80;
		System.out.println(pes2.imprimeDados());
		IMC objIMC2 = new IMC(pes2.altura, pes2.peso);
		System.out.println("IMC:" + objIMC2.calculaIMC() + "\n" +
							"Classificacao: " + objIMC2.verificaClassificacaoIMC() + "\n");
		
		Pessoa pes3 = new Pessoa (0003, "005.051.027-24", "Márcia Nogueira", 1.58, 75);
		System.out.println(pes3.imprimeDados());
		IMC objIMC3 = new IMC(pes3.altura, pes3.peso);
		System.out.println("IMC:" + objIMC3.calculaIMC() + "\n" +
							"Classificacao: " + objIMC3.verificaClassificacaoIMC() + "\n");

	}

}
