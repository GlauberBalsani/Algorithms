# Notação Big O
- Trata-se de conceito matemático para medir o custo de um algoritmo.
-  A silga "O" vem do alemão Ordnung significa "Ordem de complexidade".
-  "O(n)" a letra "n"  representa o tamanho da entrada em um algoritmo, enquando a funcão "O()" nos informa a complexidade do algoritmo em relação ao tamanho da entrada.
- Nota Big O não informa a velocidade de um algoritmo, quantos segundos um algoritmo foi executado, já que o tempo em que um algoritmo é executado pode depender de fatores como porde de hardware.  Big O é utilizado para comparar a performance entre algoritmos.

![gráfico](https://www.freecodecamp.org/portuguese/news/content/images/2021/12/1_KfZYFUT2OKfjekJlCeYvuQ.jpeg)

## Níveis de Complexidade 

![gráfico](https://www.sahinarslan.tech/static/b14f0f927757ce111e7338d849f219a5/17bda/big-o-table.jpg)

- O Big O sempre irá informar o pior caso, como podemos ver no gráfico os de complexidade Fatorial O(n!) sempre serão os de piores casos.
- No caso de complexidade linear denpendemos sempre do (n) elementos o elemento pode estar na primeira posição quanto na última sendo assim teremos que percorrer o conjunto inteiro até achar o item, não necessamente será o mais demorado.
-  Uma constante O(1) representa o melhor desempenho possível para um algoritmo. Isso significa que, independentemente do tamanho dos dados de entrada, o tempo de execução do algoritmo será sempre o mesmo. Alguns exemplos de operações com complexidade O(1) incluem acessar um elemento em um array pelo índice, ou acessar um elemento em uma tabela hash pelo identificador. 
	- `int[] array = {1, 2, 3, 4, 5}; 
	- `int index = 3;`
	- `int element = array[index]; // element = 4`
- Uma algoritmo de estrutura linear é relativo ao  'n' elementos em um array, 
	- `for (int i = 0; i < array.length; i++) {`
		    `System.out.println(array[i]);`
		`}`
		pode-se dizer que em comparção a constante uma estrutura linear é menos eficiente.Isso porque a complexidade linear significa que o tempo de execução do algoritmo aumenta proporcionalmente ao tamanho dos dados de entrada. Isso pode causar problemas em conjuntos de dados grandes, pois o tempo de execução pode se tornar muito longo.

`
