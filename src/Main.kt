fun main() {
    showMessage("Hello World")

    forLoops()
}

fun showBalanceType(balance: Double) {
    when {
        balance == 0.0 -> showMessage("Balance is neutral")
        balance > 0.0 -> showMessage("Balance is positive")
        else -> showMessage("Balance is negative")
    }
}

fun forLoops() {
    for (i in 1 downTo 0 step 3) {
        showMessage("")

        val account = Account("Eder", 1095)
        account.deposit(100.0)

//        showMessage(
//            """The account owner is ${account.owner} with number ${account.number} and balance ${account.balance}"""
//        )

        showMessage(account)
        account.deposit(15.0)
        showMessage(account)
        account.withdraw(48.0)
        showMessage(account)
        account.withdraw(148.0)
        showMessage(account)


        val account2 = Account(number = 75, owner = "Toroxa")
        account.transfer(75.0, account2)

        showMessage(account)
        showMessage(account2)

        showBalanceType(account.balance)
    }


//    for (i in 6..8) {
//        showMessage(i)
//    }
//
//    for (i in 6..8) {
//        if (i == 7) continue
//        showMessage(i)
//    }
}

fun showMessage(message: Any) {
    println(message)
    println("-------------------------------------------------------")
}

class Account(
    private val owner: String,
    private val number: Int
) {

    var balance = 0.0
        private set

    fun deposit(price: Double) {
        if (price < 0) {
            showMessage("Não é possivel realizar um deposito de um valor negativo")
            return
        }

        this.balance += price
    }

    fun withdraw(value: Double) {
        if (value > balance) {
            showMessage("Não é possivel realizar o saque para a conta de $owner, pois o saldo em conta é de $balance e o valor que está sendo tentado sacar é de $value")
            return
        }

        if (value < 0) {
            showMessage("Não é possivel realizar um saque de um valor negativo")
            return
        }

        this.balance -= value
    }

    fun transfer(value: Double, destiny: Account) {
        if (value > balance) {
            showMessage("""Não é possivel realizar uma transferência para a conta de ${destiny.owner} a partir da conta de $owner, pois o saldo em conta é de $balance e o valor que está sendo transferido é de $value""")
            return
        }

        if (value < 0) {
            showMessage("Não é possivel realizar a transferência de um valor negativo")
            return
        }

        this.withdraw(value)
        destiny.deposit(value)
    }

    override fun toString(): String {
        return "Account(owner='$owner', number=$number, balance=$balance)"
    }

}