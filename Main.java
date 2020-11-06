import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] seatNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    String[] students = new String[15]; //adds 15 new elements with nothing assigned
    int index = 0;
    for(index = 0; index < students.length; index++)
    {
      System.out.println("Who will sit at seat " + seatNumbers[index] + "? (Put Student's name)"); //prints out the question with seat number
      students[index] = scan.next();
    }
    
  }
}