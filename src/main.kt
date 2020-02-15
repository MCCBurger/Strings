import java.text.DecimalFormat

fun main() {
    //Declare and initialize variables
    var response = ""
    var points = 0
    var df = DecimalFormat("###.##%")
    var percent = ""

    /*
    Print each question and ask user for a response.
    If the response is correct increment a point
    */
    println("=================== 5 Question Quiz ===============")
    println("Q1: Who makes the Stranger Things pinball machine?")
    response = readLine()!!.toString()
    if ("Stern".equals(response, ignoreCase = true)) {
        println("Correct")
        points++
    } else
        println("Incorrect, The correct answer is Stern")
    println("Q2: What city is Stern located in?")
    response = readLine()!!.toString()
    if ("Elk Grove".equals(response, ignoreCase = true)) {
        println("Correct")
        points++
    } else
        println("Incorrect, The correct answer is Elk Grove")
    println("Q3: What pinball company made Old Chicago?")
    response = readLine()!!.toString()
    if ("Bally".equals(response, ignoreCase = true)) {
        println("Correct")
        points++
    } else
        println("Incorrect, The correct answer is Bally")
    println("Q4: Does the 1964 United Fury Bowler use a puck or a bowling ball ")
    response = readLine()!!.toString()
    if ("bowling ball".equals(response, ignoreCase = true)) {
        println("Correct")
        points++
    } else
        println("Incorrect, The correct answer is bowling ball")
    println("Q5: Bally originally made ___________ machines?")
    response = readLine()!!.toString()
    if ("Slot".equals(response, ignoreCase = true)) {
        println("Correct")
        points++
    } else
        println("Incorrect, The correct answer is slot machines")

    //Calculate the results of the quiz with percentage
    println("================== Results =============================")
    percent = df.format(points / 5.0)
    print("You got $points questions out of 5 correct that is $percent")
}