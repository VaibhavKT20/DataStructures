public class ReverseWordInAString {
        public static String reverseWords(String str) {
            char[] chars = str.toCharArray();
            int n = chars.length;

            reverse(chars, 0, n - 1);
            int start = 0;
            for (int i = 0; i <= n; i++) {
                if (i == n || chars[i] == ' ') {
                    reverse(chars, start, i - 1);
                    start = i + 1;
                }
            }

            String result = "";
            for (int i = 0; i < n; i++) {
                result += chars[i];
            }

            return result;
        }
        public static void reverse(char[] arr, int left, int right) {
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        public static void main(String[] args) {
            String input = "Hello world this is Java";
            String result = reverseWords(input);
            System.out.println(result);
        }
}

