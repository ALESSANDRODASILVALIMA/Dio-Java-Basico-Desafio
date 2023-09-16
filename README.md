## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).




# iPhone

O iPhone é um dispositivo multifuncional que inclui um reprodutor musical, um telefone e um navegador de internet.

## Funcionalidades Gerais
- Tocar música
- Pausar música
- Selecionar música
- Fazer ligações telefônicas
- Atender chamadas
- Iniciar conversa por voz
- Exibir páginas da web
- Adicionar novas abas no navegador
- Atualizar páginas da web

## Reprodutor Musical
- Classe: ReprodutorMusical

### Funcionalidades do Reprodutor Musical
- Tocar música
- Pausar música
- Selecionar música

## Telefone
- Classe: AparelhoTelefonico

### Funcionalidades do Telefone
- Fazer ligações telefônicas
- Atender chamadas
- Iniciar conversa por voz

## Navegador de Internet
- Classe: NavegadorInternet

### Funcionalidades do Navegador de Internet
- Exibir páginas da web
- Adicionar novas abas no navegador
- Atualizar páginas da web


# ----------------------------------------------------------------------------
# Diagrama em formato tabela
# iPhone

| Componente              | Classe                   |
|-------------------------|--------------------------|
| **iPhone**              |                          |
| - reprodutor            | ReprodutorMusical        |
| - telefone              | AparelhoTelefonico       |
| - navegador             | NavegadorInternet        |

## Funcionalidades Gerais

| Método                                 | Descrição                               |
|----------------------------------------|-----------------------------------------|
| + tocarMusica(): void                  | Toca música                             |
| + pausarMusica(): void                 | Pausa a reprodução de música            |
| + selecionarMusica(musica: String): void | Seleciona uma música                   |
| + ligar(numero: String): void          | Faz uma ligação telefônica              |
| + atender(): void                      | Atende uma chamada telefônica           |
| + iniciarConversaVoz(): void           | Inicia uma conversa por voz             |
| + exibirPagina(url: String): void      | Exibe uma página da web                 |
| + adicionarNovaAba(): void             | Adiciona uma nova aba no navegador      |
| + atualizarPagina(): void              | Atualiza a página da web                |

## ReprodutorMusical

| Método                                 | Descrição                               |
|----------------------------------------|-----------------------------------------|
| + tocar(): void                        | Inicia a reprodução de música           |
| + pausar(): void                       | Pausa a reprodução de música            |
| + selecionarMusica(musica: String): void | Seleciona uma música                   |

## AparelhoTelefonico

| Método                                 | Descrição                               |
|----------------------------------------|-----------------------------------------|
| + ligar(numero: String): void          | Faz uma ligação telefônica              |
| + atender(): void                      | Atende uma chamada telefônica           |
| + iniciarConversaVoz(): void           | Inicia uma conversa por voz             |

## NavegadorInternet

| Método                                 | Descrição                               |
|----------------------------------------|-----------------------------------------|
| + exibirPagina(url: String): void      | Exibe uma página da web                 |
| + adicionarNovaAba(): void             | Adiciona uma nova aba no navegador      |
| + atualizarPagina(): void              | Atualiza a página da web                |