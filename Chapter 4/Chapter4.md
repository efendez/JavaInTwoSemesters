# Iteration

We can define iteration as the form of a program control that allows us to instruct the computer to carry out a task several times by repeating a section of code. This is why it's also refered as a form of **repetition**. The programming structure that reflects this behaviour is called a **loop**.

## The for Loop

Knowing how many times - a fixed number of times - we need to repeat an action can be achieved by a _for_ loop.

A for loop consists of three main components.

The first component corresponds to a counter variable. This variable keeps track of the actual "counter" for the repetition cycle. It is usually stated as an `integer` named `i` as a convention, but it can have any other name that you'd like.

The second component states comparison between the counter variable and the "limit" of our for loop. It returns a boolean so we have to compare our counter with greater and less than or equal cases.

Finally, we have the "step" of our for loop. This final component modifies our counter variable by a step specified by us.

The code below integrates the three components in a simple for loop with a number X of repetitions:

```java
    for (int i = 0; i <= X; i++) {
        // Execute this part of the code
    }
```

## The while Loop

When we are not sure about the number of times we need to execute our code we need to use a _while_ loop.

The while loop consists of a comparison that, when `true`, allows the code to run exactly once. If such comparisson evaluates to a `false` stetement, the loop won't allow another cycle.

The code below exemplifies the structure of a while loop:

```java
    while (condition == true) {
        // Execute this part of the code
    }
```

## The do-while Loop

This kind of loop is quite similar to the `while` loop, but with a twist. The comparison is done at the **end** of the cycle rather than at the beginning.

This simple change allows the code to run _at least_ one time. The code below shows how to state a `do-while` loop:

```java
    do {
        // Execute this part of the code
    } while (condition == true);
```
