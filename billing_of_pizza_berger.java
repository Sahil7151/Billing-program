import java.util.Scanner;
public class billing_of_pizza_berger
{
    public static void main(String[] args)
    {
        float no,amount;
        Scanner kp = new Scanner(System.in);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t ### WELCOME TO THE Mr.BURGER & Miss.PIZZA TOWN ###");
        System.out.println(("What do want to have for you ?? :-> \n 1=PIZZA \n 2=BURGER"));
        int choice = kp.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("\n Please specified your choice ?? :-> \n 1->VEG \n 2->NON-VEG");
                int opinion = kp.nextInt();
                switch (opinion)
                {
                    case 1:
                        System.out.println("\n Which size would you want to prefer ?? :-> \n 1-SMALL \n 2-MEDIUM \n 3-LARGE");
                        int size = kp.nextInt();
                        switch (size)
                        {
                            case 1:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra = kp.nextInt();
                                switch (extra)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(135+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(135+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(135+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(135+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*135;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra1 = kp.nextInt();
                                switch (extra1)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(185+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(185+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(185+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(185+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*185;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra2 = kp.nextInt();
                                switch (extra2)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(245+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(245+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(245+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(245+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*245;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\n Which size would you want to prefer ?? :-> \n 1-SMALL \n 2-MEDIUM \n 3-LARGE");
                        int size1 = kp.nextInt();
                        switch (size1)
                        {
                            case 1:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra3 = kp.nextInt();
                                switch (extra3)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(170+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(170+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(170+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(170+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*170;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra4 = kp.nextInt();
                                switch (extra4)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(217+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(217+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(217+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(217+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*217;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra5 = kp.nextInt();
                                switch (extra5)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(312+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(312+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(312+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(312+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*312;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;

            case 2:
                System.out.println("\n Please specified your choice ?? :-> \n 1->VEG \n 2->NON-VEG");
                int opinion1 = kp.nextInt();
                switch (opinion1)
                {
                    case 1:
                        System.out.println("\n Which size would you want to prefer ?? :-> \n 1-SMALL \n 2-MEDIUM \n 3-LARGE");
                        int size2 = kp.nextInt();
                        switch (size2)
                        {
                            case 1:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra6 = kp.nextInt();
                                switch (extra6)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(52+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(52+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(52+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(52+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*52;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra7 = kp.nextInt();
                                switch (extra7)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(99+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(99+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(99+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(99+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*99;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra8 = kp.nextInt();
                                switch (extra8)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(131+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(131+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(131+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(131+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*131;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\n Which size would you want to prefer ?? :-> \n 1-SMALL \n 2-MEDIUM \n 3-LARGE");
                        int size3 = kp.nextInt();
                        switch (size3)
                        {
                            case 1:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra9 = kp.nextInt();
                                switch (extra9)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(74+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(74+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(74+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(74+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*74;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra10 = kp.nextInt();
                                switch (extra10)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(118+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(118+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(118+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(118+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*118;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("\n Would you want to add some extra items like :-> \n 1]Toppings \n 2]Chere \n 3]French-Fries \n 4]Coke \n 5]Nothing");
                                int extra11 = kp.nextInt();
                                switch (extra11)
                                {
                                    case 1:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(189+25);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 2:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(189+45);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 3:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(189+105);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 4:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*(189+40);
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                    case 5:
                                        System.out.println("\n please enter your required QUANTITY that is needed :-> ");
                                        no=kp.nextFloat();
                                        amount=no*189;
                                        System.out.println("\n Your order is placed successfully And your BILL is Rs :-> "+amount);
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;

            default:
                System.out.println("There was something went wrong \n please Try again!!");
                break;
        }
    }
}
