# 🎮 Jogo da Forca em Java (Console)

Este projeto é uma implementação simples do **Jogo da Forca**, desenvolvida em **Java**, executada no **terminal/console**. O objetivo é adivinhar a palavra secreta chutando letras antes que o número máximo de tentativas se esgote.

---

## 📂 Estrutura do Projeto

O projeto possui apenas uma classe:

* **ProjetoJogoDaForca.java**
  Contém toda a lógica do jogo, incluindo:

  * Escolha aleatória da palavra
  * Controle das tentativas
  * Verificação de letras corretas
  * Exibição do resultado final

---

## ⚙️ Funcionalidades

* Seleção aleatória de palavras
* Exibição da palavra com letras ocultas (`_`)
* Entrada de letras pelo usuário
* Controle de tentativas (6 tentativas)
* Verificação de vitória ou derrota

---

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 8 ou superior)**
* `ArrayList`
* `Scanner`
* `Random`

---

## ▶️ Como Executar o Projeto

### 1️⃣ Compilar o código

```bash
javac ProjetoJogoDaForca.java
```

### 2️⃣ Executar o programa

```bash
java ProjetoJogoDaForca
```

---

## 🧠 Funcionamento do Jogo

1. O programa escolhe aleatoriamente uma palavra de uma lista
2. A palavra é exibida como traços (`_`), um para cada letra
3. O jogador digita uma letra por vez
4. A cada erro, uma tentativa é perdida
5. O jogo termina quando:

   * Todas as letras são descobertas (vitória) ou
   * As tentativas acabam (derrota)

---

## 📌 Exemplo de Execução

```
Palavra: [_ , _ , _ , _ , _]
Chute uma letra: a
ERROU! Você tem mais: 5 tentativas!
```

---

## 🚀 Possíveis Melhorias

* Evitar letras repetidas
* Ignorar diferença entre maiúsculas e minúsculas
* Mostrar letras já utilizadas
* Desenhar a forca em ASCII Art
* Permitir palavras digitadas por outro jogador

---

## 👨‍💻 Autor

Projeto desenvolvido para fins **didáticos**, com foco no aprendizado de:

* Estruturas de dados
* Laços de repetição
* Condicionais
* Entrada de dados no Java

---

📘 *Excelente projeto para iniciantes praticarem lógica de programação!*

