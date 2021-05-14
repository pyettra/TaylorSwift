package ExemploBuilder;

/* A classe TaylorVersionBuilder é uma classe builder concreta, pois é
	onde implementamos os métodos escritos lá na classe AlbumBuilder. Por
	isso, fazemos um extend para a AlbumBuilder. A maioria dos métodos 
	aqui descritos vão apenas atribuir o valor recebido dentro do método
	para a variável da nossa estrutura de dados. Por exemplo, o método
	buildNomeAlbum recebe como parametro uma String nome. O atributo 
	nomeAlbum do nosso album receberá esse nome passado por parametro.
	 */

/* Mas então por que usar builder se estamos apenas atribuindo valores
	recebidos pelas respectivas funções? Bom, além de ficar mais organizado
	e sabermos mais facilmente qual tipo de álbum é, podemos incluir valores
	fixos para atributos da estrutura do album dependendo do tipo de album.
	Por exemplo, temos um atributo da estrutura de dados que se chama "ehTaylorsVersion".
	Nesse builder, apenas retornamos o valor como verdadeiro. Já no builder de
	OldVersion retornamos falso. Temos também um método que retorna o número
	de tretas envolvidas na criação daquele álbum. Esse método só é sobreescrito
	na classe de OldVersionBuilder, pois não há tretas nos álbum do tipo
	Taylor's Version. Por isso nem precisamos sobreescreve-la aqui nessa classe!*/

public class TaylorVersionBuilder extends AlbumBuilder {
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
		album.nomeGravadora = "Universal Music Group";
	}

	@Override
	public void buildEhTaylorsVersion() {
		album.ehTaylorsVersion = true;
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
}
