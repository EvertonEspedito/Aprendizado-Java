# Relógio Digital (JavaFX)

Este projeto é uma aplicação desenvolvida em **JavaFX** que exibe um
relógio digital em tempo real.\
A interface atualiza automaticamente a cada segundo usando `Timeline` e
`KeyFrame`.

## ⏱️ Funcionalidades

-   Exibição da hora atual no formato **HH:mm:ss**
-   Atualização automática a cada segundo
-   Interface simples com fundo preto e texto amarelo
-   Uso de `Timeline`, `KeyFrame` e `DateTimeFormatter`

## 🖥️ Como funciona

O programa utiliza:

``` java
KeyFrame keyFrameAtualizar = new KeyFrame(Duration.ZERO, e -> {
    rotuloTempo.setText(LocalDateTime.now().format(FORMATADOR));
});
```

E atualiza a cada 1 segundo:

``` java
KeyFrame keyFrameIntervalo = new KeyFrame(Duration.seconds(1));
```

A timeline roda indefinidamente:

``` java
relogio.setCycleCount(Animation.INDEFINITE);
relogio.play();
```

## ▶️ Como executar

### Via terminal:

``` bash
javac --module-path /caminho/javafx/lib --add-modules javafx.controls RelogioDigital.java
java --module-path /caminho/javafx/lib --add-modules javafx.controls RelogioDigital
```

Substitua **/caminho/javafx/lib** pelo diretório real do JavaFX no seu
sistema.

## 📦 Pré-requisitos

-   Java JDK 8+
-   JavaFX SDK compatível

## 📄 Licença

Livre para estudo, uso pessoal e aprimoramentos.
