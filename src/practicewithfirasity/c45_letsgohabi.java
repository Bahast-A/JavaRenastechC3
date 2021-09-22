package practicewithfirasity;

public class c45_letsgohabi {
    public static void main(String[] args) {
        int length=100;
        int sum=0;


        for(int i =0; i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ,");
                sum+=i;
            }


        }
        System.out.println();
        System.out.println(sum);
    }
}
