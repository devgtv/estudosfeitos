'''Crie um programa que leia o nome e o preço de vários produtos. O programa deverá perguntar se o usuário
vai continuar. No final, mostre: qual é o total gasto na compra, quantos produtos custam mais de 1000,
e qual é o nome do produto mais barato.'''
total_gasto = 0 
produto_1000 = 1 
produto_mais_barato = ''
valor_mais_barato = 0 
while True : 
    produto = str(input('Informe o produto que deseja cadastar: '))
    valor_produto = float(input('Informe o valor do produto  cadastrado: '))
    continuar  = str(input('Deseja cadastrar outra pessoa ? [S/N]')).strip().upper()
    total_gasto = total_gasto + valor_produto
    if valor_produto > 1000 : 
        produto_1000 += 1
    if valor_produto < valor_mais_barato:
        valor_mais_barato = valor_produto
        produto_mais_barato = produto  
    if continuar == 'N': 
        break
print(f'O total gasto na compra foi de R${total_gasto:.2f}')
print(f'Você tem {produto_1000} produtos acima de 1000 reais')
print(f'O produto mais barato foi "{produto_mais_barato}" com o valor de R${valor_mais_barato:.2f}')