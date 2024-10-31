public class Consumidor extends Thread {

  private final Deposito deposito;
  private final int tempoEntreConsumo; // Tempo em segundos entre cada consumo

  public Consumidor(Deposito deposito, int tempoEntreConsumo) {
    this.deposito = deposito;
    this.tempoEntreConsumo = tempoEntreConsumo;
  }

  @Override
  public void run() {
    try {
      while (true) { // Consome continuamente
        deposito.retirar(); // Retira uma caixa do depósito
        Thread.sleep(tempoEntreConsumo * 1000); // Espera o tempo especificado
      }
    } catch (InterruptedException e) {
      System.out.println("Consumo interrompido.");
    }
  }
}
