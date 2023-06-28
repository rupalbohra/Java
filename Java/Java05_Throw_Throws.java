public class Java05_Throw_Throws {
    class NegativeRadiusException extends Exception{
        public String toString(){
            return "Radius cannot be negative";
        }
        public String getMessage(){
            return "Radius cannot be negative!";
        }
    }

    static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    static int divide(int a, int b) throws ArithmeticException{
        // Made by harry
        int result = a/b;
        return result;
    } 
    public static void main(String[] args){
        // Shivam- uses divide function created by harry
        int c = divide(6, 0);
        System.out.println(c);  // will give error 
        try{
            double ar = area(-4);
            System.out.println(ar);
        }catch(Exception e){
            System.out.println("Exception");
        }
        // try{
        //     int c = divide(6, 0);
        //     System.out.println(c);
        // }catch(Exception e){
        //     System.out.println("Exception");
        // }
    }
}
