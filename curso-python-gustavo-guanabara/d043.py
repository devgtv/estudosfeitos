# Desenvolva uma lógica que leia o peso e a altura de uma pessoa, calcule seu IMC e mostre seu status, de acordo
# com a tabela abaixo:
# Abaixo de 18,5: abaixo do peso; entre 18,5 e 25: peso ideal; entre 25 e 30: sobrepeso;
# entre 30 e 40: obesidade; acima de 40: obesidade mórbida.

peso = float(input('Informe o seu peso : '))
altura = float(input('Informe sua altura :'))
imc = peso / (altura**2)

if imc < 18.5 : 
    print(f'Seu imc é {imc:.3f} e você está abaixo do peso.')
elif imc > 18.5 and imc < 25 :
    print(f'Seu imc é {imc:.2f} e você está no peso ideial.')
elif imc > 25 and imc < 30 :
    print(f'Seu imc é {imc:.2f} e você está com sobrepeso.')
elif imc > 30 and imc < 40 :
    print(f'Seu imc é {imc:.2f} e você esta com obesidade.')
else: 
    print(f'Seu imc é {imc:.2f} e você esta com obesidade mórbida. ')
    