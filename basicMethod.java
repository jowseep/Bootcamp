public class basicMethod {
    
    public static void main(String[] args) {
        
        int totalNums = totalNum(1,2);
        System.out.println(totalNums);
    }

    public static void displayName(String name, int age) {
        System.out.println("Your name is " + name + " and your age is " + age);
    }

    public static int totalNum(int num1, int num2) {
        
        return num1+num2;
    }
}
