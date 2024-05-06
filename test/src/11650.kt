class Coordinate(val x:Int, val y:Int)

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    val arr = Array(N) {Coordinate(0, 0)}
    for(i in 0 .. N-1){
        val input = br.readLine().split(" ").map{it.toInt()}
        arr[i] = Coordinate(input[0], input[1])
    }
    arr.sortWith(
        compareBy(
            {it.x}, {it.y}
        )
    )

    for(i in 0 .. N-1){
        bw.write("${arr[i].x} ${arr[i].y}\n")
    }
    bw.flush()
    bw.close()
}