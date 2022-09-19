import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        // homework №1
        int a = 6;
        int b = 8;
        int r = 5;
        int areaRectangular = a * b;
        double circyle = 3.14 * r * r;
        if (circyle > areaRectangular) {
            System.out.println("the circyle coverd the rectanguler");
        } else
            System.out.println("the circyle can not coverd the rectanguler");


        int a1 = 3;
        int b1 = 4;
        double r1 = 2;
        int areaRectangular1 = a1 * b1;
        double circyle1 = 3.14 * r1 * r1;
        if (circyle1 > areaRectangular1) {
            System.out.println("the circyle coverd the rectanguler");
        } else
            System.out.println("the circyle can not coverd the rectanguler");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // homework №2
        Scanner scanner = new Scanner(System.in);
        System.out.println(" inter first date 15/3/2000");
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        d1++;
        System.out.println(d1 + " " + m1 + " " + y1);

        System.out.println(" inter second date 31/12/1999");
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        d2++;
        m2++;
        y2++;
        if (d2 >= 32) {
            d2 = 1;
        }
        if (m2 >= 13) {
            m2 = 1;
        }
        System.out.println(d2 + " " + m2 + " " + y2);

        System.out.println(" inter third date 31/5/2000");
        int d3 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        d3++;
        m3++;
        y3 -= 2;
        if (d3 >= 32) {
            d3 = 1;
        }
        System.out.println(d3 + " " + m3 + " " + y3);


        System.out.println(" inter fourth date 28/2/2000");

        int d4 = scanner.nextInt();
        int m4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        d4++;
        System.out.println(d4 + " " + m4 + " " + y4);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// home work №3
        int second0 = (int) (Math.random() * 28800 + 1);

        if (second0 >= 23466) {
            System.out.println(" remained 6 hours ");
        } else if (second0 >= 10644) {
            System.out.println(" remained 2 hours ");
        } else if (second0 >= 5891) {
            System.out.println(" remained 1 hours ");
        } else if (second0 >= 1249) {
            System.out.println(" remained less than 1 hours ");
        } else
            System.out.println(" work day is finsh");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //homework №4
        System.out.println("inter Second 3661");
        Scanner scanner1 = new Scanner(System.in);
        int x1 = scanner1.nextInt();
        int hour1 = x1 / 3600;
        int min1 = (x1 % 3600) / 60;
        int second1 = ((x1 % 3600) % 60) ;
        System.out.println(hour1 + " hour  " + min1 + " mints  " + " " + second1 + " seconds");



        System.out.println("inter Second 1249");
        int x2 = scanner1.nextInt();
        int min2 = x2 /60;
        int second2 = x2 %60;
        System.out.println( min2 + " mints  " +" "+ second2 +" seconds");


        System.out.println("inter Second 7200");
        int x3 = scanner1.nextInt();
        int hour3 = x3 /3600 ;
        System.out.println( hour3 +" hours");


        System.out.println("inter Second 648958");
        int x4 = scanner1.nextInt();
        int hour4 = x4 / 3600;
        int min4 = (x4%3600)/60;
        int second4 = (x4%3600)%60;
        System.out.println( hour4 +" hours  "+ min4 +" mintes  "+ second4 +" seconds");


        System.out.println("inter Second 2258521");
        int x5 = scanner1.nextInt();
       int hour5 = x5 / 3600;
       int mint5 = (x5%3600)/60;
       int second5 = (x5%3600)%60;
        System.out.println( hour5 +" hours  "+ mint5 +" mintes  "+ second5 +" seconds");


        System.out.println("inter Second 648958");
        int x6 = scanner1.nextInt() ;
        int week6 = x6/(7*24*60*60);
        int hour6 = ((x6%(7*24*60*60))%(24*60*60))/3600;
        int min6 =  (((x6%(7*24*60*60))%(24*60*60))%3600)/60;
        int second6 = (((x6%(7*24*60*60))%(24*60*60))%3600)%60;
        System.out.println( week6 +" week "+ hour6 +" hours  "+ min6+" mintes  "+ second6+" seconds");




        System.out.println("inter Second 2258521");
        int x7 = scanner1.nextInt();
        int week7 = x7 /(7*24*60*60);
        int day7 = (x7 %(7*24*60*60))/(24*60*60);
        int hour7 = ((x7 %(7*24*60*60))%(24*60*60))/(3600);
        int min7 = (((x7 %(7*24*60*60))%(24*60*60))%(3600))/60;
        int second7 = (((x7 %(7*24*60*60))%(24*60*60))%(3600))%60;
        System.out.println(week7+" week  "+ day7 +" day  "+ hour7+" hour  "+min7+" mintes  "+ second7+ " second");



// homework №4 ( general program for seconds )
        for (int i = 1; i < 8; i++) {
            System.out.println(i+". "+"inter amount of Seconds ");
            Scanner scanner2 = new Scanner(System.in);
            int x8 = scanner2.nextInt();
            int week8 = x8 /(7*24*60*60);
            int day8 = (x8 %(7*24*60*60))/(24*60*60);
            int hour8 = ((x8 %(7*24*60*60))%(24*60*60))/(3600);
            int min8 = (((x8 %(7*24*60*60))%(24*60*60))%(3600))/60;
            int second8 = (((x8 %(7*24*60*60))%(24*60*60))%(3600))%60;
            if (x8 <(7*24*60*60)){
                week8 =0;
                if (x8<(24*60*60)) {
                    day8 = 0;
                }
                    if (x8<3600){
                        hour8=0;
                    }
                    if (x8<60){
                        min8=0;
                }
            }
            System.out.println(week8+" week  "+ day8 +" day  "+ hour8+" hour  "+min8+" mintes  "+ second8+ " second");

        }





    }
}
