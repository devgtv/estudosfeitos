'''melhore o jogo do desafio 028 aonde o computador vai ''pensar e um numero entre 0 e 10
so que agora o jogador vai tentar adivinhar ate acertar, mostrando no finl quantos palpites foram
necessarios para vencer'''

tentativas = 0 
from random import randint
print('Jogo da Advinhação')
# gera um número aleatório entre 0 e 10
num1 = int(input('informe um número entre 0 e 10 ')) 
num2 = randint(0,10)
# enquanto o número informado for diferente do número aleatório,continua tentando 
while num1 != num2 : 
    print('Resposta errada tente novamente')
    num1 = int(input('informe novamente outro número :'))
    tentativas = tentativas + 1

tentativas = tentativas + 1 
print(f'PARABÉNS! Você acertou o número e teve um total de {tentativas} tentativas.')