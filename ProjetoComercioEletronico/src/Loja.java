
public class Loja {
	public static void main(String[] args) {
		
		Produto p, p2, p3;         // declarei
		p = new Produto(123, "Computador", 2500.00); // reservei (aloquei) a memória para isso         
		p2 = new Produto(1234, "Mouse", 70.00);       
		p3 = new Produto(420, "Teclado", 120.00);

		
		//p.setCodigo(123);              // atribui
		//p.setDescricao("Computador");  // atribui
		//p.setPreco(2500.00);           // atribui  
		
		//p2.setCodigo(1234);              
		//p2.setDescricao("Mouse");  
		//p2.setPreco(70.00); 
		
		//p3.setCodigo(420);             
		//p3.setDescricao("Teclado"); 
		//p3.setPreco(120.00); 
		
		System.out.println("---- precos antes dos decontos ----");
		p.mostrarAnuncio();
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
	
		System.out.println("*******************************");
		
		p.aplicarDesconto(10);
		// internamente na chamada do método, há uma atribuição do valor 10 para o parâmetro percentual
		p.mostrarAnuncio();
		// internamente na chamada do método, há uma atribuição do valor 55.00 para o parâmetro NovoPreco
		p2.setPreco(55.00);
		// internamente na chamada do método, há uma atribuição do valor 99.00 para o parâmetro NovoPreco
		p3.setPreco(99.00);
		
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();
		
		// simulando descontos
		System.out.println("O preco do " + p.getDescricao() + " com mais 15% de desconto fica R$ " + p.simularDesconto(15));
		p.mostrarAnuncio();
	}

}
