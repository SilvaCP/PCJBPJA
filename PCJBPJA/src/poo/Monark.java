package poo;

public class Monark {
	public static void main(String[] args) {
		
		Bicicleta monark = new Bicicleta();
		monark.ano = 2020;
		monark.cor ="Vermelha";
		monark.modelo ="Carga";
		
		System.out.println("Bicicleta Monark:");
		System.out.println("Ano: " + monark.ano);
		System.out.println("Cor: " + monark.cor);
		
		monark.andar();
		monark.frear();
		System.out.println("Bicicleta parada!");
		
	}
}
