//Same implicit method behaviour is applies to implicit classes with one argument as well

implicit class MyImplicitClassWithSingleArgument(oneArgument: Int){
  def myImplicitMethod() = f"implicit class method with String input ${oneArgument}"
}

def anotherMethod(instance:MyImplicitClassWithSingleArgument) = f"another method with name : ${instance.myImplicitMethod()}"


anotherMethod(100)


//There are alot of rules for the "scope" qualifiers and precedence etc...

//Benefits of implicit is those can be used to inject methods at runtime
//Different method for prod and different method for dev etc....

