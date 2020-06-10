# Iteration

We can define iteration as the form of a program control that allows us to instruct the computer to carry out a task several times by repeating a section of code. This is why it's also refered as a form of **repetition**. The programming structure that reflects this behaviour is called a **loop**.

## The for Loop

Knowing how many times - a fixed number of times - we need repeat an action can be achieved by a _for_ loop.

A for loop consists of three main components.

The first component corresponds to a counter variable. This variable keeps track of the actual "counter" for the repetition cycle. It is usually stated as an `integer` named `i` as a convention, but it can have any other name that you'd like.

The second component states a comparison between the counter variable and the "limit" of our for loop. It returns a boolean so we have to compare our counter with greater and less than or equal cases.

Finally we have the "step" of our for loop. This final component modifies our counter variable by a step specified by us.

The code bellow integrates the three components in a simple for loop with a number X of repetitions:

```java
    for (int i = 0; i <= X; i++) {
        // Execute this part of the code
    }
```

## The while Loop

When we are not sure about the number of times we need to execute our code we need to use a _while_ loop.

The while loop consists of a comparison that, when `true`, allows the code to run exactly once. If such comparisson evaluates to a `false` stetement, the loop won't allow another cycle.

The code bellow exemplifies the structure of a while loop:

```java
    while (condition == true) {
        // Execute this part of the code
    }
```