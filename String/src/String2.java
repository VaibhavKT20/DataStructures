public class String2 {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equals("Hello World"));
        System.out.println(str.compareTo("Hello W"));
        System.out.println("Hello".compareTo(str));
        System.out.println(str.compareTo("Hello World"));
        System.out.println(str.compareTo("Aello World"));
        System.out.println(str.compareTo("Lello World"));

    }
}
