'''Faça um programa que jogue par ou ímpar com o computador. O jogo só será interrompido  
quando o jogador perder, mostrando o total de vitórias consecutivas que ele conquistou no final do jogo.'''
from random import randint
vitorias_consecutivas = 0 
while True :
    escolha_jogador = str(input('Informe [PAR/IMPAR]')).strip().upper()
    if escolha_jogador not in ['PAR' ,'IMPAR'] : 
        print(f'Escolha inválida! ')
        continue
    escolha_num_jogador = int(input('Informe um número: '))
    escolha_num_maquina = randint(0, 10)
    
    soma = escolha_num_jogador  + escolha_num_maquina
    if soma % 2 == 0 : 
        resultado = 'PAR'
    else : 
        resultado = 'IMPAR'
    if escolha_jogador == 'PAR' and resultado ==  'PAR'  or escolha_jogador == 'IMPAR' and resultado == 'IMPAR' : 
        vitorias_consecutivas += 1 
        print(f'PARABENS VOCÊ GANHOU E ESTA COM {vitorias_consecutivas} vitorias consecutivas ! ')
    else : 
        print(f'Infelizmente você perdeu e fez {vitorias_consecutivas} vitorias consecutivas !')
        break