'''Crie um programa que simule o funcionamento de um caixa eletrônico.
No início, pergunte ao usuário qual será o valor a ser sacado (número inteiro)
e o programa informará quantas cédulas de cada valor serão entregues.
Obs: considere que o caixa possui cédulas de 50, 20, 10 e 1.'''

valor = int(input('Digite o valor que deseja sacar? '))

if valor // 50 > 0 : 
    print(f' ==> {valor//50} notas de R$50')
    valor = valor % 50

if valor // 20 > 0: 
    print('f==> {valor // 20} notas de R$ 20')
    valor = valor % 20 

if valor // 10 > 0: 
    print(f'==> {valor // 10} notas de R$ 10')
    valor = valor % 10 

if valor > 0 : 
    print(f'==> {valor} notas de R$1 ')