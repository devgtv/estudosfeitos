'''Crie um programa que leia a idade e o sexo de várias pessoas. A cada pessoa cadastrada, o programa
deverá perguntar se o usuário quer ou não continuar. No final, mostre quantas pessoas têm mais de 18 anos,
quantos homens foram cadastrados e quantas mulheres têm menos de 20 anos.'''

quant_homens = 0
quant_homens_acima_18  = 0
quant_mulheres = 0
quant_mulheres_acima_18 = 0
quant_mulheres_menor_20 = 0

while True: 
    sexo = str(input('Informe [M] para masculino e [F] para feminino: ')).upper().strip()[0]
    idade = int(input('Informe a idade da pessoa em anos!'))

    if sexo in ['M'] : 
        quant_homens += 1 
        if idade > 18 : 
            quant_homens_acima_18 += 1 

    elif sexo in ['F'] : 
        quant_mulheres += 1 
        if idade > 18 : 
            quant_mulheres_acima_18 += 1  
        if idade < 20 :
            quant_mulheres_menor_20 += 1 

    continuar = input('Deseja cadastrar outra pessoa ? [S/N] : ').upper().strip()[0]
    if continuar == 'N' : 
        break
total_pessoas_acima_18 = quant_homens_acima_18  + quant_mulheres_acima_18
print(f'O total de pessoas acima de 18 anos é: {total_pessoas_acima_18}')
print(f'O total de mulheres com menos de 20 anos é: {quant_mulheres_menor_20}')
print(f'O total de homens cadastrados é: {quant_homens}')

