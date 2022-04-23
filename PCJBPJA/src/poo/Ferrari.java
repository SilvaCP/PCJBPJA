package poo;

public class Ferrari {
	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2002;
		ferrari.cor = "Vermelho";
		System.out.println("Ferrari");
		System.out.println("Ano " + ferrari.ano);
		System.out.println("Cor " + ferrari.cor);
		ferrari.ligar();
		System.out.println("Ferrari ligado!");
		System.out.println("Acelerar!");
		ferrari.acelerar();
		ferrari.desligar();
		System.out.println("Carro Ferrari desligado!");
	}
}
