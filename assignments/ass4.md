
## Assignment 4: Enrollment Undo

**Concepts:** Stack, Switch, If-Else

### Question
Show a menu in a loop with the following options:

1. Enroll learner
2. Undo last enrollment
3. Show last enrollment
4. Exit

- Enroll pushes the learner's name onto a stack.
- Undo pops the last name and prints `Undone: <name>`.
- Show uses peek to display the last enrolled name without removing it.

### Edge Cases
- If undo or show is selected when the stack is empty, print "Nothing to undo".
- If an invalid menu choice is entered, print "Invalid choice" using the default case.

### Think About – Answer

**1. Why is a stack the right choice for undo? Why not a queue?**

- Stack follows LIFO (Last In, First Out).
- The last enrolled learner is removed first.
- Queue follows FIFO (First In, First Out).
- A queue removes the first enrolled learner instead of the last one.
- Therefore, a stack is suitable for undo operations.

### Important Methods
- `push()` – Adds a learner's name.
- `pop()` – Removes the last enrolled name.
- `peek()` – Displays the last enrolled name without removing it.
- `isEmpty()` – Checks whether the stack is empty.

