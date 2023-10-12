# RabbitMQ
RabbitMQ

	- Producer: Application that sends the messages.
	- Consumer: Application that receives the messages.
	- Queue: Buffer that stores messages.</p>
	- Message: Information that is sent from the producer to a consumer through RabbitMQ.
	- Connection: A TCP connection between your application and the RabbitMQ broker.
	- Channel: A virtual connection inside a connection. When publishing or consuming messages from a queue - it's all done over a channel.
	- Exchange: Receives messages from producers and pushes them to queues depending on rules defined by the exchange type. To receive messages, a queue needs to be bound to at least one exchange.
	- Binding: A binding is a link between a queue and an exchange.
	- Routing key: A key that the exchange looks at to decide how to route the message to queues. 
		Think of the routing key like an address for the message.
	  - The routing key must be a list of words, delimited by a period (.)
<p> The queue is the place where messages are stored until they are consumed by the consumer, or in other ways removed from the queue.

 

## Let’s follow the life-cycle for an exchange:
- The client asks the server to make sure the exchange exists (Declare). The exchange is created if it does not already exist.
- The client publishes messages to the exchange.
- The client may choose to delete the exchange (Delete)
