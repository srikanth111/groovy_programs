//implementing trait at runtime in class
import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

trait Extra {

String extra() {
	println 'this is extra method'
	}
	
}
