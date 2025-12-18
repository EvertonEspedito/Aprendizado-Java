# 🔐 Gerador de Senhas com JavaFX

Este projeto é um **Gerador de Senhas** desenvolvido em **Java**, utilizando **JavaFX** para a interface gráfica. Ele permite ao usuário definir o tamanho da senha e gerar automaticamente uma senha aleatória composta por letras maiúsculas, minúsculas e números.

---

## 📂 Estrutura do Projeto

O projeto é composto por dois arquivos principais:

* **GeradorDeSenhas.java**
  Responsável pela lógica de geração de senhas. Utiliza a classe `SecureRandom` para garantir maior segurança na aleatoriedade.

* **FrontGeradorSenhas.java**
  Responsável pela interface gráfica (GUI) utilizando JavaFX. Permite a interação do usuário para informar o tamanho da senha e visualizar o resultado.

---

## ⚙️ Funcionalidades

* Definir o tamanho da senha
* Gerar senhas aleatórias
* Interface gráfica simples e intuitiva
* Uso de geração segura de números aleatórios (`SecureRandom`)

---

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 11 ou superior)**
* **JavaFX**
* **SecureRandom** (biblioteca padrão do Java)

---

## ▶️ Como Executar o Projeto

### 1️⃣ Compilar a classe de lógica

```bash
javac GeradorDeSenhas.java
```

### 2️⃣ Compilar a interface JavaFX

> Substitua `$PATH_TO_FX` pelo caminho da pasta `lib` do JavaFX no seu sistema.

```bash
javac --module-path $PATH_TO_FX --add-modules javafx.controls FrontGeradorSenhas.java
```

### 3️⃣ Executar a aplicação

```bash
java --module-path $PATH_TO_FX --add-modules javafx.controls FrontGeradorSenhas
```

---

## 🧠 Funcionamento Interno

* O usuário informa o tamanho da senha no campo de texto
* Ao clicar no botão **Gerar Senha**, a interface chama o método:

```java
GeradorDeSenhas.gerarSenhas(tamanho)
```

* A senha gerada é exibida automaticamente no campo de saída

---

## 📌 Observações

* O campo da senha gerada é apenas para leitura
* O projeto pode ser facilmente estendido para incluir caracteres especiais
* Ideal para fins didáticos e prática com JavaFX

---

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo em **Java e JavaFX**.

---

📘 *Sinta-se à vontade para melhorar a interface ou adicionar novas funcionalidades!*

