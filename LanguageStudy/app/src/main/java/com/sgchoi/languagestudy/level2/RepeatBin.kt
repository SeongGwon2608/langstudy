package com.sgchoi.languagestudy.level2

/*
 * Programmers Coding Test
 * 문제명 : 이진변환 반복하기
 * 난이도 : Level 2
 * 주의사항 :
 */
fun repeatBin (s: String): IntArray {
    var answer: IntArray = intArrayOf(0, 0)
    var strData: String = s
    var cntRepeat: Int = 0
    var cntRemove: Int = 0

    while(true){
        var charArray = strData.toCharArray()
        var strTemp: String = ""

        cntRepeat++
        for(i in charArray.indices){
            if(charArray[i] == '1'){
                strTemp += "1"
            }else{
                cntRemove++
            }
        }
        if(strTemp == "1"){
            break
        }else{
            strData = toBin(strTemp.length)
        }

    }

    answer[0] = cntRepeat
    answer[1] = cntRemove
    return answer
}

fun toBin (value: Int): String{
    var result: String = ""
    var temp: Int = value

    while(true){
        result = (temp%2).toString() + result
        temp /= 2

        if(temp == 1){
            result = "1$result"
            break
        }
    }

    return result
}