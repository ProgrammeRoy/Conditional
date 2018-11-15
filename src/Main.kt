fun main(args: Array<String>){

//CONDITIONAL IF ELSE
    var edad=20

    if (edad>=18) println("Eres mayor de edad")
    else println("Eres menor de edad")

//CONDITIONAL WHEN(ANCIENT SWITCH)
    var valor=5
    when(valor){
        1 -> println("El número es 1")
        2-> println("El número es 2")
        3-> println("El número es 3")
        4-> println("El número es 4")
        5-> println("El número es 5")
        else-> println("No es 1,2,3,4,5")
    }

    when(valor>10){
        true-> println("Valor es mayor a 10")
        false-> println("Valor $valor es menor a 10")
    }

    when(valor){
        1-> println("El número es 1")
        2-> println("El número es 2")
        3-> println("El número es 3")
        else-> println("No es 1,2,3")
    }

//CONDITIONAL WHEN - RANGE
    var variable=15
    when(variable){
        in 1..10 -> println("Variable entre 1 y 10")
        in 11..20 -> println("Variable entre 11 y 20")
        in 21..30 -> println("Variable entre 21 y 30")
    }

    when(variable){
        10,11,12,13,14,15 -> println("Variable 10,11,12,13,14,15")
        20,21 -> println("Variable 20 o 21")
    }

//IS
    var isNew=5
    when(isNew){
        1-> println("Es 1")
        2-> println("Es 2")
        is Int-> println("Es entero")
        !is Int -> println("No es entero")
    }

//WHEN WITHOUT ARGUMENTS
    var x=1
    var y=2
    when{
        x>y -> println("x>y")
        x<y -> println("x<y")
        else -> println("x==y")
    }

//RANGES
    var aTOz = "a".."x"
    println(aTOz)

    var siEsta="b" in aTOz
    println(siEsta)

    var oneTO = 25..30
    println(oneTO)

    var siEstaNumero=26 in oneTO
    println(siEstaNumero)

    val numberStep = 5..10
    var newNumber = numberStep.step(3)
    var sum=newNumber.sum()
    println(newNumber)
    var isInto = 6 in newNumber
    println(isInto)
}