package poo;

public class BMW {
public static void main(String[] args) {
	Carro bmw = new Carro();
	bmw.ano = 2022;
	bmw.cor = "Preto";
	
	System.out.println("Carro: BMW");
	System.out.println("Ano: " + bmw.ano);
	System.out.println("Cor: " + bmw.cor);

	bmw.ligar();
	System.out.println("BMW ligada!");
	System.out.println("Acelerar!");
	bmw.acelerar();
	System.out.println("Desligar a BMW");
	bmw.desligar();
	System.out.println("Motor da BMW desligado!");
	
	Carro mustang = new Carro();
	mustang.ano = 2023;
	mustang.cor = "Azul";
	
	System.out.println("Carro: Mustang");
	System.out.println("Ano: " + mustang.ano);
	System.out.println("Cor: " + mustang.cor);
	
	mustang.ligar();
	System.out.println("Mustang ligado!");
	mustang.acelerar();
	System.out.println("VRUUUUUUuuuuuu.");
	mustang.desligar();
	System.out.println("Motor do Mustang desligado!");
	
}
}
