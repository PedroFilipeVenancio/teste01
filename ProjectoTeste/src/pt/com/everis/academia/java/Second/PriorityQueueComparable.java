package pt.com.everis.academia.java.Second;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparable implements Comparable<PriorityQueueComparable> {

	private String nome;
	private Integer idade;
	
	
	public PriorityQueueComparable(String nome, Integer idade) {
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
	public int compareTo(PriorityQueueComparable o) {
		// TODO Auto-generated method stub
		return o.getIdade().compareTo(getIdade());
	}
	
	
	
	@Override
	public String toString() {
		return "PriorityQueueComparable [nome=" + nome + ", idade=" + idade + "]";
	}


	public static void main(String[] args) {
		Queue ok = new PriorityQueue<>();
		ok.add(new PriorityQueueComparable("Antonio1", 132));
		ok.add(new PriorityQueueComparable("Antonio2", 232));
		ok.add(new PriorityQueueComparable("Antonio3", 332));
		ok.add(new PriorityQueueComparable("Antonio4", 432));
		
		System.out.println(ok.peek());
	}
	
	

}
