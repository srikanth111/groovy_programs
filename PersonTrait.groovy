import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class PersonTrait implements Greetable1 {
	String name(){
	'Bob'
	}
	static void main(String[] args){
	def p =new PersonTrait()
	p.name()
}
}