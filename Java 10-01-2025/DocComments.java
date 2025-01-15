public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function name : greet
     * 
     * Inside the function :
     * 1. It prints hi
     * 
     */

    public static void greet(){
        System.out.println("hi");
    }

    /**
     * Function name : printText
     * @param name (String)
     * @param age  (String)
     * 
     * Inside a function
     * 1. prints the values
     */

    public static void printText( String name, String age){
        System.out.println("Hello, my name is " + name + " and I am " + age + "years young");
    }


    /**
     * Function Name: calculateAreaOfRect
     * 
     * @param l (double)
     * @param w (double)
     * @return  (double)
     * 
     * Inside fuction
     * return a value
     */
    public static double calculateAreaOfRect(double l, double w){
        return l * w;
    }
}
