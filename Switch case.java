public class Switch case {
public  static void main(String [] args)
{
int choice ;
System.out.println(" pick one: 1.Hi\t 2.hey\t 3.Hello\t");
Scanner s= new scanner (system.in);
chioce=s.nextInt();
switch (choice)
{
case 1:system.out.println ("you said hi");
break;
case 2:system.out.println ("you said hey");
break;
case 3:system.out.println ("you said hello");
break;
default:system.out.println ("invalid choice.");
}
}
}