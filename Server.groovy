//initializing the default construction when creating the object.
//by using with() method for default constructor
import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class Server {
	String name
	String status
	int sessionCount
	void display()
	{
	println "$name"
	println "$status"
	println "$sessionCount"
	}
	
	static void main(String[] args)
	{
		def server = new Server()
		//server.name = "act"
		//def server = new Server(name:"ActFibernet")
		server.with(){
			name = "FiberNet"
			status = "connected"
			sessionCount = 3
		}
		server.display()
	}
}

