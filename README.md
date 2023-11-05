<h1 align="center"> Serialização </h1>

A serialização é um processo em Java que permite converter o estado de um objeto em uma sequência de bytes. Essa sequência de bytes pode ser armazenada em um arquivo, transmitida pela rede ou usada para criar um clone do objeto.

Para que um objeto possa ser serializado, ele deve implementar a interface Serializable. Essa interface não possui nenhum método a ser implementado, mas apenas indica que o objeto é serializável.

O processo de serialização é realizado pelo método writeObject() da classe ObjectOutputStream. Esse método escreve a sequência de bytes que representa o estado do objeto no fluxo de saída.

O processo de desserialização é realizado pelo método readObject() da classe ObjectInputStream. Esse método lê a sequência de bytes do fluxo de entrada e cria um novo objeto com o estado especificado.

## A serialização é uma ferramenta útil para uma variedade de tarefas, incluindo:

- Armazenamento de objetos em um arquivo
- Transmissão de objetos pela rede
- Criação de clones de objetos

## Alguns exemplos de como a serialização pode ser usada em Java incluem:

- Salvar o estado de um jogo em um arquivo
- Transmitir informações de um servidor para um cliente
- Criar um backup de um objeto

  ## <div align="center"> Classes principais </div>

<table>
  <tr>
    <td>Classe</td>
    <td>Descrição</td>
  </tr>
  <tr>
    <td>Serializable</td>
    <td>Esta interface é a marca de serialização. Uma classe que implementa esta interface pode ser serializada</td>
  </tr>
    <tr>
    <td>ObjectOutputStream</td>
    <td>Esta classe é usada para serializar objetos</td>
  </tr>
  </tr>
    <tr>
    <td>ObjectInputStream</td>
    <td>Esta classe é usada para desserializar objetos</td>
  </tr>
</table>

