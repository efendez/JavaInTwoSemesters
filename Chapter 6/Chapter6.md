## Arrays
---
An array is a collection of items that holds information of a desired type. You can not "mix" data types, an integer array may only hold integer values, a char array may only hold character values, and so on and so forth.
 
Any declared array must allocate a certain ammount of space in memory. This translates to specifying the maximum number of elements an array should contain.

To use an array we need two things, a declaration and memory allocation.

```java
    type[] arrayName;
    arrayName = new type[length];
```
These two elements can be combined into a single line expression:

```java
    type[] arrayName = new type[length];
```
Array elements can be accessed through indexing. Java arrays start at index 0.
 
If the elements of an array are known beforehand, then we can create an array with these initial values. The array length is infered by how many elments are specified in the sigle line expression. They are placed in braces and separated by commas:

```java
    type[] arrayName = {"1-element", "2-element", "...", "nth-element"};
    // arrayName has n elements and its last index is n - 1
```
To asign and retrieve information of an array we must access those elements exclusively through indexing.

```java
    System.out.println(arrayName[0]);
    // 1-element

    arrayName[2] = "3-element";
```

We can access array items dynamicly using a loop.

We can use send arrays as parameters, but there's a catch. We've seen that when we sent a value as a parameter, we were actually sending a copy of that variable, as for arrays it works a little different. When sending an array as a parameter we are not sending a copy of such, we are sending a pointer to the arrays allocated memory.

### Varargs

Varargs is a way of writing functions / methods that can "accept" arrays or any variable of the same type as the same parameter. The varargs argument must come last in the parameter list.

```java
    static type funcName(type... variableName) {
        return type;
    }
```

We can also create methods that return an array value.
  
For each loops are used to access the entirety of an array and if we wish to read the elements in the array, but not modify them. While using for each loops we do not need array indexes to access elements of a desired array.
 
### Multi-dimensional arrays / Two dimensional arrays

```java
    type[][] arrayName = new type[length][lengt]
 
    type[][] arrayName = {
                            {(row-0 col-0), (row-0 col-1), (...)},
                            {(row-1 col-0), (row-1 col-1), (...)},
                            ...
                        }
```
We will often need multi-dimensional arrays of different inner lengths. These type of arrays are called ragged arrays since they are partitioned" as how their inner lengths behave.

## Exercises
---

