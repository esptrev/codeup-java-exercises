package collections_lec;

public class Exceptions {

    public static void main(String[] args) {
       int [] numbers = {1,2,3,4,5};
       try {
           System.out.println(numbers[5]);
       }catch (Exception e){
           System.out.println("Index doesn't exist");
       }
    }


    public static void foo() throws Exception {
        throw new Exception("ouch");
    }


}
