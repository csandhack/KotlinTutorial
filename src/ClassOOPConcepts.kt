
fun main(args: Array<String>) {

    var car1 = Car("Allah") // inti runs/executes

    println("The Name is ${car1.name}")

    car1.name = "A"

    println("The Name is ${car1.name}")

}

class Car(var name: String){

    // property of class can be definded/declared here
    // or inside constructor
    // var name: String

    // inti block runs/executes when the class object is created.
    init {
        println("The Name is ${this.name}")
    }
}