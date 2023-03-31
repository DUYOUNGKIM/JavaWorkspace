package chap_01;

public class _02_Variables {
    public static void main(String[] args) {
        String name = "두영";
        int age = 29;
        System.out.println(name);
        System.out.println(age);
        System.out.println(name +"님, 안녕하세요");
        name = "du";
        double score = 90.5;
        char grade = 'A';
        System.out.println(name);
        System.out.println(score);
        System.out.println(grade);

        boolean pass = true;
        System.out.println(pass);

        double d =3.14; //정밀한 소수를 계산할때 사용
        float f = 3.14F;
        System.out.println(d);
        System.out.println(f);
        long l = 1000000000000L; //21억 초과하면 long ,아니면 int 사용

    }
}
