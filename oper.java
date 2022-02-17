import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class oper extends Bank  {

  public int balans()
    {
        return  balans;
    }
    Scanner enter = new Scanner(System.in);

    public int polosh()
    {
        System.out.print("Напишите сколько хотите положить: ");
        int a = enter.nextInt();
        balans = balans+a;
        try {
            FileInputStream pos = new FileInputStream(new File("file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return balans;
    }

    public int snat()
    {
        System.out.print("Напишите сколько хотите cнять: ");
        int a = enter.nextInt();
        balans = balans-a;
        return balans;
    }
    public void znach()
    {
        System.out.print("Выберите тип  1) С карты 2) с счета ");
        int a = enter.nextInt();
        if(a < 2)
        {
            balans = balans;
        }
        else
        {
            balans = balans - 100;
        }
    }


}