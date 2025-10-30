public class ArrayPairs {
    public static void printPairs(int numbers[]){
         int tp = 0; //to keep track of pairs //OUTSIDE the loop so that it doesn't reset to 0 every time
        for(int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
           
            for(int j = i+1; j < numbers.length; j++){ //j starts from i+1 coz we want pairs not same elements
                System.out.print("("+curr + "," + numbers[j] +") "); //print pairs, first current and then numbers[j]
                tp++; //whenever a pair is printed, increment tp
            }
            System.out.println(); //new line after every i
        }
        System.out.println("Total pairs:" + tp); //print total pairs, print only once so outside the loop

        // total pairs can also can be calculated using:
        System.out.println("Total pairs using formula: " + (numbers.length*(numbers.length-1)/2));
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
