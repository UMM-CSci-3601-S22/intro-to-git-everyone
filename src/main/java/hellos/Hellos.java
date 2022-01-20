package hellos;

/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

  public static void main(final String[] args) {
    Hellos helloRunner = new Hellos();
    helloRunner.run();
  }

  public void run() {
    String output = generateOutput();
    System.out.println(output);
  }

  public String generateOutput() {
    StringBuilder builder = new StringBuilder();
    builder.append(kkSaysHello());
    builder.append(nicSaysHello());
    
    builder.append(nikSaysHello());
    builder.append(nickgSaysHello());
    builder.append(yuboSaysHello());
    return builder.toString();
  }

  private String nickgSaysHello() {
    return "NickG says 'Hi!'\n";
  }
  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }
  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String nikSaysHello() {
    return "Nik says 'Hey!'\n";
  }


  private String yuboSaysHello() {
    return "Yubo says 'Hello!'\n";
  }

}
