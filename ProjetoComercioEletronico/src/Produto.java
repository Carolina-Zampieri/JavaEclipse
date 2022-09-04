// aqui estou preocupada em definir meu novo tipo de dado que será
// usado por outras classes / programas java

public class Produto {
	
	// declaro as variáveis que compoem a estrutura
	private int codigo;           
	private String descricao;    // declaração de atributos 
	private double preco;
	
	
	public Produto(int codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// possibilidade de criar funcionalidades
	public void mostrarAnuncio() { // void retorno vazio -> esse método vai imprimir 3 coisas e acabou
		System.out.println("----- PRODUTO EM OFERTA -----");
		System.out.println(codigo + ": " + descricao);
		System.out.printf("R$ %.2f\n", preco); 
	}
	
	// métodos que recebem entradas
	public void modificarPreco(double novoPreco) {
		preco = novoPreco;
	}
	
	public void aplicarDesconto(double percentual) { // declarei uma variável dentro dos () -> são chamadas de parametros -> é a forma de como a plicação princiap tem de se comunicar com a classe
		preco = preco - preco * percentual / 100;
	}

	public double simularDesconto(double percentual){
		double precoSimulado;
		precoSimulado = preco - preco * percentual / 100;
		return precoSimulado;
		
		
	}
}
