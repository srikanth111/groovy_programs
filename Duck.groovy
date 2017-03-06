import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
import java.lang.String.*

trait SpeakingDuck {
	String speak()
}

class Duck implements SpeakingDuck{
	String speak(){
		println 'Speaking'
	}

	String methodMissing(String name){
	"${name.capitalize()}!"
	}
}
	def d = new Duck()
	d.speak()
	//d.methodMissing('srikanth')
	//assert d.speak() == 'Quack!'
	
