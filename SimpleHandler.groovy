import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*
class SimpleHandler implements DefaultHandler, MessageHandler
{
	//String message
	//String payload
	void on(String message, Map payload)
	{
	println "seeing $message with payload $payload"
	super.on(message,payload)
	}
	static void main(String[] args)
	{
	def sh =new SimpleHandler()
		sh.on('test logging', [:])

	}
}