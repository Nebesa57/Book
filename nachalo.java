import java.util.Scanner;

public class nachalo {


    public static void main(String[] args) {

        boolean b;
        b = false;
        System.out.println("b ровнятес:" + b);
        b = true;
        System.out.println("b ровянятся:" + b);
        if (b) {
            System.out.println("Код выполняется");
        } else {
            System.out.println("Не выполняется код");
        }

        System.out.println("20 > 10 " + (20 > 10));
    }


}

class Dyint {
    public static void main(String[] args) {
        double a;
        int b;
        a = 5.853;
        b = (int) a;
        byte c = 10;
        int g = c * 100;
        c = (byte) (c * 100);
        System.out.print(b);
    }
}

class s20 {
    public static void main(String[] args) {

        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31,
                30, 31, 30, 31};


        int twoM[][] = new int[3][];
        int k = 0;

        twoM[0] = new int[1];
        twoM[1] = new int[2];
        twoM[2] = new int[3];

        for (int a = 0; a < 3; a++) {

            for (int g = 0; g < a + 1; g++) {
                twoM[a][g] = k;
                k++;
            }
        }

        for (int a = 0; a < 3; a++) {

            for (int g = 0; g < a + 1; g++) {
                System.out.println(twoM[a][g] + " ");
                System.out.println();
            }
        }
        int mas[], mas2[], mas3[] = new int[5];

    }
}

class opera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 10;
        //a = scan.nextInt();
        if (a < 2) {
            System.out.println("А равняется числу: <=1");
        }
        if (a < 4) {
            System.out.println("А равняется числу: <=3");
        }
        if (a < 6) {
            System.out.println("А равняется числу: <=5");
        } else
            System.out.println("А равняется числу: " + a);

        int month;
        String season = " ";
        month = scan.nextInt();
        if (month == 12 || month == 1 || month == 2)
            season = "Зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "Не существующий месяц";

        System.out.println("Вы ввели месяц относящийся к: " + season);


    }

}

class str130 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch (a) {
            case 0:
                System.out.println("a Равно 0");
                break;
            case 1:
                System.out.println("a Равно 1");
                break;
            case 2:
                System.out.println("a Равно 2");
                break;
            default:
                System.out.println("A больше 3");
        }


    }
}

class opredVrGodaVrs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
            case 2:
            case 12:
                System.out.println("Время года Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года Лета");
            case 9:
            case 10:
            case 11:
                System.out.println("Время когда Осень");
                break;
            default:
                System.out.println("Вы ввели несуществующий месяц");
        }
    }
}

class while1 {
    public static void main(String[] args) {
        int a = 10;
        while (a > 0) {
            System.out.println("Цикл номер " + a);
            a--;
        }

        int b = 100;
        int c = 500;
        while (++b < --c) ;
        System.out.println(c + " " + b);
    }
}

class dowhile {
    public static void main(String[] args) {
        int a = 10;
        do {
            System.out.println("Цыкл равен: " + a);
            a--;
        }
        while (a > 0);
    }
}

class oneMenu {

    public static void main(String[] args)
            throws java.io.IOException {
        char m;
        do {
            System.out.println("Выберите время года, чтобы узнать какие месяца в него входят");
            System.out.println("        1: Зима");
            System.out.println("        2: Весна");
            System.out.println("        3: Лето");
            System.out.println("        4: Осень");
            m = (char) System.in.read();
        }
        while (m < '1' || m > '5');

        switch (m) {
            case '1':
                System.out.println("В Зиму хводят такие месяца как: ");
                System.out.println("Декабрь");
                System.out.println("Январь");
                System.out.println("Февраль");
                break;
            case '2':
                System.out.println("В Весну хводят такие месяца как: ");
                System.out.println("Март");
                System.out.println("Апрель");
                System.out.println("Май");
                break;
            case '3':
                System.out.println("В Лето хводят такие месяца как: ");
                System.out.println("Июнь");
                System.out.println("Июль");
                System.out.println("Август");
                break;
            case '4':
                System.out.println("В Осень хводят такие месяца как: ");
                System.out.println("Сентябрь");
                System.out.println("Октябрь");
                System.out.println("Ноябрь");
                break;
        }


    }
}


class massss {
    public static void main(String[] args) {
        int isk = 5;
        int mas[] = {1, 2, 3, 4, 6, 7};
        boolean end = false;
        for (int x : mas) {
            if (x == isk) {
                end = true;
                break;
            }
        }
        if (end)
            System.out.println("Число найдено");
        else
            System.out.println("Число не найдено");
    }
}


class zadac {
    public static void main(String[] args) {
        int h, s, w;
        for (s = 5; s >= 0; s--) {
            for (w = 0; w <= s; w++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


class vihod {
    public static void main(String[] args) {

        for (int a = 0; a < 100; a++) {
            if (a == 10) {
                break;
            }
            System.out.println("a= " + a);
        }
    }
}

class vihod2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (b < 3) {
            System.out.println("Проход номер: " + b + " ");
            b++;
            while (a < 100) {
                if (a == 10) break;
                System.out.print("a = " + a + " ");
                a++;
            }
        }
    }
}

class Benk {
    public static void main(String[] args) {
        oper Oper = new oper();
        System.out.println(Oper.balans);
    }
}

class brik {
    public static void main(String[] args) {
        boolean t = true;
        second:
        {
            two:
            {

                third:
                {
                    if (t) break two;

                }
            }
            System.out.println("Вывод 3");
        }


    }
}

class contin{
    public static void main(String[] args) {
        for(int i =0;i<10;i++)
        {
            System.out.print(i+" ");
            if(i%2==0) continue;

                System.out.println(" ");

        }
    }
}

