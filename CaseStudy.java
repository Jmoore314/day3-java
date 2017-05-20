//this program takes an input and repeats, the counts the spaces clicked until exited
public class CaseStudy {

  public static void main(String[] args)
    throws java.io.IOException {
    
    char ch, ignore;
    int caseChanges = 0;

    System.out.println("Press a key followed by ENTER:");
    System.out.println("Press '.' when finished.");
    do {
      ch = (char) System.in.read();

      if ((ch >= 'a') && (ch <= 'z')) {
        ch -= 32;
        caseChanges++;
      } else if ((ch >= 'A') && (ch <= 'Z')) {
        ch += 32;
        caseChanges++;
      }
      System.out.println("Your character is now: " + (char) ch);

      do {
        ignore = (char) System.in.read();
      } while(ignore != '\n');
    } while(ch != '.');

    System.out.println("There were " + caseChanges + " Changes in casing entered.");
  }  
}