package ExemploBuilder;

public class AlbumProduct {
  /* Essa é a estrutura de dados que nossos objetos
    vão assumir. Os atributos são compartilhados 
    tanto pelo álbum do tipo Taylor's Version quanto
    os Old Version. Isso facilita a nossa leitura dos dados.
    Já podemos deixar o atributo de nome da cantora como
    "Taylor Swift", já que essa dado é comum aos dois tipos
    de álbum*/
  public String nomeCantora = "Taylor Swift";
  public String nomeAlbum;
  public int anoLancamento;
  public String nomeGravadora;
  public boolean ehTaylorsVersion;
  public int numeroDeMusicas;
  public String single;
  public double notaPitchfork;
  public int tretas;
}