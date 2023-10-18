import java.util.*;
class Buffer
{
	public static void main(String args[])
	{
		StringBuffer name=new StringBuffer("Anjali");
		System.out.println("StringBuffer="+name);
		name.delete(2,3);
		System.out.println("After deleting the StringBuffer is"+name);
	}
}