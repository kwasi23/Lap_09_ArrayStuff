import java.util.Random;
import java.util.Scanner; //These lines import the classed needed from java to create random numbers and read user inpit
public class Lab_09_ArrayStuff { //declares a public class named lab09arraystuff

    public static double getAverage(int[] values){ //a public static method that takes an integer array values as its parameter and returns double
        double sum = 0;
        double avg = 0; //these lines declare two double variables and initialize them to 0
        if(values!=null && values.length!=0){ //checks if value array is not null, has at least one element
            for(double d: values){ //these lines calculate the sum of all elements in the value then divide by the length of the array
                sum = sum +d;
            }
            avg = sum/values.length;
        }
        return avg; //takes an integer array as input and returns the average of the array elements. The method first initilizes a sum varaible to 0 and an avg varaible to 0.
        //if the input array is not null and not empty, the method iterates over the array elements and adds each elemnt ot sum.
        //afterwards the method calculates the average by dividing sum by the legnth of the array and assigns the result to avg.

    }
    public static void main(String[] args) { //public static method named main
        int[] dataPoints =new int[100];
        int count=0;
        Random Goku = new Random();//creates a new instance of the random class named Goku because I like goku
        int index=0;
        int min,max; //Declare 4 interger variables
        for(int i=0;i<100;i++){ //initiates a loop that runs 100 times. i the variable increases by 1
            dataPoints[i] = Goku.nextInt(100) + 1; //initialzes each element of the datapoints array with a random integer between 1 and 100 using the next int method of the goku object
        }
        System.out.println("values");//prints string values
        for(int i=0;i<99;i++){
            System.out.print(dataPoints[i]+" | ");
        }
        System.out.println(dataPoints[99]+" ");//prints out all the lements of datapoints array sepearated by the pipe character and followed by a space expect for the last element which is printed on a new line without pipe character
        Scanner pipe =new Scanner(System.in);
        int number=SafeInput.getRangedInt(pipe,"plug in number please between 1 and 100", 1,100);//initializes a new scanner object named pipe and reads an integer from the user using getrangedint method of the safeinput class.
        for(int i=0;i<100;i++){
            if(number==dataPoints[i])
                count++;//block of code counts the number of coocurences of the number variable in the datapoints array and prints out the count to the console.
        }
        System.out.println("count "+number+" in array: "+count+" ");
        number=SafeInput.getRangedInt(pipe,"plug in number please between 1 and 100",1,100);
        int i;
        for(i=0;i<100;i++){
            if(number==dataPoints[i]){
                index=i;
                break;
            }
        }
        if(i<100)
            System.out.println("value "+number+" was found in the array index "+index);
        else{
            System.out.println("number "+number+" couldn't be found");//block of code reads another integer from the user and searches for it in the datapoints array.
            //if the interger is found its index is printed out to the console or a message indicating that the number could not be found is printer
        }
        System.out.println(" ");//blank line
        min=dataPoints[0];
        max=dataPoints[0];
        for(i=1;i<100;i++){
            if(min>dataPoints[i])
                min=dataPoints[i];
            if(max<dataPoints[i])
                max=dataPoints[i];//block of code finds the minimum and maximum values in the datapoints array and stores them in the min and max variables
        }
        System.out.println("average: "+getAverage(dataPoints));
        System.out.println("max: "+max);
        System.out.println("min: "+min);//prints out the average,min and max


    }
}

