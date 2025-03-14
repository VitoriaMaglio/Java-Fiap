public class TesteReceita {
    public static void main(String[] args) {
        //Instanciar um obj = Criar o objeto
        Receita boloFuba = new Receita();
        boloFuba.nomeReceita = "Bolo de fubá";
        boloFuba.modoDePreparo = "Adicione ...";
        boloFuba.autorReceita = "Claudia";
        boloFuba.dificuldadeReceita = "Fácil";
        boloFuba.descricao = "Legal";
        boloFuba.porcoes = 8;
        boloFuba.tempoPreparo = 35;
        boloFuba.ingredientes ="1 xícara de chá de óleo.\n" +
                "4 ovos\n" +
                "2 xícaras de chá de açúcar.\n" +
                "1 xícara de chá de leite morno.\n" +
                "2 xícaras de chá de farinha de trigo.\n" +
                "1 xícara de chá de fubá.\n" +
                "1 colher de sopa de fermento em pó.\n";
        boloFuba.exibirReceita();
        boloFuba.exibirReceita2();





        //System.out.println(boloFuba.tempoPreparo + " endereço" + boloFuba);




    }
}
