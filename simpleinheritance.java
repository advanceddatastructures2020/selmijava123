class A
{
int i,j;
void showij()
{
System.out.print("i= "+i+ ""+" j = " +j);
}
}
class B extends A
{
int k;
void showk()
{
System.out.print("k= " + k+"\n");
}
void sum()
{
System.out.println("i+j+k=" + (i+j+k));
}
}

class SimpleInheritance
{
public static void main(String args[])
{
A superOb=new A();
B subOb=new B();
superOb.i=10;
superOb.j=20;
System.out.println("contents of superOb:\n");
superOb.showij();

subOb.i=2;
subOb.j=3;
subOb.k=4;
System.out.println("\ncontents of subOb:\n");
subOb.showij();
subOb.showk();
System.out.println("i+ j+ k in subOb:");
subOb.sum();
}
}