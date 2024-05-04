import java.io.*

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var sb = StringBuilder()
    var N:Int = br.readLine().toInt()
    var stack = arrayListOf<Int>()
    for(i in 0..N-1){
        var M = br.readLine().split(" ")
        if(M[0] == "push"){
            stack.add(M[1].toInt())
        }
        else if(M[0] == "pop"){
            if(stack.isEmpty()) sb.appendLine(-1)
            else sb.appendLine(stack.removeAt(stack.lastIndex))
        }
        else if(M[0] == "top"){
            if(stack.isEmpty()) sb.appendLine(-1)
            else sb.appendLine(stack.last())
        }
        else if(M[0] == "size"){
            sb.appendLine(stack.size)
        }
        else if(M[0] == "empty"){
            if(stack.isEmpty()) sb.appendLine(1)
            else sb.appendLine(0)
        }
    }

    println(sb.toString())
}