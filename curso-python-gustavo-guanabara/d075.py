'''Desenvolva um programa que leia quatro valores pelo teclado e os armazene em uma tupla. No final, mostre:
quantas vezes apareceu o valor 9,
em que posição foi digitado o primeiro valor 3,
quais foram os números pares.'''
num = (int(input('Digite um número : ')),
       int(input('Digite outro número : ')),
       int(input('Digite outro número : ')),
       int(input('Digite outro número : ')),)
print('='*20)   
print(f'Você digitou os valores {num}')
print('='*20)   
print(f'O numero de vezes que apareceu o valor 9 foi {num.count(9)} vezes.')
while True : 
    for cont_par in num : 
        if cont_par % 2 == 0 : 
            print(f'{cont_par} e par')
    else : 
        break

if 3 in num : 
    print(f'O número 3 apareceu na posição {num.index(3)+1}')
else : 
    print(f'O número 3 não aparece')

