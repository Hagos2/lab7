package Chapter6;

public class FindSumAndProduct {
    public static  void main(String[]args){
       int num=0;
       int i=1;
       int j=1;
       int sum=0;
       int k=1;
       int res=0;
        for(i=1;i<=100;i++){
            num+=i;
        }
        System.out.println(num);

    //do-while
    do{
      sum+=j;
        j++;
    }
    while(j<=100);
    System.out.println(sum);

    //while-loop

    while(k<=100) {
        res+= k;
        k++;
    }
        System.out.println(res);
    // b sum
        int sum1=0;
        for(int I=5;I<=50;I+=5){
            sum1+=I;
        }
        System.out.println(sum1);
        // do-while loop
       int sum2=0;
       int J=5;
        do{
            sum2+=J;
            J+=5;
        }
        while(J<=50);
        System.out.println(sum2);
        // while-loop
        int Res=0;
        int K=5;
        while(K<=50) {
            Res+= K;
            K+=5;
        }
        System.out.println(Res);

    }
}

