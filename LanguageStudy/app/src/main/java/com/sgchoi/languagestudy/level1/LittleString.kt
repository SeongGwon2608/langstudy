package com.sgchoi.languagestudy.level1

/*
 * Programmers Coding Test
 * 문제명 : 크기가 작은 부분 문자열
 * 난이도 : Level 1
 * 주의사항 : 일반 Int 사용시 에러 발생하므로 toBigInteger 사용하여 바로 계산 수행
 */
fun littleString(t: String, p: String): Int {
    var answer: Int = 0
    var length: Int = p.length

    var tempString: String = ""
    for(i in 0 ..  t.length-length){
        for( j in 0 until length){
            tempString += t[i+j]
        }
        if(tempString.toBigInteger() <= p.toBigInteger()){
            answer++
        }
        tempString = ""
    }
    return answer
}