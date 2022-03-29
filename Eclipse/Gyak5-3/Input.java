import java.util.Scanner;
public class Input
{
    static Scanner input = new Scanner(System.in);

    public String readStringWithBufferCleaner()
    {
        String answer;
        input.nextLine();
        System.out.print("Enter the string: ");
        while (input.hasNextInt())
        {
            System.out.print("Wrong input! Please retry: ");
            input.nextLine();
        }
        answer = input.nextLine();
        return answer;
    }
    public String readString()
    {
        String answer;
        System.out.print("Enter the string: ");
        while (input.hasNextInt())
        {
            System.out.print("Wrong input! Please retry: ");
            input.nextLine();
        }
        answer = input.nextLine();
        return answer;
    }

    public int readInteger()
    {
        int answer;
        System.out.print("Enter the number: ");
        while(!input.hasNextInt())
        {
            System.out.print("That's not a number! Please retry: ");
            input.next();
        }
        answer = input.nextInt();
        return answer;
    }


}