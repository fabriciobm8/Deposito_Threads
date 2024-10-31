public class Produtor implements Runnable {

  private final Deposito deposito;
  private final int tempoEntreProducao;

  public Produtor(Deposito deposito, int tempoEntreProducao) {
    this.deposito = deposito;
    this.tempoEntreProducao = tempoEntreProducao;
  }

  @Override
  public void run() {
    try {
      while (true) { // Produz continuamente
        deposito.colocar(); // Adiciona uma caixa ao depósito
        Thread.sleep(tempoEntreProducao * 1000); // Espera o tempo especificado
      }
    } catch (InterruptedException e) {
      System.out.println("Produção interrompida.");
    }
  }
}