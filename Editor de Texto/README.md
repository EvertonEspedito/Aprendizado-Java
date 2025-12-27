# 📝 Editor Básico de Texto em JavaFX

Este projeto é um **editor básico de texto** desenvolvido em **Java
utilizando JavaFX**, com funcionalidades essenciais como **abrir, editar
e salvar arquivos de texto (.txt)**, funcionando de forma semelhante a
um bloco de notas simples.

------------------------------------------------------------------------

## 📌 Funcionalidades

-   📂 Abrir arquivos de texto existentes
-   ✏️ Editar o conteúdo do arquivo
-   💾 Salvar alterações no mesmo arquivo
-   🆕 Criar e salvar novos arquivos
-   🖱 Interface gráfica simples e intuitiva
-   📑 Barra de ferramentas com botões de ação

------------------------------------------------------------------------

## 🛠️ Tecnologias Utilizadas

-   Java
-   JavaFX
-   TextArea
-   FileChooser
-   BorderPane
-   ToolBar

------------------------------------------------------------------------

## 🖥️ Interface

O editor possui: - Uma área de texto central para edição - Uma barra de
ferramentas superior com os botões: - Abrir Arquivo - Salvar

------------------------------------------------------------------------

## 📂 Estrutura do Projeto

    EditorDeTexto/
    │
    ├── EditorDeTexto.java
    └── README.md

------------------------------------------------------------------------

## ▶️ Como Executar

### Pré-requisitos

-   Java JDK 11 ou superior
-   JavaFX configurado no ambiente

### Compilação e Execução

``` bash
javac --module-path PATH_PARA_JAVAFX/lib --add-modules javafx.controls EditorDeTexto.java
java --module-path PATH_PARA_JAVAFX/lib --add-modules javafx.controls EditorDeTexto
```

> Substitua `PATH_PARA_JAVAFX` pelo caminho onde o JavaFX está
> instalado.

------------------------------------------------------------------------

## 🧠 Funcionamento

-   O `TextArea` permite a edição livre do texto.
-   O `FileChooser` é usado para abrir e salvar arquivos.
-   O sistema mantém referência ao arquivo atual, permitindo
    sobrescrever ao salvar.
-   Se nenhum arquivo estiver aberto, o botão **Salvar** solicita o nome
    do arquivo.

------------------------------------------------------------------------

## 🚀 Melhorias Futuras

-   Buscar e substituir texto
-   Atalhos de teclado (Ctrl + S / Ctrl + O)
-   MenuBar (Arquivo / Editar / Ajuda)
-   Detecção de alterações não salvas
-   Suporte a múltiplos arquivos (abas)

------------------------------------------------------------------------

## 👨‍💻 Autor

**Everton Santos**

Projeto desenvolvido para fins de aprendizado em JavaFX.
