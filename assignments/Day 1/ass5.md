
## Assignment 5: Batch Waitlist

**Concepts:** Array, Queue, If-Else

### Question
A batch has 3 seats stored in a String array. Learners join one by one.

1. If a seat is empty, add the learner to that seat.
2. If all seats are full, add the learner to the waitlist queue.
3. When a learner drops out, give their seat to the first person in the waitlist.
4. Print the seats and waitlist after every step.

### Edge Cases
- If someone drops out but the waitlist is empty, make the seat empty.
- If the entered name is not in the batch, print "Name not found in batch".

### Think About – Answer

**1. Why is a queue fair here? What would go wrong if you used a stack?**

- Queue follows FIFO (First In, First Out).
- The learner who joins the waitlist first gets the seat first.
- It gives everyone a fair chance.
- Stack follows LIFO (Last In, First Out).
- It gives the seat to the last learner who joined the waitlist.
- Therefore, a queue is suitable for a waitlist.

### Important Methods
- `add()` – Adds a learner to the queue.
- `poll()` – Removes and returns the first learner.
- `isEmpty()` – Checks whether the queue is empty.
- `Arrays.toString()` – Displays the seats.

