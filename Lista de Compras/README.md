# Lista de Compras - JavaFX

## 📋 Descrição
Este projeto é um **aplicativo de Lista de Compras** desenvolvido em **JavaFX**, com foco em aprendizado.
Ele permite adicionar, remover e exportar itens de uma lista utilizando uma interface gráfica simples.

---

## ⚙️ Funcionalidades
- ➕ Adicionar itens à lista
- ❌ Remover item selecionado
- 📄 Visualizar itens em uma ListView
- 💾 Exportar a lista para um arquivo `.txt`

---

## 🛠 Tecnologias Utilizadas
- Java
- JavaFX
- ListView
- ObservableList
- Manipulação de arquivos (`PrintWriter`)

---

## ▶️ Como Executar

### Compilar
```bash
javac --module-path $PATH_TO_FX --add-modules javafx.controls ListaDeCompras.java
```

### Executar
```bash
java --module-path $PATH_TO_FX --add-modules javafx.controls ListaDeCompras
```

> Substitua `$PATH_TO_FX` pelo caminho onde o JavaFX está instalado.

---

## 📂 Estrutura do Projeto
```
ListaDeCompras/
│
├── ListaDeCompras.java
├── listaDeCompras.txt
└── README.md
```

---

## 📤 Exportação
Ao clicar em **Exportar Lista**, os itens são salvos no arquivo `listaDeCompras.txt`, um item por linha.

---

## 🎯 Objetivo
Projeto criado para fins educacionais, visando praticar:
- Interfaces gráficas com JavaFX
- Eventos de botões
- Listas observáveis
- Escrita de arquivos

---

## 👨‍💻 Autor
Everton Santos  
Projeto de estudos em Java / JavaFX
