package com.sgchoi.languagestudy.level2

/*
 * Programmers Coding Test
 * 문제명 : 카펫
 * 난이도 : Level 2
 * 주의사항 : 그림으로 그려보면 쉽게 이해가능
 */
fun carpet (brown: Int, yellow: Int): IntArray {
    var answer: IntArray = IntArray(2)
    var brownCalc:Int = (brown - 4)/2

    for(i in 1 .. yellow){
        if(yellow % i == 0){
            if(brownCalc == i + (yellow / i)){
                answer = intArrayOf((yellow / i)+2, i+2)
                return answer
            }
        }
    }
    return answer
}