public class MainDisc {

    static Input input = new Input();
    public static void main(String[] args) {
        
        System.out.println("Please enter the number of disc!");
        int size = input.readInteger();
        Disc[] discArray = new Disc[size];
        readIntoDiscArray(discArray);
        
        System.out.println("Deatils of the discs.");
        printDiscArray(discArray);

        System.out.println("\nGive me a disc as a parameter.");
        Disc parameter = readDisc();
        System.out.println();
        biggerSmallerEquals(discArray, parameter);

        System.out.println("\nReading parameter discs info.");
        System.out.println("Performer search.");
        Disc performerParamteter = readDisc();
        findSamePerformer(discArray, performerParamteter);

        System.out.println("\nDeatails of maxmimum");
        printMaxLengthDetails(discArray);

        System.out.println("\nSearch through performers.");
        String parameterPerformer = input.readStringWithBufferCleaner();
        printPerformersDetails(discArray, parameterPerformer);
    }

    private static Disc readDisc()
    {
        System.out.println("\nPlease enter the performer of the disc!");
        String performer = input.readStringWithBufferCleaner();
        System.out.println("Please enter the title of the disc!");
        String title = input.readString();
        System.out.println("Please enter the length of the disc!");
        int length = input.readInteger();
        Disc disc = new Disc(performer, title, length);
        return disc;
    }
    private static void readIntoDiscArray(Disc[] discArray)
    {
        for (int i = 0; i < discArray.length; i++) {
            discArray[i] = readDisc();
        }
    }
    private static void printDiscArray(Disc[] discArray)
    {
        for (int i = 0; i < discArray.length; i++) {
            System.out.println("\nDetail #" + (i + 1) + "\n");
            System.out.println(discArray[i].toString());
        }
    }
    private static void biggerSmallerEquals(Disc[] discArray, Disc parameter)
    {
        for (int i = 0; i < discArray.length; i++) {

            switch (discArray[i].sameLengthThanParameter(parameter)) {
                case 1: System.out.println("Length " + discArray[i].getLength() + " is bigger than the parameter's length: " + parameter.getLength());
                    break;
                case -1: System.out.println("Length " + discArray[i].getLength() + " is smaller than the parameter's length: " + parameter.getLength());
                    break;
                default: System.out.println("Length " + discArray[i].getLength() + " equals than the parameter's length: " + parameter.getLength());
                    break;
            }

        }
    }
    private static void findSamePerformer(Disc[] discArray, Disc performerParameter)
    {
        boolean found = false;
        for (int i = 0; i < discArray.length; i++) {
            if (discArray[i].isTheSamePerformer(performerParameter.getPerformer()))
            {
                found = true;
                System.out.println("\nName: " + discArray[i].getPerformer() + " = " + performerParameter.getPerformer() + " equalition found at the index of " + (i + 1) + ".");
            } 
        }
        if (!found)
        {
            System.out.println("\nThere's no same performer in the sequence.");
        }
    }
    private static int maxLength(Disc[] discArray)
    {
        int max = discArray[0].getLength();
        for (int i = 1; i < discArray.length; i++) {
            if (discArray[i].getLength() > max)
            {
                max = discArray[i].getLength();
            }
        }
        return max;
    }
    private static void printMaxLengthDetails(Disc[] discArray)
    {
        for (int i = 0; i < discArray.length; i++) {
            if (discArray[i].getLength() == maxLength(discArray))
            {
                System.out.println("Details of the maximum length's (" + discArray[i].getLength() + ") disc:");
                System.out.println(discArray[i].toString());
            }
        }
    }
    private static void printPerformersDetails(Disc[] discArray, String parameterPerformer)
    {
        boolean isInTheSequence = false;
        for (int i = 0; i < discArray.length; i++) {
            if (parameterPerformer.equals(discArray[i].getPerformer()))
            {
                isInTheSequence = true;
                System.out.println("\nDetails of the parameter performer's disc:");
                System.out.println(discArray[i].toString());
            }
        }
        if (!isInTheSequence)
        {
            System.out.println("There's no a performer like this in the sequence.");
        }
    }
}