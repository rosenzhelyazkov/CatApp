class Cat (val name: String, var age: Int, var weight: Int) {
    var weight: Int=initialWeight
        set(value) {
            if(value in 0..20) field = value
            else println("ERORR: weight must be between 0 and 20")
        }
    fun walk(times :Int=1) {
        weight=weight-times
    }
    fun eat(times:Int=1) {
        weight=weight+times
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"

    }
}

