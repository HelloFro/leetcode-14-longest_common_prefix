package dev.hellofro

fun main() {
    val test1 = arrayOf("flower", "flow", "flight")
    val test2 = arrayOf("dog", "racecar", "car")
    val test3 = arrayOf("a", "b")
    val tests = arrayOf(test1, test2, test3)
    val solution = Solution()

    for(test in tests){
        println(solution.longestCommonPrefix(test))
    }
}