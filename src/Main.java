import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] vector = new int [10000 ];

        //It's a ordered vector
        for (int cont = 0; cont < vector.length; cont++) {
            vector[cont] = cont * 2;
        }

        System.out.println("What number are you searching?");
        Scanner read = new Scanner(System.in);
        int wanted = read.nextInt();

        int cont = 0;
        boolean founded = false;
        int begin = 0;
        int end =  vector.length -1;
        int mid;
        while (begin <= end) {
            //With half of the vector it will make our problem easier
            mid = (int) ((begin + end) / 2);
            cont++;
            if (vector[mid] == wanted){
                founded = true;
                break;
                //Verifying other possibilities for our search - < our >
            } else if (vector[mid] < wanted) {
                 begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //It'll be true if our searching value was founded, if not, the looping will check it all
        if (founded == true) {
            System.out.println("Existing value!");
        } else {
            System.out.println("That value don't exist.");
        }
        System.out.println("We did " + cont + " tests.");
    }
}
