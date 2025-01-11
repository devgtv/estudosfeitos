# Desenvolva um programa que leia o nome, idade e sexo de 4 pessoas. 
# No final do programa, mostre:
# a média de idade do grupo, 
# qual é o nome do homem mais velho e quantas mulheres têm menos de 20 anos.
soma_idade = 0
media_idade = 0
maior_idade_homen = 0 
nome_velho = ''
tot_mulher_20 = 0 
for p in range(1, 5):
    print(f'------ {p} -------')
    nome = str(input('Nome: ')).strip()
    idade = int(input('Idade: '))
    sexo = str(input('Sexo [M/F]')).strip()
    soma_idade = soma_idade + idade
    if p == 1 and sexo in 'Mm':
        maior_idade_homen = idade
        nome_velho = nome
    if sexo in 'Mm' and idade > maior_idade_homen: 
        maior_idade_homen = idade
        nome_velho = nome
    if sexo in 'Ff' and idade > 20 : 
        tot_mulher_20 = tot_mulher_20 +1
        
media_idade = soma_idade / 4
print(f'A média de idade do grupo é de {media_idade} anos.')
print(f'O homen mais velho tem {maior_idade_homen} anos e se chama {nome_velho}')
print(f'Ao todo são {tot_mulher_20} mulheres com menos de 20 anos. ')