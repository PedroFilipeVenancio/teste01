package pt.com.everis.academia.java.Second;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeu {
	
	private String nome;
	private Integer idade;
	
	
	public ArrayDequeu(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	@Override
	public String toString() {
		return "ArrayDequeu [nome=" + nome + ", idade=" + idade + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ok = new ArrayDeque<>();
		ok.addFirst(new ArrayDequeu("Antonio1", 132));
		ok.addFirst(new ArrayDequeu("Antonio2", 232));
		ok.addFirst(new ArrayDequeu("Antonio3", 332));
		ok.addFirst(new ArrayDequeu("Antonio4", 432));
		
		System.out.println(ok);
		
		System.out.println(ok.peek());
		System.out.println(ok.getLast());
		System.out.println(ok.getFirst());

	}

}
