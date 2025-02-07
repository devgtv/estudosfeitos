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


print('='*20)
print(f'Os primeiros 5 times colocados são : {times[0:5]}') # Mostre os 5 primerios colocados 
print('='*20)
print(f'Os ultímos 4 colocados  são : {times[-4:]}') # Mostre os 4 ultímos colocados da tabela.
print('='*20)
print(f'Times em ordem alfabética: {sorted(times)}') # Mostre os times em ordem alfabética .
print('='*20)

localizador = str(input('Qual time que deseja localizar ? ')) # variavel responsavel por colher o dado do time a ser localizado.
posicao_time = times.index(localizador) # mostre a possição dentro da tupla aonde o time do usuario se encontra
print(f'O time {localizador} está na posição {posicao_time + 1}')