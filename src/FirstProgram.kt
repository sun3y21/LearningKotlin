//
//fun main(args : Array<String>)
//{
//    val name = if (args.size == 1)  args[0] else "Sunnny"
//    println("Hello $name!!!!")
//}
//
//fun sum(a : Int, b: Int) = a + b // function with expression body

fun isValidIdentifier(s: String): Boolean {
   if (s.isEmpty())
       return false
    fun isValid1stChar(ch: Char) = ch == '_' || ch in 'a'..'z' || ch in 'A'..'Z'
    fun isValidChar(ch : Char) = ch == '_' || ch in 'a'..'z' || ch in 'A'..'Z' || ch in '0'..'9'
    fun checkRemainingList() : Boolean
    {
        var i = 1
        while (i < s.length)
        {
            if(!isValidChar(s[i]))
            {
                return false
            }
            i++
        }
        return true
    }
    return isValid1stChar(s[0]) && checkRemainingList()


}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

