# Escreva um programa para aprovar o empréstimo bancário para a compra de uma casa.
# O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
# Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário, caso contrário o empréstimo será negado.]

casa = float(input('Qual e o valor da casa que gostaria de comprar ? '))
salario = float(input('Qual e o seu salário ? '))
tempo = int(input('Em quantos anos vai pagar ? '))
parcela = casa / (tempo * 12) 
if parcela > (30 / 100 ) * salario : 
    print('Emprestimo negado ! ')
else  : 
       print(f'Seu empréstimo foi aprovado! Você terá que pagar R${parcela:.2f} mensalmente durante {tempo} anos! ou  {tempo*12} messes')