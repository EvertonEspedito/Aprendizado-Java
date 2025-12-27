# 🌐 Navegador Web Simples em JavaFX

Este projeto é um **navegador web básico** desenvolvido em **Java com
JavaFX**, utilizando os componentes `WebView` e `WebEngine` para
carregar e exibir páginas da web dentro de uma aplicação desktop.

O usuário pode digitar uma URL e pressionar **Enter** para navegar até o
site desejado.

------------------------------------------------------------------------

## 📌 Funcionalidades

-   🌍 Carregamento de páginas web
-   ⌨️ Campo de texto para digitar URLs
-   🔗 Formatação automática da URL (`http://` ou `https://`)
-   🖥 Interface gráfica simples e funcional

------------------------------------------------------------------------

## 🛠️ Tecnologias Utilizadas

-   **Java**
-   **JavaFX**
-   `WebView`
-   `WebEngine`
-   `TextField`
-   `VBox`

------------------------------------------------------------------------

## 🖥️ Interface

A interface do navegador contém: - Um **campo de texto** para inserir a
URL - Uma **área de visualização web** para exibir o site carregado

Tudo organizado verticalmente usando um `VBox`.

------------------------------------------------------------------------

## 📂 Estrutura do Projeto

    WebBrowser/
    │
    ├── WebBrowser.java
    └── README.md

------------------------------------------------------------------------

## ▶️ Como Executar

### Pré-requisitos

-   Java JDK 11 ou superior
-   JavaFX configurado no ambiente

### Compilação

``` bash
javac --module-path PATH_PARA_JAVAFX/lib --add-modules javafx.web WebBrowser.java
```

### Execução

``` bash
java --module-path PATH_PARA_JAVAFX/lib --add-modules javafx.web WebBrowser
```

> Substitua `PATH_PARA_JAVAFX` pelo caminho onde o JavaFX está
> instalado.

------------------------------------------------------------------------

## 🧠 Funcionamento do Código

-   O `TextField` captura a URL digitada pelo usuário.
-   Ao pressionar **Enter**, o `WebEngine` carrega a página.
-   O método `formatUrl()` garante que a URL tenha o protocolo correto
    (`http://` ou `https://`).
-   O `WebView` renderiza o conteúdo da página dentro da aplicação.

------------------------------------------------------------------------

## 🚀 Possíveis Melhorias Futuras

-   Botões de **Voltar / Avançar**
-   Histórico de navegação
-   Barra de progresso de carregamento
-   Suporte a múltiplas abas
-   Favoritos

------------------------------------------------------------------------

## 👨‍💻 Autor

**Everton Santos**

Projeto desenvolvido para fins de **aprendizado em JavaFX e integração
com conteúdo web**.
