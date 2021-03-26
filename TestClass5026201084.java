public class TestClass5026201084 {

    public static void main(String[] args) {

        //instance of ComputeMethods,
        ComputeMethods5026201084 methods = new ComputeMethods5026201084();
        //invokes methods
        double degreesC = methods.fToC(78);
        double hypotenuseC = methods.hypotenuse(3, 4);
        int dicesRoll = methods.roll();
        System.out.println("Temp in celsius is " + degreesC );
        System.out.println("Hypotenuse is " + hypotenuseC);
        System.out.println("The sum of the dices values is " + dicesRoll);
    }
}