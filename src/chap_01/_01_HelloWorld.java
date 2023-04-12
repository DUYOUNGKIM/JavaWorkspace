package chap_01;

public class _01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("안녕하세요?");
        int num =1;
        for (int i=1; i<=100; i++){
            if (i%3==0){

                System.out.println(num +"번째 3의배수"+ i);
                num +=1;
            }
        }

    }

        }



