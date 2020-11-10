
# Meus estudos sobre Kotlin

##  Sumário

 1. [Variáveis](#Variáveis)<br>
	 1. [Mutáveis](#Mutáveis)<br>
	 2. [Imutáveis](#Imutáveis)<br>
 2. [Importações](#importacoes)<br>	
	 1. [Alias](#Alias)	
 3. [Init](#Init)
 4. [Casting](#Casting)<br>	
	 1. [Is](#Is)<br>
	 2. [Cast](#Cast<br>)
	 3. [SmartCast](#SmartCast)<br>
 5.  [Exceptions](#Exceptions)<br>
	 1. [Own Exceptions](#own-exception)<br>
	 2. [Try is an expression](#try-is-an-expression)<br>
	 3. [If is an expression](#if-is-an-expression)<br>
	 4. [When is an expression](#when-is-an-expression)
 6.  [Null Safety](#null-safety)<br>
	 1. [Non null assertion operator](#non-null-assertion-operator)<br>
	 2. [Elvis Operator](#elvis-operator)<br>
	 3. [Safe casts](#safe-casts)<br>
 7.  [Arrays](#arrays)<br>
	 1. [Percorrendo arrays](#percorrendo-arrays)<br>
	 2. [Percorrendo indices de arrays](#percorrendo-indices-de-arrays)<br>
	 1. [Range](#range)<br>
	 2. [Arrays contains](#arrays-contains)<br>
	 3. [Obter valor máximo](#obter-valor-máximo)<br>
	 4. [Obter valor mínimo](#obter-valor-mínimo)<br>
	 5. [Obter média de valores](#obter-média-de-valores)<br>
	 6. [Verificar se todos os valores condiz com uma condição](#verificar-se-todos-os-valores-condiz-com-uma-condição)<br>
	 7. [Verificar se ao menos 1 valor condiz com uma condição](#verificar-se-ao-menos-1-valor-condiz-com-uma-condição)<br>
	 8. [Verificar se ao menos 1 valor condiz com uma condição](#verificar-se-nenhum-valor-condiz-com-uma-condição)<br>
	 9. [Verificar se nenhum valor condiz com uma condição](#verificar-se-nenhum-valor-condiz-com-uma-condição)<br>
	 10. [Filtrar array](#filtrar-array)<br>
	 11. [Buscar o primeiro item de acordo com condição](#buscar-o-primeiro-item-de-acordo-com-condição)<br>
	 12. [Criar Array de objetos](#criar-array-de-objetos)<br>
	 13. [Map](#map)<br>
	 14. [Reduce](#reduce)<br>
	 15. [Take - Obtendo os primeiros itens de um array](#take---obtendo-os-primeiros-itens-de-um-array)<br>
	 16. [TakeLast - Obtendo os ultimos itens de um array](#takelast---obtendo-os-ultimos-itens-de-um-array)<br>
 8. [Listas](#listas)<br>
    1. [Listas mutáveis](#mutablelist)<br>
    2. [Join To String](#jointostring)<br>
    3. [Ordenando listas crescente](#sortedby)<br>
    4. [Ordenando listas decrescente](#sortedbydescending)<br>
	 

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
        println(value.name)
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
    println(age)
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

#### Criar Array de objetos
```kotlin
fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size){ index -> values[index].toBigDecimal() }
}

val salarios = bigDecimalArrayOf("1500.19", "4850.50", "3200.00", "4420.00", "3212.00")
```

#### Map
```kotlin
val salariosComAumento = salarios.map{ salario -> salario * aumento }.toTypedArray()
```

#### Reduce
```kotlin
val soma: BigDecimal = salarios.reduce { it, accum -> it.plus(accum) }
```

#### Take - Obtendo os primeiros itens de um array
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
val initialsAges: List<Int> = ages.take(3)
println(lastAges)

// -> [14, 26, 35]
```

#### TakeLast - Obtendo os ultimos itens de um array
```kotlin
val ages = intArrayOf(14, 26, 35, 12, 18, 22, 24, 13)
val lastAges: List<Int> = ages.takeLast(3)
println(lastAges)

// -> [22, 24, 13]
```

### Listas

#### MutableList
```kotlin
val books: MutableList<Int> = mutableListOf(1, 2, 3, 4)
books.add(5)
println(books)

// -> [1, 2, 3, 4, 5]
```

#### JoinToString
```kotlin
val books: MutableList<Int> = mutableListOf(1, 2, 3, 4)
books.add(5)
println(books)

// -> [1, 2, 3, 4, 5]
```

#### SortedBy
```kotlin
val books = listOf<Book>()
books.sortedBy { it.yearPublish }
```

#### SortedByDescending
```kotlin
val books = listOf<Book>()
books.sortedByDescending { it.yearPublish }
```