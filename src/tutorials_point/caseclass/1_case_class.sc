/**Case class are regular classes that are
  * 1.) Immutable by default
  * 2.) Decomposable through pattern matching
  * 3.) Compared by structual equality
  * 4.) No new keyword is required at the time of instanciation
  *  */

abstract class Notification
case class EmailNotification(source:String, title:String, body: String) extends Notification
case class SMS(source:String, message:String) extends Notification
case class VoiceRecording(contactName:String, link:String) extends Notification

//Instantiating is simple, No new keywords
val someEmail = EmailNotification("source","title","body")

//Constuctor parameters of a case class is treated as public and can access
someEmail.source

//Though you can access it public, you cant mutate it directly
//someEmail.source = "new source"

//Instead you can use copy method
val differentEmail = someEmail.copy(source = "Some Other Email Source")

//Compiler provides toString and equals method, equals checks the structural equality
val anotherEmail = EmailNotification("source","title","body")
someEmail.equals(anotherEmail)



def showNotification(notification: Notification): String = {

  notification match {
    case EmailNotification(source, title, body) =>
      f"You got an email from ${source} with title ${title} and body ${body}"
    case SMS(source, message) =>
      f"You got an sms from ${source} and message ${message}"
    case VoiceRecording(contactName, link) =>
      f"You got a voice recording from ${contactName} with the link ${link}"
  }
}

showNotification(EmailNotification("emailSource","emailTitle","emailBody"))
showNotification(SMS("smsSource","sms body"))
showNotification(VoiceRecording("contactName","link"))


//This can further developed into

def showSpecialNotification(notification: Notification, specialNotification: String): String = {

  notification match {
    case EmailNotification(source, _, _) if source == specialNotification =>
      f"You got an email from special ${source} "
    case SMS(source, _) if source == specialNotification =>
      f"You got an sms from special ${source}"
    case other =>
      showNotification(other) //Use of a variable in the case, calling the other method
  }
}

showSpecialNotification(EmailNotification("specialEmailSource","emailTitle","emailBody"),"specialEmailSource")
showSpecialNotification(EmailNotification("normalEmailSource","emailTitle","emailBody"),"specialEmailSource")
showSpecialNotification(SMS("specialSmsSource","sms body"),"specialSmsSource")
showNotification(VoiceRecording("contactName","link"))
