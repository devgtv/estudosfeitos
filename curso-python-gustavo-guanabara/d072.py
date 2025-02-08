'''Crie um programa que tenha uma tupla completamente preenchida com a contagem por extenso, de zero até vinte.  
O seu programa deverá ler um número pelo teclado entre 0 e 20  
e exibi-lo por extenso.'''  

num = ('Zero', 'Um','Dois','Tres','Quatro','Cinco','Seis','Sete','Oito','Nove','Dez','Onze','Doze','Treze','Catorze','Quinze','Dezesseis','dezessete','Dezoito','Dezonove','Vinte')
while True : 

    n = int(input('Digite um número entre 0 e 20: '))
    if 0 <= n and n <=20 : 
        print(f'Digitate o número: {num[n]}') 
    continuar = str(input('Deseja continuar [S/N]: ')).upper().strip()[0]
    if continuar in 'N': 
        break