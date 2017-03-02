import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class GreetingMachine implements GreeterTrait {
//static void main(String[] args)
//{
def g =new GreetingMachine()
assert g.greet() == "Hello from a private method!"
g.greet()
try {
	assert g.greetingMessage()
}catch(MissingMethodException e){
	println "greetingMessage is private in trait"
}

//}
}

//By using trait only public and private methods are supported...
//Neither protected nor package private is not supported.