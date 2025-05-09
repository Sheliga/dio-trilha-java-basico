# ✅ Checklist - Projeto: DesafioControleFluxo

## 📁 Estrutura do Projeto
- [x] Criar o projeto `DesafioControleFluxo`
- [x] Criar a classe `Contador.java`
- [x] Criar a classe `ParametrosInvalidosException.java`

---

## 👨‍💻 Implementação da Classe `Contador.java`
- [x] Criar o método `main`
    - [x] Utilizar `Scanner` para ler dois inteiros do terminal
        - [x] Exibir mensagem: "Digite o primeiro parâmetro "
        - [x] Ler o primeiro número com `nextInt()`
        - [x] Exibir mensagem: "Digite o segundo parâmetro "
        - [x] Ler o segundo número com `nextInt()`
    - [x] Chamar o método `contar(parametroUm, parametroDois)`
    - [x] Tratar exceção `ParametrosInvalidosException`
        - [x] Exibir mensagem: "O segundo parâmetro deve ser maior que o primeiro"

- [x] Criar o método `contar(int parametroUm, int parametroDois)`
    - [x] Verificar se `parametroUm > parametroDois`
        - [x] Se sim, lançar `ParametrosInvalidosException`
    - [x] Calcular a diferença: `contagem = parametroDois - parametroUm`
    - [x] Executar um `for` de 1 até `contagem`
        - [ ] Imprimir: `System.out.println("Imprimindo o número " + i);`

---

## ❗ Implementação da Classe `ParametrosInvalidosException.java`
- [x] Estender a classe `Exception`
- [x] Criar um construtor que recebe uma `String mensagem`
- [x] Passar a mensagem para o construtor da superclasse (`super(mensagem)`)

---

## ✅ Testes
- [x] Testar com `parametroUm = 5` e `parametroDois = 10` → deve imprimir de 1 a 5
- [x] Testar com `parametroUm = 10` e `parametroDois = 5` → deve lançar exceção

---

## 💡 Extras (opcional)
- [x] Validar se os valores digitados são inteiros
- [x] Tratar possíveis exceções do `Scanner`
- [x] Adicionar comentários explicativos no código

