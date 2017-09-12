//Implicit conversions
//If you defined one argument method with the implicit modifier,
//When the method is in scope,
//Scala uses that type to convert arguments of the input types into output types

implicit def thisIsAImplicitMethod(input:Int) = f"Called method with the imput type of ${input}"

def anotherMethod(name:String) = f"another method with name : ${name}"

//Here the fist method is used convert the int into the string since the implicit method
// is in the scope. The implicit method takes a int and returns a String..
anotherMethod(100)


