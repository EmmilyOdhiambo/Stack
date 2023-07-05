fun main(){
    val myStack = Stack()
    println(myStack.peek())
    println(myStack.isEmpty())
    myStack.push(34)
    myStack.push(12)
    println(myStack.peek())
    myStack.push(3)
    myStack.push(7)
    myStack.pop()
    println(myStack.peek())
    var x = myStack.pop()
    var y = myStack.pop()
    var z = x!!+y!!
    println(z)
    println(reverseString("Stephanie"))
}

class Stack {
    var data = mutableListOf<Int>()
    fun push(value: Int) {
        data.add(value)
    }

    fun pop(): Int? {
        if (data.isEmpty()) {
            return null
        }
        var top = data[data.lastIndex]
        data.remove(data.lastIndex)
        return top
    }

    fun peek(): Int? {
        if (data.isEmpty()) {
            return null
        }
        return data[data.lastIndex]

    }

    fun isEmpty(): Boolean {
        return (data.isEmpty())

    }
}
fun reverseString(stg:String):String {
    var result = mutableListOf<Char>()
    for (i in stg.lastIndex downTo 0) {
        result.add(stg[i])
    }
    return result.joinToString ("")
}
fun reverseWithStack(stg:String):String{
    val stack = Stack()
    for(character in stg){
      stack.push(character)
    }
    val result = mutableListOf<Char>()
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }

}