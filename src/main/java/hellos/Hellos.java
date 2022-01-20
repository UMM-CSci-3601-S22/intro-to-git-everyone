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

    builder.append(conSaysHello());
    builder.append(kkSaysHello());
    builder.append(maxSaysHello());
    builder.append(nicSaysHello());

    return builder.toString();
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

}
