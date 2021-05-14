package ExemploBuilder;

/* A classe AlbumBuilder é nossa interface, que determinará todos
	os métodos necessários para que possamos construir um álbum!
	Declaramos também um objeto do tipo AlbumProduct, que nos dará
	a estrutura de dados necessária para a construção dos dois tipos
	de álbuns. Essa classe é uma base apenas com a declaração dos métodos.
	Vamos extender, a partir da classe AlbumBuilder, a classe TaylorVersionBuilder
	e a classe OldVersionBuilder. Assim, os métodos podem ser sobreescritos
	e podemos manipular os resultados de cada atributo conforme o tipo
	de álbum construído. O único método aqui construído é o getAlbum, pois
	ele nos retornará, lá na classe Cliente, o álbum que desejamos. */
public abstract class AlbumBuilder {
	protected AlbumProduct album = new AlbumProduct();

	public abstract void buildNomeCantora();
	public abstract void buildNomeAlbum(String nome);
	public abstract void buildAnoLancamento(int ano);
	public abstract void buildNomeGravadora();
	public abstract void buildEhTaylorsVersion();
	public abstract void buildNumeroDeMusicas(int numero);
	public abstract void buildSingle(String single);
	public abstract void buildNotaPitchfork(double nota);
	public abstract void buildNumeroDeTretas(int tretas);

	public AlbumProduct getAlbum(){
		return album;
	}
}
