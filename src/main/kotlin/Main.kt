fun main() {
    personDetails("Marisa",26,"Kenya")
    println(addition(12,3,89,12))
    println( numbers(12,5,100,90,2))
    personRecord("Susan",24,"0712345678","susan@gmail.com",45.00,"Ugandan")

}

//1. Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya”
fun personDetails(name:String,age:Int,nationality:String){
    println("Hello my name is ${name}, I am ${age} years old and I am from ${nationality}")

}

//2. Create and invoke a function that returns the sum of any given 4 numbers
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum=num1+num2+num3+num4
    return sum

}

//3. Create and invoke a function that given any 5 numbers, it returns their average
fun numbers(num1:Int,num2:Int,num3:Int,num4:Int,num5:Int):Int{
    var y=num1+num2+num3+num4+num5
    return y

}

//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not.
fun personRecord(name:String,age: Int,phoneNumber:String,email:String,weight:Double,hot:String){
    println("Is a Ugandan")

}