import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   Scanner sc1 = new Scanner(System.in);
 System.out.println("\nInsira uma palavra:");
String p = sc1.nextLine();
 String o= p.toUpperCase();
 String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
 if( alfabeto.contains(o)== true){
   System.out.println("A palavra " + p + " é um abecadariano.");
  }
  else{
    System.out.println("A palavra " + p + " não é um abecadariano.");
  }
  }
}