'''refaça o desafio 051, lendo o primerio termo e a razao de uma pa, mostrando os 10 primeriso termos
da prograssao usando a estrutura while. '''
print('Gerador de Pa')
print('-=' * 10)
primeiro = int(input('Primeiro termo : '))
razao = int(input('Razão da PA:'))
termo = primeiro
cont = 1 
while cont <= 10:
    print(f'{termo} > ', end=' ')
    termo = termo + razao
    cont = cont + 1
print('Fim')


