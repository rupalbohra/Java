public class Java06_Finally {
    public static int greet(){
        try{
            int a = 5;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        
// finally block will be executed even if the error occurs or not. In the absence of finally block, the program would stop if it doesn't catches any error 
        finally{  
            System.out.println("This is the end of the program");
        }
        return -1;
    }
        public static void main(String[] args){
        int k = greet();
        System.out.println(k);
    }
}
