# ✅ Checklist - Projeto: DesafioControleFluxo

## 📁 Estrutura do Projeto
- [X] Criar o projeto `DesafioControleFluxo`
- [ ] Criar a classe `Contador.java`
- [ ] Criar a classe `ParametrosInvalidosException.java`

---

## 👨‍💻 Implementação da Classe `Contador.java`
- [ ] Criar o método `main`
    - [ ] Utilizar `Scanner` para ler dois inteiros do terminal
        - [ ] Exibir mensagem: "Digite o primeiro parâmetro"
        - [ ] Ler o primeiro número com `nextInt()`
        - [ ] Exibir mensagem: "Digite o segundo parâmetro"
        - [ ] Ler o segundo número com `nextInt()`
    - [ ] Chamar o método `contar(parametroUm, parametroDois)`
    - [ ] Tratar exceção `ParametrosInvalidosException`
        - [ ] Exibir mensagem: "O segundo parâmetro deve ser maior que o primeiro"

- [ ] Criar o método `contar(int parametroUm, int parametroDois)`
    - [ ] Verificar se `parametroUm > parametroDois`
        - [ ] Se sim, lançar `ParametrosInvalidosException`
    - [ ] Calcular a diferença: `contagem = parametroDois - parametroUm`
    - [ ] Executar um `for` de 1 até `contagem`
        - [ ] Imprimir: `System.out.println("Imprimindo o número " + i);`

---

## ❗ Implementação da Classe `ParametrosInvalidosException.java`
- [ ] Estender a classe `Exception`
- [ ] Criar um construtor que recebe uma `String mensagem`
- [ ] Passar a mensagem para o construtor da superclasse (`super(mensagem)`)

---

## ✅ Testes
- [ ] Testar com `parametroUm = 5` e `parametroDois = 10` → deve imprimir de 1 a 5
- [ ] Testar com `parametroUm = 10` e `parametroDois = 5` → deve lançar exceção

---

## 💡 Extras (opcional)
- [ ] Validar se os valores digitados são inteiros
- [ ] Tratar possíveis exceções do `Scanner`
- [ ] Adicionar comentários explicativos no código

