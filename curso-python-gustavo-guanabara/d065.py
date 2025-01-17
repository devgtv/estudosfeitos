'''Crie um programa que leia varios numeros inteiros pelo teclado.No FInal da execução,mostre
a media entre todos os valores e qual foi o maior e o menor valores lidos. programa deve
perguntar ao usuario se ele quer ou nao continuar a digitar valores'''
 
resp = 'S'
soma = quant = media = maior = menor =  0
while resp in 'Ss': 
    num = int(input('Digite um número:'))
    soma += num
    quant += 1 
    if quant == 1 : 
        maior = menor = num
    else : 
        if num > maior : 
            maior = num
        if num < menor : 
            menor = num
    resp = str(input('Quer continuar? [S/N] ')).upper().strip()[0]
media = soma / quant
print(f'Voce digitou {quant} números e a media foi {media}')
print(f'O maior valor foi {maior} e o menor foi {menor}')