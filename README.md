# OrderBot Telegram - Done

O  **OrderBot Telegram  _v1_**  é uma aplicação inicial desenvolvida em Spring para facilitar o fluxo de pedidos em diferentes estabelecimentos, como restaurantes, farmácias, etc., através da plataforma Telegram. Esta aplicação utiliza a API do Telegram para se comunicar com os clientes e gerenciar seus pedidos de forma eficiente.

## Funcionalidades Principais

-   **Integração com o Google Gemini IA:**  O OrderBot Telegram utiliza a tecnologia de inteligência artificial do Google Gemini IA para oferecer respostas humanizadas aos clientes, proporcionando uma experiência de atendimento personalizada e eficaz.
-   **Fluxo de Pedidos Simplificado:**  Os clientes podem facilmente fazer pedidos através do Telegram, seguindo um fluxo intuitivo e simplificado, proporcionando uma experiência de usuário agradável e sem complicações.

## Pré-requisitos

Para executar o OrderBot Telegram, você precisará das seguintes ferramentas:

-   Java JDK 22 ou superior
-   Tokens do Telegram e do Gemini IA
-   ngrok

## Como Usar

Siga estas etapas para configurar e executar o OrderBot Telegram:

1.  **Crie um Bot no Telegram:**

    -   Siga o tutorial disponível em  [https://core.telegram.org/bots/tutorial#obtain-your-bot-token](https://core.telegram.org/bots/tutorial#obtain-your-bot-token)  para criar um bot no Telegram e obter seu token.
2.  **Configuração Local:**

    -   Utilize a ferramenta ngrok para disponibilizar o seu localhost na web.
    -   Adicione os tokens do Telegram e do Gemini IA em seus respectivos locais no arquivo  `application.yml`.
3.  **Adicione um Webhook:**

    -   Siga o tutorial em  [https://core.telegram.org/bots/api#setwebhook](https://core.telegram.org/bots/api#setwebhook)  para adicionar um webhook para o seu bot.
4.  **Executar o Aplicativo:**

    -   Compile e execute o aplicativo Spring Boot.
5.  **Interagir com o Bot:**

    -   Abra o Telegram e inicie uma conversa com o bot que você criou.
    -   Siga as instruções para fazer um pedido e interagir com o OrderBot Telegram.