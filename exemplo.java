public class Exemplo {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean c = a && b; // c recebe falso
    System.out.println(c);
    c = a || b; // c recebe verdadeiro
    System.out.println(c);
    c = !a; // c recebe falso
    System.out.println(c);
    c = a ^ b; // c recebe verdadeiro
    System.out.println(c);
  }
}
