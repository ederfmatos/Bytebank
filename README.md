
# Bytebank

##  Sumário

 1. [Variáveis](#Variáveis)
	 2. [Mutáveis](#Mutáveis)	
	 3. [Imutáveis](#Imutáveis)	
 2. Importações
	 3. [Alias](#Alias)	
 3. [Init](#Init)	
 4. [Casting](#Casting)	
	 5. [Is](#Is)
	 6.  [Cast](#Cast)
	 7.  [SmartCast](#SmartCast)
 5.  [Exceptions](#Exceptions)
	 6.  [Own Exceptions](#OwnExceptions)
	 

### Variáveis

##### Mutáveis
Para criar variáveis mutáveis utilizamos a palavra "var"

```kotlin
var name = ""
var age = 12

name = "Eder"
``` 

##### Imutáveis
Para criar variáveis imutáveis utilizamos a palavra "val"

```kotlin
val name = ""
val age = 12
``` 

### Importações

#### Alias

```kotlin
import com.ederfmatos.bytebank.model.Customer
import com.ederfmatos.bytebank.model.auth.Customer as CustomerAuth

val customer = Customer()
val customerAuth = CustomerAuth()
```

### Init

Com o "init" podemos executar um trecho de código assim que uma instancia da classe for criada, indiferente do construtor
Exemplo:

```kotlin
class Customer(name: String) {

    constructor(name: String, age: Int): this(name = name) {

    }
    
    init {
        // Código
    }

}
```

### Casting

#### Is

Para verificar se uma variável é uma instancia de outra utilizamos o "is"
Exemplo:

```kotlin
fun print(value: Any) {
    if (value is Customer) {
    // ... Segue
    }
}
``` 

#### Cast

Para realizar o cast de um variável podemos utilizar as seguintes formas
Exemplo:

```kotlin
fun print(value: Any) {
    val newValue: Customer = value as Customer
    println(newValue) 

    value as Customer
    println(value) 
}
``` 

#### SmartCast

É possivel fazer a verificação de uma variavel com um tipo e logo em seguida já utiliza-la com cast implicito
Exemplo:

```kotlin
fun print(value: Any) {
    if (value is Customer) {
        println(value.name)
    }
}
``` 


### Exceptions

```kotlin
try {

} catch(e: Exception) {
    e.printStackTrace()    
} finally {

}
```

#### Own Exception
```kotlin
class InsufficientFundsException : Exception(message = "Saldo insuficiente")

fun test() {
    throw InsufficientFundsException() 
}
```

#### Try is an expression

```kotlin
 val value: Int? = try { 
    Integer.parseInt("1")
 } catch(e:  NumberFormatException) { 
    null
 }
```

#### If is an expression

```kotlin
 val value: Int? = if (value) { 
    Integer.parseInt("1")
 } else { 
    null
 }
```

#### When is an expression

```kotlin
val valorComTaxa: Double? = when {
    valorRecebido != null -> valorRecebido + 0.1
    else -> null
}
```

### Null Safety

Pode ser nulo
```kotlin
val customer: Customer? = null
println(customer?.address.toString().toUpperCase())
```

Não pode ser nulo
```kotlin
val customer: Customer = Customer()
println(customer.address.toString().toUpperCase())
```

#### Non null assertion operator

Garante que a variavel não será nula
```kotlin
val customer: Customer? = null
println(customer!!.address.toString().toUpperCase())
```

#### Elvis Operator
```kotlin
val value = null
val value2 = value ?: 1
println(value2)

// -> 1 
```

```kotlin
val value = null
val value2 = value ?: throw IllegalStateException()
println(value2)

// -> java.lang.IllegalStateException
```

#### Safe casts
```kotlin
fun test(value: Any) {
    val number: Int? = value as? Int
    println(number)
}

test("não é um número")

// -> null
```


### Arrays

#### Percorrendo arrays
```kotlin
val ages = intArrayOf(10,11,23,25,64)

for (age in ages) {
    
}
```

```kotlin
val ages = intArrayOf(10,11,23,25,64)

ages.forEach { age: Int -> println(age) }
```

```kotlin
val ages = intArrayOf(10,11,23,25,64)

ages.forEach { println(it) }
```

##### Percorrendo indices de arrays
```kotlin
val ages = intArrayOf(10,11,23,25,64)

for (index in ages.indices) {
    val age = ages[index]
    println(age)
}
```

```kotlin
val ages = intArrayOf(10,11,23,25,64)
ages.forEachIndexed { index, age -> println(age) }
```

#### Range
```kotlin
1.rangeTo(10).forEach { println(it) }

val numerosPares = 0..100 step 2
numerosPares.forEach{ println(it) }

val numerosParesUntil = 2.until(100)
numerosParesUntil.forEach{ println(it) }

val cemAteZero = 100 downTo 0
cemAteZero.forEach{ println(it) }

val valores = 1500..5000
valores.forEach{ println(it) }
```

#### Arrays contains
```kotlin
val numerosParesUntil = 2.until(100)
val numero = 18

if (numero in numerosParesUntil) {
    println("Está dentro do intervalo")
}

val alphabet =  'a'..'z'
if ('k' in alphabet) {
    println("Está dentro do alfabeto")
}
```

#### Obter valor máximo
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
println(ages.max())

// -> 35
```

#### Obter valor mínimo
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
println(ages.min())

// -> 12
```

#### Obter média de valores
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
println(ages.average())

// -> 20.5
```

#### Verificar se todos os valores condiz com uma condição
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
println(ages.all { it >= 18 })

// -> false
```

#### Verificar se ao menos 1 valor condiz com uma condição
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
println(ages.any { it >= 18 })

// -> true
```

#### Verificar se nenhum valor condiz com uma condição
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
println(ages.none { it == 19 })

// -> true
```

#### Filtrar array
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
println(ages.filter { it >= 18 })

// -> [26, 35, 18, 22, 24]
```

#### Buscar o primeiro item de acordo com condição
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
println(ages.find { it >= 18 })

// -> 26
```
