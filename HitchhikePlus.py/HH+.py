saida = 1
saidaLogin = 1
opcao2 = int(input("Deseja incluir dados do veiculo: 1- Sim / 2- Não "))

hitchhike = {}
veiculo = {}
    #USUARIO
while (saida == 1): #Usuario
    print("1 - Cadastro de Usuario ")
    print("2 - Login Usuario")
    print("3 - Exibir Usuarios")
    print("4 - Conferir se tem mais de um Usuario no mesmo bairro (minimo 2 users cadastrados)")
    print("5 - Deletar Minha Conta")

    opcao = int(input("Digite a opção desejada: "))
    if (opcao == 1): # Cadastro do Usuario
        nome = input("Nome e Sobrenome: ")
        user = input("Crie um User: ")
        email = input("Digite seu E-Mail: ")
        idade = int(input("Idade: "))
        bairro = input("Bairro: ")
        cpf = int(input("CPF(Apenas Números): "))
        numCelular = int(input("Digite seu número de telefone: "))
        senha = input("Crie uma senha: ")
        hitchhike[user] = {'nome': nome, 'user': user, 'email': email, 'idade': idade, 'bairro': bairro,
                          'cpf': cpf, 'celular': numCelular, 'senha': senha}
        print("Prencha informações do seu veiculo")
    if (opcao2 == 1):# Veiculo
        nome_empresa = input("Digite o nome da empresa: ")
        nome_veiculo = input("Nome o nome do veiculo: ")
        cor = input("Crie a cor do veiculo: ")
        placa = input("Digite a placa do veiculo: ")
        motorista[placa] = {'nome_empresa': nome_empresa, 'nome_veiculo': nome_veiculo, 'cor': cor, 'placa': placa}
    elif (opcao == 2): #Login
        user = input("Digite seu User: ")
        if (user in hitchhike ):
            senha = input("Digite sua senha: ")
        else:
            print("User não encontrado, Tente novamente")
        if (senha in hitchhike [user]['senha']):
            print("Você esta logado!")
            while (saidaLogin != 0):
                print("1 - Editar usuario")
                print("2 - Ver meu perfil")
                opcaoLogin = int(input("Digite a opção desejada: "))
                if (opcaoLogin == 1):
                    user = input("Digite seu User: ")
                    if (user in hitchhike ): #Usuario
                        hitchhike[user]['nome'] = input("Edite seu Nome e Sobrenome: ")
                        hitchhike[user]['email'] = input("Edite seu E-Mail:")
                        hitchhike[user]['idade'] = int(input("Edite sua Idade: "))
                        hitchhike[user]['endereco'] = input("Edite seu Endereço: ")
                        hitchhike[user]['cpf'] = int(input("Edite seu CPF: "))
                        hitchhike[user]['celular'] = int(input("Edite seu número de telefone: "))
                        hitchhike[user]['senha'] = input("Edite sua Senha: ")
                    print("Altere  informações do seu veiculo")
                    if (opcao2 == 1):  # Veiculo
                        veiculo[placa]['nome_empresa'] = input("Edite o nome da empresa: ")
                        veiculo[placa]['nome_veiculo'] = input("Edite o nome do veiculo: ")
                        veiculo[placa]['cor'] = input("Edite a cor do veiculo: ")
                if (opcaoLogin == 2):
                    print(hitchhike [user])
                saidaLogin = int(input("Deseja Continuar Logado? (1-SIM / 0-NÃO): "))
    elif (opcao == 3): #Mostrar Dados
        print(hitchhike)
        if (opcao2 == 1):
            print(veiculo)
    elif (opcao == 4):  # FAZENDO AINDA
        for chave, subdic in veiculo.items(): # Conferir se tem mais de um usuario na mesma empresa
            if (subdic['nome_empresa'] == ['nome_empresa']):
        for chave, subdic in hitchhike.items(): # Conferir se tem mais de um usuario no mesmo bairro
            if (subdic['bairro'] == ['bairro'] ):
                print("Possui usuarios da mesma empresa, no seu bairro")
    elif (opcao == 5): # Deletar dados
        user = input("Digite seu User: ")
        if (user in hitchhike ):
            senha = input("Digite sua senha: ")
            if (senha in hitchhike [user]['senha']):
                print("Você tem certeza que deseja deletar sua conta?")
                opcaoDelete = input("Digite (Sim) caso tenha certeza: ")
                if (opcaoDelete == "Sim") or (opcaoDelete == "s") or (opcaoDelete == "sim"):
                    user = input("Digite seu User para deletar sua conta: ")
                    del hitchhike[user]
                    del veiculo[placa]
                    print("Sua conta foi deletada com sucesso")
                else:
                    print("Você cancelou a operação ou errou seu User, tente novamente caso deseje excluir sua conta.")
    saida = int(input("Deseja Continuar? (1-SIM / 0-NÃO): "))
    saidaLogin = 1
















