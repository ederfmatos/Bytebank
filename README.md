# Bytebank

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


#### Exceptions

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