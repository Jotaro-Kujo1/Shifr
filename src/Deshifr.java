import java.util.Scanner;

public class Deshifr extends Glob{
    //private String str;
    //private String strAfter;

    public Deshifr(Shifr sh){
        boolean f = checkUser(sh);
        if(f){
            str = sh.strAfter;
            changeNumbers = sh.changeNumbers;
            password = sh.password;
            treatment(sh);
        }
    }
    private boolean checkUser(Shifr sh){
        String tmp;
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите пароль: ");
        tmp = in.nextLine();
        if(tmp.equals(sh.password)) return true;
        else return false;
    }
    private void treatment(Shifr sh){
        char [] arr2 = str.toCharArray();
        int a = changeNumbers.get(0);
        int b = changeNumbers.get(1);
        for(int i=arr2.length-1;i>=0;i--){
            if(i == b && a >= 0){
                char tmp1 = arr2[b];
                char tmp2 = arr2[a];
                arr2[b] = tmp2;
                arr2[a] = tmp1;
                a--;
                b--;
            }
        }
        String resStr = new String(arr2);
        System.out.println(" haha ez " + resStr);
    }
}
