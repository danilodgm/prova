open class Obra {

    var nome = ""
    var diasTrabalhado = 0;
    var equipamentos = ArrayList<Equipamento>()
    var trabalhadores = ArrayList<MaoDeObra>()
    var insumos = ArrayList<Insumos>()
    var gastoTotal = 0.0

    fun cliente(nome: String):Obra{
        this.nome = nome
        return this
    }

    fun diasTrabalhado(dias: Int) :Obra{
        this.diasTrabalhado = dias
        return this
    }

    fun comEqipamentosUtilizados(equipamentos: ArrayList<Equipamento>) :Obra{
        this.equipamentos =equipamentos
        return this
    }

    fun contratarMaoDeObra(trabalhadores: ArrayList<MaoDeObra>) :Obra{
        this.trabalhadores =trabalhadores
        return this
    }

    fun comprarInsumos(insumos: ArrayList<Insumos>) :Obra{
        this.insumos =insumos
        return this
    }

    fun totalInsumos() :Obra{
        var total = 0.0

        total = totalizaInsumos(total)

        println("Valor Total com Insumos R$: ${total}")

        return this
    }

    fun gastosComMaoDeObra() :Obra{
        var total = 0.0

        total = totalizaMaoObra(total)

        println("Valor Total com Mão de Obra R$: ${total}")
        return this
    }

    fun gastoComEqupamentos() :Obra{
        var total = 0.0

        total = totalizaEquipamento(total)

        println("Valor Total com Equipamentos R$: ${total}")
        return this
    }

    fun totalGasto(){


        this.gastoTotal = totalizaInsumos(this.gastoTotal)

        this.gastoTotal = totalizaMaoObra(this.gastoTotal)

        this.gastoTotal = totalizaEquipamento(this.gastoTotal)

        println("\nCUSTO TOTAL DA OBRA R$: ${this.gastoTotal}")
    }

    private fun totalizaEquipamento(total: Double): Double {
        var total1 = total
        for (i in equipamentos) {
            total1 += i.qtdeHora * i.valorHora
        }
        return total1
    }

    private fun totalizaMaoObra(total: Double): Double {
        var total1 = total
        for (i in trabalhadores) {
            total1 += (this.diasTrabalhado * 8) * i.valorHora
        }
        return total1
    }

    private fun totalizaInsumos(total: Double): Double {
        var total1 = total
        for (i in insumos) {
            total1 += i.qtde * i.valor
        }
        return total1
    }
}