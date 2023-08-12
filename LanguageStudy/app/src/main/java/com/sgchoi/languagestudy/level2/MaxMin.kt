package com.sgchoi.languagestudy.level2

/*
 * Programmers Coding Test
 * 문제명 : 최댓값과 최솟값
 * 난이도 : Level 2
 * 주의사항 :
 */
fun maxMin(s: String): String {
    var answer = "";
    var stringData: List<String> = s.split(" ")

    var maxValue: Int = stringData[0].toInt()
    var minValue: Int = stringData[0].toInt()

    for(i in stringData.indices){
        if(maxValue < stringData[i].toInt()){
            maxValue = stringData[i].toInt()
        }

        if(minValue > stringData[i].toInt()){
            minValue = stringData[i].toInt()
        }
    }

    answer = "$minValue $maxValue"

    return answer
}
