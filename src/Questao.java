public class Questao {
    // Atributos da classe
    private String pergunta;
    private String[] alternativas;
    private int respostaCorreta;

    // Construtor da classe
    public Questao(String pergunta, String[] alternativas, int respostaCorreta) {
        // Verificando se a resposta correta está dentro dos limites válidos
        if (respostaCorreta < 0 || respostaCorreta >= alternativas.length) {
            throw new IllegalArgumentException("Índice da resposta correta inválido.");
        }

        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    // Getter para obter a pergunta
    public String getPergunta() {
        return pergunta;
    }

    // Getter para obter as alternativas
    public String[] getAlternativas() {
        return alternativas;
    }

    // Método que verifica se a resposta do usuário está correta
    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }

    // Método que exibe a pergunta e as alternativas no console
    public void exibirQuestao() {
        // Exibindo a pergunta
        System.out.println(this.pergunta);

        // Exibindo as alternativas
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println((i + 1) + ". " + alternativas[i]);
        }
    }

    // Método adicional para mostrar a resposta correta (caso necessário)
    public void mostrarRespostaCorreta() {
        System.out.println("Resposta correta: " + alternativas[respostaCorreta]);
    }
}
