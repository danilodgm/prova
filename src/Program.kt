


fun main(args: Array<String>) {


    var funcionario1 = MaoDeObra()
        .comNome("Jose")
        .valorHora(60.0)

    var funcionario2 = MaoDeObra()
        .comNome("João")
        .valorHora(30.0)

    var funcionario3 = MaoDeObra()
        .comNome("Sergio")
        .valorHora(160.0)


    var funcionario4 = MaoDeObra()
        .comNome("Pedro")
        .valorHora(50.0)

    var trabalhadores = ArrayList<MaoDeObra>()

    trabalhadores.add(funcionario1)
    trabalhadores.add(funcionario2)
    trabalhadores.add(funcionario3)
    trabalhadores.add(funcionario4)

    var trator = Equipamento()
        .nome("Trator")
        .aluguelHora(20.0)
        .horaTrabalhada(10)

    var andaime = Equipamento()
        .nome("Andaime")
        .aluguelHora(10.0)
        .horaTrabalhada(10)

    var betoneira = Equipamento()
        .nome("Betoneira")
        .aluguelHora(20.0)
        .horaTrabalhada(30)

    var equipamentos = ArrayList<Equipamento>()
    equipamentos.add(trator)
    equipamentos.add(andaime)
    equipamentos.add(betoneira)



    var cimento = Insumos()
        .nome("Cimento")
        .custo(20.0)
        .quantidade(5)

    var cal = Insumos()
        .nome("Cal")
        .custo(10.0)
        .quantidade(2)

    var tijolo = Insumos()
        .nome("Tijolo")
        .custo(500.0)
        .quantidade(2)



    var insumos = ArrayList<Insumos>()
    insumos.add(cimento)
    insumos.add(cal)
    insumos.add(tijolo)

    var contrucao1 = Obra()
        .cliente("Vale")
        .diasTrabalhado(30)
        .contratarMaoDeObra(trabalhadores)
        .comEqipamentosUtilizados(equipamentos)
        .comprarInsumos(insumos)
        .totalInsumos()
        .gastosComMaoDeObra()
        .gastoComEqupamentos()
        .totalGasto()



}