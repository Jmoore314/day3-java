//this program takes an input and repeats, the counts the spaces clicked until exited
public class SpacesCounter {

  public static void main(String[] args)
    throws java.io.IOException {
    
    char ch, ignore;
    int spaces = 0;

    System.out.println("Press a key followed by ENTER:");
    System.out.println("Press '.' when finished.");
    do {
      ch = (char) System.in.read();
      System.out.println("Your character is: " + ch);

      if (ch == ' ') spaces++;

      do {
        ignore = (char) System.in.read();
      } while(ignore != '\n');
    } while(ch != '.');
    System.out.println("There were " + spaces + " spaces entered.");
  }  
}