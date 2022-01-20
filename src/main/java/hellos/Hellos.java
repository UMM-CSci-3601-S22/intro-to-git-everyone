package hellos;

/**
 * A complicated Java program used to demonstrate merge conflicts when
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

    builder.append(collinSaysHello());
    builder.append(conSaysHello());
    builder.append(kkSaysHello());
    builder.append(maxSaysHello());
    builder.append(nicSaysHello());
    builder.append(nikSaysHello());
    builder.append(ollieSaysHello());
    builder.append(yuboSaysHello());

    return builder.toString();
  }

  private String collinSaysHello() {
    return "Collin says 'Howdy!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String conSaysHello() {
    return "Conner says 'Hey!'\n";
  }

  private String maxSaysHello() {
    return "Max says 'Greetings fellow human!'\n";
  }

  private String nikSaysHello() {
    return "Nik says 'Hey!'\n";
  }

  private String yuboSaysHello() {
    return "Yubo says 'Hello!'\n";
  }

  private String ollieSaysHello() {
    return "Ollie says 'hi!'\n";
  }
}
