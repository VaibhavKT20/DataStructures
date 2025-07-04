public class String1 {
    public static void main(String[] args) {
        String name="Vaibhav";
        System.out.println(name);
        int arr[]=new int[3];
        arr[0]=4;
        System.out.println(arr[0]);
        int brr[]=arr;
        brr[0]=8;
        System.out.println(brr[0]);
        System.out.println(arr[0]);
        int crr[]=new int[3];
        crr[0]=2;
        System.out.println(crr[0]);
    }
}
