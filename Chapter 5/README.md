# Methods

They are part of a class, and contain a particuar set of instructions. Usually methods perform a single well-structured task. Once we've written a method we can get it to perform the task within the method, that way we say that the method is being **called**.

The header of a method consists of three core elements:

1. Modifiers
2. The value type that our method shall return
3. The name of the method

As we stated before, a method can be called to perform the code that has inside itself. We call a method by using its name, followed by brackets.

```java
    methodName();
```

## Inputs and Outputs

We can send information to a method and we can also receive information from it. A method can receive information by specifying its **parameters**. Parameters must have a type and a place-holder name defined such as:

```java
    static void methodName(int firstParameter) {
        // Do something with firstParameter
    }
```

Notice our method structure:

1. Modifier: `static`
2. Return value type: `void`
3. Method name: `methodName`

Additionaly we have our parameter, which is specified by its type and its place-holder name:

4. Parameter data-type: `int`
5. Parameter place-holder name: `firstParameter`

## Method Overloading

Same operators can behave differently depending on what it is operating on thus, methods can be overloaded. We can overload a method by simply introducing a new instance of the same method but with different parameters:

*Method 1*
```java
    static void methodNameTwo() {
        // Do something when no parameters are passed into the method
    }
```

*Method 2*
```java
    static void methodNameTwo(int firstParameter) {
        // Do something when an int is passed into the method
    }
```
*Method 3*
```java
    static void methodNameTwo(int firsParameter, char secondParameter) {
        // Do something when an int and a char are passed into the method
    }
```