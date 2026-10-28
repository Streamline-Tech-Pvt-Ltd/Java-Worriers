41). What is constructor chaining?
ans=Calling one constructor from another constructor using this() or super() is called constructor chaining.

42). What is the use of the static keyword?
ans=static is used to create class-level variables and methods shared by all objects.

43). Can a static method access non-static variables directly?
ans=No, a static method cannot directly access non-static variables.

44). Difference between static and instance methods?
ans= - Static method: Belongs to the class.
     - Instance method: Belongs to an object.

45). Use of the final keyword?
ans= - Variable: Value cannot be reassigned.
     - Method: Cannot be overridden.
     - Class: Cannot be inherited.

46). What is a String in Java?
ans= A String is an object used to store a sequence of characters.

47). Why are strings immutable in Java?
ans= Strings are immutable because their values cannot be changed after creation, improving security and thread safety.

48). What is the String Constant Pool?
ans= It is a special memory area where Java reuses string literals to save memory.

49). Difference between String, StringBuilder, and StringBuffer?
ans = - String: Immutable.
      - StringBuilder: Mutable and faster, but not thread-safe.
       - StringBuffer: Mutable and thread-safe.

50). Difference between == and .equals() for strings?
ans=  - == compares object references.
      - .equals() compares string contents.


51). Difference between String.valueOf() and toString()?
ans = - String.valueOf() converts a value to a String and handles null.
      - toString() returns the object's string representation; calling it on null causes a NullPointerException.

52). What are wrapper classes in Java?
ans = Wrapper classes convert primitive types into objects, e.g., int to Integer.

53). What are autoboxing and unboxing?
ans = - Autoboxing: Primitive to wrapper object.
      - Unboxing: Wrapper object to primitive.

54). Difference between int and Integer?
ans =- int is a primitive data type.
     - Integer is a wrapper class that stores an integer as an object.

55). Why should we override equals() and hashCode() together?
ans Because equal objects must have the same hash code, especially when used in HashMap and HashSet.


56). What is an exception in Java?
ans = An exception is an event that interrupts the normal flow of a program.

57). Difference between an error and an exception?
ans= - Error: A serious problem, usually difficult to recover from.
     - Exception: A problem that a program can often handle.

58). Difference between checked and unchecked exceptions?
ans=	- Checked: Checked at compile time, e.g., IOException.
	- Unchecked: Occur at runtime, e.g., NullPointerException.


59). Difference between throw and throws?
ans = - throw: Used to throw an exception explicitly.
      - throws: Declares possible exceptions in a method signature.


60). Purpose of try, catch, and finally?
ans = - try: Contains risky code.
      - catch: Handles exceptions.
      - finally: Usually executes cleanup code.
