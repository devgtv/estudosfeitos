'''Crie uma tupla preenchida com os 20 primeiros colocados da tabela do Campeonato Brasileiro de Futebol, na ordem de colocação.  
Depois, mostre:  
- Apenas os 5 primeiros colocados  
- Os últimos 4 colocados da tabela  
- Uma lista com os times em ordem alfabética  
- Em que posição na tabela está o time da Goias?'''  
times = (
    "Botafogo", "Palmeiras", "Flamengo", "Fortaleza", "Internacional", "São Paulo",
    "Corinthians", "Bahia", "Cruzeiro", "Vasco da Gama", "Vitória", "Atlético Mineiro",
    "Fluminense", "Grêmio", "Juventude", "Bragantino", "Athletico Paranaense", "Cuiabá",
    "Goiás", "América Mineiro"
)


# Exemplo de
print('='*20)
print(f'Os primeiros 5 times colocados são : ')

for cont in range(0,5) :
    print(f'{times[cont]} ')

print('='*20)
print(f'Os ultímos 4 colocados da tabela')
for cont in range(-4,0) : 
    print(f'{times[cont]} ')


localizador = str(input('Qual time que deseja localizar ? '))
posicao_time = times.index(localizador)
print(f'O time {localizador} está na posição {posicao_time + 1}')