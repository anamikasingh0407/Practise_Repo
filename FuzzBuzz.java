class FuzzBuzz{
public static void main(String args[]){
for(int i=1;i<=100;i++)
{
if (i%3==0 && i%5==0)
{
System.out.println("Fizz Buzz");
}
elseif (i%3 ==0)
{
System.out.println("Fizz");
}
elseif (i%5 ==0)
{
System.out.println("Buzz");
}
else
{
System.out.println("i");
}
}
}