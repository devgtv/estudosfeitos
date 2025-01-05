# A Confederação Nacional de Natação precisa de um programa que leia o ano de nascimento de um atleta
# e mostre sua categoria, de acordo com a idade: até 9 anos: Mirim; até 14 anos: Infantil;
# até 19 anos: Júnior; até 20 anos: Sênior; acima: Master.

idade = int(input('Informe a sua idade: '))
if idade <= 9:
    print('O atleta está na categoria MIRIM!')
elif idade <= 14:
    print('O atleta está na categoria INFANTIL!')
elif idade <= 19:
    print('O atleta pertence à categoria JÚNIOR!')
elif idade <= 20:
    print('O atleta pertence à categoria SÊNIOR!')
else:
    print('O atleta é nível MASTER!')
