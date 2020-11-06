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