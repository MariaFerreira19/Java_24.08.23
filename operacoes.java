package JavaOO;
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
	float num1, num2, soma, dif, prod, div;
	int op;
	Scanner ent = new Scanner(System.in);
	System.out.println("Operações com dois números");
	System.out.println("Digite o primeiro número: ");
	num1 = ent.nextFloat();
	System.out.println("Digite o segundo número: ");
	num2 = ent.nextFloat();
	System.out.println("Opções de operações");
	System.out.println("1 - Soma dos 2 números");
	System.out.println("2 - Subtrai os 2 números");
	System.out.println("3 - Multiplica os 2 números");
	System.out.println("4 - Divide os 2 números");
	System.out.println("Escolha a sua opção: ");
	op = ent.nextInt();
	soma = num1 + num2;
	dif = num1 - num2;
	prod = num1 * num2;
	div = num1 / num2;
	switch(op) {
	case 1: System.out.println(num1 + "+" + num2 + "=" + soma);
	break;
	case 2: System.out.println(num1 + "-" + num2 + "=" + dif);
	break;
	case 3: System.out.println(num1 + "*" + num2 + "=" + prod);
	break;
	case 4: if(num2 == 0) {System.out.println("Não existe divisão por zero");}
		else {System.out.println(num1 + "/" + num2 + "=" + div);}
	break;
	default: System.out.println("Opção inválida!"); break;
		}//fim da switch
	}//fim da main
}//fim da classe
