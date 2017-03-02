import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
trait GreeterTrait {
	private String greetingMessage(){
	'Hello from a private method'
	}
	String greet(){
	def m = greetingMessage()
	println m
	m
	}
}