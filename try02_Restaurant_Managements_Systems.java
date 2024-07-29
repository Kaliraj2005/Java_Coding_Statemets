import java.io.*;
import java.lang.*;import java.util.*;
final class Offline_Events
{
    public final void events()
    {
        Scanner in = new Scanner(System.in);
        int choose,members,i=0,per_member_rate;
        System.out.println("Pleasure to meet you all with in This Special Events !!!");
        System.out.println("\n 1.) Dancing \n 2.) Playing Games \n 3.) Sports Play-Grounds \n 4.) Theatres \n 5.) Private Parties \n 6.) Exit ");
        choose=in.nextInt();
        switch(choose)
        {
            case 1 ->
            {
                per_member_rate=150;int dancing_count,next_dancing;
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_dancing=in.nextInt();
                if(next_dancing!=0)
                {
                    while(next_dancing==1)
                    {
                        if(next_dancing!=0)
                        {
                            System.out.println("Welcome our Dancing Program !!!");
                            System.out.println("For a single person : 150/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                dancing_count=members*per_member_rate;
                                System.out.println("Your Payment for Dancing program : "+dancing_count+"/-Rupees Existed");
                                System.out.println("Successfully Accomplished the Registration Process !!!");
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please Try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_dancing = in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            case 2 ->
            {
                int gaming_count;per_member_rate=210;int next_gaming;
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_gaming=in.nextInt();
                if(next_gaming!=0)
                {
                    while(next_gaming==1)
                    {
                        if(next_gaming!=0)
                        {
                            System.out.println("Welcome our Gaming Program Process !!!");
                            System.out.println("For a single person : 210/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                gaming_count=members*per_member_rate;
                                System.out.println("Your Payment for Gaming Process : "+gaming_count+"/-Rupees Existed");
                                System.out.println("Successfully Accomplished the Registration Process for Gaming Functionalities !!!");
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_gaming=in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            case 3 ->
            {
                int sports_count;per_member_rate=90;int next_sports;
                System.out.println("This is for Sports with Play-Grounds Process ");
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_sports=in.nextInt();
                if(next_sports!=0)
                {
                    while(next_sports==1)
                    {
                        if(next_sports!=0)
                        {
                            System.out.println("Welcome our Sports Process with Play-Grounds !!!");
                            System.out.println("For a single person : 90/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                sports_count=members*per_member_rate;
                                System.out.println("Your Payment for Sports Process with Play-Grounds : "+sports_count+"/-Rupees Existed");
                                System.out.println("Successfully Accomplished the Registration Process for Sports with Play-grounds Functionalities !!!");
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please Try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_sports=in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            case 4 ->
            {
                int theatre_count;per_member_rate=170;int next_theatre;
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_theatre=in.nextInt();
                if(next_theatre!=0)
                {
                    while(next_theatre==1)
                    {
                        if(next_theatre!=0)
                        {
                            System.out.println("Welcome our Theatre Programs with Vibes Events !!!");
                            System.out.println("For a single person : 170/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                theatre_count=members*per_member_rate;
                                System.out.println("Your Payment for Theatre Programs : "+theatre_count+"/-Rupees Existed");
                                System.out.println("Successfully Accomplished the Registration Process for Theatre Program Functionalities !!!");
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please Try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_theatre=in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            case 5 ->
            {
                int vibes_count;per_member_rate=80;int next_parties;
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_parties=in.nextInt();
                if(next_parties!=0)
                {
                    while(next_parties==1)
                    {
                        if(next_parties!=0)
                        {
                            System.out.println("Welcome our Private-Parties with DJs Vibes Events !!!");
                            System.out.println("For a single person : 170/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                vibes_count=members*per_member_rate;
                                System.out.println("Your Payment for Private-Parties with DJs Programs : "+vibes_count+"/-Rupees Existed");
                                System.out.println("Successfully Accomplished the Registration Process for Private-Parties with DJs Programs of Functionalities !!!");
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_parties=in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            default ->
            {
                System.out.println("Your Input has Wrong !!! So Exited");
                System.exit(0);
            }
        }
    }
}
final class Offline_Food_Menu
{
    public final int veg(int cal)
    {
        Scanner in = new Scanner(System.in);
        int veg_foods;int bill=0;
        System.out.println("Variety of Vegetarian Foods");
        System.out.println("1.)Veg Fried Rice\t\t = 85/-Rupees\n2.)Masala Dosa\t\t\t = 35/-Rupees\n3.)Poori with Gravi\t\t = 45/-Rupees\n4.)Mushroom Gravi\t\t = 50/-Rupees\n5.)Chappati with Paneer\t = 40/-Rupees\n6.)Naan with Paneer\t\t = 35/-Rupees");
        System.out.println("Enter According for above Instructions");
        veg_foods=in.nextInt();
        switch(veg_foods)
        {
            case 1 ->
            {
                final int veg_rice=85;
                bill+=veg_rice;
                cal=bill;
                System.out.println("Veg Fried Rice : "+cal);
            }
            case 2 ->
            {
                final int masala_dosa=35;
                bill+=masala_dosa;
                cal=bill;
                System.out.println("Masala Dosa : "+cal);
            }
            case 3 ->
            {
                final int poosi_gravi=45;
                bill+=poosi_gravi;
                cal=bill;
                System.out.println("Poori with Gravi : "+cal);
            }
            case 4 ->
            {
                final int mushroom_gravi=50;
                bill+=mushroom_gravi;
                cal=bill;
                System.out.println("Mushroom Gravi : "+cal);
            }
            case 5 ->
            {
                final int chapatti_paneer=40;
                bill+=chapatti_paneer;
                cal=bill;
                System.out.println("Chappati with paneer : "+cal);
            }
            case 6 ->
            {
                final int naan_paneer=35;
                bill+=naan_paneer;
                cal=bill;
                System.out.println("Naan with paneer : "+cal);
            }
            default ->
            {
                System.out.println("This is Invalid Input !!!");
                System.exit(0);
            }
        }
        return cal;
    }
    public final int non_veg(int cal)
    {
        Scanner in = new Scanner(System.in);
        int non_veg_foods;int bill=0;
        System.out.println("Variety of Non-Vegetarian Foods");
        System.out.println("\n1.)Chicken Fried Rice\t\t = 95/-Rupees\n2.)Mutton & Chicken Biriyani = 185/-Rupees\n3.)Butter Chicken\t\t\t = 75/-Rupees\n4.)Tandoori Chicken\t\t\t = 120/-Rupees\n5.)Chicken Eggs\t\t\t\t = 15/-Rupees\n6.)Duck Eggs\t\t\t\t = 15/-Rupees\n7.)Quail Eggs\t\t\t\t = 20/-Rupees");
        System.out.println("Enter According for above Instructions");
        non_veg_foods=in.nextInt();
        switch(non_veg_foods)
        {
            case 1 ->
            {
                final int chicken_rise=95;
                bill+=chicken_rise;
                cal=bill;
                System.out.println("Chicken Fried Rice : "+cal);
            }
            case 2 ->
            {
                final int mutton_chicken_biriyani=185;
                bill+=mutton_chicken_biriyani;
                cal=bill;
                System.out.println("Mutton & Chicken Biriyani : "+cal);
            }
            case 3 ->
            {
                final int butter_chicken=75;
                bill+=butter_chicken;
                cal=bill;
                System.out.println("Butter Chicken : "+cal);
            }
            case 4 ->
            {
                final int tandoori_chicken=120;
                bill+=tandoori_chicken;
                cal=bill;
                System.out.println("Tandoori Chicken : "+cal);
            }
            case 5 ->
            {
                final int chicken_eggs=15;
                bill+=chicken_eggs;
                cal=bill;
                System.out.println("Chicken Eggs : "+cal);
            }
            case 6 ->
            {
                final int duck_eggs=15;
                bill+=duck_eggs;
                cal=bill;
                System.out.println("Duck Eggs : "+cal);
            }
            case 7 ->
            {
                final int quail_eggs=20;
                bill+=quail_eggs;
                cal=bill;
                System.out.println("Quail Eggs : "+cal);
            }
            default ->
            {
                System.out.println("Your Input has Invalid !!!");
                System.exit(0);
            }
        }
        return cal;
    }
}
// -------------------------------------------------------------------------------------------------------
final class Online_Events
{
    public final void events()
    {
        Scanner in = new Scanner(System.in);
        int choose,members,i=0,per_member_rate,discount;
        System.out.println("Pleasure to meet you all with in This Special Events !!!");
        System.out.println("\n 1.) Dancing \n 2.) Playing Games \n 3.) Sports Play-Grounds \n 4.) Theatres \n 5.) Private Parties ");
        choose=in.nextInt();
        switch(choose)
        {
            case 1 ->
            {
                per_member_rate=150;int dancing_count,next_dancing;final int discount_dancing=35;
                System.out.println("If You want Continue , Yes=1 or No=0 : ");
                next_dancing=in.nextInt();
                if(next_dancing!=0)
                {
                    while(next_dancing==1)
                    {
                        if(next_dancing!=0)
                        {
                            System.out.println("Welcome our Dancing Program !!!");
                            System.out.println("For a single person : 150/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                if(members<=5)
                                {
                                    dancing_count=members*per_member_rate;
                                    System.out.println("Your Payment for Dancing program : "+dancing_count+"/-Rupees Existed");
                                    System.out.println("Successfully Accomplished the Registration Process !!!");
                                }
                                else if(members>6)
                                {
                                    int bill_dancing=0;
                                    discount=(members*discount_dancing)/100;
                                    bill_dancing+=members+discount_dancing;
                                    System.out.println("Congratulations !!! You got Discount For Dancing Program !!!"+discount+"/-Rupees");
                                    System.out.println("Eventually Your Total Amount for Dancing Program : "+bill_dancing);
                                }
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please Try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_dancing = in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            case 2 ->
            {
                int gaming_count;per_member_rate=210;int next_gaming,discount_gaming=50;
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_gaming=in.nextInt();
                if(next_gaming!=0)
                {
                    while(next_gaming==1)
                    {
                        if(next_gaming!=0)
                        {
                            System.out.println("Welcome our Gaming Program Process !!!");
                            System.out.println("For a single person : 210/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                if(members<=5)
                                {
                                    gaming_count=members*per_member_rate;
                                    System.out.println("Your Payment for Gaming program : "+gaming_count+"/-Rupees Existed");
                                    System.out.println("Successfully Accomplished the Registration Process !!!");
                                }
                                else if(members>6)
                                {
                                    int bill_gaming=0;
                                    discount=(members*discount_gaming)/100;
                                    bill_gaming+=members+discount_gaming;
                                    System.out.println("Congratulations !!! You got Discount For Gaming Program !!!"+discount+"/-Rupees");
                                    System.out.println("Eventually Your Total Amount for Gaming Program : "+bill_gaming);
                                }
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please Try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_gaming=in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            case 3 ->
            {
                int sports_count;per_member_rate=90;int next_sports;
                int discount_sports=40;
                System.out.println("This is for Sports with Play-Grounds Process ");
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_sports=in.nextInt();
                if(next_sports!=0)
                {
                    while(next_sports==1)
                    {
                        if(next_sports!=0)
                        {
                            System.out.println("Welcome our Sports Process with Play-Grounds !!!");
                            System.out.println("For a single person : 90/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                if(members<=5)
                                {
                                    sports_count=members*per_member_rate;
                                    System.out.println("Your Payment for Sports & its Play-Grounds program : "+sports_count+"/-Rupees Existed");
                                    System.out.println("Successfully Accomplished the Registration Process !!!");
                                }
                                else if(members>6)
                                {
                                    int bill_sports=0;
                                    discount=(members*discount_sports)/100;
                                    bill_sports+=members+discount_sports;
                                    System.out.println("Congratulations !!! You got Discount For Sports & Play-Grounds !!!"+discount+"/-Rupees");
                                    System.out.println("Eventually Your Total Amount for Sports & Play-Grounds : "+bill_sports);
                                }
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please Try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_sports=in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            case 4 ->
            {
                int theatre_count;per_member_rate=170;int next_theatre;
                int discount_theatres=40;
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_theatre=in.nextInt();
                if(next_theatre!=0)
                {
                    while(next_theatre==1)
                    {
                        if(next_theatre!=0)
                        {
                            System.out.println("Welcome our Theatre Programs with Vibes Events !!!");
                            System.out.println("For a single person : 170/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                if(members<=5)
                                {
                                    theatre_count=members*per_member_rate;
                                    System.out.println("Your Payment for Theatres with Programs : "+theatre_count+"/-Rupees Existed");
                                    System.out.println("Successfully Accomplished the Registration Process !!!");
                                }
                                else if(members>6)
                                {
                                    int bill_theatres=0;
                                    discount=(members*discount_theatres)/100;
                                    bill_theatres+=members+discount_theatres;
                                    System.out.println("Congratulations !!! You got Discount For Theatre & its Programs !!!"+discount+"/-Rupees");
                                    System.out.println("Eventually Your Total Amount for Theatre & its Programs : "+bill_theatres);
                                }
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please Try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_theatre=in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            case 5 ->
            {
                int vibes_count;per_member_rate=80;int next_parties; int discount_DJs=40;
                System.out.println("If You want continue , Yes=1 or No=0 : ");
                next_parties=in.nextInt();
                if(next_parties!=0)
                {
                    while(next_parties==1)
                    {
                        if(next_parties!=0)
                        {
                            System.out.println("Welcome our Private-Parties with DJs Vibes Events !!!");
                            System.out.println("For a single person : 170/-Rupees !!!");
                            System.out.println("How many Members Existed : ");
                            members=in.nextInt();
                            if(members!=0)
                            {
                                if(members<=5)
                                {
                                    vibes_count=members*per_member_rate;
                                    System.out.println("Your Payment for Private Parties with DJs Programs : "+vibes_count+"/-Rupees Existed");
                                    System.out.println("Successfully Accomplished the Registration Process !!!");
                                }
                                else if(members>6)
                                {
                                    int bill_DJs=0;
                                    discount=(members*discount_DJs)/100;
                                    bill_DJs+=members+discount_DJs;
                                    System.out.println("Congratulations !!! You got Discount For Private Parties with DJs Programs !!! : "+discount+"/-Rupees");
                                    System.out.println("Eventually Your Total Amount for Private Parties with DJs Programs             : "+bill_DJs+"/-Rupees");
                                }
                            }
                            else
                            {
                                System.out.println("Member has Insufficient !!! Please Try Again !!!");
                                System.exit(0);
                            }
                            i++;
                        }
                        System.out.println("If You want continue , Yes=1 or No=0 : ");
                        next_parties=in.nextInt();
                    }
                }
                else
                {
                    System.out.println("Thank You For Joining Us !!!");
                    System.exit(0);
                }
            }
            default ->
            {
                System.out.println("Your Input has Wrong !!! So Exited");
                System.exit(0);
            }
        }
    }
}
final class Online_Food_Menu
{
    public final void veg()
    {
        Scanner in = new Scanner(System.in);
        int veg_foods;
        System.out.println("Variety of Vegetarian Foods");
        System.out.println("1.)Veg Fried Rice\t\t = 85/-Rupees\n2.)Masala Dosa\t\t\t = 35/-Rupees\n3.)Poori with Gravi\t\t = 45/-Rupees\n4.)Mushroom Gravi\t\t = 50/-Rupees\n5.)Chappati with Paneer\t = 40/-Rupees\n6.)Naan with Paneer\t\t = 35/-Rupees");
        System.out.println("Enter According for above Instructions");
        veg_foods=in.nextInt();
        switch(veg_foods)
        {
            case 1 ->
            {
                int discount_veg_rice,quantity_veg_rice; int veg_rice=85,offer_veg_rice=30,bill_veg_rice;
                System.out.println("Quantity of Veg Fried Rice : ");
                quantity_veg_rice=in.nextInt();
                if(quantity_veg_rice==1)
                {
                    bill_veg_rice=veg_rice;
                    System.out.println("Total Bill of Veg Fried Rice : "+bill_veg_rice);
                }
                else if(quantity_veg_rice>=2)
                {
                    System.out.println("You Entered Veg Fried Quantity Exist                 : "+quantity_veg_rice +" Items !!!");
                    discount_veg_rice=(offer_veg_rice/quantity_veg_rice)*100;
                    bill_veg_rice=0;
                    bill_veg_rice+=quantity_veg_rice*veg_rice;
                    System.out.println("Overall Amount for Veg Fried Rice Without Offer      : "+bill_veg_rice+"/-Rupees");
                    bill_veg_rice-=discount_veg_rice;
                    System.out.println("Congrats !!! You got Discount for Veg Fried Rice     : "+discount_veg_rice+"/-Rupees");
                    System.out.println("Eventually Your Amount for Veg Fried Rice With Offer : "+bill_veg_rice+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't Entered Relevant the Food Items , Please Try Again !!!");
                }
            }
            case 2 ->
            {
                int discount_masala_dosa,quantity_masala_dosa; int masala_dosa=35,offer_masala_dosa=10,bill_masal_dosa;
                System.out.println("Quantity of Masala Dosa : ");
                quantity_masala_dosa=in.nextInt();
                if(quantity_masala_dosa==1)
                {
                    bill_masal_dosa=masala_dosa;
                    System.out.println("Total Bill of Masala Dosa : "+bill_masal_dosa);
                }
                else if(quantity_masala_dosa>=2)
                {
                    System.out.println("You Entered The Masala Dosa Quantity Exist           : "+quantity_masala_dosa +" Items !!!");
                    discount_masala_dosa=(offer_masala_dosa/quantity_masala_dosa)*100;
                    bill_masal_dosa=0;
                    bill_masal_dosa+=quantity_masala_dosa*masala_dosa;
                    System.out.println("Overall Amount for Masala Dosa Without Offer         : "+bill_masal_dosa+"/-Rupees");
                    bill_masal_dosa-=discount_masala_dosa;
                    System.out.println("Congrats !!! You got Discount for Masala Dosa        : "+discount_masala_dosa+"/-Rupees");
                    System.out.println("Eventually Your Amount for Masala Dosa With Offer    : "+bill_masal_dosa+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 3 ->
            {
                int discount_poori_gravi,quantity_poori_gravi; int poori_gravi=45,offer_poori_gravi=10,bill_poori_gravi;
                System.out.println("Quantity of Poori with Gravi : ");
                quantity_poori_gravi=in.nextInt();
                if(quantity_poori_gravi==1)
                {
                    bill_poori_gravi=poori_gravi;
                    System.out.println("Total Amount of Poori with Gravi : "+bill_poori_gravi);
                }
                else if(quantity_poori_gravi>=2)
                {
                    System.out.println("You Entered The Poori with Gravi Quantity Exist        : "+quantity_poori_gravi +" Items !!!");
                    discount_poori_gravi=(offer_poori_gravi/quantity_poori_gravi)*100;
                    bill_poori_gravi=0;
                    bill_poori_gravi+=quantity_poori_gravi*poori_gravi;
                    System.out.println("Overall Amount for Poori with Gravi Without Offer      : "+bill_poori_gravi+"/-Rupees");
                    bill_poori_gravi-=discount_poori_gravi;
                    System.out.println("Congrats !!! You got Discount for Poori with Gravi     : "+discount_poori_gravi+"/-Rupees");
                    System.out.println("Eventually Your Amount for Poori with Gravi With Offer : "+bill_poori_gravi+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 4 ->
            {
                int discount_mushroom_gravi,quantity_mushroom_gravi; int mushroom_gravi=50,offer_mushroom_gravi=15,bill_mushroom_gravi;
                System.out.println("Quantity of Mushroom with Gravi : ");
                quantity_mushroom_gravi=in.nextInt();
                if(quantity_mushroom_gravi==1)
                {
                    bill_mushroom_gravi=mushroom_gravi;
                    System.out.println("Total Amount of Mushroom with Gravi : "+bill_mushroom_gravi);
                }
                else if(quantity_mushroom_gravi>=2)
                {
                    System.out.println("You Entered The Mushroom with Gravi Quantity Exist        : "+quantity_mushroom_gravi +" Items !!!");
                    discount_mushroom_gravi=(offer_mushroom_gravi/quantity_mushroom_gravi)*100;
                    bill_mushroom_gravi=0;
                    bill_mushroom_gravi+=quantity_mushroom_gravi*mushroom_gravi;
                    System.out.println("Overall Amount for Poori with Gravi Without Offer         : "+bill_mushroom_gravi+"/-Rupees");
                    bill_mushroom_gravi-=discount_mushroom_gravi;
                    System.out.println("Congrats !!! You got Discount for Mushroom with Gravi     : "+discount_mushroom_gravi+"/-Rupees");
                    System.out.println("Eventually Your Amount for Mushroom with Gravi With Offer : "+bill_mushroom_gravi+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 5 ->
            {
                int discount_chapatti_paneer,quantity_chapatti_paneer; int chapatti_paneer=40,offer_chapatti_paneer=10,bill_chapatti_paneer;
                System.out.println("Quantity of Chapatti with paneer : ");
                quantity_chapatti_paneer=in.nextInt();
                if(quantity_chapatti_paneer==1)
                {
                    bill_chapatti_paneer=chapatti_paneer;
                    System.out.println("Total Amount of Chapatti with paneer : "+bill_chapatti_paneer);
                }
                else if(quantity_chapatti_paneer>=2)
                {
                    System.out.println("You Entered The Chapatti with Paneer Quantity Exist         : "+quantity_chapatti_paneer +" Items !!!");
                    discount_chapatti_paneer=(offer_chapatti_paneer/quantity_chapatti_paneer)*100;
                    bill_chapatti_paneer=0;
                    bill_chapatti_paneer+=quantity_chapatti_paneer*chapatti_paneer;
                    System.out.println("Overall Amount for Chapatti with Paneer Without Offer       : "+bill_chapatti_paneer+"/-Rupees");
                    bill_chapatti_paneer-=discount_chapatti_paneer;
                    System.out.println("Congrats !!! You got Discount for Chapatti with Paneer      : "+discount_chapatti_paneer+"/-Rupees");
                    System.out.println("Eventually Your Amount for Chapatti with Paneer With Offer  : "+bill_chapatti_paneer+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 6 ->
            {
                int discount_naan_paneer,quantity_naan_paneer; int naan_paneer=35,offer_naan_paneer=10,bill_naan_paneer;
                System.out.println("Quantity of Naan with Paneer : ");
                quantity_naan_paneer=in.nextInt();
                if(quantity_naan_paneer==1)
                {
                    bill_naan_paneer=naan_paneer;
                    System.out.println("Total Amount of Naan with Paneer : "+bill_naan_paneer);
                }
                else if(quantity_naan_paneer>=2)
                {
                    System.out.println("You Entered The Naan with Paneer Quantity Exist         : "+quantity_naan_paneer +" Items !!!");
                    discount_naan_paneer=(offer_naan_paneer/quantity_naan_paneer)*100;
                    bill_naan_paneer=0;
                    bill_naan_paneer+=quantity_naan_paneer*naan_paneer;
                    System.out.println("Overall Amount for Naan with Paneer Without Offer       : "+bill_naan_paneer+"/-Rupees");
                    bill_naan_paneer-=discount_naan_paneer;
                    System.out.println("Congrats !!! You got Discount for Naan with Paneer      : "+discount_naan_paneer+"/-Rupees");
                    System.out.println("Eventually Your Amount for Naan with Paneer With Offer  : "+bill_naan_paneer+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            default ->
            {
                System.out.println("This is Invalid Input !!!");
                System.exit(0);
            }
        }
    }
    public final void non_veg()
    {
        Scanner in = new Scanner(System.in);
        int non_veg_foods;int bill=0;
        System.out.println("Variety of Non-Vegetarian Foods");
        System.out.println("\n1.)Chicken Fried Rice\t\t = 95/-Rupees\n2.)Mutton & Chicken Biriyani = 185/-Rupees\n3.)Butter Chicken\t\t\t = 75/-Rupees\n4.)Tandoori Chicken\t\t\t = 120/-Rupees\n5.)Chicken Eggs\t\t\t\t = 20/-Rupees\n6.)Duck Eggs\t\t\t\t = 20/-Rupees\n7.)Quail Eggs\t\t\t\t = 30/-Rupees");
        System.out.println("Enter According for above Instructions : ");
        non_veg_foods=in.nextInt();
        switch(non_veg_foods)
        {
            case 1 ->
            {
                int discount_chicken_fried_rice,quantity_chicken_fried_rice; int chicken_fried_rice=95,offer_chicken_fried_rice=20,bill_chicken_fried_rice;
                System.out.println("Quantity of Chicken Fried Rice : ");
                quantity_chicken_fried_rice=in.nextInt();
                if(quantity_chicken_fried_rice==1)
                {
                    bill_chicken_fried_rice=chicken_fried_rice;
                    System.out.println("Total Amount of Chicken Fried Rice : "+bill_chicken_fried_rice);
                }
                else if(quantity_chicken_fried_rice>=2)
                {
                    System.out.println("You Entered The Chicken Fried Rice Quantity Exist         : "+quantity_chicken_fried_rice +" Items !!!");
                    discount_chicken_fried_rice=(offer_chicken_fried_rice/quantity_chicken_fried_rice)*100;
                    bill_chicken_fried_rice=0;
                    bill_chicken_fried_rice+=quantity_chicken_fried_rice*chicken_fried_rice;
                    System.out.println("Overall Amount for Chicken Fried Rice Without Offer       : "+bill_chicken_fried_rice+"/-Rupees");
                    bill_chicken_fried_rice-=discount_chicken_fried_rice;
                    System.out.println("Congrats !!! You got Discount for Chicken Fried Rice      : "+discount_chicken_fried_rice+"/-Rupees");
                    System.out.println("Eventually Your Amount for Chicken Fried Rice With Offer  : "+bill_chicken_fried_rice+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 2 ->
            {
                int discount_mutton_chicken_biriyani,quantity_mutton_chicken_biriyani; int mutton_chicken_biriyani=185,offer_mutton_chicken_biriyani=30,bill_mutton_chicken_biriyani;
                System.out.println("Quantity of Mutton & Chicken Biriyani : ");
                quantity_mutton_chicken_biriyani=in.nextInt();
                if(quantity_mutton_chicken_biriyani==1)
                {
                    bill_mutton_chicken_biriyani=mutton_chicken_biriyani;
                    System.out.println("Total Amount of Mutton & Chicken Biriyani : "+bill_mutton_chicken_biriyani);
                }
                else if(quantity_mutton_chicken_biriyani>=2)
                {
                    System.out.println("You Entered The Mutton & Chicken Biriyani Quantity Exist         : "+quantity_mutton_chicken_biriyani +" Items !!!");
                    discount_mutton_chicken_biriyani=(offer_mutton_chicken_biriyani/quantity_mutton_chicken_biriyani)*100;
                    bill_mutton_chicken_biriyani=0;
                    bill_mutton_chicken_biriyani+=quantity_mutton_chicken_biriyani*mutton_chicken_biriyani;
                    System.out.println("Overall Amount for Mutton & chicken Biriyani Without Offer       : "+bill_mutton_chicken_biriyani+"/-Rupees");
                    bill_mutton_chicken_biriyani-=discount_mutton_chicken_biriyani;
                    System.out.println("Congrats !!! You got Discount for Mutton & Chicken Biriyani      : "+discount_mutton_chicken_biriyani+"/-Rupees");
                    System.out.println("Eventually Your Amount for Mutton & chicken Biriyani With Offer  : "+bill_mutton_chicken_biriyani+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 3 ->
            {
                int discount_butter_chicken,quantity_butter_chicken; int butter_chicken=75,offer_butter_chicken=18,bill_butter_chicken;
                System.out.println("Quantity of Butter Chicken : ");
                quantity_butter_chicken=in.nextInt();
                if(quantity_butter_chicken==1)
                {
                    bill_butter_chicken=butter_chicken;
                    System.out.println("Total Amount of Butter Chicken : "+bill_butter_chicken);
                }
                else if(quantity_butter_chicken>=2)
                {
                    System.out.println("You Entered The Butter Chicken Quantity Exist         : "+quantity_butter_chicken +" Items !!!");
                    discount_butter_chicken=(offer_butter_chicken/quantity_butter_chicken)*100;
                    bill_butter_chicken=0;
                    bill_butter_chicken+=quantity_butter_chicken*butter_chicken;
                    System.out.println("Overall Amount for Butter Chicken Without Offer       : "+bill_butter_chicken+"/-Rupees");
                    bill_butter_chicken-=discount_butter_chicken;
                    System.out.println("Congrats !!! You got Discount for Butter Chicken      : "+discount_butter_chicken+"/-Rupees");
                    System.out.println("Eventually Your Amount for Butter Chicken With Offer  : "+bill_butter_chicken+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 4 ->
            {
                int discount_tandoori_chicken,quantity_tandoori_chicken; int tandoori_chicken=120,offer_tandoori_chicken=25,bill_tandoori_chicken;
                System.out.println("Quantity of Tandoori Chicken : ");
                quantity_tandoori_chicken=in.nextInt();
                if(quantity_tandoori_chicken==1)
                {
                    bill_tandoori_chicken=tandoori_chicken;
                    System.out.println("Total Amount of Tandoori Chicken : "+bill_tandoori_chicken);
                }
                else if(quantity_tandoori_chicken>=2)
                {
                    System.out.println("You Entered The Tandoori Chicken Quantity Exist         : "+quantity_tandoori_chicken +" Items !!!");
                    discount_tandoori_chicken=(offer_tandoori_chicken/quantity_tandoori_chicken)*100;
                    bill_tandoori_chicken=0;
                    bill_tandoori_chicken+=quantity_tandoori_chicken*tandoori_chicken;
                    System.out.println("Overall Amount for Tandoori Chicken Without Offer       : "+bill_tandoori_chicken+"/-Rupees");
                    bill_tandoori_chicken-=discount_tandoori_chicken;
                    System.out.println("Congrats !!! You got Discount for Tandoori Chicken      : "+discount_tandoori_chicken+"/-Rupees");
                    System.out.println("Eventually Your Amount for Tandoori Chicken With Offer  : "+bill_tandoori_chicken+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 5 ->
            {
                int discount_chicken_eggs,quantity_chicken_eggs; int chicken_eggs=20,offer_chicken_eggs=10,bill_chicken_eggs;
                System.out.println("Quantity of Chicken Eggs : ");
                quantity_chicken_eggs=in.nextInt();
                if(quantity_chicken_eggs==1)
                {
                    bill_chicken_eggs=chicken_eggs;
                    System.out.println("Total Amount of Chicken Eggs : "+bill_chicken_eggs);
                }
                else if(quantity_chicken_eggs>=2)
                {
                    System.out.println("You Entered The Chicken Eggs Quantity Exist         : "+quantity_chicken_eggs +" Items !!!");
                    discount_chicken_eggs=(offer_chicken_eggs/quantity_chicken_eggs)*100;
                    System.out.println("Congrats !!! You got Discount for Chicken Eggs      : "+discount_chicken_eggs+"/-Rupees");
                    bill_chicken_eggs=0;
                    bill_chicken_eggs+=quantity_chicken_eggs*chicken_eggs;
                    System.out.println("Overall Amount for Chicken Eggs Without Offer       : "+bill_chicken_eggs+"/-Rupees");
                    bill_chicken_eggs-=discount_chicken_eggs;
                    System.out.println("Eventually Your Amount for Chicken Eggs With Offer  : "+bill_chicken_eggs+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 6 ->
            {
                int discount_duck_eggs,quantity_duck_eggs; int duck_eggs=20,offer_duck_eggs=10,bill_duck_eggs;
                System.out.println("Quantity of Duck Eggs : ");
                quantity_duck_eggs=in.nextInt();
                if(quantity_duck_eggs==1)
                {
                    bill_duck_eggs=duck_eggs;
                    System.out.println("Total Amount of Duck Eggs : "+bill_duck_eggs);
                }
                else if(quantity_duck_eggs>=2)
                {
                    System.out.println("You Entered The Duck Eggs Quantity Exist         : "+quantity_duck_eggs +" Items !!!");
                    discount_duck_eggs=(offer_duck_eggs/quantity_duck_eggs)*100;
                    System.out.println("Congrats !!! You got Discount for Duck Eggs      : "+discount_duck_eggs+"/-Rupees");
                    bill_duck_eggs=0;
                    bill_duck_eggs+=quantity_duck_eggs*duck_eggs;
                    System.out.println("Overall Amount for Duck Eggs Without Offer       : "+bill_duck_eggs+"/-Rupees");
                    bill_duck_eggs-=discount_duck_eggs;
                    System.out.println("Eventually Your Amount for Duck Eggs With Offer  : "+bill_duck_eggs+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            case 7 ->
            {
                int discount_quail_eggs,quantity_quail_eggs; int quail_eggs=30,offer_quail_eggs=10,bill_quail_eggs;
                System.out.println("Quantity of Quail Eggs : ");
                quantity_quail_eggs=in.nextInt();
                if(quantity_quail_eggs==1)
                {
                    bill_quail_eggs=quail_eggs;
                    System.out.println("Total Amount of Quail Eggs : "+bill_quail_eggs);
                }
                else if(quantity_quail_eggs>=2)
                {
                    System.out.println("You Entered The Quail Eggs Quantity Exist         : "+quantity_quail_eggs +" Items !!!");
                    discount_quail_eggs=(offer_quail_eggs/quantity_quail_eggs)*100;
                    System.out.println("Congrats !!! You got Discount for Quail Eggs      : "+discount_quail_eggs+"/-Rupees");
                    bill_quail_eggs=0;
                    bill_quail_eggs+=quantity_quail_eggs*quail_eggs;
                    System.out.println("Overall Amount for Quail Eggs Without Offer       : "+bill_quail_eggs+"/-Rupees");
                    bill_quail_eggs-=discount_quail_eggs;
                    System.out.println("Eventually Your Amount for Quail Eggs With Offer  : "+bill_quail_eggs+"/-Rupees");
                }
                else
                {
                    System.out.println("Sorry !! , You didn't will Forward Relevant to the Food Items , Please Try Again !!!");
                }
            }
            default ->
            {
                System.out.println("Your Input has Invalid !!!");
                System.exit(0);
            }
        }
    }
}
public class try02_Restaurant_Managements_Systems
{
    private static void online_functionalities()
    {
        Scanner in = new Scanner(System.in);
        int choose,foods,foodc,cal=0,veg,non_veg,i=0,repeated=1;
        System.out.println("If Do you want show the Restaurant of within Offline Entire Functionalities ( Yes=1 or Exit=0 ) : ");
        choose=in.nextInt();
        while(repeated==1)
        {
            if(choose==1)
            {
                System.out.println(" 1.) Food Menus of Functionalities\n 2.) Special Events of Systems");
                System.out.println("Enter 1 or 2 : ");
                foods = in.nextInt();
                switch (foods)
                {
                    case 1 ->
                    {
                        int repeated_menu = 1;
                        while (repeated_menu == 1)
                        {
                            repeated_menu = 1;
                            if (repeated_menu != 0)
                            {
                                System.out.println("Are You Vegetarian or Non-Vegetarian ? ( 1 or 0 ) : ");
                                foodc = in.nextInt();
                                if (foodc == 1)
                                {
                                    int next_veg;
                                    System.out.println("If You Want Continue , Yes=1 or Exit=0 : ");
                                    next_veg = in.nextInt();
                                    if (next_veg != 0)
                                    {
                                        while (next_veg == 1)
                                        {
                                            if (next_veg != 0)
                                            {
                                                System.out.println("These menu for Vegetarians");
                                                Online_Food_Menu obj1 = new Online_Food_Menu();
                                                obj1.veg();
                                                i++;
                                            }
                                            System.out.println("If You want continue , Yes=1 or No=0 : ");
                                            next_veg = in.nextInt();
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Thank You For Joining Us !!!");
                                        System.exit(0);
                                    }
                                }
                                else if (foodc == 0)
                                {
                                    int next_non_veg;
                                    System.out.println("If You Want Continue , Yes=1 or No=0 : ");
                                    next_non_veg = in.nextInt();
                                    if (next_non_veg != 0)
                                    {
                                        while (next_non_veg == 1)
                                        {
                                            if (next_non_veg != 0)
                                            {
                                                System.out.println("These menu for Non-Vegetarians");
                                                Online_Food_Menu obj2 = new Online_Food_Menu();
                                                obj2.non_veg();
                                                i++;
                                            }
                                            System.out.println("If You want continue , Yes=1 or No=0 : ");
                                            next_non_veg = in.nextInt();
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Thank You For Joining Us !!!");
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Your Input has Invalid !!!");
                                    System.out.println("Are You Repeatedly Endeavour Again ? Yes=1 or Exit=0 : ");
                                    repeated_menu = in.nextInt();
                                    if (repeated_menu == 1)
                                    {
                                        System.out.println("You're Endeavours with " + i + "Times Existed !!!");
                                        i++;
                                    }
                                    else if (repeated_menu == 0)
                                    {
                                        System.out.println("Thank You For Joining Us !!!");
                                        System.exit(0);
                                    }
                                    else
                                    {
                                        System.out.println("Thank You For Joining Us !!!");
                                        System.exit(0);
                                    }
                                }
                            }
                            i++;
                        }
                    }
                    case 2 ->
                    {
                        int repeated_events = 1;
                        while (repeated_events == 1)
                        {
                            repeated_events = 1;
                            if (repeated_events != 0)
                            {
                                System.out.println("Special Events");
                                Online_Events obj3 = new Online_Events();
                                obj3.events();
                            }
                            else
                            {
                                System.out.println("Your Input has Invalid !!!");
                                System.out.println("Are You Repeatedly Endeavour Again ? Yes=1 or Exit=0 : ");
                                repeated_events = in.nextInt();
                                if (repeated_events == 1)
                                {
                                    System.out.println("You're Endeavours with " + i + "Times Existed !!!");
                                    i++;
                                }
                                else if (repeated_events == 0)
                                {
                                    System.out.println("Thank You For Joining Us !!!");
                                    System.exit(0);
                                }
                                else
                                {
                                    System.out.println("Thank You For Joining Us !!!");
                                    System.exit(0);
                                }
                            }
                            i++;
                        }
                    }
                    default ->
                    {
                        System.out.println("This Input has Invalid !!!");
                        System.out.println("Thank You For Joining Us !!!");
                        repeated=1;
                    }
                }
            }
            else if(choose==0)
            {
                System.out.println("Thank You For joining Us !!!");
                System.exit(0);
            }
            else
            {
                System.out.println("Thank You For joining Us !!!");
                System.exit(0);
            }
            i++;
        }
    }
    static
    {
        int entry,choose,foods,foodc,cal=0,veg,non_veg,i=0,repeated=1;
        Scanner in = new Scanner(System.in);
        System.out.println("My HeartFelt Welcome to Restaurant Process to You !!!");
        System.out.println("Offline = 1 (or) Online = 0 ");
        entry=in.nextInt();
        if(entry==1)
        {
            System.out.println("Warm Welcome to Codex Restaurant !!! ");
            System.out.println("This is Offline Process !!!");
            System.out.println("If Do you want show the Restaurant of within Online Entire Functionalities ( Yes=1 or Exit=0 ) : ");
            choose=in.nextInt();
            while(repeated==1)
            {
                if(choose==1)
                {
                    System.out.println(" 1.) Food Menus of Functionalities\n 2.) Special Events of Systems");
                    System.out.println("Enter 1 or 2 : ");
                    foods = in.nextInt();
                    switch (foods)
                    {
                        case 1 ->
                        {
                            int repeated_menu = 1;
                            while (repeated_menu == 1)
                            {
                                repeated_menu = 1;
                                if (repeated_menu != 0)
                                {
                                    System.out.println("Are You Vegetarian or Non-Vegetarian ? ( 1 or 0 ) : ");
                                    foodc = in.nextInt();
                                    if (foodc == 1)
                                    {
                                        int next_veg;
                                        System.out.println("If You Want Continue , Yes=1 or Exit=0 : ");
                                        next_veg = in.nextInt();
                                        if (next_veg != 0)
                                        {
                                            while (next_veg == 1)
                                            {
                                                if (next_veg != 0)
                                                {
                                                    System.out.println("These menu for Vegetarians");
                                                    Offline_Food_Menu obj1 = new Offline_Food_Menu();
                                                    veg = obj1.veg(cal);
                                                    System.out.println("The Vegetarian Bill Payment Exist : " + veg + "/-Rupees");
                                                    i++;
                                                }
                                                System.out.println("If You want continue , Yes=1 or No=0 : ");
                                                next_veg = in.nextInt();
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Thank You For Joining Us !!!");
                                            System.exit(0);
                                        }
                                    }
                                    else if (foodc == 0)
                                    {
                                        int next_non_veg;
                                        System.out.println("If You Want Continue , Yes=1 or No=0 : ");
                                        next_non_veg = in.nextInt();
                                        if (next_non_veg != 0)
                                        {
                                            while (next_non_veg == 1)
                                            {
                                                if (next_non_veg != 0)
                                                {
                                                    System.out.println("These menu for Non-Vegetarians");
                                                    Offline_Food_Menu obj2 = new Offline_Food_Menu();
                                                    non_veg = obj2.non_veg(cal);
                                                    System.out.println("The Non_Vegetarian Bill Payment Exist : " + non_veg + "/-Rupees");
                                                    i++;
                                                }
                                                System.out.println("If You want continue , Yes=1 or No=0 : ");
                                                next_non_veg = in.nextInt();
                                            }
                                        }
                                        else
                                        {
                                            System.out.println("Thank You For Joining Us !!!");
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Your Input has Invalid !!!");
                                        System.out.println("Are You Repeatedly Endeavour Again ? Yes=1 or Exit=0 : ");
                                        repeated_menu = in.nextInt();
                                        if (repeated_menu == 1)
                                        {
                                            System.out.println("You're Endeavours with " + i + "Times Existed !!!");
                                            i++;
                                        }
                                        else if (repeated_menu == 0)
                                        {
                                            System.out.println("Thank You For Joining Us !!!");
                                            System.exit(0);
                                        }
                                        else
                                        {
                                            System.out.println("Thank You For Joining Us !!!");
                                            System.exit(0);
                                        }
                                    }
                                }
                                i++;
                            }
                        }
                        case 2 ->
                        {
                            int repeated_events = 1;
                            while (repeated_events == 1)
                            {
                                repeated_events = 1;
                                if (repeated_events != 0)
                                {
                                    System.out.println("Special Events");
                                    Offline_Events obj3 = new Offline_Events();
                                    obj3.events();
                                }
                                else
                                {
                                    System.out.println("Your Input has Invalid !!!");
                                    System.out.println("Are You Repeatedly Endeavour Again ? Yes=1 or Exit=0 : ");
                                    repeated_events = in.nextInt();
                                    if (repeated_events == 1)
                                    {
                                        System.out.println("You're Endeavours with " + i + "Times Existed !!!");
                                        i++;
                                    }
                                    else if (repeated_events == 0)
                                    {
                                        System.out.println("Thank You For Joining Us !!!");
                                        System.exit(0);
                                    }
                                    else
                                    {
                                        System.out.println("Thank You For Joining Us !!!");
                                        System.exit(0);
                                    }
                                }
                                i++;
                            }
                        }
                        default ->
                        {
                            System.out.println("This Input has Invalid !!!");
                            System.out.println("Thank You For Joining Us !!!");
                            repeated=1;
                        }
                    }
                }
                else if(choose==0)
                {
                    System.out.println("Thank You For joining Us !!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Thank You For joining Us !!!");
                    System.exit(0);
                }
                i++;
            }
        }
        else if(entry==0)
        {
            System.out.println("Warm Welcome to Codex Restaurant ");
            System.out.println("This is Online Statements !!!!");
            online_functionalities();
        }
        else
        {
            System.out.println("You're Entered the Wrong way !!!!");
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Thank You For Joining Us !!! ");
        System.exit(0);
    }
}


