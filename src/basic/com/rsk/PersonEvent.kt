package basic.com.rsk

sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Aeating(val Food:String) : PersonEvent()
}


fun handleEvent(event: PersonEvent){
    when(event){
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Aeating -> println(event.Food)
    }
}