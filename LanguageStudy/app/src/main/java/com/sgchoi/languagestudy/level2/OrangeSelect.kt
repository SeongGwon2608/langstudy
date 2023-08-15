package com.sgchoi.languagestudy.level2

/*
 * Programmers Coding Test
 * 문제명 : 귤 고르기
 * 난이도 : Level 2
 * 주의사항 :
 */
fun orangeSelect (k: Int, tangerine: IntArray): Int {
    var answer: Int = 1
    var arrList: MutableList<Int> = mutableListOf()
    var posValue: Int = tangerine[0]
    var count: Int = 0
    var pos: Int = 0

    tangerine.sort()
    for(i in tangerine.indices){
        if(posValue == tangerine[i]){
            count++
        }else{
            arrList.add(pos, count)
            posValue = tangerine[i]
            pos++
            count = 1
        }
    }

    if(count > 0){
        arrList.add(pos, count)
        count = 0
    }

    arrList.sort()
    while(true){
        count += arrList[arrList.size-answer]

        if(count >= k) break
        else answer++
    }

    return answer
}