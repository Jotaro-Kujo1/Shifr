import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Shifr extends Glob{
    //private String str;
    //private String strAfter;
    private String abes;
    //private List<Integer> changeNumbers = new ArrayList<Integer>();
    //private String password;

    public Shifr(){
        treatment();
    }

    private void treatment(){
        create();
        splinter(abes);
        int a = changeNumbers.get(0);
        int b = changeNumbers.get(1);
        char [] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }

        for(int i=0;i<arr.length;i++){
            if(i==a && b<arr.length){
                char tmp1 = arr[a];
                char tmp2 = arr[b];
                arr[a] = tmp2;
                arr[b] = tmp1;
                a++;
                b++;
            }
        }

        changeNumbers.clear();
        changeNumbers.add(a);
        changeNumbers.add(b);
        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        strAfter = new String(arr);
    }
    private void create(){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите ваше сообщение ");
        str = in.nextLine();
        //setStr(in.nextLine());
        System.out.println(" Введите какие символы менять(К примеру: 1,3, значит будет пропускаться 1 и 3, 2 и 4, 3 и 5 и.т.д.:");
        abes = in.nextLine();
        //setAbes(in.nextLine());
        System.out.println(" Установите пароль: ");
        password = in.nextLine();
    }
    private void splinter(String a){
        for(String str: a.split(",")){
            changeNumbers.add(Integer.parseInt(str));
        }
    }
    /*
    private void setStr(String str){
        this.str = str;
    }
    private void setAbes(String str){
        abes = str;
    }
     */
    protected String getStrAfterTreatment(){
        return strAfter;
    }
    protected List<Integer> getChangeNumbers(){
        return changeNumbers;
    }
    public void display(){
        System.out.println(str);
        System.out.println(abes);
        System.out.println(strAfter);
    }
}
