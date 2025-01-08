# Crie um programa que faça o computador jogar Jokenpô com você.

import random 
opcoes = ['pedra','papel','tesoura']
escolha_jogador = input('Escolha entre pedra,papel ou tesoura : ').lower().strip()
if escolha_jogador not in opcoes: 
    print('Escolha inválida.')
else:
    escolha_computador = random.choice(opcoes)
print(f'Você escolheu {escolha_jogador}')
print(f'O computador escolheu {escolha_computador}')
if escolha_jogador == escolha_computador : 
    print('EMPATE!')
elif (escolha_jogador == 'pedra') and escolha_computador =='tesoura' or (escolha_jogador == 'papel' and escolha_computador =='pedra' or (escolha_jogador == 'tesoura' and escolha_computador == 'papel')):
    print('VOCÊ GANHOU!')
else:
    print('O computador ganhou!')  
