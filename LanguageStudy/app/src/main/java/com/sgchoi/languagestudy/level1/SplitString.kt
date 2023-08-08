package com.sgchoi.languagestudy.level1

/*
 * Programmers Coding Test
 * 문제명 : 문자열 나누기
 * 난이도 : Level 1
 * 주의사항 : if문 사용시 순서에 주의
 */
fun splitString(s: String): Int {
    var answer: Int = 0
    var temp: Char  = s[0]
    var count: Int = 1

    for(i in 1 until s.length){
        if(temp == '0')
            temp = s[i]

        if(s[i] == temp)
            count++
        else
            count--

        if(count == 0) {
            answer++
            temp = '0'
        }
    }
    if(count != 0)
        answer++

    return answer
}