
public class StringManipulation{
	public static void main(String arg[])
	{
		String greeting = "Hello";
		System.out.println(greeting);
		String txt2 = "ABCDEFGHIJKLMNOPQSTUVWXYZ";
		System.out.println("The length of the txt string is: "+ txt2.length());
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("locate"));
		String firstname = "Jhon";
		String lastname = "Doe";
		System.out.println(firstname.concat(lastname));
		System.out.println(firstname + " " + lastname);
		String x = "10";
		String y = "20";
		String z = x+y;
		System.out.println(z);
		
		String a = "RockStar";
		System.out.println(a.charAt(5));
		System.out.println(a.compareTo("Rockstar"));
		System.out.println(a.compareToIgnoreCase("ROCKSTAR"));
		System.out.println(a.replace("Rock","New"));
	}
}
	