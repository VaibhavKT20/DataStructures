public class SubsetsOfString {

    public static void main(String[] args) {
        System.out.println("Subsets of 'ABC':");
        subsetsString("ABC", "");
    }
    public static void subsetsString(String str, String current) {
        if (str.isEmpty()) {
            System.out.println(current);
            return;
        }
        subsetsString(str.substring(1), current + str.charAt(0));
        subsetsString(str.substring(1), current);
    }
}
