package implementacao;

public class Lista {
	Contato[] contatos = new Contato[100]; //vetor que armazena os contatos
	int n  = 0; //posicao indice do ultimo elemento da lista
	
	/**
	* Verifica se a lista est‡ vazia
	* @return true se a lista estiver vazia ou false caso o contr‡rio
	*/
	public boolean isVazia() {
		return (n == 0);
	}
	
	/**
	* Verifica se a lista est‡ cheia
	* @return true se a lista estiver cheia ou false caso o contr‡rio
	*/
	public boolean isCheia() {
		return (n == contatos.length);
	}
	
	/**
	* Obter o tamanho da lista
	*/
	public int tamanho() {
		return n;
	}
	
	/**
	* Verifica o valor do elemento com base na posicao
	*/
	public Contato buscar(int pos) {
		
	}
	
}
