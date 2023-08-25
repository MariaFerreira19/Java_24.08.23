package JavaOO;
import java.util.Scanner;
public class Letras {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		char conceito;
		System.out.println("Digite uma letra para saber se é vogal ou consoante (minúscula): ");
		conceito = ent.next().charAt(0);
		
		switch (conceito) {
		case 'a' ,'e', 'i' ,'o' ,'u': System.out.println("Vogal");
		break;
		case 'b' ,'c', 'd' ,'f' ,'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 
		'x', 'y', 'z': System.out.println("Consoante");
		break;
		default: System.out.println("Caractere inválido!");
		break;
		
		}
	}
}
