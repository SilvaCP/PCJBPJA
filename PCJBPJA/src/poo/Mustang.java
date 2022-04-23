package poo;

public class Mustang {
	public static void main(String[] args) {
		Carro mustang = new Carro();
		mustang.ano = 2023;
		mustang.cor = "Azul";
		
		System.out.println("Carro: Mustang");
		System.out.println("Ano: " + mustang.ano);
		System.out.println("Cor: " + mustang.cor);
		
		mustang.ligar();
		System.out.println("Mustang ligado!");
		System.out.println("Acelerar!");
		mustang.acelerar();
		mustang.desligar();
		System.out.println("Motor do Mustang desligado!");
		System.out.println("");
	}

}
