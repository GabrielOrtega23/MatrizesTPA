<h1>Exercícios de Matrizes em Java</h1>


<hr>

<h2>Ex1 - Soma e Média dos Números Pares de uma Matriz 4x4</h2>

<p>Código:</p>



<h3>Explicação detalhada</h3>
<ul>
<li>Scanner sc = new Scanner(System.in): cria o leitor de entrada.</li>
<li>int[][] matriz = new int[4][4]: cria a matriz 4x4.</li>
<li>int somaPares = 0, qtdPares = 0: inicializa variáveis.</li>
<li>Mensagem inicial solicitando os valores.</li>
<li>Dois laços for percorrem linhas e colunas.</li>
<li>matriz[i][j] = sc.nextInt(): lê cada valor.</li>
<li>Se o valor for par, soma e incrementa o contador.</li>
<li>Calculo da média usando operador ternário.</li>
<li>Exibição dos resultados.</li>
<li>Fechamento do Scanner.</li>
</ul>

<hr>

<h2>Ex2A - Matriz de Letras</h2>

<p>Código:</p>



<h3>Explicação</h3>
<ul>
<li>A matriz é criada já preenchida com caracteres.</li>
<li>O laço for-each percorre cada linha.</li>
<li>O segundo for-each imprime cada caractere com espaço.</li>
<li>System.out.println pula linha para formar a matriz visualmente.</li>
</ul>

<hr>

<h2>Ex2B - Matriz de Inteiros</h2>

<p>Código:</p>



<h3>Explicação</h3>
<p>Mesma lógica do Ex2A, porém com valores inteiros.</p>

<hr>

<h2>Ex2C - Matriz Double</h2>

<p>Código:</p>



<h3>Explicação</h3>
<p>Mesmo processo, agora utilizando valores decimais.</p>

<hr>

<h2>Ex3 - Matriz 5x5: Soma Ímpares, Soma Colunas e Linhas</h2>

<p>Código:</p>



<h3>Explicação</h3>
<ul>
<li>Leitura da matriz 5x5.</li>
<li>Soma dos números ímpares.</li>
<li>Soma das colunas em um laço separado.</li>
<li>Soma das linhas em outro laço.</li>
</ul>

<hr>

<h2>Ex4 - Matriz 3x5: Repetidos, Pares e Ímpares</h2>

<p>Código:</p>



<h3>Explicação</h3>
<ul>
<li>HashSet armazena valores já digitados.</li>
<li>Se um valor já estiver no Set, repetido = true.</li>
<li>Contagem separada de pares e ímpares.</li>
<li>Armazenamento na matriz em cada iteração.</li>
</ul>

<hr>

<h2>Ex5 - Diagonais da Matriz 4x4</h2>

<p>Código:</p>



<h3>Explicação</h3>
<ul>
<li>Diagonal principal pega índices iguais.</li>
<li>Diagonal secundária pega elementos onde i + j = 3.</li>
</ul>

<hr>

<h2>Ex6 - Figuras usando Matrizes 4x4</h2>

<h3>6A - Matriz inteira com *</h3>



<h3>Explicação</h3>
<ul>
<li>Preenche toda a matriz com *.</li>
<li>Imprime na tela formatado.</li>
</ul>

<hr>

<h3>6B - Borda de * e centro vazio</h3>



<h3>Explicação</h3>
<ul>
<li>Borda: linha 0, linha 3, coluna 0 ou coluna 3.</li>
<li>Centro recebe espaço em branco.</li>
</ul>

<hr>

<h3>6C - Triângulo de *</h3>




<h3>Explicação</h3>
<ul>
<li>A cada linha o número de asteriscos aumenta.</li>
<li>O restante da matriz fica vazio.</li>
<li>A condição j <= i cria o formato triangular.</li>
</ul>

<hr>


