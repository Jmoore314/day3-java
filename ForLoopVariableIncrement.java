// a variable increment in a for loop
public class ForLoopVariableIncrement {

  public static void main(String[] args){
    for(int i = 1; i < 100; i += i) { 
      System.out.println("i is: " + i);
    }
  }  
}