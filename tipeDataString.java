public class tipeDataString {
    public static void main(String[] args) {
        //perbedaan primitive dan non primitive
        String firstname = "Devan";
        String lastname = "Nusi";
        String fullName = firstname + " " + lastname;
       // System.out.println(firstname + " " + lastname);
       // System.out.println(firstname.concat(" ").concat(lastname));
        System.out.println(fullName.toUpperCase());

        System.out.println(fullName.charAt(6));
        System.out.println(fullName.contains("Nusi"));
    }
}
