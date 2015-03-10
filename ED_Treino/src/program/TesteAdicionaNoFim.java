package program;
import implement.*;

public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Jo‹o");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.toString());
		System.out.println(lista.tamanho());
		System.out.println(lista.contem(a3));
		System.out.println(lista.pega(4));
		
	}
}
