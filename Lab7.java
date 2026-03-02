import java.util.Arrays;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {

        int[] A20 = new int[20];
        int sumNegA20 = 0;
        for (int i = 0; i < 20; i++) {
            A20[i] = (int) (Math.random() * 41 - 20);
            if (A20[i] < 0) sumNegA20 += A20[i];
        }
        System.out.println("1) " + sumNegA20);

        int[] B15 = new int[15];
        int sumPosB15 = 0;
        for (int i = 0; i < 15; i++) {
            B15[i] = (int) (Math.random() * 41 - 20);
            if (B15[i] > 0) sumPosB15 += B15[i];
        }
        System.out.println("2) " + sumPosB15);

        double[] A12 = new double[12];
        double prodNegA12 = 1;
        boolean hasNeg = false;
        for (int i = 0; i < 12; i++) {
            A12[i] = Math.random() * 20 - 10;
            if (A12[i] < 0) {
                prodNegA12 *= A12[i];
                hasNeg = true;
            }
        }
        System.out.println("3) " + (hasNeg ? prodNegA12 : 0));

        int[] C25 = new int[25];
        long prodPosC25 = 1;
        boolean hasPos = false;
        for (int i = 0; i < 25; i++) {
            C25[i] = (int) (Math.random() * 21 - 10);
            if (C25[i] > 0) {
                prodPosC25 *= C25[i];
                hasPos = true;
            }
        }
        System.out.println("4) " + (hasPos ? prodPosC25 : 0));

        int[] D17 = new int[17];
        double sumD17 = 0;
        for (int i = 0; i < 17; i++) {
            D17[i] = (int) (Math.random() * 21 - 10);
            sumD17 += D17[i];
        }
        System.out.println("5) " + sumD17 / 17);

        int[][] A10 = new int[10][10];
        int[] B10 = new int[10];
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                A10[i][j] = (int) (Math.random() * 21 - 10);
                if (A10[i][j] < 0) sum += A10[i][j];
            }
            B10[i] = sum;
        }
        System.out.println("6) " + Arrays.toString(B10));

        int[][] B5 = new int[5][5];
        int[] A5 = new int[5];
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                B5[i][j] = (int) (Math.random() * 21 - 10);
                if (B5[i][j] > 0) sum += B5[i][j];
            }
            A5[i] = sum;
        }
        System.out.println("7) " + Arrays.toString(A5));

        int[][] A12x6 = new int[12][6];
        long[] prodCol = new long[6];
        Arrays.fill(prodCol, 1);
        boolean[] hasNegCol = new boolean[6];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A12x6[i][j] = (int) (Math.random() * 21 - 10);
                if (A12x6[i][j] < 0) {
                    prodCol[j] *= A12x6[i][j];
                    hasNegCol[j] = true;
                }
            }
        }
        for (int j = 0; j < 6; j++) {
            if (!hasNegCol[j]) prodCol[j] = 0;
        }
        System.out.println("8) " + Arrays.toString(prodCol));

        int[][] C5 = new int[5][5];
        long prodDiag = 1;
        boolean hasPosDiag = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C5[i][j] = (int) (Math.random() * 21 - 10);
                if (i == j && C5[i][j] > 0) {
                    prodDiag *= C5[i][j];
                    hasPosDiag = true;
                }
            }
        }
        System.out.println("9) " + (hasPosDiag ? prodDiag : 0));

        int[][] D7 = new int[7][7];
        double sumDiag = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D7[i][j] = (int) (Math.random() * 21 - 10);
                if (i == j) sumDiag += D7[i][j];
            }
        }
        System.out.println("10) " + sumDiag / 7);

        int[] A25 = new int[25];
        for (int i = 0; i < 25; i++) {
            A25[i] = (int) (Math.random() * 100);
        }
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < 25; i++) {
            if (A25[i] < A25[minIndex]) minIndex = i;
            if (A25[i] > A25[maxIndex]) maxIndex = i;
        }
        int temp = A25[minIndex];
        A25[minIndex] = A25[maxIndex];
        A25[maxIndex] = temp;
        System.out.println("11) " + Arrays.toString(A25));

        int[] B25 = new int[25];
        for (int i = 0; i < 25; i++) {
            B25[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(B25);
        System.out.println("12) " + Arrays.toString(B25));

        int[] C20 = new int[20];
        double sumC20 = 0;
        for (int i = 0; i < 20; i++) {
            C20[i] = (int) (Math.random() * 100);
            sumC20 += C20[i];
        }
        System.out.println("13) " + sumC20 / 20);

        int[] D30 = new int[30];
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < 30; i++) {
            D30[i] = (int) (Math.random() * 100);
            if (D30[i] % 2 == 0) sumEven += D30[i];
            else sumOdd += D30[i];
        }
        System.out.println("14) even=" + sumEven + " odd=" + sumOdd);

        int[][] table = new int[3][5];
        System.out.println("15)");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = (int) (Math.random() * 10);
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("16) " + maxX());

        Scanner sc = new Scanner(System.in);

        System.out.print("s1: ");
        String s1 = sc.nextLine();
        System.out.print("s2: ");
        String s2 = sc.nextLine();
        System.out.print("s3: ");
        String s3 = sc.nextLine();
        System.out.print("s4: ");
        String s4 = sc.nextLine();
        System.out.print("s5: ");
        String s5 = sc.nextLine();

        if (s4.equals(s5)) {
            System.out.println("17) " + s1 + s2);
        } else {
            System.out.println("17) " + s1 + s3);
        }

        sc.close();
    }

    public static short maxX() {
        short[] array = new short[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (short) Math.round(50 * Math.random());
        }
        short max = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}