/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{

    String surname = "Mendez";
        String givenName = "Javier";
        String uscisNumber = "56-3-445";
        String countryOfOrigin = "El Salvador";
        int birthday = 2451564, validFromDate = 3956753, expirationDate = 3956840;
        char sex = 'M';

    // 1. Create the first object
    DACArecipient recipient1 = new DACArecipient();

    // 2. Fill it with the example data from your README
    // Params: surname, givenName, uscisNum, country, birthday, validFrom, expires, sex
    recipient1.setAll(surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
   
    // 3. Create the second object that is identical to the first.
    DACArecipient recipient2 = new DACArecipient();
    recipient2.setAll(surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);

    // 4. Test part 1: toString()
    System.out.println("--- Test toString() --- ");
    System.out.println(recipient1.toString());
    System.out.println();

    // 5. Test part 2: equals()
    System.out.println("--- Testing equals() ---");
    if (recipient1.equals(recipient2)) {
    System.out.println("Success: The two objects are equal.");
  } else {
    System.out.println("Failure: The objects should be equal but are not.");
  }
  System.out.println();
  

  // 6. Test part 4: printCard() with confirmed Julian Dates
  System.out.println("--- Testing printCard() ---");
  System.out.print(recipient1.printCard());
}

}