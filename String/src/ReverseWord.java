public class ReverseWord {
    public static String reverseWord(String str){
        String arr[]=str.split(" ");
        String res="";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()==0){
                continue;
            }
            if(res.length()==0){
                res+=arr[i];
            }
            else{
                res+=" "+arr[i];
            }
        }
        return res;
    }
    public static String reverseWord1(String str){
        String arr[]=str.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()==0){
                continue;
            }
            if(res.length()==0){
                res.append(arr[i]);
            }
            else{
                res.append(" ");
                res.append(arr[i]);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String result= "the sky is blue";
        System.out.println(reverseWord(result));
        System.out.println(reverseWord1(result));
    }
}
