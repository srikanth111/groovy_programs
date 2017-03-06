import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

trait DefaultHandler {
	void on(String message, Map payload){
	println "Received $message with payload $payload"
	//sh.on('executed', 'payload1')
	}
}