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
	 obj.methodA();
	 obj.callInnerMethod();
	 }
}