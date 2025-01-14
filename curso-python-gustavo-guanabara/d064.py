'''Crie um programa que leia vários números inteiros pelo teclado.
O programa só vai parar quando o usuário digitar o valor 999, que é a condição de parada.
No final, mostre quantos números foram digitados e qual foi a soma entre eles (desconsiderando o valor de parada).'''
soma = 0 
num = int(input('Digite um numúmero:'))
while num != 999 : 
    soma = soma + num
    num = int(input('Digite um numúmero:'))
    
print(f'O valor da soma foi {soma}')
