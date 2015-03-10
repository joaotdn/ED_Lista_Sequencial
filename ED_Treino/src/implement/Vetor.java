package implement;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0; //número total de alunos no vetor
	
	//adiciona no fim da lista
	public void adiciona(Aluno aluno) {
		//forma linear: nao muito convencional, o laço é rodado 51 vezes (por exemploe)
		//se tivermos 50 posições ocupadas
//		for (int i = 0; i < this.alunos.length; i++) {
//			if(this.alunos[i] == null) {
//				this.alunos[i] = aluno;
//				break;
//			}
//		}
		
		//Melhoria: consumo constante
		//dessa maneira o consumo de tempo para adicionar
		//um novo aluno será sempre o mesmo
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	//Para adicionar um aluno, deve-se colocar em pos. ja ocupada
	//ou na primeira posicao vazia no metoro posicaoValida
	public void adiciona(int posicao, Aluno aluno) {
		
		//posicao menor que 0 ou maior q o total de 
		//alunos
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
			this.alunos[i + 1] = this.alunos[i];
		}

		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	
	private boolean posicaoValida(int pos) {
		return pos >= 0 && pos <= this.totalDeAlunos;
	}
	
	public Aluno pega(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.alunos[posicao];
	}
	
	//true se a pos tiver ocupada e false caso contrario
	//necessario para pegar o aluno no metodo acima
	private boolean posicaoOcupada(int pos) {
		//se a posiçao não estiver ocupada, retorna false
		return pos >= 0 && pos < this.totalDeAlunos;
	}
	
	public void remove(int posicao) {
		
	}
	
	public boolean contem(Aluno aluno) {
		//metodo ineficiente: percorre o array inteiro
//		for (int i = 0; i < this.alunos.length; i++) {
//			if(aluno == this.alunos[i]) {
//				return true;
//			}
//		}
		
		//compara-se o valor da referencia ao objeto 
		//armazenada na variavel
//		for (int i = 0; i < this.totalDeAlunos; i++) {
//			if(aluno == this.alunos[i]) {
//				return true;
//			}
//		}
		
		//compara o Objeto
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if(aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}
	
	public String toString() {
		if(this.totalDeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder buider = new StringBuilder();
		buider.append("[");
		
		for (int i = 0; i < this.totalDeAlunos; i++) {
			buider.append(this.alunos[i]);
			buider.append(", ");
		}
		
		buider.append(this.alunos[this.totalDeAlunos - 1]);
		buider.append("]");
		
		return buider.toString();
	}
}
