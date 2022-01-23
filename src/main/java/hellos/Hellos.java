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
    builder.append(coleSaysHello());
    builder.append(collinSaysHello());
    builder.append(conSaysHello());
    builder.append(danielSaysHello());
    builder.append(dongtingSaysHello());
    builder.append(frogSaysHello());
    builder.append(johnSaysHello());
    builder.append(joshSaysHello());
    builder.append(kkSaysHello());
    builder.append(maxSaysHello());
    builder.append(nicSaysHello());
    builder.append(nickgSaysHello());
    builder.append(nikSaysHello());
    builder.append(ollieSaysHello());
    builder.append(yuboSaysHello());
    return builder.toString();
  }

  private String conSaysHello() {
    return "Conner says 'Hey!'\n";
  }

  private String coleSaysHello() {
    return "Cole says 'Aloha!'\n";
  }

  private String collinSaysHello() {
    return "Collin says 'Howdy!'\n";
  }

  private String conSaysHello() {
    return "Conner says 'Hey!'\n";
  }

  private String danielSaysHello() {
    return "Daniel says 'Sup!'\n";
  }

  private static String dongtingSaysHello() {
    return "Dongting says 'Hello!'\n";
  }

  private String frogSaysHello() {
    return "Froggie says 'Ribbit!'\n";
  }

  private String johnSaysHello() {
    return "John says 'Hello!'\n";
  }

  private String joshSaysHello() {
    return "Josh says 'Hello!'\n";
  }
    
  private String kkSaysHello() {
    return "KK says 'Hello!'\n";
  }

  private String maxSaysHello() {
    return "Max says 'Greetings fellow human!'\n";
  }

  private String nicSaysHello() {
    return "Nic says 'Howdy!'\n";
  }

  private String nickgSaysHello() {
    return "NickG says 'Hi!'\n";
  }

  private String nikSaysHello() {
    return "Nik says 'Hey!'\n";
  }

  private String ollieSaysHello() {
    return "Ollie says 'hi!'\n";
  }

  private String yuboSaysHello() {
    return "Yubo says 'Hello!'\n";
  }

}
