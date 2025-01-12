n1 = float(input('Informe o primeiro número: '))
n2 = float(input('Informe o segundo número: '))
opcao = 0

while opcao != 5:
    print('''    [1] somar
    [2] multiplicar
    [3] maior 
    [4] novos números
    [5] sair do programa ''')
    
    opcao = int(input('Qual é a sua opção? '))
    
    if opcao == 1:
        soma = n1 + n2
        print(f'A soma entre {n1} e {n2} é {soma}')
    elif opcao == 2:
        multiplicar = n1 * n2
        print(f'A multiplicação de {n1} e {n2} é {multiplicar}')
    elif opcao == 3:
        if n1 > n2:
            maior = n1
        elif n2 > n1:
            maior = n2
        else:
            maior = n1  # Caso os números sejam iguais
        print(f'O maior número entre {n1} e {n2} é {maior}')
        if n1 == n2:
            print(f'Os dois números são iguais!')
    elif opcao == 4:
        print('Informe os números novamente:')
        n1 = float(input('Informe o primeiro número: '))
        n2 = float(input('Informe o segundo número: '))
    elif opcao == 5:
        print('Finalizando...')
    else:
        print('Opção inválida. Tente novamente')
    
    print('=-=' * 10)

print('Fim do programa! Volte sempre.')
