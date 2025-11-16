1) Strings in JAVA, are not primitive types. They are classes

2) String name = "Binita";
    name += " Dutta";

    The original string 'name' doesn't get modified, on concatenating with " Dutta" due to the concept of string constant pool. The reference changes.

3) By default strings in JAVA, are immutable. Once you create the object, it is immutable. To work with mutable strings we can make use of String Buffers or String Builders.

4) String Buffer is thread-safe and String Builder is not.

5) Instance varibales are shared with a class and not a specific function.

6) A static varibale is shared by all the objects of the class. This is a common varibale for all the objects of the class. A static varibale should be called by the class name. Static means you are making it a class member.

7) There is a different area in the JVM, where we have all the static varibales.

8) In a non-static method we can use static varibales.

9) The constructor function is fired everytime an object is created out of the class. But the static constructor is called only once. The static block is always called first followed by the constructor.

10) Every time you create an object, there are 2 steps that are followed:
    - The class loads
    - Objects are instanstiated

11) In JVM, we have a special area for a class loader. It is the area where all the classes are loaded. So the class will get loaded from your library to the class loader and it happens only once.

12) If you don't create an object of class, the class will also not get loaded.

13) If you do not want to create an object of the class, but you want to load the class, in JAVA, we have a special class called as 'Class'. 
        Class.forName("Mobile");
        So the static block method is fired up!

14) You can call a static method directly from the class name.

15) - You can use a static varibale inside a static method. 
    - You can use a static varibale inside a non-static method. 
    - You cannot use a non-static varibale inside a static method. 

16) The problem with not making the main method a static method:
    'main' becomes a non-static method. So you cannot call 'main' without the object of 'Hello'