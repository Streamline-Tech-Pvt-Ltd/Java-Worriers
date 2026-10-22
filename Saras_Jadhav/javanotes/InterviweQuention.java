1)What is Java? What are its main features?
ans:-Java is a high-level, object-oriented programming language used to develop web applications, mobile applications,etc.

 * Main Features of Java
1)Simple: Java is easy to learn and understand.
2)Object-Oriented: Java uses classes and objects.
3)Platform Independent: Java programs can run on different operating systems using the JVM.
4)Multithreaded: Java can perform multiple tasks at the same time.
5)Secure: Java provides security features to protect programs.

2)Why is Java called platform-independent?
ans:-Java is called platform-independent because a Java program can run on different operating systems like Windows, Linux, and macOS without changing the source code.

3)What is the difference between JDK, JRE, and JVM?
ans:-JDK (Java Development Kit): Used to develop and compile Java programs.
     JRE (Java Runtime Environment): Provides the environment to run Java programs.
     JVM (Java Virtual Machine): Executes Java bytecode.

4)How does a Java program execute internally?
ans:- 1)Write: Write the Java program.
      2)Compile: The Java compiler converts source code into bytecode.
      3)Bytecode: The bytecode is stored in a .class file.
      4)Execute:
      5)Output: display the output

5)What is bytecode in Java?
Ans:- Byte Code is the intermediate code , machine independent code generate by the java compiler when compile the java source code .

6) What is the difference between compiled and interpreted languages?
ans:-*Compiled Language:=
      1)The whole program is translated before execution.
      2)Generally, execution is faster.
      3)Errors are reported during compilation.
      4)ex:C, C++

    *Interpreted Language
     1)The code is executed through an interpreter.
     2)Generally, execution is slower.
     3)Errors may appear during execution.
     5)Example: Python, JavaScript

7)What are the primitive data types in Java?
ans:=Primitive data types are the basic data types in Java used to store simple values.
     ex=
           byte= Stores small integers
           short= Stores short integers
           int=	Stores integers
           long= Stores large integers
           float= Stores decimal numbers
           double= Stores decimal numbers with more precision
           char= Stores a single character
           boolean= Stores true or false

8)What is the difference between primitive and non-primitive data types?
ans:-
      Primitive                                                  Non Primitive
1 Store the actual value                                   store reference memory
2.predefined                                               user defined
3 fixed size                                               Variable size depend
Examples: int, char, boolean, double	                   Examples: String, arrays, classes

9)What are variables in Java, and what are their types?
ans:-A variable in Java is a name given to a memory location used to store data.
    *Types:=
     1. Local Variable
     2. Instance Variable
     3. Static Variable

10)What is the difference between local, instance, and static variables? 
ans:=Local Variable	                                    Instance Variable             	       Static Variable
     1)Declared inside a block.         	Declared inside a class but outside methods.	  Declared inside a class using the static keyword.
     2)Used only within that method 	                Belongs to an object.	                          Shared by all objects of the class
          or block
     3)Created when the method or block         Exists as part of an object.                       Associated with the class.
          executes.
     Example: int age = 20;                       Example: int salary = 25000;                     Example: static String name = "sai";


11)What are the different types of operators in Java?
ans:=Operators in Java are symbols used to perform operations on variables and values.
    1)Arithmetic= |+| _| % | * |
    2)Relational | ==, !=, >, <, >=, <= | a > b |
    3)Logical | &&, ||, ! | a > 5 && b < 10 |
    4)Assignment | =, +=, -=, *=, /= | a += 5 |
    5)Unary | ++, --, !, - | a++ |
    6)Bitwise | &, |, ^, ~ | a & b |
    7)Ternary | ? : | a > b ? a : b |

12)What is the difference between == and .equals()?
ans:=          ==	                                              .equals()
       
            It is an operator.	                                It is a method.
           Compares object references.                         	Compares object contents (if overridden).
           Example: a == b	                                        Example: a.equals(b)


13)What is the difference between && and &?
ans:=       &                                                                      &&
      1 . Logical Operators                                                   Bit Wise Operators
      2 One condition is true its true                               Both condition is true return true

14)What is the difference between break, continue, and return?
ans:=break = Stops the loop.
    continue = Skip the current iteration.
    return = Exit the method.


15)What is the difference between if-else and switch?
ans:=          if-else	                                   switch
          1.Checks conditions.	                       Checks a value against multiple cases.
	  2. Supports conditions like >, <, and ==.	Uses case labels to match values.
          3.Best for complex conditions.	            Best for multiple fixed choices.
          4.Uses if, else if, and else.	                Uses switch, case, and default.

16)What are loops in Java? Explain for, while, and do-while.
ans:=Loops in Java are used to execute a block of code repeatedly until a condition is satisfied.

     1. for Loop
        Used when the number of repetitions is known.
     ex=    for (int i = 1; i <= 5; i++) {
           System.out.println(i);
            }

    2. while Loop
        Checks the condition before executing the code.
	ex:=
        int i = 1;
	while (i <= 5) {
    	System.out.println(i);
    	i++;
	}

   3. do-while Loop
       the condition is checked after execution.
        ex=
	int i = 1;
	do {
   	 System.out.println(i);
    	i++;
	} while (i <= 5);

17)What is an array in Java?
ans+An array in Java is a collection of elements of the same data type stored under a single variable name.


18)What is the difference between a one-dimensional and a multidimensional array?
ans=          One-Dimensional Array	                       Multidimensional Array
	Stores data in a single row or list.	      Stores data in rows and columns or multiple dimensions.
	Uses one index.	                              Uses two or more indices.
	Example: int[] a = {10, 20, 30};	     Example: int[][] a = {{10, 20}, {30, 40}};

19)Can we change the size of an array after creating it?
ans:=No array is fixed sized

20)What is the difference between an array and an ArrayList?
ans:=                   Array	                    			 ArrayList
		1.Size is fixed.					Size can dynamically.
		2.Can store primitive values .		         Stores objects 
		3.Uses length to get size.			Uses size() to get the number of elements.
		4.Can be faster for simple operations.		Provides built-in methods to add and remove elements.
