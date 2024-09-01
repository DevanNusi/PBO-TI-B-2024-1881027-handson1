public class tipeDataArray {
    public static void main(String[] args) {
        //array adalah kumpulan data yang memiliki tipe yang sama

        int[] arrayinteger = new int[3];
        arrayinteger[0] =20;
        arrayinteger[1] =40;
        arrayinteger[2] =60;
        System.out.println(arrayinteger[2]);

        int[] arrayInteger2 = new int[] {20, 40, 50};
        arrayInteger2[1] = 60;
        System.out.println(arrayInteger2);

        //multi dimension
        int[][] arrayInteger3 = new int[][]{{20, 40, 60}, {90, 100, 110}, {70, 30, 190}};
        System.out.println(arrayInteger3[0][2] + arrayInteger3[1][2]);

        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = 20;
        arrayOfObject[1] = "Devan Nusi";
        arrayOfObject[2] = 20L;
        System.out.println(arrayOfObject[1]);
    }
}
