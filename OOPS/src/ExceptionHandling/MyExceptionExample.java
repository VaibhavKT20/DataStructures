package ExceptionHandling;

public class MyExceptionExample {
    public static void main(String[] args) {
        try {
            String name="Vaibhav";
            if(name.equals("Vaibhav")) {
                throw new MyException("Name is Vaibhav");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Final block always execute");
        }
    }
}
