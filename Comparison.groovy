import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Comparison
{
	String s1 = 'madam'  
	String s2 = 'madam'
	String s3
	void display()
	{
	if(s1==s3)
	{
	println 'both the strings are equal'
	
	}
	else{
	println 'both the strings are not equal'
	}

	}

	void display2()
	{
		if(s1.is(s2))
		{
			println 'both the strings are equal'
			println "my name is:$s1"
		}
		else{
			println 'both the strings are not equal'
		}
	}

	void display3()
	{
		if (s1.equals(s2))
		{
			println 'both the strings are equal'
		}
		else{
			println 'both the strings are not equal'
		}
	}

	static void main(String[] args)
	{
	def obj1 = new Comparison()
		obj1.s3 = 'LoremIpsum'
		obj1.display()
		obj1.display2()
		obj1.display3()

	}
}