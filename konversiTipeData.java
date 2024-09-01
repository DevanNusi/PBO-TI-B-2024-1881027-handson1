public class konversiTipeData {
    public static void main(String[] args) {
        //widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFLoat = tipeDataLong;
        double tipeDataFloat = tipeDataFLoat;

        //narrowing
        int tipeDataInteger = -129;
        byte tipeDataByte2 = (byte) tipeDataInteger;
        System.out.println(tipeDataByte2);
        String firstname, lastname;
        firstname = "Devan";
        lastname = "Nusi";

        System.out.printf("%s %s", firstname, lastname);
    }
}
