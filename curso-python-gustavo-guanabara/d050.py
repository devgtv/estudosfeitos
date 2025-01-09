# Desenvolva um programa que leia seis números inteiros.
# Mostre a soma apenas dos que forem pares e desconsidere os ímpares.

soma = 0
cont = 0
for c in range(1, 7 ) : 
    num = int(input(f'Digite o {c} valor: '))
    if num % 2 == 0 : 
        soma = soma + num
        cont = cont + 1
print(f'Você informou {cont} números pares e a soma foi {soma}')