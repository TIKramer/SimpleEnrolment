
/******************************************************************
* Author: Thomas Kramer                                           * 
* Purpose: Get input from user to help create the enrollment entry*
* Date: 22/04/2016 4:52 PM                                        *
******************************************************************/

import java.util.*;

public class ValidateInput
{

/*******************************************************************
* Author: Thomas Kramer                                            *
* Purpose: Get type from user and validate                         *
* Date: 22/04/2016 4:52 PM                                         *
*******************************************************************/
    public static char getType()
    {
        Scanner sc = new Scanner(System.in);
        char entry = 'o';
        boolean validInput = false;
        do
        {
            System.out.println("Please enter a type:");
            char userInputtedCharacter = sc.next().charAt(0);
            boolean isUppercase = Character.isUpperCase(userInputtedCharacter);
            if (CheckCharContainsSpecialCharacters.containsSpecialCharacters(userInputtedCharacter))
            {
                System.out.println("Invalid input");
                validInput = false;
            }
            else if (isUppercase == true)
            {
                entry = 'T';
                validInput = true;
            }
            else if (isUppercase == false)
            {
                entry = 'S';
                validInput = true;
            }

        } while (validInput == false);
        return entry;
    }

/*******************************************************************
* Author: Thomas Kramer                                            *
* Purpose: Get name from user and validate                         *
* Date: 22/04/2016 4:52 PM                                         *
*******************************************************************/
    public static String getName()
    {
        Scanner sc = new Scanner(System.in);
        boolean validString = false;
        String name = "";
        do
        {
            System.out.println("Please enter the name:");
            name = sc.nextLine();
            validString = (name != null && !name.isEmpty());
        } while (validString == false);
        return name;
    }

/*******************************************************************
* Author: Thomas Kramer                                            *
* Purpose: Get unit from user and validate                         *
* Date: 22/04/2016 4:52 PM                                         *
*******************************************************************/
    public static String getUnit()
    {
        Scanner sc = new Scanner(System.in);
        boolean matchingClassFound = false;
        String[][] unitsAndMatchingChars = new String[][]
        {
                { "COMP1001", "O", "P", "D" } };
        String selectedUnit = "";
        do
        {
            System.out.println("Please enter the unit use a character:");
            char userInputtedCharacter = sc.nextLine().charAt(0);
            for (int i = 0; i <= (unitsAndMatchingChars.length - 1); i++)
            {
                for (int j = 1; j <= (unitsAndMatchingChars[i].length - 1); j++)
                {
                    if (unitsAndMatchingChars[i][j].charAt(0) == Character.toUpperCase(userInputtedCharacter))
                    {
                        selectedUnit = unitsAndMatchingChars[i][0];
                        matchingClassFound = true;
                    }
                }
            }
        } while (matchingClassFound == false);
        return selectedUnit;
    }

/*******************************************************************
* Author: Thomas Kramer                                            *
* Purpose: Get unit from user and validate                         *
* Date: 22/04/2016 4:52 PM                                         *
*******************************************************************/
    // I pass in type as only students can select a room
    // Tutors can only select a number of pracs
    public static String getDetail(char type)
    {
        Scanner sc = new Scanner(System.in);
        String detail = "";
        boolean validRoom = false;
        boolean validPracs = false;
        if (type == 'S')
        {
            do
            {
                System.out.println("Please enter a room number:");
                try
                {
                    double roomNumber = sc.nextDouble();
                    detail = detail + roomNumber;
                    validRoom = true;
                }
                catch (Exception e)
                {
                    System.out.println("Invalid value");
                    validRoom = false;
                    sc.next();
                }
            } while (validRoom == false);
        }
        if (type == 'T')
        {
            do
            {
                System.out.println("Please enter the number of pracs you are teaching:");
                try
                {
                    int numOfPracs = sc.nextInt();
                    detail = detail + numOfPracs;
                    validPracs = true;
                }
                catch (Exception e)
                {
                    System.out.println("Invalid value");
                    validPracs = false;
                    sc.next();
                }
            } while (validPracs == false);
        }
        return detail;
    }
}
