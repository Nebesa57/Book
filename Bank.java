import java.util.Scanner;

public class Bank {
    public int snat;
    public  int polosh;
    public int balans = 10000;

    public void Bank(int snat,int polosh,int balans)
{
    this.snat = snat;
    this.polosh = polosh;
    this.balans = balans;
}
    public int getSnat() {
        return snat;
    }

    public void setSnat(int snat) {
        this.snat = snat;
    }

    public int getPolosh() {
        return polosh;
    }

    public void setPolosh(int polosh) {
        this.polosh = polosh;
    }

    public int getBalans() {
        return balans;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }






}
