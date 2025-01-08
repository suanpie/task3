package Q4;

public class Q4 {
    public static void main(String[] args) {
        int num = -5;
        String ans = ( num < 0 ) ? "음수" :
                ( num == 0 ) ? "영" : "양수";

        System.out.println("-5는 무엇일까요? " + ans);
    }
}
