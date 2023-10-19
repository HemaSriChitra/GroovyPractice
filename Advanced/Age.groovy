public class IfStatements {
    public static void main(String[] args){
        //Initialization
        int age;
        //creates an instance for object
        Scanner sc = new Scanner(System.in);
                        
        System.out.print("Please enter your age: ");
        //scans the next token of the input data
        age = sc.nextInt(); 
                           
        if(age>=18){
            println("You are eligible..");
        }
        else{
            println("You are not eligible..");
        }
    }
}
