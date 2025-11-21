<h1>📘 Atividade — Matrizes e Vetores em Java</h1>



<hr>

<h2 id="ex1"> Exercício 1 — Matriz 4x4: soma e média dos números pares</h2>

<p><strong>image</strong> — Print do código completo.</p>

<h3> Explicação do código</h3>

<p><strong>image</strong> — Trecho onde cria a matriz.</p>

<p>
<code>int[][] matriz = new int[4][4];</code>  
Cria uma matriz de inteiros com 4 linhas e 4 colunas.  
Esse tipo de estrutura representa um conjunto bidimensional de valores, como uma tabela:
</p>

<pre>
[ 0 ][ 1 ][ 2 ][ 3 ]
[ 0 ][ 1 ][ 2 ][ 3 ]
[ 0 ][ 1 ][ 2 ][ 3 ]
[ 0 ][ 1 ][ 2 ][ 3 ]
</pre>

<p>
Cada posição é acessada usando <code>matriz[linha][coluna]</code>.  
</p>

<h3> Leitura da matriz com for duplo</h3>

<p><strong>image</strong> — Loop de leitura.</p>

<p>
O código usa dois laços <code>for</code> aninhados.  
O primeiro percorre as linhas (0 a 3).  
O segundo percorre as colunas (0 a 3).
</p>

<pre>
for (int i = 0; i < 4; i++) {        ← percorre as linhas
    for (int j = 0; j < 4; j++) {    ← percorre as colunas
</pre>

<p>
Assim, cada número digitado pelo usuário é armazenado exatamente na posição correta da matriz.
</p>

<h3> Verificação de par</h3>

<p><strong>image</strong> — Parte do código que verifica pares.</p>

<p>
Um número é par quando o resto da divisão por 2 é zero:
</p>

<code>if (valor % 2 == 0)</code>

<p>
Se for par:
</p>
<ul>
 <li>Ele é somado na variável <code>soma</code>.</li>
 <li>A quantidade de pares aumenta: <code>contPares++;</code></li>
</ul>

<h3>📊 Cálculo da média</h3>

<p><strong>image</strong> — Cálculo da média.</p>

<p>
A média é:
</p>

<pre>
media = soma / contPares;
</pre>

<h3>🖥️ Deploy (saída no terminal)</h3>
<p><strong>image</strong></p>

<hr>

<h2 id="ex2"> Exercício 2 — Matrizes prontas</h2>

<h3>2A — Matriz de letras</h3>

<p><strong>image</strong></p>

<p>
Aqui usamos uma matriz do tipo <code>char[][]</code>.
Cada posição da matriz armazena um caractere.
</p>

<pre>
char[][] m = new char[4][5];
</pre>

<p>
Esse tipo de estrutura é ideal para trabalhar com:
</p>

<ul>
 <li>tabelas com caracteres</li>
 <li>jogos da velha</li>
 <li>mapas simples</li>
 <li>grades de letras</li>
</ul>

<hr>

<h2 id="ex3"> Exercício 3 — Matriz 5x5 com operações</h2>

<p><strong>image</strong> — Código</p>

<h3> Parte A — Soma dos números ímpares</h3>

<p><strong>image</strong></p>

<p>
Usa a condição:
</p>

<code>if (valor % 2 != 0)</code>

<p>
Resto diferente de zero indica número ímpar.
</p>

<h3> Parte B — Soma de cada coluna</h3>

<p><strong>image</strong></p>

<p>
Para somar colunas, o loop externo percorre colunas, e o interno percorre linhas.
</p>

<h3> Parte C — Soma de cada linha</h3>

<p><strong>image</strong></p>

<p>
Aqui a lógica é invertida:  
O laço externo percorre linhas, e o interno percorre colunas.
</p>

<hr>

<h2 id="ex4"> Exercício 4 — Vetor 3x5: repetidos, pares e ímpares</h2>

<h3> Verificar repetidos</h3>

<p><strong>image</strong></p>

<p>
O código usa <code>HashSet</code> porque ele:
</p>

<ul>
 <li>não permite valores repetidos</li>
 <li>é rápido</li>
</ul>

<p>
Se um valor já existir no HashSet, então ele é repetido.
</p>

<h3> Contar pares e ímpares</h3>

<p><strong>image</strong></p>

<p>
Usa o mesmo teste dos exercícios anteriores:
</p>

<pre>
if (n % 2 == 0)  → par
else             → ímpar
</pre>

<hr>

<h2 id="ex5"> Exercício 5 — Matriz 4x4 decimal: diagonais</h2>

<p><strong>image</strong></p>

<h3> Diagonal principal</h3>

<pre>
matriz[i][i]
</pre>

<h3> Diagonal secundária</h3>

<pre>
matriz[i][3 - i]
</pre>

<p>
Isso forma:
</p>

<pre>
[0,3]
[1,2]
[2,1]
[3,0]
</pre>

<hr>

<h2 id="ex6"> Exercício 6 — Figuras com matriz</h2>

<h3>A — Quadrado cheio</h3>
<p><strong>image</strong></p>

<h3>B — Quadrado com bordas</h3>
<p><strong>image</strong></p>

<h3>C — Triângulo em formato escada</h3>
<p><strong>image</strong></p>

<p>
Essas figuras são construídas preenchendo a matriz com <code>*</code> ou com espaços.  
O programa imprime linha por linha, formando as figuras.
</p>

<hr>

<h2 id="exec"> Como executar</h2>

<p>Compilar:</p>
<pre><code>javac NomeDoArquivo.java</code></pre>

<p>Executar:</p>
<pre><code>java NomeDaClasse</code></pre>

<p><strong>Exemplo:</strong></p>
<pre>
javac Ex1.java
java Ex1
</pre>

<hr>


