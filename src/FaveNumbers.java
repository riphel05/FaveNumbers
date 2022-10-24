import java.util.Scanner;

        public class FaveNumbers
        {
            {
                Scanner in = new Scanner(System.in);
                String faveInt = "";
                String faveDouble = "";
                faveInt = SafeInput.getNonZeroLenString(in, "Enter your favorite int: ");
                faveDouble = SafeInput.getNonZeroLenString(in, "Enter your favorite double");
                System.out.println("\nYour favorite int is: " + faveInt + "\nYour favorite double is: " + faveDouble);
            }
        };

