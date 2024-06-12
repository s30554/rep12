import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount implements AccountOpearations {
    private double stankonta = 0 ;

    public BankAccount(double stankonta) {
        this.stankonta = stankonta;
    }

    public double getStankonta() {
        return stankonta;
    }

    public void setStankonta(double stankonta) {
        this.stankonta = stankonta;
    }

    ArrayList<Transaction>transactions=new ArrayList<>();

    @Override
    public void sprawdzStanKonta() {
       System.out.println("Stan konta: " + stankonta);
    }
    @Override
    public void wykonaniePrzelewu() {

        System.out.println("podaj kwote przelewu");
        Scanner scanner=new Scanner(System.in);
        double przelew= scanner.nextInt();
        stankonta = stankonta - przelew;
        System.out.println("Stan konta: " + stankonta);

        if(przelew>stankonta){
            throw new AccountOperationException();
        }


    }
    @Override
    public void dokonanieWplaty() {

        System.out.println("podaj kwote wplaty");
        Scanner scanner=new Scanner(System.in);
        double wplata= scanner.nextInt();
        stankonta = stankonta + wplata;
        System.out.println("Stan konta: " + stankonta);


    }
}
