import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
trait Greetable1 implements NamedTrait {
	String greeting(){ "Hello, ${name}!"}
}

