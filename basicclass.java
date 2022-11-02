import java.util.Scanner;
public class basicclass {

        double billpay;

        void Bill(long units)
        {
            if(units<100)
                billpay=units*1.20;
            else if(units<=300)
                billpay=100*1.20+(units-100)*2;
            else if(units>300)
                billpay=100*1.20+200 *2+(units-300)*3;

        }


    }
    class ComputeElectricityBill extends basicclass
    {
        public static void main(String args[])
        {
            long units;

            Scanner sc=new Scanner(System.in);

            System.out.println("enter number of units");

            units=sc.nextLong();

            ComputeElectricityBill b=new ComputeElectricityBill();
            b.Bill(units);

            System.out.println("total Bill U have to pay : " + b.billpay);
        }
    }

