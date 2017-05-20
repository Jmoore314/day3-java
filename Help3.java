// this program will display a help scenario for learning Java
public class Help3 {

  public static void main(String[] args)
    throws java.io.IOException {

    char choice, ignore;
    for (;;) {
      do {    
          System.out.println("Help on:");
          System.out.println(" 1. if");
          System.out.println(" 2. switch");
          System.out.println(" 3. for");
          System.out.println(" 4. while");
          System.out.println(" 5. do-while");
          System.out.println(" 6. break");
          System.out.println(" 7. continue");
          System.out.print("Choose one: ");
          choice = (char) System.in.read();

          do {
              ignore = (char) System.in.read();
          } while (ignore != '\n');
      } while ( choice < '1' | choice > '7' & choice != 'q');
      
      if (choice == 'q') break;

      System.out.println();

      switch(choice) {
        case '1':
          System.out.println("The If:\n");
          System.out.println("If (condition) {statement;}")  ;
          System.out.println("Elseif (condition) {statement;}");
          System.out.println("Else {statement;}");
          break;
        case '2':
          System.out.println("The Switch:\n");
          System.out.println("switch (expression) {");
          System.out.println("  case constant:");
          System.out.println("    statement sequence;");
          System.out.println("    break;");
          System.out.println("  //...");
          System.out.println("}");
          break;
        case '3':
          System.out.println("The For:\n");
          System.out.println("for (init; condition; iteration) {statement;}");
          break;
        case '4':
          System.out.println("The While:\n");
        System.out.println("while (condition) {statement;}");
          break;
        case '5':
          System.out.println("The Do-While:\n");
          System.out.println("do {statement;} while (condition);");
          break;
        case '6':
          System.out.println("The Break:\n");
          System.out.println("break; or break label;");
          break;
        case '7':
          System.out.println("The Continue:\n");
          System.out.println("continue; or continue label;");
          break;
      }
      System.out.println();
    }   
  }  
}