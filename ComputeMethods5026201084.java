import java.util.Random;
import java.lang.Math;

public class ComputeMethods5026201084 {

    public double fToC(double degreesF) {
        return  5.0/9.0*(degreesF - 32);
    }
    public double hypotenuse(int a, int b){
        return Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)));
    }
    public int roll(){
        Random random = new Random();
        int randomRoll1 = random.nextInt(6) + 1;
        int randomRoll2 = random.nextInt(6) + 1;
        return randomRoll1 + randomRoll2;
    }

}