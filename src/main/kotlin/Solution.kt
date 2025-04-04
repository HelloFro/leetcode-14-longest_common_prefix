package dev.hellofro

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.size == 1){ return strs[0] }

        // Get the shortest string and use it as the prefix
        val shortestStrAsPrefix = strs.minByOrNull { str -> str.length } ?: return ""

        if (shortestStrAsPrefix.isEmpty()){ return "" }

        // Ensure the first char in prefix matches every string
        if(!strs.all { str -> str.startsWith(shortestStrAsPrefix.substring(0, 1)) }){
            return ""
        }

        // expand the prefix using the chars of the shortest string
        // and check each against the corresponding indices of each string
        for(i in 1 until shortestStrAsPrefix.length){
            if(!strs.all { str -> str.startsWith(shortestStrAsPrefix.substring(0, i + 1)) }){
               return shortestStrAsPrefix.substring(0, i)
            }
        }

        // the longest common prefix cannot be longer than the shortest string so we return the original
        return shortestStrAsPrefix
    }
}