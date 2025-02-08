'''Crie um programa que tenha uma tupla única com nomes de produtos e seus respectivos preços,
 na sequência. No final, mostre uma listagem de preços, organizando os dados em forma tabular.
'''
listagem = (
    ('Caneta', 1.99),
    ('Boracha', 2.45),
    ('Caderno', 3),
    ('Mochila', 145.56),
    ('Fichario', 175.23),
    ('Estojo', 42.50),
    ('Compasso', 30),
    ('Transferidor', 16),
    ('Livro', 12)
)

for produto, preco in listagem:
    print(f"{produto:.<20} R${preco:>5.2f}")
