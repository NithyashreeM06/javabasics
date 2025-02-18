public class exceptionhandling {
    public static void main(String[]args) {
        try{
         int result=6/0;
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero"+e);
        }
        finally{
            System.out.println("Exception Succesfull");
        }
        try{
            int[] numbers={1,2,3};
            System.out.println(numbers[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("invalid index!"+e);
        } 
        finally{
            System.out.println("Exception Successfull");
        }
        }
    }

    

