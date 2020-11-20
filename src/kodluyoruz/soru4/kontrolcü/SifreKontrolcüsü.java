package kodluyoruz.soru4.kontrolcü;

public class SifreKontrolcüsü {

    public static String returnLoginDetail(String email, String password) {
        if (email == null || password == null) {
            return "Hatali";
        }
        return "Basarili";
    }

}
