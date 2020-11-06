import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] seatNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; //Which seats are open/avaliable
    String[] students = new String[15]; //adds 15 new elements with nothing assigned

    System.out.println("Seating Arrangement Program, Input Student's Names To Fill Up Your Seats");
    int index;

    for(index = 0; index < students.length; index++) //loops until every seat has been filled with a student
    {
      System.out.println("Who will sit at seat " + seatNumbers[index] + "? (Put Student's name)"); //prints out the question with seat number
      students[index] = scan.nextLine(); //scans whole next line for user input
    }

    System.out.println("\n Thank you for your input, here is the new seating chart:");

    index = 0;

    while (index < 15) // loop will stop after index = 15
    {
      System.out.println(students[index] + ", sits at seat number " + seatNumbers[index] + "."); 
      index++; //adds one to index to prevent infinite loop, to stop at 15
    }

    System.out.println("\n That is the new seating chart! \n If there is an error or you have made a mistake, run the program again!");

    scan.close(); //ends the scanner
  }
}