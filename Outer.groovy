//Using inner classes we can increase encapustion by hiding the inner class methods from other classes.
import org.codehaus.groovy.runtime.InvokerHelper
 import java.lang.*
 class Outer{
 		private String privatestr='srikanth'

 		def callInnerMethod(){
 			new Inner().methodA()
 		}
 		class Inner {
 			def methodA(){
 				println "${privatestr}"
 			}
 		}


	 static void main(String[] args)
	 {
	 def obj = new Outer()
	 //def obj2 = new Inner()
	 //obj.methodA();
	 obj.callInnerMethod()

	 }
}