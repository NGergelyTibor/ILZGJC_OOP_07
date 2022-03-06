package Input;
import java.util.Scanner;
public class Input {
    static Scanner input = new Scanner(System.in);
    public String readString()
    {
        String answer;
        System.out.print("Adjon meg egy stringet: ");
        while (input.hasNextInt())
        {
            System.out.print("Hibas input, kerem adja meg ujra: ");
            input.nextLine();
        }
        answer = input.nextLine();
        return answer;
    }
    public double readDouble()
    {
        double answer;
        System.out.print("Adjon meg egy szamot: ");
        while(!input.hasNextDouble())
        {
            System.out.print("Nem egy szam, kerem adja meg ujra: ");
            input.next();
        }
        answer = input.nextDouble();
        return answer;
    }

    public int readInteger()
    {
        int answer;
        System.out.print("Adjon meg egy szamot: ");
        while(!input.hasNextInt())
        {
            System.out.print("Nem egy szam, kerem adja meg ujra: ");
            input.next();
        }
        answer = input.nextInt();
        return answer;
    }

}
