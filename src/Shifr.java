import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.*;

public class Shifr extends Glob{
    private String abes;

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
        a--;
        b--;

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
        try{
            FileReader fread = new FileReader("C://Javist/Shifr/filetest.txt");
            BufferedReader reader = new BufferedReader(fread);
            str = reader.readLine();
            abes = reader.readLine();
            password = reader.readLine();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void splinter(String a){
        for(String str: a.split(",")){
            changeNumbers.add(Integer.parseInt(str));
        }
    }

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
