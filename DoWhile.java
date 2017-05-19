// the program demonstrates the do-while loop
public class DoWhile {

  public static void main(String[] args)
    throws java.io.IOException {

    char ch;

    do {
      System.out.print("Press a key followed by ENTER:");
      ch = (char) System.in.read();
    } while (ch != 'q');

  }  
}