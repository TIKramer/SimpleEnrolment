/*****************************************************************
 * Author: Thomas Kramer                                         *
 * Purpose: To manage first year tutors and track student        *
 *          practical enrollment                                  *
 * Date: 20/04/2016 4:40 PM                                      *
*****************************************************************/

public class SimpleEnrolment
{

    public static void main(String args[])
    {
        String newEntry = createSingleEntry();
        System.out.println(newEntry);

    }

    public static String createSingleEntry()
    {

        char type = ValidateInput.getType();
        String name = ValidateInput.getName();
        String unit = ValidateInput.getUnit();
        String detail = ValidateInput.getDetail(type);
        String entry = type + " " + name + " " + unit + " " + detail;
        return entry;

    }
}
