package com.sgchoi.languagestudy.level2

import java.util.Stack

/*
 * Programmers Coding Test
 * 문제명 : 괄호 회전하기
 * 난이도 : Level 2
 * 주의사항 :
 */
fun spinBracket (s: String): Int {
    var answer: Int = 0
    var cpString: MutableList<Char> = s.toCharArray().toMutableList()
    var spinCount: Int = s.length

    for(i in 0 until spinCount){
        if(i == 0){
            answer += checkBracket(cpString)
        }else{
            cpString.add(cpString[0])
            cpString.removeAt(0)
            answer += checkBracket(cpString)
        }
    }


    return answer
}

fun checkBracket (strData: MutableList<Char>): Int{
    var result: Int = 1
    var stack: Stack<Char> = Stack()
    var charTemp: Char = '0'

    for(i in strData.indices){
        if(strData[i] == '[' || strData[i] == '{' || strData[i] == '('){
            stack.push(strData[i])
        }else{
            if(stack.empty()) return 0
            else charTemp = stack.pop()

            if(charTemp == '[' && strData[i] != ']') return 0
            else if(charTemp == '{' && strData[i] != '}') return 0
            else if(charTemp == '(' && strData[i] != ')') return 0
        }
    }

    if(!stack.empty()) return 0

    return result
}