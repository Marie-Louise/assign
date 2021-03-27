fun main() {
    var marie=Human("marie",34,90.67)
    marie.eat(1)
    println(marie.weight)
    marie.speak("she is strong")
    marie.birthday()
    var muteteyimana=User("muteteyimana","marie","mariemuteteyimana@gmail.com",56788,686768)
    println(muteteyimana.lastName)
    println(muteteyimana.passWard)


}
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println("i am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday(){
        age+=1
        println(age)
    }
}
data class User(var firstName:String,var lastName:String,val email:String,val phoneNumber:Int,val passWard:Int)
