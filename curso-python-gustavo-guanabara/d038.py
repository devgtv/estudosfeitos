# Escreva um programa que leia dois números inteiros e compare-os, mostrando na tela uma mensagem:
# O primeiro valor é maior / o segundo valor é maior / não existe valor maior, os dois são iguais.
n1 = int(input('Informe o primeiro número que deseja comparar : '))
n2 = int(input('Informe o segundo número que deseja comparar : '))
if n1 == n2 : 
    print(f'Não existe valor maior, os doias são iguais.')
elif n1 > n2 : 
    print(f'O primeiro valor ({n1}) é maior que o segundo valor ({n2}).)')
else  : 
    print(f'O segundo valor ({n2}) é maior que o primeiro valor ({n1}).')