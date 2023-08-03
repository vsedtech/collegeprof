import com.company.SecondClass;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      System.out.println("what happens");
      one();
      two();
      SecondClass sc = new SecondClass();
      SecondClass.main();


    }
    public static void one(){
        System.out.println("One");
        two();
    }
    public static void two(){
        System.out.println("Two");
        one();
    }
}