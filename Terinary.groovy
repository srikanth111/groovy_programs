import org.codehaus.groovy.runtime.InvokerHelper
import java.lan.*
class Terinary{
	static void main(String[] args)
	{
	int a = 10
	int b = 2
	def result = (a>b)? (a>b) :'false'// using elvis operator we are finding conditon 
	println result
	}
}