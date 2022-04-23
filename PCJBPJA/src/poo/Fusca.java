package poo;

public class Fusca {
	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.ano = 1978;
		fusca.cor = "Branco";
		
		System.out.println("Carro: Fusca");
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Ano: " + fusca.cor);
		
		fusca.ligar();
		System.out.println("Fusca ligado!");
		System.out.println("Acelerar!");
		fusca.acelerar();
		System.out.println("Desligar o Fusca!");
		fusca.desligar();
		System.out.println("Motor do Fusca desligado!");
	}

}
