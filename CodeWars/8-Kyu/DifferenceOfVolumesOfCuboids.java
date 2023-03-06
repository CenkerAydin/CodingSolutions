package CodeWars;

public class DifferenceOfVolumesOfCuboids {
    public static int findDifference(final int[] firstCuboid,
                                     final int[] secondCuboid) {

        int volumeFirst=1;
        int volumeSecond=1;
        for(int i=0;i<firstCuboid.length;i++){
            volumeFirst *=firstCuboid[i];
            volumeSecond *=secondCuboid[i];
        }
        return Math.abs(volumeSecond-volumeFirst);

    }
}
