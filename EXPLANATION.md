# Explanation of Java Concepts Used

## 1. Scanner Class
The `Scanner` class is used to take input from the user through the keyboard.

```java
Scanner sc = new Scanner(System.in);
```

Methods used:
- `nextDouble()` – Reads a decimal (double) value.
- `next()` – Reads a single word.
- `charAt(0)` – Gets the first character of the entered string.

Example:
```java
double num1 = sc.nextDouble();
char operation = sc.next().charAt(0);
```

---

## 2. Variables
Variables are used to store data in memory.

Example:
```java
double num1;
double num2;
char operation;
```

- `double` stores decimal numbers.
- `char` stores a single character such as `+`, `-`, `*`, or `/`.

---

## 3. User Input
The program asks the user to enter:
1. First number
2. Second number
3. Arithmetic operator

Example:
```java
System.out.print("Enter the first number: ");
double num1 = sc.nextDouble();
```

---

## 4. Switch Statement
The `switch` statement selects which arithmetic operation to perform based on the operator entered by the user.

Example:
```java
switch(operation) {
    case '+':
        System.out.println(num1 + num2);
        break;
}
```

Supported operations:
- `+` Addition
- `-` Subtraction
- `*` Multiplication
- `/` Division

---

## 5. Arithmetic Operators

The program uses Java arithmetic operators.

| Operator | Operation |
|----------|-----------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |

Example:
```java
num1 + num2
num1 - num2
num1 * num2
num1 / num2
```

---

## 6. If-Else Statement
An `if-else` statement checks whether the second number is zero before performing division.

Example:
```java
if (num2 == 0) {
    System.out.println("Error: Division by zero is not allowed.");
} else {
    System.out.println(num1 / num2);
}
```

This prevents the program from attempting an invalid division.

---

## 7. Error Handling
The program handles one common runtime error:

### Division by Zero
If the user enters `0` as the second number while performing division, the program displays an error message instead of performing the calculation.

Example Output:
```
Error: Division by zero is not allowed.
```

---

## 8. Output Statements
The `System.out.print()` and `System.out.println()` methods are used to display messages and results.

Example:
```java
System.out.println("Result = " + (num1 + num2));
```

---

## 9. Closing the Scanner
After all inputs are read, the Scanner object is closed to free system resources.

```java
sc.close();
```

---

# Program Flow

1. Start the program.
2. Read the first number.
3. Read the second number.
4. Read the arithmetic operator.
5. Use a `switch` statement to determine the operation.
6. Check for division by zero before dividing.
7. Display the result or an appropriate error message.
8. Close the Scanner.
9. End the program.

---

# Java Concepts Covered

- Scanner Class
- Variables
- User Input
- Data Types (`double`, `char`)
- Arithmetic Operators
- Switch Statement
- If-Else Statement
- Error Handling
- Output Statements
- Resource Management (`sc.close()`)
