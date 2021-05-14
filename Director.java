package ExemploBuilder;

/* A classe diretora não é obrigatória, mas ela ajuda na distinção
    de responsabilidades das nossas classes no código. Uma classe
    diretora fica responsável pela criação efetiva dos objetos. Para isso,
    criamos os métodos de construção dos álbuns, que receberão todos os valores necessários
    para a construção do álbum. 
    
    Criamos dois métodos separados, cada um relacionado
    ao tipo de álbum que estamos criando. Isso porque o Builder nos permite chamar
    apenas os métodos de construção que serão de fato necessários para a construção
    do objeto que queremos construir. Por exemplo, um álbum do tipo Taylors Version não
    possui tretas. Por isso, não há necessidade de chamar o método que constroi o número de
    tretas. Isso evita que necessitemos de um valor opcional dentro dos construtores (já que 
    o valor de tretas seria sempre nulo no caso de um objeto provindo de TaylorVersionBuilder).
    Assim, só chamamos os métodos de build necessários para aquele objeto que está sendo criado!
    
    O lado perfeito de utilizar um padrão de projeto como builder é poder separar a construção 
    inteira do nosso objeto em vários métodos e diminuir as responsabilidades em cima dos construtores
    (o método mesmo) de cada classe.  */

public class Director {
	protected AlbumBuilder gravadora;
	 
    public Director(AlbumBuilder gravadora) {
        this.gravadora = gravadora;
    }
 
    public void construirOldVersion(String nomeAlbum, int ano, int numeroMusicas, String single, double nota, int tretas) {
        gravadora.buildNomeAlbum(nomeAlbum);
        gravadora.buildAnoLancamento(ano);
        gravadora.buildNomeGravadora();
        gravadora.buildEhTaylorsVersion();
        gravadora.buildNumeroDeMusicas(numeroMusicas);
        gravadora.buildSingle(single);
        gravadora.buildNotaPitchfork(nota);
        gravadora.buildNumeroDeTretas(tretas);
    }

    public void construirTaylorsVersion(String nomeAlbum, int ano, int numeroMusicas, String single, double nota) {
        gravadora.buildNomeAlbum(nomeAlbum);
        gravadora.buildAnoLancamento(ano);
        gravadora.buildNomeGravadora();
        gravadora.buildEhTaylorsVersion();
        gravadora.buildNumeroDeMusicas(numeroMusicas);
        gravadora.buildSingle(single);
        gravadora.buildNotaPitchfork(nota);
    }
 
    public AlbumProduct getAlbum() {
        return gravadora.getAlbum();
    }
}
