<h1>Exercícios em Java – README Completo</h1>

<p>Este projeto contém 6 exercícios desenvolvidos em Java, cada um trabalhando conceitos fundamentais como matrizes, vetores, loops, condicionais e métodos da classe <b>Arrays</b>. Abaixo está a explicação detalhada de cada código.</p>

<hr>

<h2>📘 Exercício 1 – Matriz 4x4: Soma e Média dos Números Pares</h2>

<p>O programa lê uma matriz 4x4, soma todos os números pares e calcula a média deles.</p>

<h3>Explicação do código linha por linha</h3>

<pre>
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
</pre>
<p>Importante para permitir entrada do usuário pelo teclado.</p>

<pre>
    int[][] matriz = new int[4][4];
</pre>
<p>Cria uma <b>matriz inteira 4x4</b>, que funciona como uma tabela com 4 linhas e 4 colunas.</p>

<pre>
    int somaPares = 0;
    int quantidadePares = 0;
</pre>
<p>Variáveis auxiliares para acumular valores pares e contar quantos foram digitados.</p>

<pre>
    for (int linha = 0; linha < 4; linha++) {
        for (int coluna = 0; coluna < 4; coluna++) {
</pre>
<p>Dois laços for criam um loop duplo, percorrendo cada posição da matriz.</p>

<pre>
            System.out.print("Digite um número: ");
            matriz[linha][coluna] = sc.nextInt();
</pre>
<p>Lê valores digitados e coloca na posição atual da matriz.</p>

<pre>
            if (matriz[linha][coluna] % 2 == 0) {
                somaPares += matriz[linha][coluna];
                quantidadePares++;
            }
</pre>
<p>Verifica se é par. Se for, soma e conta.</p>

<pre>
    if (quantidadePares > 0) {
        double media = (double) somaPares / quantidadePares;
</pre>
<p>Evita divisão por zero e calcula a média.</p>

<hr>

<h2>📘 Exercício 2 – Ordenação de Nomes (A–Z e Z–A)</h2>

<h3>Explicação</h3>

<pre>
String[] nomes = {"Carlos", "Ana", "Pedro", "Bruna"};
</pre>
<p>Cria um vetor de Strings contendo nomes.</p>

<h3>Ordenação Crescente</h3>
<pre>
Arrays.sort(nomes);
</pre>
<p>Organiza em ordem alfabética.</p>

<h3>For-each</h3>
<pre>
for (String nome : nomes) {
    System.out.println(nome);
}
</pre>
<p><b>for-each</b> percorre posição por posição automaticamente.</p>

<h3>Ordenação Decrescente</h3>
<pre>
Arrays.sort(nomes, Collections.reverseOrder());
</pre>
<p>Inverte a lógica de comparação, gerando ordem Z–A.</p>

<hr>

<h2>📘 Exercício 3 – Vetor de Números Pares</h2>

<h3>Explicação linha por linha</h3>

<pre>
int[] numeros = new int[10];
</pre>
<p>Vetor que guarda 10 números digitados.</p>

<pre>
int[] pares = new int[10];
</pre>
<p>Vetor para armazenar apenas os pares.</p>

<pre>
int contadorPares = 0;
</pre>
<p>Registra quantos números pares foram encontrados.</p>

<pre>
for (int i = 0; i < numeros.length; i++) {
    System.out.print("Número " + (i + 1) + ": ");
    numeros[i] = sc.nextInt();
</pre>
<p>Preenche o vetor com valores digitados.</p>

<pre>
    if (numeros[i] % 2 == 0) {
        pares[contadorPares] = numeros[i];
        contadorPares++;
    }
}
</pre>
<p>Verifica pares, armazena e incrementa contador.</p>

<hr>

<h2>📘 Exercício 4 – Vetor de Ímpares</h2>

<p>Mesma lógica do exercício anterior, mas com condição:</p>

<pre>
if (numeros[i] % 2 != 0)
</pre>

<p>Apenas números ímpares são armazenados.</p>

<hr>

<h2>📘 Exercício 5 – Matriz de Caracteres (char[][])</h2>

<p>Este código trabalha com uma matriz de caracteres 5x5.</p>

<h3>Explicação</h3>

<pre>
char[][] m = new char[5][5];
</pre>

<p>Cria uma matriz de <b>char</b>, ou seja, cada posição armazena um único caractere.</p>

<p>Essa estrutura funciona como um tabuleiro:</p>

<ul>
    <li>5 linhas</li>
    <li>5 colunas</li>
    <li>Total → 25 posições</li>
</ul>

<h3>Preenchendo a matriz</h3>
<pre>
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        m[i][j] = '*';
    }
}
</pre>

<p>Um loop duplo percorre todas as posições e preenche com um caractere escolhido.</p>

<h3>Exibindo a matriz</h3>

<pre>
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print(m[i][j] + " ");
    }
    System.out.println();
}
</pre>

<p>Mostra a matriz como uma tabela.</p>

<hr>

<h2>📘 Exercício 6 – Matriz Interativa / Jogo</h2>

<p>Este foi o exercício corrigido por você com o print. Aqui está a explicação completa.</p>

<h3>Matriz</h3>
<pre>
char[][] m = new char[5][5];
</pre>
<p>Cria o mapa do jogo.</p>

<h3>Preenchimento</h3>
<pre>
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        m[i][j] = '-';
    }
}
</pre>

<h3>Posição especial (exemplo)</h3>
<pre>
m[2][3] = 'X';
</pre>
<p>Marca algum item ou obstáculo no tabuleiro.</p>

<h3>Exibição</h3>
<pre>
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print(m[i][j] + " ");
    }
    System.out.println();
}
</pre>

<p>Imprime um tabuleiro visual.</p>

<hr>

<h2>📄 Conclusão</h2>

<p>Este README mostrou:</p>

<ul>
    <li>Explicação detalhada de vetores</li>
    <li>Uso de matrizes 4x4 e 5x5</li>
    <li>Laços for e for-each</li>
    <li>Ordenação com Arrays.sort()</li>
    <li>Manipulação de chars</li>
    <li>Construção de tabelas e lógica de preenchimento</li>
</ul>

<p>Pronto para ser colado no GitHub.</p>

