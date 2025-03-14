public class Receita {

    String nomeReceita;
    String autorReceita;
    String ingredientes;
    String modoDePreparo;
    String dificuldadeReceita;
    int tempoPreparo;
    int porcoes;
    String descricao;
// método sem retorno ->
    public void exibirReceita() {
        System.out.println("Receita de " + nomeReceita);
        System.out.println("=====================");
        System.out.println("Publicado por: " + autorReceita);
        System.out.println(dificuldadeReceita + "\t" + tempoPreparo + "\t" + porcoes);
        System.out.println("Ingridientes\n " + ingredientes);
        System.out.println("Modo de preparo\n " + modoDePreparo);
    }

        public String exibirReceita2() {

            String mensagem = "Receita de " + nomeReceita +
                    "\n=========================================" +
                    "\nPublicado por: " + autorReceita +
                    "\nDificuldade: " + dificuldadeReceita +
                    "\nTempo de Preparo: " + tempoPreparo + " minutos" +
                    "\nPorções: " + porcoes;
            return mensagem;
        }

    }




