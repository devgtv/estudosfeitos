# Faça um programa que leia um número inteiro e diga se ele é ou não um número primo.
num = int(input('Digite um número : '))
tot = 0
for c in range(1,num+1):
    if num % c == 0:
        print(f'\033[33m')
        tot = tot + 1
    else : 
        print('\033[31m') 
    print(f'{c}',end='')
print(f'\n O número {num} foi divisível {tot} vezes')
if tot == 2 : 
    print('E por isso ele é primo')
else:
    print('E por isso que ele não é primo ')
