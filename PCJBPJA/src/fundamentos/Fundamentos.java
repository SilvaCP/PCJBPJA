package fundamentos;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		nome = "Carlos";
		int idade;
		idade = 10;
		char sexo;
		sexo = 'M';
		double temperatura;
		temperatura = 26.8;
		boolean arCondicionado;
		arCondicionado = true;
		System.out.println("Uso de variaveis em Java.");
		System.out.println("Exemplos:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Condicionado: " + arCondicionado);
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("Operadores Aritméticos e Atribuições.");
		System.out.println("Exemplos:");
		double i = 10;
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("ESTRUTURA DE CONTROLE");
		System.out.println("");
		System.out.println("Estrutura de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do 'if' ");
		if (sexo == 'F') {
			System.out.println("Alistamento Militar obrigatório.");
		}else {
			System.out.println("Despensado!");
		}
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'else if' ");
		if (idade < 16) {
			System.out.println("Proibido voltar!");
		}else if(idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigatorio!");
		}else if(idade == 16 || idade == 17 || idade > 70){
			System.out.println("Voto facultativo.");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'switch case' ");
		System.out.println("1 Cadastro de cliente.");
		System.out.println("2 Cadastro de usuário.");
		System.out.println("3 Cadastro de relatório.");
		int opcao = 3;
		switch (opcao) {
		case 1: {
			System.out.println("Cliente");
			break;
		}
		case 2:{
			System.out.println("Usuário");
			break;
		}
		case 3:{
			System.out.println("Relatório");
			break;
		}
		default:
		System.out.println("Opção inválida!");
		break;
		}
		System.out.println("");
		System.out.println("Exemplo 4 - Uso do 'for'");
		for(int j = 10; j > 0; j-- ){
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Exemplo 5 Tabuada!");
		for(int tabuada = 0; tabuada <= 10; tabuada++){
			System.out.println("");
			for(int valor = 0; valor <= 10; valor++){
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		System.out.println("");
		System.out.println("Exemplo 6 - Uso da estrutura while");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Exemplo 7 - Uso da estrutura do while");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente (s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER!");
	}

}
