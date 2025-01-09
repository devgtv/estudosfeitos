# Desenvolva um programa que leia o primeiro termo e a razão de uma PA.
# No final, mostre os 10 primeiros termos dessa progressão.
primerio = int(input('Primeiro termo: '))
razao = int(input('Razão: '))
decimo = primerio + (10-1)*razao
for c in range(primerio,decimo + razao ,razao):
    print(f'{c}',end=' > ' )
print('Acabou')