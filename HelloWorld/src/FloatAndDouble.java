public class FloatAndDouble {

    public static void main(String[] args) {

        int myIntValue = 5;
        float myFloatValue =  5.25f;
        double myDoubleValue = 5.25;

        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        System.out.println(myIntValue + myFloatValue + myDoubleValue);

        double kilogramToPoundRation = 2.205;
        double poundsToKilogramRation = 0.453592;

        double kilogramValue = 2.5;

        double convertedKilograms = kilogramValue * poundsToKilogramRation;

        System.out.println("Converted kilograms = " + convertedKilograms);
    }
}
