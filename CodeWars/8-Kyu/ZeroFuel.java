package CodeWars;

public class ZeroFuel {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (distanceToPump <= mpg * fuelLeft)
            return true;

        return false;
    }
}
