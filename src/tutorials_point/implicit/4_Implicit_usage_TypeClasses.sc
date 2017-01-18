trait SomeTrait[T] {
  def someMethodInTrait(x: T):String
}

/**
  * Case classes are regular classes which export their constructor parameters and which provide a
  * recursive decomposition mechanism via pattern matching.
  *
  * Here in this someInstanceVariable can be accessed outside even though
  * It has not been defined with var
  *
  * Also you dont need to define them with the new key word
  */
case class SomeCaseClass(someInstanceVariable:String)

object SomeObject extends SomeTrait[SomeCaseClass] {
  def someMethodInTrait(x:SomeCaseClass) = x.someInstanceVariable
}


