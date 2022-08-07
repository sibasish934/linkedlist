import java.util.Scanner;
import java.lang.Math;
public class WormHole {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the start coordinates:-");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the end coordinates:-");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("wormhole time:-");
        int wornHole = sc.nextInt();
        System.out.println("Enter the intimate point:-");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int result =  getWormHole(x1,y1,x2,y2,x3,y3,wornHole);
        System.out.println(result);
    }

    private static  int getWormHole(int x1, int y1, int x2, int y2, int x3, int y3,int wornHole) {
        int res = Math.abs(x2-x1) + Math.abs(y2-y1);
        int r = Math.abs(x3-x1)+ Math.abs(y3-y1)+wornHole;
        System.out.println(res);
        System.out.println(r);
        return Math.min(res, r);
    }
}
