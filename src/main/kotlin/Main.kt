package dev.hellofro

import dev.hellofro.Solution

fun main() {
    val test1 = arrayOf("flower", "flow", "flight")
    val test2 = arrayOf("dog", "racecar", "car")
    val solution = Solution()

    println(solution.longestCommonPrefix(test1))
    println(solution.longestCommonPrefix(test2))
}