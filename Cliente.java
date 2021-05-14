package ExemploBuilder;

/* Na nossa classe Cliente, vamos construir os álbuns!! YAY!
	Pra isso, basta criar um objeto do tipo Director, que é o objeto
	necessário para a chamada dos métodos de criação do álbum. Na criação
	do director, passamos como parametro um novo builder, que deve ser um
	builder referente ao tipo de album que desejamos criar. Ou seja, se
	quisermos um album de TaylorsVersion, passamos o TaylorVersionBuilder
	como parametro da criação do Director, pois o Director precisa de 
	algum AlbumBuilder para ser criado. É necessário lembrar aqui que passamos 
	toda a responsabilidade de criação do álbum para essa classe diretora. 

	Depois, chamamos o método de construção de álbum respectivo ao álbum criado 
	e passamos os parâmetros que desejamos. Após criado o álbum, vamos obtê-lo 
	criando um objeto do tipo AlbumProduct (que é o nosso objeto concreto). 
	Ele receberá o resultado do nosso método getAlbum, da classe diretora. 
	E depois é só correr pro abraço (no caso, imprimir os valores que queremos ver no console :D)
	
	Pra criar mais um álbum, basta criar o director referente a esse album (ou seja,
	passando o builder correto), e inserir as informações desejadas no método
	de construção de álbum respectivo.  
	*/

public class Cliente {
	public static void main(String[] args) {
		Director director = new Director(new TaylorVersionBuilder());
	 
	    director.construirTaylorsVersion("Fearless (Taylor's Version)", 2021, 26, "Love Story", 7.5);

	    AlbumProduct album = director.getAlbum();
	    System.out.println("Artista: " + album.nomeCantora);
		System.out.println("Nome do Album: " + album.nomeAlbum);
		System.out.println("Ano de Lançamento: " + album.anoLancamento);
		System.out.println("Gravadora: " + album.nomeGravadora);
		System.out.println("É Taylor's Version?: " + album.ehTaylorsVersion);
		System.out.println("Número de músicas: " + album.numeroDeMusicas);
		System.out.println("Single do álbum: " + album.single);
		System.out.println("Nota no pitchfork: " + album.notaPitchfork);

		System.out.println("\n");
	 
	    director = new Director(new OldVersionBuilder());
	    director.construirOldVersion("Fearless", 2008, 13, "Fifteen", 8.1, 5);

	    album = director.getAlbum();
		System.out.println("Artista: " + album.nomeCantora);
		System.out.println("Nome do Album: " + album.nomeAlbum);
		System.out.println("Ano de Lançamento: " + album.anoLancamento);
		System.out.println("Gravadora: " + album.nomeGravadora);
		System.out.println("É Taylor's Version?: " + album.ehTaylorsVersion);
		System.out.println("Número de músicas: " + album.numeroDeMusicas);
		System.out.println("Single do álbum: " + album.single);
		System.out.println("Nota no pitchfork: " + album.notaPitchfork);
		System.out.println("Número de tretas: " + album.tretas);
	}
}
