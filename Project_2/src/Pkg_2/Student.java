package Pkg_2;

public class Student
{
	public int sum(int a,int b)
	{
	int sum;	
	sum=a+b;
	System.out.println("SUM =" + sum);
	return sum;
    }
	public int sub(int c,int d)
	{
		int sub;
		sub=c-d;
		System.out.println("Sub =" + sub);
		return sub;	
	}
   public int mul(int e,int f)
   {
   int mul;
   mul=e*f;
   System.out.println("mul = " + mul);
   return mul;
   }
   public void div(int g,int h)
   {
	   int div;
	   div=g/h;
	   System.out.println("Result of ((((10+2)-2)+2)*2/2) is " + div);	
   }
   public static void main(String[] args)
   {
 Student answer=new Student();
 int sum=answer.sum(10,2);
 int sub=answer.sub(sum,2);
 int sum1=answer.sum(sub,2);
 int mul=answer.mul(sum1,2);
 answer.div(mul,2);
   }  
}


			   
			   
	   
   
   

