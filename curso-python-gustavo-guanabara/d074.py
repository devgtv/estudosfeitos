'''Crie um programa que vai gerar cinco números aleatórios e colocá-los em uma tupla.  
Depois disso, mostre a listagem de números gerados e também indique o menor e o maior valor que estão na tupla.'''
from random import randint
lista = (randint(0,99999), randint(0,99999), randint(0,99999), randint(0,99999),
         randint(0,99999))
print('Os valores sorteados foram : ', end='')
for n in lista: 
    print(f'{n}',end=' ')
maior_menor = sorted(lista)
print(f'\nO menor valor é: {maior_menor[0]}')
print(f'O menor valor é: {maior_menor[4]}')
# ou utilizar 

'''menor = min(tupla)
maior = max(tupla)'''
