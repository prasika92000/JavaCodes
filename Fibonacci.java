public class Fibonacci{
public static void main(String[] args)
{
int i,c=0;
int n=100;
int a=0;
int b=1;
System.out.println("Fibonacci series upto "+n+" is :");
while(c<=n){
	System.out.print(c+" ");
	a=b;
	b=c;
	c=a+b;
	}
	}
	}