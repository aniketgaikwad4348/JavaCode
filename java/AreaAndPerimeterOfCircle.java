import java.util.Scanner ;
class AreaAndPerimeterOfCircle
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER THE RADUIS OF CIRCLE : " );
  int r = sc.nextInt();
  int pi = 22/7 ;
  int area = pi * r *r ;
  int perimeter = 2 * pi * r ;
  
  System.out.println("AREA OF CIRCLE : " + area);
  System.out.println("PERIMETER OF CIRCLE :" + perimeter);
 }
}
  