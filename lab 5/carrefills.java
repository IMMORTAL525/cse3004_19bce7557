import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
    static int compute_refills(int dist,int tank,int stops[],int n){
        int current_refills=0;
        int num_refills=0;
        int last_refill=0;
        while(current_refills<=n) {
            last_refill = current_refills;
            while ((current_refills <= n) && (stops[current_refills + 1] - stops[last_refill]) <= tank) {
                current_refills = current_refills + 1;
            }
 
            if (current_refills == last_refill)
                return -1;
            if (current_refills <= n)
                num_refills = num_refills + 1;
        }
        return num_refills;
    }
   
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n+2];
        stops[0] = 0;
        stops[n+1] = dist;
        int sum=0;
        for (int i = 1; i <= n; i++) {
            stops[i] = scanner.nextInt();
            sum=sum+stops[i];
        }
 
        int x=(compute_refills(dist,tank,stops,n));
        if((compute_refills(dist,tank,stops,n)==-1))
        {
            System.out.println("Not possible to reach destination");
            System.exit(0);
        }
        int y = dist-stops[n];
        System.out.println("Remaining Distance we can travel : " +y);
       
        if(y==sum)
        {
            System.out.println("Round trip is possible");
        }
        else{
            System.out.println("Round trip is not possible");
        }
        }
       
}
