import java.util.Scanner;
public class Calculator {
float num1,num2;
Calculator(float num1 , float num2)
{
this.num1 = num1;
this.num2 = num2;
}
float add()
{
	return num1+num2;
}
float sub()
{
return num1-num2;	
}

float mul()
{
	return num1*num2;
}
float div()
{
	return num1/num2;
}

public static void main(String args []) {
	float x , y ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number");
x= sc.nextFloat();
y= sc.nextFloat();
sc.close();
Calculator cal = new Calculator(x,y);
System.out.println("Addition" + cal.add());
System.out.println("Subtraction" + cal.sub());
System.out.println("Multipication" + cal.mul());
System.out.println("Division" + cal.div());
}
}
