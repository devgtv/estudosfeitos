'''Melhore o desafio 061 , perguntando para o usuario se ele quer mostrar mais alguns termos
o Programa encerra quando ele disser que quer mostar 0 termos '''

print('Contador de PA')
primeiro = int(input('Qual é o termo da PA? '))
razao = int(input('Qual é a razão da PA? '))
termo = primeiro
cont = 1
mais = 10 
total = 0 
while mais != 0 : 
    total = total + mais
    while cont <= total : 
        print(f'{termo} >',end='')
        termo = termo + razao 
        cont = cont + 1
        print('Pausa')
        mais = int(input('Quantos termo você quer mostrar a mais ? '))
print(f'Prograssão finalizada com {total} termos mostrados')