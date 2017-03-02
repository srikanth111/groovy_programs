import java.lang.*
import org.codehaus.groovy.runtime.InvokerHelper
class Bird implements FlyingAbility{
	public String name(){
		'Bob'
	}
	
	static void main(String[] args)
	{
	def b = new Bird()
	//assert b.fly() == 'i am flying'
	assert b.name() == 'Hello, Bob!'
	}
}