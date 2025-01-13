'''Faça um programa que leia o sexo de uma pessoa, mas so aceita os valores M ou f 
Caso esteja errado, peçaa digitação novamente até ter um valor correto'''

sexo = str(input('Inform seu sexo: [M/F] ')).upper()[0].strip()
while sexo not in 'MF' : 
    sexo = str(input('Dados inválidos,Por favor,informe seu sexo : ')).strip().upper()[0]
print(f'Sexo {sexo} registrado com sucesso')