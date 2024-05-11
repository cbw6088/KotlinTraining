import java.io.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    var Arr = mutableListOf<Pair<Int, String>>()

    for(i in 0..N-1){
        val input = br.readLine().split(" ")
        val age = input[0].toInt()
        val name = input[1]
        Arr.add(Pair(age, name))
    }

    val result = Arr.sortedWith(compareBy{it.first})
    result.forEach{
        bw.write("${it.first} ${it.second}\n")
    }
    bw.flush()
    bw.close()
}