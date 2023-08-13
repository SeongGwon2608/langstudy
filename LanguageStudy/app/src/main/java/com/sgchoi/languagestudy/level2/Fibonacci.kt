package com.sgchoi.languagestudy.level2

/*
 * Programmers Coding Test
 * 문제명 : 피보나치 수
 * 난이도 : Level 2
 * 주의사항
 *  - 재귀 쓰라고 하는데 굳이 쓸필요 없어서 그냥 작성
 *  - 연산 후 변수에 담는 과정에서 오버플로우 발생가능성 있어서 변수저장시에 나눠줌
 */
fun fibonacci (n: Int): Int {
    var answer: Int = 0
    var fibo1: Int = 0
    var fibo2: Int = 1
    var temp: Int = 0

    for(i in 0 until n){
        temp = fibo1 % 1234567
        fibo1 = (fibo1 + fibo2) % 1234567
        fibo2 = temp
    }

    answer = fibo1 % 1234567
    return answer
}