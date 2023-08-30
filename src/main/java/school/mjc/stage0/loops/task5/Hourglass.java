package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < i ; j++) {
                    System.out.print(" ");
            }
            for (int j = i; j < height - i; j++) {
                    System.out.print("8");

            }

            for (int j = height - 1; j >= height - i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = height / 2 ; i < height; i++) {
            for (int j = 0; j < height - i -1; j++) {
                System.out.print(" ");
            }

            for (int j = height - i; j <= i + 1; j++) {
                System.out.print("8");
            }

            for (int j = i; j < height - 1; j ++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
