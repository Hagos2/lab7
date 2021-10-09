package Chapter6;

public class ProductNumber {
    public static void main(String[] args) {
        double product = 1;
        for (int i = 1; i <= 100; i++) {
            product *= i;
        }
        System.out.println(product);
        // do-while loop
        int j = 1;
        double product1 = 1;
        do {
            product1 *= j;
            j++;
        }
        while (j <= 100);
        System.out.println(product1);
        // while loop
        int k = 1;
        double product2 = 1;
        while (k <= 100) {
            product2 *= k;
            k++;
        }
        System.out.println(product2);
        //b-for loop

        double  product3 = 1;
        for (int I = 5; I <= 50; I += 5) {
            product3*= I;
        }
        System.out.println(product3);
        // do- while loop
        int J=5;
        double product4=1;
        do{
            product4*=J;
            J+=5;
        }
        while(J<=50);
        System.out.println(product4);
        // while-loop
        double product5=1;
        int K=5;
        while(K<=50) {
            product5*= K;
            K+=5;
        }
        System.out.println(product5);


    }
}