package Es_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Imput string: Questa è una stringa.");
        System.out.println(checkString("Questa è una stringa."));
    }

    private static String checkString(String value) {
        String result = (value.length() >= 10) ? "Length greater than or equal to 10" : "Length less than 10";
        return result;
    }
}
