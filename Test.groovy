import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Test {
	static void main(String[] args)
	{
		def pattern = ~/fo*/
		println 'Hello Groovy'
		def a = 4
		def b = 2
		if(a%b==0)
		{
			println 'a is an even number'
		}
		else
		{
			println 'a is an odd number'
		}

	assert 'f' ==~ pattern
	}
}
