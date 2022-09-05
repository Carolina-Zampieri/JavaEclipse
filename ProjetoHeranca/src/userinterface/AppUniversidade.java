package userinterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Carolina", "carol@carol.com", "999789012");
		//p.setNome("Carolina");
		//p.setEmail("carol@carol.com");
		//p.setTelefone("999789012");
		
		System.out.println(p.exibirInfo());
		
		Estudante e = new Estudante("Angelica", "angelica@angel.com", "912345678", 1234, "Computacao");
		
		//e.setNome("Angelica");
		//e.setEmail("angelica@angel.com");
		//e.setTelefone("912345678");
		//e.setNumeroMatricula(1234);
		//e.setCurso("Computacao");
		
		System.out.println(e.exibirInfo());
		
	}
}
