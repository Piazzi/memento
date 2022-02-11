<div align="center">
  <h1> MEMENTO  </h1>
</div>

# Code

Simple project representing the memento design pattern. This project used the same example from my <a href="https://github.com/Piazzi/state"> state design pattern project </a>

# Definition

Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

![image](https://user-images.githubusercontent.com/40416044/153596653-fda4c1d1-4e5b-4f2d-bddd-142bb2aae210.png)

The memento pattern is implemented with three objects: the originator, a caretaker and a memento. The originator is some object that has an internal state. The caretaker is going to do something to the originator, but wants to be able to undo the change. The caretaker first asks the originator for a memento object. Then it does whatever operation (or sequence of operations) it was going to do. To roll back to the state before the operations, it returns the memento object to the originator. The memento object itself is an opaque object (one which the caretaker cannot, or should not, change). When using this pattern, care should be taken if the originator may change other objects or resources—the memento pattern operates on a single object.

Classic examples of the memento pattern include a pseudorandom number generator (each consumer of the PRNG serves as a caretaker who can initialize the PRNG (the originator) with the same seed (the memento) to produce an identical sequence of pseudorandom numbers) and the state in a finite state machine.

![image](https://user-images.githubusercontent.com/40416044/153596824-a20f4ed5-cc13-4976-adb9-897b01f6c16b.png)

Source: <a href="https://en.wikipedia.org/wiki/Memento_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/memento"> Refactoring Guru </a>
