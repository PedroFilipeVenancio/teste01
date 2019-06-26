package pt.com.everis.academia.java.Second;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparator {
	private String nome;
	private Integer idade;
	
	
	public PriorityQueueComparator(String nome, Integer idade) {
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
		return "PriorityQueueComparator [nome=" + nome + ", idade=" + idade + "]";
	}


	public static void main(String[] args) {
		Queue ok = new PriorityQueue<>(new Comparator<PriorityQueueComparator>() {
			@Override
			public int compare (PriorityQueueComparator o1, PriorityQueueComparator o2) {
				return o2.getIdade().compareTo(o1.getIdade());
			}
		});
		ok.add(new PriorityQueueComparator("Antonio1", 132));
		ok.add(new PriorityQueueComparator("Antonio2", 232));
		ok.add(new PriorityQueueComparator("Antonio3", 6332));
		ok.add(new PriorityQueueComparator("Antonio4", 432));
		ok.add(new PriorityQueueComparator("Antonio3666666", 6332));
		
		System.out.println(ok.peek());
	}
	
	

}

