
public class ClasseQueUsa {
	public static void main(String[] args) {
		
		InterfaceServico i;
		
		i = new InterfaceServico() {
			public void executa(int valor) {
				System.out.println("Estou executando algo..." + valor);
			}
		};
		
		i.executa(10);
		
		InterfaceServico i2 = (valor) -> {    //esse trecho de código "eu tenho efetivamente a minha lista e parametros que vai implicar nessa execucao"
			System.out.println("Outra logica " + valor);
		};
		
		i2.executa(20);
	}
}
