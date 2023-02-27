public class Main {
    public static void main(String[] args) {

        for(int number=2; number<=100; number++){

            int counter=0;

            for(int k=1; k<=number; k++){
                if(number % k == 0){
                    counter++;
                }
            }

            if(counter<=2){
               System.out.print(number + " ");
            }
        }
    }
}