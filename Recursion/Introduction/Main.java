package Recursion.Introduction;

public class Main {

    public static int cnt = 0;

    public static void fnc(){
        if(cnt == 4) return;
        System.out.println("Count : "+cnt);
        cnt++;

        fnc();
    }
    public static void main(String[] args) {
        fnc();
    }
}
