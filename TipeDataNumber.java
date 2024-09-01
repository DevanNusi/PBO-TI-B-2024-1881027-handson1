import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TipeDataNumber {
    public static void main(String[] args) {
        //Bilangan Bulat
        byte tipeDataByte = 18;
        short tipeDataShort = 30;
        int tipeDataInt = 15;
        long tipeDataLong =20L;

        //bilangan pecahan
        float tipeDataFloat = 4.4F;
        double tipeDataDouble = 5.5D;
        //float harus menggunakan F dibelakang angka agar sistem tidak mendeteksi sebagai double

        //sistem bilangan
        int decimalInt = 20;
        int hexDecimal = 0xff;
        int binDecimal = 0b0101;
        //bin harus menggunakan ob dan hex harus menggunakan 0x

        int sebuahBilangan = 1_000_000_000;

        System.out.println(binDecimal);

    }
}
