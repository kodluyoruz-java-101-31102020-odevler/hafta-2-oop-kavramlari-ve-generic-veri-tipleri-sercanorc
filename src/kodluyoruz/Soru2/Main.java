package kodluyoruz.Soru2;

public class Main {
    public static void main(String[] args) throws Exception {

        Integer[][] m1 = new Integer[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        Integer[][] m2 = new Integer[][]{{1, 1, 1},{2, 2, 2},{3, 3, 3}};
        Double[][] m3 = new Double[][]{{1.1, 2.1, 3.1},{4.1, 5.1, 6.1},{7.1, 8.1, 9.1}};
        Double[][] m4 = new Double[][]{{1.1, 1.1, 1.1},{2.1, 2.1, 2.1},{3.1, 3.1, 3.1}};
        IntegerMatrix integerMatrix = new IntegerMatrix();
        DoubleMatrix doubleMatrix=new DoubleMatrix();
        System.out.println("\nm1 * m2");
        GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2));
        System.out.println("\n\nDouble");
        GenericMatrix.printResult(m3, m4, doubleMatrix.multiplyMatrix(m3, m4));

    }
}
