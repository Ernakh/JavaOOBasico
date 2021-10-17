import java.util.Scanner;

import Pastel.PastelAssado;
import Pastel.PastelFrito;

public class Main 
{

	/*
	 * extends serve somente para heran�a, quando voc� quer que uma determinada classe "estenda" suas funcionalidades para uma outra, de modo que ela possa usar essa funcionalidade original
	 * 			 ou adaptar para sua necessidade. 
	 * implements � somente para interface, pois esta funciona como um contrato, e voc� precisa "implementar" na classe os m�todos que a interface tiver
	 * 
	 * */
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		Pessoa p = new Pessoa();
		p.setNome("Fabr�cio");
		p.setIdade(31);
		
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		
		System.out.println("---");
		
		p = new Pessoa("Fabr�cio TL");
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		
		System.out.println("---");
				
		p = new Pessoa("Fabr�cio Tonetto Londero", 31);
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		
		System.out.println("---");
		
		System.out.println(p.trabalhar());
		System.out.println(p.comer());
		
		System.out.println("---");
		
		Aluno a = new Aluno();
		
		System.out.println(a.trabalhar());
		System.out.println(a.estudar());
		System.out.println(a.comer());
		
		System.out.println("---");
		
		Cavalo c = new Cavalo();
		System.out.println(c.pular());
		
		System.out.println("---");
		
		Scanner scan = new Scanner (System.in);
		c.nome = scan.nextLine();
		System.out.println(c.nome);
		
		System.out.println("---");
		
		PastelFrito pastelF = new PastelFrito();
		System.out.println(pastelF.exibirInfoPastel());
		
		System.out.println("---");
		
		PastelAssado pastelA = new PastelAssado();
		System.out.println(pastelA.exibirInfoPastel());
		
		System.out.println("---");
		
	}
}
