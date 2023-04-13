package br.com.HitchhikePlus.teste;

import br.com.HitchhikePlus.beans.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        // ApiColaboração
        String recebeEnderecoEmpresa = JOptionPane.showInputDialog("Cadastre o endereço da empresa: ");
        String recebeEnderecoMotorista = JOptionPane.showInputDialog("Cadastre o endereço do motorista: ");
        int recebeRaio = Integer.parseInt(JOptionPane.showInputDialog("Digite o raio de distancia a calcular: "));//Por padrão foi decidido 10km de raio de distancia mas como o entregável pediu JOptionpane em todos os atributos
        String recebeTrajeto = JOptionPane.showInputDialog("Digite o trajeto: "); //calculaTrajeto por um método/aplicativo (maps por exemplo)
        String recebeEnderecoPassageiro = JOptionPane.showInputDialog("Cadastre o endereço do passageiro: ");

        // Avaliação
        String recebeAvaliacaoViajem = JOptionPane.showInputDialog("Avalie sua viagem: ");
        String recebeAvaliacaoVeiculo = JOptionPane.showInputDialog("Avalie o veículo do motorista: ");
        String recebeAvaliacaoMotorista = JOptionPane.showInputDialog("Avalie o motorista: ");
        String recebeAvaliacaoPassageiro = JOptionPane.showInputDialog("Avalie o passageiro: ");
        String recebeComentario = JOptionPane.showInputDialog("Se for preferível deixe um comentário: ");

        // Conexão
        boolean recebeAmizade = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite se existe amizade ou não: "));

        // Conteudo
        String recebeMapa = JOptionPane.showInputDialog("Digite conteudo para o Mapa: ");
        String recebeForum = JOptionPane.showInputDialog("Digite conteudo para o Forum: ");
        String recebeHomepage = JOptionPane.showInputDialog("Digite conteudo para a HomePage: ");

        // Empresa
        String recebeNomeEmpresa = JOptionPane.showInputDialog("Digite o nome da Empresa Parceira: ");
        String recebeEmpresaFilial = JOptionPane.showInputDialog("Digite em qual filial você trabalha: ");
        String recebeEmailCorporativo = JOptionPane.showInputDialog("Digite seu email corporativo: ");
        String recebeCdVerificacao = JOptionPane.showInputDialog("Digite o código de verifição que você recebeu de sua empresa: ");

        // Forum
        String recebeAssunto = JOptionPane.showInputDialog("Digite o assunto: ");
        String recebeDuvida = JOptionPane.showInputDialog("Digite a sua dúvida: ");
        String recebeResposta = JOptionPane.showInputDialog("Digite a resposta da dúvida: ");

        // Veiculo
        String recebeModelo = JOptionPane.showInputDialog("Digite o modelo do seu carro: ");
        String recebePlaca = JOptionPane.showInputDialog("Digite a placa do seu carro: ");
        String recebeMarca = JOptionPane.showInputDialog("Digite a marca do seu carro: ");
        int recebeNumeroAssentos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de assentos: "));
        double recebeQtdeCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade que gasta em sua viajem: "));
        String recebeCor = JOptionPane.showInputDialog("Digite a cor do seu carro: ");

        // Viajem
        String recebeHorarioViajem = JOptionPane.showInputDialog("Digite o horario da viagem: ");
        double recebeDuracaoViajem = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração da viagem: "));;
        String recebeAndamento = JOptionPane.showInputDialog("Digite o andamento da viagem: ");

        // Usuario
        String recebeNome = JOptionPane.showInputDialog("Cadastre o seu nome: ");
        String recebeEmailPessoal = JOptionPane.showInputDialog("Cadastre o seu E-Mail pessoal: ");
        String recebeCpf = JOptionPane.showInputDialog("Cadastre o seu CPF: ");
        String recebeTelefone = JOptionPane.showInputDialog("Cadastre o seu telefone: ");
        char recebeGenero = JOptionPane.showInputDialog("Cadastre o seu gênero: ").charAt(4);
        String recebeDataNascimento = JOptionPane.showInputDialog("Cadastre a sua data de nascimento: ");
        String recebeBairo = JOptionPane.showInputDialog("Cadastre o seu bairro: ");
        String recebeCidade = JOptionPane.showInputDialog("Cadastre a sua cidade: ");
        String recebeEstado = JOptionPane.showInputDialog("Cadastre o seu estado: ");
        String recebeEndereco = JOptionPane.showInputDialog("Cadastre o seu endereço: ");
        String recebeComplementos = JOptionPane.showInputDialog("Cadastre os seus complementos: ");
        int recebeCep = Integer.parseInt(JOptionPane.showInputDialog("Cadastre o seu CEP: "));
        String recebeSenha = JOptionPane.showInputDialog("Cadastre a sua senha: ");

        // Instanciando Objetos!!

        ApiColaboracao apiColaboracao = new ApiColaboracao(recebeEnderecoEmpresa, recebeEnderecoMotorista,
                recebeRaio, recebeTrajeto, recebeEnderecoPassageiro);

        Avaliacao avaliacao = new Avaliacao(recebeHorarioViajem, recebeDuracaoViajem, recebeAndamento,
                recebeAvaliacaoViajem, recebeAvaliacaoVeiculo, recebeAvaliacaoMotorista,
                recebeAvaliacaoPassageiro, recebeComentario);

        Conexao conexao = new Conexao(recebeAmizade);

        Conteudo conteudo = new Conteudo(recebeMapa, recebeForum, recebeHomepage);

        Empresa empresa = new Empresa(recebeNome, recebeEmailPessoal, recebeCpf, recebeTelefone, recebeGenero,
                recebeDataNascimento, recebeBairo, recebeCidade, recebeEstado, recebeEndereco, recebeComplementos,
                recebeCep, recebeSenha, recebeNomeEmpresa, recebeEmpresaFilial, recebeEmailCorporativo,
                recebeCdVerificacao);

        Forum forum = new Forum(recebeAssunto, recebeDuvida, recebeResposta);

        Veiculo veiculo = new Veiculo(recebeNome, recebeEmailPessoal, recebeCpf, recebeTelefone, recebeGenero,
                recebeDataNascimento, recebeBairo, recebeCidade, recebeEstado, recebeEndereco, recebeComplementos,
                recebeCep, recebeSenha, recebeModelo, recebePlaca, recebeMarca, recebeNumeroAssentos,
                recebeQtdeCombustivel, recebeCor);

        Viagem viagem = new Viagem(recebeHorarioViajem, recebeDuracaoViajem, recebeAndamento);

        Chat chat = new Chat();

        Criptografia criptografia = new Criptografia();

    }
}