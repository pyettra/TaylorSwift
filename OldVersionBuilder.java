package ExemploBuilder;

/* Para o ábum que não pertece mais a Taylor Swift, criamos o builder
	OldVersionBuilder. 
	
	A única diferença dele para o TaylorVersionBuilder
	é a atribuição de falso ao atributo de "ehTaylorsVersion" e o 
	override que precisamos fazer no método de número de tretas.
	Aqui, receberemos do usuário que está criando um álbum da OldVersion
	um valor para o número de tretas e ele será utilizado na construção desse
	álbum. 
	
*/

public class OldVersionBuilder extends AlbumBuilder {
	@Override
	public void buildNomeAlbum(String nome) {
		album.nomeAlbum = nome;
	}

	@Override
	public void buildAnoLancamento(int ano) {
		album.anoLancamento = ano;
	}

	@Override
	public void buildNomeGravadora() {
		album.nomeGravadora = "Big Machine Label Group";
	}

	@Override
	public void buildEhTaylorsVersion() {
		album.ehTaylorsVersion = false;
	}

	@Override
	public void buildNumeroDeMusicas(int numero) {
		album.numeroDeMusicas = numero;
	}

	@Override
	public void buildSingle(String single) {
		album.single = single;
	}

	@Override
	public void buildNotaPitchfork(double nota) {
		album.notaPitchfork = nota;
	}

	@Override
	public void buildNumeroDeTretas(int tretas) {
		album.tretas = tretas;
	}
}
