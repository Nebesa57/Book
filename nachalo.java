import java.util.Scanner;
import java.util.Stack;

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

class contin {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println(" ");

        }
    }
}


class metka {
    public static void main(String[] args) {
        one:
        for (int a = 6; a < 10; a++) {
            for (int j = 0; j < 10; j++) {
                if (j > a) {
                    System.out.println();
                    continue one;
                }
                System.out.print("a" + "b");
            }
        }
        System.out.println(" ");
    }
}

class zadania {
    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            if (a % 2 == 0)
                System.out.print("a");
            else
                System.out.print("b");
        }
        System.out.println(" ");
        for (int a = 0; a < 10; a++) {
            switch (a) {
                case 1:
                case 2:
                    System.out.print("c");
                    break;
                case 3:
                case 4:
                    System.out.print("d");
                    break;
                case 5:
                case 6:
                    System.out.print("c");
                    break;
                case 7:
                case 8:
                    System.out.print("d");
                    break;
                case 9:
                    System.out.print("c");
                    break;
            }
        }
        System.out.println(" ");
        for (int a = 0; a < 10; a++) {
            switch (a) {
                case 1:
                    System.out.print("b");
                    break;

                case 2:
                    System.out.print("a");
                    break;
                case 3:
                    System.out.print("b");

                    break;
                case 4:
                    System.out.print("a");

                    break;
                case 5:
                    System.out.print("b");

                    break;
                case 6:
                    System.out.print("a");

                    break;
                case 7:
                    System.out.print("b");

                    break;
                case 8:
                    System.out.print("a");

                    break;

            }
        }
        System.out.println(" ");
        for (int a = 0; a < 10; a++) {
            switch (a) {
                case 1:
                case 2:
                    System.out.print("d");

                    break;
                case 3:
                case 4:
                    System.out.print("c");

                    break;
                case 5:
                case 6:
                    System.out.print("d");
                    break;
                case 7:
                    System.out.print("c");
                    break;
            }
        }
        System.out.println(" ");
        for (int a = 0; a < 10; a++) {
            switch (a) {
                case 1:
                    System.out.print("a");
                    break;
                case 2:
                    System.out.print("b");
                    break;
                case 3:
                    System.out.print("a");

                    break;
                case 4:
                    System.out.print("b");

                    break;
                case 5:
                    System.out.print("a");

                    break;
                case 6:
                    System.out.print("b");

                    break;
            }
        }
        System.out.println(" ");

        for (int a = 0; a < 10; a++) {
            switch (a) {
                case 1:
                case 2:
                    System.out.print("c");
                    break;
                case 3:
                case 4:
                    System.out.print("d");
                    break;
                case 5:
                    System.out.print("c");
                    break;

            }
        }
    }
}

class clas {
    public static void main(String[] args) {
        class box {
            int dlina;
            int shirina;
            int visota;

            void volume() {
                System.out.println(dlina * shirina * visota);
            }
        }
        box box1 = new box();
        box box2 = new box();

        box1.dlina = 10;
        box1.shirina = 10;
        box1.visota = 10;


        box2.dlina = 20;
        box2.shirina = 20;
        box2.visota = 20;

        box1.volume();

        box2.volume();
    }
}


class zadania2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту ");
        int visota = scan.nextInt();
        System.out.println("Введите ширину: ");
        int shirina = scan.nextInt();
        System.out.println("Введите 4 буквы: ");
        System.out.println(" ");
        String a = "a";//scan.nextLine();
        String b = "b";//scan.nextLine();
        String c = "c";//scan.nextLine();
        String d = "d";//scan.nextLine();
        System.out.println(" ");
        one:

        for (int v = 0; v < visota; v++) {
            for (int g = 4; g < shirina; shirina--) {
                if (shirina % 2 == 0) {
                    for (int s = 0; s < shirina; s++) {
                        System.out.print(a);
                        System.out.print(b);
                    }
                    System.out.println(" ");
                } else {
                    for (int s = 0; s < shirina; s++) {
                        if (s % 2 == 0) {
                            System.out.print(c);
                        } else
                            System.out.print(d);
                    }
                    System.out.println(" ");

                }
            }
        }
    }
}


