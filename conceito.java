 package JavaOO;
import java.util.Scanner;
public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		char conceito;
		System.out.println("Conceito de um aluno numa matéria");
		System.out.println("Digite o conceito do aluno (caracteres válidos: A|B|C|D|E|F)");
		conceito = ent.next().charAt(0);
		switch (conceito) {
		case 'a':
		case 'A': System.out.println("Conceito EXCELENTE!");
				break;
		case 'b':
		case 'B': System.out.println("Conceito ÓTIMO!");
		break;
		case 'c':
		case 'C': System.out.println("Conceito BOM!");
		break;
		case 'd':
		case 'D': System.out.println("Conceito REGULAR!");
		break;
		case 'e':
		case 'E': System.out.println("Conceito RUIM!");
		break;
		case 'f':
		case 'F': System.out.println("Nos vemos no ano que vem!");
		break;
		default: System.out.println("Opção inválida!"); 
		break; 
		}
	}

}
