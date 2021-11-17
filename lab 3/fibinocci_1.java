import java.util.*;
public class Main {
static double fibRecurs(double n)
{
if (n <= 1)
return n;
return fibRecurs(n-1) + fibRecurs(n-2);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double fno = sc.nextDouble();
System.out.println("Fibanocci series for "+fno+" is:"+fibRecurs(fno));
}
}
