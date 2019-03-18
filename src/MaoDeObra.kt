class MaoDeObra {
    var nome = ""
    var valorHora = 0.0


    fun comNome(nome: String) :MaoDeObra{
        this.nome = nome
        return this
    }


    fun valorHora(valor: Double) :MaoDeObra{
        this.valorHora = valor
        return this
    }


}