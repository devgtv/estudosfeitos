#Refaça o desafio 35 dos triagnulos acrescentado o recuso de mostrar que tipo de triango sera formado#
# equilaero : todos os lados iguais , isosceles : dois lados iguais , escaleno : todos os lados diferentes

print('-='*20)
print('Analisador de Triângulos')
print('-='*20)

# Solicitação dos segmentos de reta
a = float(input('Informe o primeiro segmento: '))
b = float(input('Informe o segundo segmento: '))
c = float(input('Informe o terceiro segmento: '))

# Verificando se é possível formar um triângulo
if a < b + c and b < a + c and c < a + b:
    print('É possível formar um triângulo')

    # Identificando o tipo de triângulo
    if a == b == c:  
        print('É um triângulo equilátero (todos os lados iguais)')
    elif a == b or b == c or a == c:  
        print('É um triângulo isósceles (dois lados iguais)')
    else:  # Escaleno
        print('É um triângulo escaleno (todos os lados diferentes)')
else:
    print('Os segmentos acima NÃO PODEM FORMAR UM TRIÂNGULO')

