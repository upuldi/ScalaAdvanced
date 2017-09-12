//Better Example
implicit def thisIsAImplicitMethod(input:Int) =
  f"First method : ${input}"

def somthing(name:String) = f"Second Method : ${name}"

//Here the fist method is used convert the int into the string since the implicit method
// is in the scope. The implicit method takes a int and returns a String..
somthing(100)