21)What is object-oriented programming (OOP)?
ans:=Object-Oriented Programming is a programming approach based on classes and objects. It helps us write reusable, organized, and easy-to-maintain code.


22)What is a class, and what is an object?
ans:=class:=  A class is a blueprint or template used to create objects. It contains variables and methods.
     object:= An object is an instance of a class. It has its own data and can use the methods defined in the class.

23)What are the four pillars of OOP?
ans:=1. Encapsulation
Wrapping data (variables) and methods into a single unit called a class.

2. Inheritance
One class can acquire the properties and methods of another class.

3. Polymorphism
One method or interface can have different forms.

4. Abstraction
Hiding implementation details and showing only essential information.

24)What is encapsulation? Give a real-world example.
ans:=Encapsulation is an OOP concept that combines data (variables) and methods into a single unit called a class. It also protects data by restricting                      	direct access using access modifiers like private.
	Real-world example: ATM machine
	An ATM protects your bank account details. You can withdraw money using the ATM options, but you cannot directly access or change the bank's 	internal data.

25)What is inheritance in Java?
ans:=Inheritance in Java: Inheritance means one class can use the properties and methods of another class. It helps to reuse code.

26)What are the different types of inheritance?
ans:=  1. Single Inheritance: One child class inherits from one parent class.
       2. Multilevel Inheritance: A class inherits from a child class, forming a chain.
       3. Hierarchical Inheritance: Multiple child classes inherit from one parent class.
       4. Multiple Inheritance: One child class inherits from multiple parent classes. Java supports this through interfaces, not through classes.
       5. Hybrid Inheritance: A combination of two or more types of inheritance. Java can support it using interfaces.

27)Why does Java not support multiple inheritance through classes?
ans:=Java does not support multiple inheritance through classes because it creates confusion when two parent classes have the same method.

28)What is polymorphism?
ans:=Polymorphism in Java: Polymorphism means one thing having many forms.

      Example: The same method name can perform different tasks.

29)What is the difference between compile-time and runtime polymorphism?
ans:=      Compile-Time Polymorphism	              Runtime Polymorphism
	1. Method overloading.	                 1. Method overriding.
	2. Decided at compile time.		2. Decided at runtime.
	3. Inheritance is not required.		3. Inheritance is generally required.
	4. Same method, different parameters.	4. Same method, same parameters.


30)What is method overloading?
ans:=Method Overloading: Defining multiple methods with the same name but different parameters in a class.


31)What is method overriding?
ans:=Method Overriding: When a child class has the same method as its parent class, it is called method overriding.

32)What is abstraction in Java?
ans:=Abstraction: Hiding internal details and showing only important features.

	Ex: We drive a car without knowing how its engine works.

33)What is the difference between an abstract class and an interface?
ans:=     Abstract Class			     		 Interface
	1. Uses abstract keyword.	         	 1. Uses interface keyword.
	2. Uses extends keyword.			2. Uses implements keyword.
	3. Can have abstract and normal methods.	3. Can have abstract and default methods.
	4. A class can extend only one class.		4. A class can implement multiple interfaces.

34)What is the difference between this and super?
ans:=            this                                                    	super
          1. Refers to the current class object.	               1. Refers to the parent class.
          2. Accesses current class variables and methods.	       2. Accesses parent class variables and methods.
          3. Used with this() to call the current class constructor.	3. Used with super() to call the parent class constructor.

35)What is the difference between association, aggregation, and composition?
ans:=            Association	                             Aggregation	                              Composition
           1. General relationship between objects.	1. Weak relationship.	                         1. Strong relationship.
           2. Objects can exist independently.   	2. Both objects can exist independently.	 2. Child depends on parent for its lifecycle.
           3. Example: Teacher and Student.	        3. Example: Department and Teacher.	         3. Example: House and Room.

36)What is a constructor in Java?
ans:=A constructor is a special method used to initialize an object. It has the same name as the class and has no return type.

37)What are the different types of constructors?
ans:=  1. Default Constructor: A constructor automatically provided by Java when no constructor is defined.
       2. Parameterized Constructor: A constructor that accepts parameters to initialize an object with values.

38)What is the difference between a constructor and a method?
ans:=             Constructor	                               Method
          1. Initializes an object.	                1. Performs a task.
          2. Name must be the same as the class.	2. Can have any valid name.
          3. Has no return type.	                3. Has a return type or void.
          4. Called when an object is created.	        4. Called when invoked.

39)Can a constructor be overloaded?
ans:=Yes, a constructor can be overloaded in Java.
          Constructor overloading means creating multiple constructors in the same class with different parameters.


40)Can a constructor be overridden?
ans:=No, a constructor cannot be overridden in Java.
     Reason: Constructors are not inherited by child classes, and overriding requires inheritance.