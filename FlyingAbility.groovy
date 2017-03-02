// this is a program which is using concept of traits
import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
trait FlyingAbility{
	 abstract String name()

	 String greeting()
	 {
	 	"Hello,${name()}!"
	 }

}