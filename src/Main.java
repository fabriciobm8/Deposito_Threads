public class Main {

  public static void main(String[] args) {

    Deposito dep = new Deposito();
    Produtor p = new Produtor(dep, 2);
    Consumidor c = new Consumidor(dep, 1);

    // Inicia o produtor em uma nova thread
    Thread threadProdutor = new Thread(p);
    threadProdutor.start();

    // Inicia o consumidor em uma nova thread
    c.start();

  }
}