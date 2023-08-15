package com.sgchoi.languagestudy.level2

/*
 * Programmers Coding Test
 * 문제명 : 예상 대진표
 * 난이도 : Level 2
 * 주의사항 :
 */
fun matchPrediction (n: Int, a: Int, b: Int): Int {
    var answer = 0
    var num1: Int = a
    var num2: Int = b

    while(true){
        answer++

        num1 = (num1+1) / 2
        num2 = (num2+1) / 2

        if(num1 == num2) break
    }

    return answer
}