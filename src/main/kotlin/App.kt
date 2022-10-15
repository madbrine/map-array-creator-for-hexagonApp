
fun main() {

    fun MapCreator(xp: Int,yp: Int) {
        var key = 1
        var x = 1
        var y = 1
        while (y <= yp) {
            print("[")
            while (x <= xp) {
                if (x != xp) {
                    print("{x:$x,y:$y,c:'#108c00',key:$key},")
                } else {
                    print("{x:$x,y:$y,c:'#108c00',key:$key}")
                }
                x++
                key++
            }
            x = 1
            println("],")
            y++
        }
    }
    MapCreator(15,15)
}