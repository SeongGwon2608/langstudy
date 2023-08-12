package com.sgchoi.languagestudy.level2

/*
 * Programmers Coding Test
 * 문제명 : 최댓값과 최솟값
 * 난이도 : Level 2
 * 주의사항 : 문자열 사이, 앞, 끝부분에 있는 연속된 공백 고려
 */

fun jadenCaseString(s: String): String {
    var answer = ""

    var strData: String = s.lowercase()
    var listSplit: List<String> = strData.split(" ")

    for(i in listSplit.indices){
        if(i == listSplit.size-1){
            answer += remakeString(listSplit[i])
        }else{
            answer += remakeString(listSplit[i]) + " "
        }
    }

    return answer
}

fun remakeString(str: String): String{
    var charTemp: CharArray = str.toCharArray()
    var resultString: String = ""

    if(str == ""){
        return ""
    }

    charTemp[0] = charTemp[0].uppercaseChar()

    for(i in charTemp.indices){
        resultString += charTemp[i]
    }
    return resultString
}