class proba {
    public static void main(String[] args) {
        String a = "5";
        System.out.println(a + a);

    }

    int squre(int a) {
        return a * a;
    }

    void pask() {
        System.out.println(squre(10));
    }

}

class dva {
    public static void main(String[] args) {
        proba pro = new proba();
        pro.squre(10);
        System.out.print("");
    }

}

class box {
    double dlina;
    double visota;
    double shirina;

    double raschet() {
        return dlina * visota * shirina;
    }


    box(double d, double v, double s) {
        this.dlina = d;
        this.visota = v;
        this.shirina = s;
    }


    public static void main(String[] args) {

        box box1 = new box(10, 20, 30);
        box box2 = new box(20, 30, 40);

        System.out.println(box1.raschet());
        System.out.println(box2.raschet());

    }
}

 /*   class zadackaa() {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0.0D;
        int N = 0;
        boolean R1 = true;
        boolean R2 = true;
        double x = 1.0D;
        System.out.print("Введите количество элементов n: ");
        int n = in.nextInt();
        System.out.print("Введите точность eps: ");
        double eps = in.nextDouble();
        double a = x;
        double a_n = x;

        do {
            sum += a;
            a = a_n * (-x * (double)(2 * N + 1) / (double)(2 * N + 3));
            a_n = a;
            ++N;
        } while(N < n);

        System.out.print("Сумма n членов ряда равна: " + sum);
        sum = 0.0D;
        a = x;
        a_n = x;
        N = 0;

        do {
            sum += a;
            a = a_n * (-x * (double)(2 * N + 1) / (double)(2 * N + 3));
            a_n = a;
            ++N;
        } while(Math.abs(a) > eps);

        System.out.print("\nСумма членов ряда > eps равна: " + sum);
        sum = 0.0D;
        a = x;
        a_n = x;
        N = 0;

        do {
            sum += a;
            a = a_n * (-x * (double)(2 * N + 1) / (double)(2 * N + 3));
            a_n = a;
            ++N;
        } while(Math.abs(a) > eps / 10.0D);

        System.out.print("\nСумма членов ряда > eps/10 равна: " + sum);
        System.out.print("\narctg(x): " + Math.atan(x));
    }
}*/


class stack {
    public static void main(String[] args) {
        Stack steck = new Stack();
        steck.push(1234);
        if (!steck.empty()) {
            System.out.println(steck.pop());
        }
    }
}

class peregr {
    void test() {
        System.out.println("ERROR");
    }

    void test(int a) {
        System.out.println("a:=" + a);
    }


    void test(int a, int b) {
        System.out.println("a b:=" + a + " " + b);
    }

    void test(double a) {
        System.out.println("a:=" + a);
    }

}

class Overlad {
    public static void main(String[] args) {
        peregr ob = new peregr();
        int i = 88;
        ob.test(10, 20);
        ob.test(12.123);
        ob.test(i);

    }


}


class BOOX {
    double a;
    double v;
    double c;

    BOOX(double ac, double vc, double cc) {
        a = ac;
        v = vc;
        c = cc;
    }

    BOOX(double len) {
        a = v = c = len;
    }

    BOOX() {
        a = -1;
        v = -1;
        c = -1;
    }

    double volueme() {
        return a * v * c;
    }

    public static void main(String[] args) {
        BOOX box1 = new BOOX(8, 9, 10);
        BOOX box2 = new BOOX(3);
        BOOX box3 = new BOOX();

        System.out.println(box1.volueme());
        System.out.println(box2.volueme());
        System.out.println(box3.volueme());

    }


}

class facrial
{

    int fackt(int n)
    {
        int result;
        if(n==1)
        {
            return 1;
        }
        else
            result = n * fackt(n-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        facrial f = new facrial();
        System.out.println(f.fackt(5));

    }
}
