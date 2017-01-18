//A class marked with implicit keyword is called an implicit class

//Implicit keyword allows for variables, parameters and classes

implicit val someImplicitIntegerValue = 7
implicit val someImplicitString ="Hello"

//Here implicit keywords apply to the parameter list of the method
//Even though it has only been defined in the first parameter
def greetPerson(implicit greeting: String, code:Int) = f"Scala says ${greeting} to 00${code}"

//When scala see a method call to such a method with implicit parameters
//First it check whether there are implicit variables in the scope and use those for the method call
//Those variable names need not to be same, its all about the type
greetPerson

// Scala look for these implicit values by type only
// If there are many implicit values with same type it will throw an error

//implicit val anotherImplicitInt = 10
//implicit val anotherImplicitString = "Implicit String Value"
