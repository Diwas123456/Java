import java.util.Scanner;
public class Area {
public float RectangleArea(float l , float b )
{
	return l*b;
}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length and breadth of rectangle ");
	float length = sc.nextFloat();
	float breadth = sc.nextFloat();
	sc.close();
	Area A = new Area();
	System.out.println("Area of rectange is :" + A.RectangleArea(length, breadth));
}
}
