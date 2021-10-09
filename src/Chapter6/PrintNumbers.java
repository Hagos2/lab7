package Chapter6;

public class PrintNumbers {
    public static void main(String[] args) {
       // int num = 10;
        for (int i = 10; i <41; i+=10) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i +j +" ");
               // num++;
            }
            System.out.println(" ");
        }
    }

}