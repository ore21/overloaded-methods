import javax.naming.Name;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("please enter either 1 or 2.");
        System.out.println("-------------------");
        System.out.println(" 1 = Business Customer. ");
        System.out.println(" 2 = Residential Customer. ");

        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            int decision = scanner.nextInt();
            switch (decision) {
                case 1:
                    System.out.println(" You have selected Business Customer.");

                    Scanner ubinput = new Scanner(System.in);
                    String bName;
                    System.out.println(" Enter your business name:");
                    bName = ubinput.next();

                    Scanner coninput = new Scanner(System.in);
                    String conName;
                    System.out.println(" Enter your contact name:");
                    conName = coninput.next();

                    Scanner numbinput = new Scanner(System.in);
                    String custbNum;
                    System.out.println("Enter your business phone number: ");
                    custbNum = numbinput.next();

                    System.out.println("Your business name is : " + bName);
                    System.out.println("Your Contact name is : " + conName);
                    System.out.println("Your business phone number is : " + custbNum);
                    break;

                case 2:
                    System.out.println(" You have selected Residential Customer. ");

                    Scanner urinput = new Scanner(System.in);
                    String rName;
                    System.out.println(" Enter your business name:");
                    rName = urinput.next();

                    Scanner numrinput = new Scanner(System.in);
                    String custrnum;
                    System.out.println(" Enter your residential phone number :");
                    custrnum = numrinput.next();

                    System.out.println(" Your Residential name is: " + rName);
                    System.out.println(" Your Residential phone number is: " + custrnum);
                    break;
                default:
                    System.out.println("Bro really?, Please try to input a number between 1 and 2!");
            }
            }
        }
    }
