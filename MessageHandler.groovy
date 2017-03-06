//implementing chaining behaviour in groovy

import org.codehaus.groovy.runtime.InvokerHelper
import java.lang.*

interface MessageHandler {
	void on(String message, Map payload)
}