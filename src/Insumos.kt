class Insumos {
    var nome = ""
    var valor = 0.0
    var qtde = 0

    fun nome(nome: String) :Insumos{
        this.nome = nome
        return this
    }

    fun custo(valor: Double) :Insumos{
        this.valor = valor
        return this
    }

    fun quantidade(qtde: Int) :Insumos{
        this.qtde = qtde
        return this
    }
}