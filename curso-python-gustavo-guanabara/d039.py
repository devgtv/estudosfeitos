# Faça um programa que leia o ano de nascimento de um jovem e informe, de acordo com sua idade:
# Se ele ainda vai se alistar ao serviço militar.
# Se é a hora de se alistar.
# Se já passou o tempo do alistamento.
# Seu programa também deve mostrar o tempo que faltou ou que passou do prazo.

from datetime import date
atual = date.today().year
nasc = int(input('Ano de nascimento : '))
idade = atual - nasc
print(f'Quem nasceu em {nasc} tem {idade} anos em {atual}')
if idade == 18 : 
    print('Voce tera que se aliastar')
elif idade < 18 : 
    print(f'Ainda não e a hora ainda falta {18 - idade} anos para adentrar ao exercito brasileiro')
else  : 
    print(f'Voce passou do tempo de se aliastar em {idade - 18} anos')
