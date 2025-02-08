produtos = (
    ("Produto A", 50.99,60),
    ("Produto B", 30.00,60),
    ("Produto C", 120.45,60)
)

# Aqui, 'produtos' é uma tupla contendo outras tuplas
print(produtos)
# Saída: (('Produto A', 50.99), ('Produto B', 30.0), ('Produto C', 120.45))

# Para acessar uma sub-tupla:
print(produtos[0])  # Saída: ('Produto A', 50.99)

# E para acessar os elementos dentro da sub-tupla:
print(produtos[0][2])  # Saída: Produto A (nome)
 # Saída: 50.99 (preço)
