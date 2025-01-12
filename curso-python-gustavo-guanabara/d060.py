''''Faça um programa que leia um numero qualquer e mostre o seu fatorial'''
from math import factorial
num = int(input('Informe o número que deseja saber seu fatorial: '))
fatorail = factorial(num)
print(f'O valor do fatorial de {num} é {fatorail}')
