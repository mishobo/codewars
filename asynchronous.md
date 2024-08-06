# What is asynchronous programming?
- Asynchronous programming was devised to accommodate for the lag between when a function is called to when the value of that function is returned.
- Asynchronous programming in Java allows you to execute the tasks concurrently improving the overall performance and responsiveness of your applications.
- Asynchronous programming involves executing tasks concurrently without blocking the calling thread.
- Instead of spawning multiple threads, asynchronous operations utilize non-blocking I/O and event-driven mechanisms to handle tasks asynchronously, 
  allowing the program to continue execution while waiting for I/O or other operations to complete.
- Asynchronous programming is well-suited for handling I/O-bound operations, such as network requests, file I/O, and database queries.

# Multithreading in Java
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. 
Each part of such program is called a thread. So, threads are light-weight processes within a process.

Threads can be created by using two mechanisms :
1. Extending the Thread class
2. Implementing the Runnable Interface

- Common use cases for multi-threading include parallelizing computational tasks, managing user interfaces, and handling concurrent I/O operations.

# Use Case Comparison:
- Multi-Threading: Ideal for CPU-bound tasks that can be parallelized, such as image processing, video encoding, or mathematical computations, 
  as well as scenarios requiring responsive user interfaces.
- Asynchronous Programming: Well-suited for handling I/O-bound operations, such as network communication, file I/O, and database access, 
  where non-blocking execution and scalability are essential.

* Resources used:-
1. Multi-Threading Vs Asynchronous by Sundar Govindarajan PMP®, MCSA, MCP, MCSE(Cloud), MCSD, MS(Azure)
   Sundar Govindarajan PMP®, MCSA, MCP, MCSE(Cloud), MCSD, MS(Azure)
   https://www.linkedin.com/pulse/multi-threading-vs-asynchronous-sundar-govindarajan-dlbnc/