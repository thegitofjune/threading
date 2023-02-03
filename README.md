# threading
An example of some threads, their methods and ways to avoid problems that can be encountered when threading

# extends Thread class
not the preferred way but is demoed here


# implements Runnable
this means the class can stil extend another class

# uses join
to make calling thread go into a waiting state until referenced thread terminates

# uses interrupt
A thread can be asked, but not forced to be interuppted

# uses readwrite locks
read locks can be held and used by mutliple threads concurrently, write threads cannot. Locks released in finally block

# uses wait and notify
Simulates a gadget factory a supply chain and consumers of the gadgets. Uses two infinite while loops that hand control to each other depending on the state of the supply chain. Uses wait and notify to communicate between the threads
