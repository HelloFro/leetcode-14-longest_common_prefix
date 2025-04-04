package dev.hellofro

fun main() {
    val test1 = arrayOf("flower", "flow", "flight")
    val test2 = arrayOf("dog", "racecar", "car")
    val test3 = arrayOf("a", "b")
    val test4 = arrayOf("", "")
    val test5 = arrayOf("aa", "ab")
    val tests = arrayOf(test1, test2, test3, test4, test5)
    val solution = Solution()

    for(test in tests){
        println(solution.longestCommonPrefix(test))
    }
}