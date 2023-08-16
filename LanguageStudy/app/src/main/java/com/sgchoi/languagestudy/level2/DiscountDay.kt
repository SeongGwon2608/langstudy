package com.sgchoi.languagestudy.level2

/*
 * Programmers Coding Test
 * 문제명 : 할인 행사
 * 난이도 : Level 2
 * 주의사항 :
 */
fun discountDay (want: Array<String>, number: IntArray, discount: Array<String>): Int {
    var answer: Int = 0

    for(i in 0 .. discount.size - 10){
        var saleList: Array<String> = makeSaleDay(i, discount, 10)
        answer += checkWant(want, number, saleList)
    }

    return answer
}

fun makeSaleDay (day: Int, discount: Array<String>, size: Int): Array<String>{
    var arrResult: Array<String> = Array(size){""}
    var pos: Int = 0

    for (i in day until day+size){
        arrResult[i-day] = discount[day + pos]
        pos++
    }
    return arrResult
}

fun checkWant (want: Array<String>, number: IntArray, discount: Array<String>): Int {
    var result: Int = 1
    var map: MutableMap<String, Int> = mutableMapOf<String, Int>()

    for(i in want.indices){
        map[want[i]] = number[i]
    }

    for(i in discount.indices){
        if(map.containsKey(discount[i])){
            map[discount[i]] = map.getValue(discount[i]) - 1
        }else{
            return 0
        }
    }

    for(i in want.indices){
        if(map[want[i]] != 0) return 0
    }

    return result
}