    # Elabore um programa que calcule o valor a ser pago por um produto, considerando o seu preço normal e a condição de pagamento:
    # À vista, dinheiro ou cheque: 10% de desconto
    # À vista no cartão: 5% de desconto
    # Em até 2x no cartão: preço normal
    # 3x ou mais no cartão: 20% de juros

valor = float(input('Informe o valor do produto a ser pago : '))

print('Escolha a forma de pagamento:')
print('1 - À vista no dinheiro ou cheque')
print('2 - À vista no cartão')
print('3 - Em até 2x no cartão')
print('4 - Em 3x ou mais no cartão')

opcao = int(input('Digite o número correspondente à forma de pagamento: '))

if opcao == 1:
    valor_final = valor - (valor * 10 / 100)
    print(f'Você irá pagar R$ {valor_final:.2f} e obteve um desconto de 10% de R$ {valor * 10 / 100:.2f}')
elif opcao == 2:
    valor_final = valor - (valor * 5 / 100)
    print(f'Você irá pagar R$ {valor_final:.2f} e obteve um desconto de 5% de R$ {valor * 5 / 100:.2f}')
elif opcao == 3:
    print(f'Você irá pagar duas parcelas de R$ {valor / 2 :.2f}')
elif opcao == 4:
    parcelas = int(input('Informe quantas parcelas será em 3x ou mais: '))
    if parcelas < 3:
        print('Erro: o número de parcelas deve ser 3 ou mais.')
    else:
        valor_final = valor + (valor * 20 / 100)
        valor_parcela = valor_final / parcelas
        print(f'Você irá pagar {parcelas} parcelas de R$ {valor_parcela:.2f} cada.')
else:
    print('Opção inválida')
