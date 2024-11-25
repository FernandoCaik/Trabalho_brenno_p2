import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("Alfredo Nasser");
        System.out.println("fernando caik de mello da silva");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Bem-vindo ao quiz sobre Carros! Você responderá 15 perguntas de múltipla escolha.");

        // Criar perguntas
        Questao[] questoes = new Questao[15];

        // Definição das perguntas sobre Carros
        questoes[0] = new Questao("Qual é o nome do sistema que permite que o carro pare de forma eficiente?",
                new String[]{"ABS", "ESC", "TCS", "ESP", "EBD"}, 0);
        questoes[1] = new Questao("Qual é a função do câmbio em um carro?",
                new String[]{"Controlar a velocidade", "Alterar a direção", "Gerenciar a distribuição de combustível", "Alterar as marchas", "Armazenar energia elétrica"}, 3);
        questoes[2] = new Questao("Qual tipo de combustível é utilizado por carros elétricos?",
                new String[]{"Gasolina", "Diesel", "Álcool", "Eletricidade", "Gás natural"}, 3);
        questoes[3] = new Questao("O que significa a sigla 'SUV' nos carros?",
                new String[]{"Sport Utility Vehicle", "Super Urban Vehicle", "Speed Unlimited Vehicle", "Sports Urban Vehicle", "Standard Utility Vehicle"}, 0);
        questoes[4] = new Questao("Qual é o nome do componente que transmite a potência do motor para as rodas?",
                new String[]{"Embreagem", "Câmbio", "Eixo de transmissão", "Volante", "Radiador"}, 2);
        questoes[5] = new Questao("O que é o sistema de injeção eletrônica?",
                new String[]{"Sistema que armazena combustível no tanque", "Sistema que controla a mistura de ar e combustível no motor", "Sistema de resfriamento do motor", "Sistema de freios", "Sistema de direção do veículo"}, 1);
        questoes[6] = new Questao("Qual é a principal função do radiador no carro?",
                new String[]{"Controlar a pressão do combustível", "Armazenar óleo", "Resfriar o motor", "Lubrificar os pistões", "Proteger o câmbio"}, 2);
        questoes[7] = new Questao("O que é um motor turbo?",
                new String[]{"Motor com maior capacidade", "Motor que utiliza eletricidade", "Motor que aumenta a potência com a ajuda de um compressor", "Motor movido a gás", "Motor com câmbio automático"}, 2);
        questoes[8] = new Questao("O que significa a sigla 'ABS' nos carros?",
                new String[]{"Air Brake System", "Anti-lock Braking System", "Automatic Brake Steering", "Accelerated Brake System", "Auxiliary Brake Support"}, 1);
        questoes[9] = new Questao("Qual é o principal objetivo de um airbag?",
                new String[]{"Aumentar a velocidade do carro", "Diminuir a velocidade", "Proteger os passageiros em caso de colisão", "Manter o carro estável", "Reduzir o consumo de combustível"}, 2);
        questoes[10] = new Questao("Qual é a função do catalisador no sistema de escape?",
                new String[]{"Melhorar a eficiência do combustível", "Filtrar as impurezas do ar", "Reduzir as emissões de gases poluentes", "Aumentar a potência do motor", "Melhorar a estabilidade do carro"}, 2);
        questoes[11] = new Questao("Qual é o tipo de carro que combina esportividade e desempenho com o conforto?",
                new String[]{"SUV", "Hatchback", "Sedan", "Coupé", "Minivan"}, 3);
        questoes[12] = new Questao("O que é o 'controle de tração' em um carro?",
                new String[]{"Controle da aceleração do motor", "Controle da estabilidade do carro em curvas", "Prevenção do deslizamento das rodas em superfícies escorregadias", "Sistema que ajuda nas trocas de marchas", "Controle da pressão dos pneus"}, 2);
        questoes[13] = new Questao("O que é um motor V8?",
                new String[]{"Motor com 8 cilindros em linha", "Motor com 4 cilindros em V", "Motor com 8 cilindros dispostos em V", "Motor com 8 cilindros horizontais", "Motor de alta eficiência com 6 cilindros"}, 2);
        questoes[14] = new Questao("Qual é a principal função do sistema de direção assistida?",
                new String[]{"Ajudar na frenagem do carro", "Reduzir o consumo de combustível", "Facilitar a manobra do volante", "Aumentar a velocidade do carro", "Ajustar a altura do banco"}, 2);

        // Variáveis para contagem de acertos e erros
        int acertos = 0;
        int erros = 0;

        // Loop pelas questões
        for (Questao questao : questoes) {
            questao.exibirQuestao();  // Exibe a pergunta e as alternativas

            // Ler resposta do usuário
            System.out.print("Digite o número da sua resposta: ");
            int resposta = scanner.nextInt() - 1;  // A resposta é dada em índice de 0 a 4 (correspondente a A, B, C, D, E)

            // Verificar resposta
            if (questao.verificarResposta(resposta)) {
                acertos++;
                System.out.println("Resposta correta!");
            } else {
                erros++;
                System.out.println("Resposta incorreta.");
            }
        }

        // Resultados finais
        System.out.println("\nVocê acertou " + acertos + " questões e errou " + erros + " questões.");
        double porcentagem = ((double) acertos / questoes.length) * 100;  // Cálculo da porcentagem com precisão
        System.out.printf("Sua porcentagem de acertos é: %.2f%%\n", porcentagem);

        scanner.close();
    }
}



