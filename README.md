<h1>README – Exercícios de Matrizes em Java</h1>

<hr>

<h2>Exercício 1 – Leitura de Matriz 4x4, Soma e Média dos Valores Pares</h2>
<img width="301" height="320" alt="1" src="https://github.com/user-attachments/assets/587734ef-fd75-4b8c-b348-d319936236d9" />

<h3>Objetivo</h3>
<p>Ler uma matriz 4x4 de números inteiros, calcular a soma de todos os números pares e encontrar a média desses valores.</p>

<h3>Explicação das Linhas</h3>
<ul>
    <li>Criação de um objeto responsável pela leitura dos dados do usuário.</li>
    <li>Declaração de uma matriz 4x4 para armazenar valores inteiros.</li>
    <li>Criação de variáveis usadas para acumular a soma dos pares e a quantidade encontrada.</li>
    <li>Exibição de mensagem solicitando os valores ao usuário.</li>
</ul>

<h3>Explicando os loops for</h3>
<ul>
    <li>O loop externo percorre as 4 linhas da matriz.</li>
    <li>O loop interno percorre as 4 colunas da matriz.</li>
    <li>A combinação dos dois loops permite visitar cada posição da matriz.</li>
    <li>A cada iteração é lido um número e verificado se é par para atualizar soma e contagem.</li>
</ul>

<h3>Etapas finais</h3>
<ul>
    <li>Cálculo da média usando operador condicional para evitar divisão por zero.</li>
    <li>Exibição da soma e média dos valores pares.</li>
    <li>Fechamento do leitor de entrada.</li>
</ul>

<hr>

<h2>Exercício 2 – Criação e Exibição de Matrizes Pré-definidas</h2>

<h3>2A – Matriz de Letras</h3>
<img width="197" height="202" alt="2a" src="https://github.com/user-attachments/assets/9da93486-5f93-48b9-90c3-1a6c139abb01" />

<p>Matriz fixa contendo letras de 'a' a 't'. O programa percorre e exibe os caracteres na tela.</p>

<h3>Explicação dos loops</h3>
<ul>
    <li>O loop externo acessa cada linha da matriz.</li>
    <li>O loop interno percorre cada caractere da linha atual.</li>
    <li>Cada caractere é exibido com espaço entre eles.</li>
</ul>

<h3>2B – Matriz de Inteiros</h3>
<p>Matriz contendo números inteiros predefinidos. O programa apenas exibe seus valores.</p>
<img width="204" height="202" alt="2b" src="https://github.com/user-attachments/assets/1dafe92c-13e2-4710-a392-2308d339bd65" />

<h3>Explicação dos loops</h3>
<ul>
    <li>O loop externo seleciona cada linha da matriz.</li>
    <li>O loop interno percorre os números daquela linha.</li>
    <li>Todos os valores são impressos mantendo o formato de matriz.</li>
</ul>

<h3>2C – Matriz de Decimais</h3>
<p>Matriz fixa com valores decimais (double). O programa percorre e exibe seus elementos.</p>
<img width="206" height="193" alt="2c" src="https://github.com/user-attachments/assets/2dc77d86-6e7b-459e-9bef-4975f0068983" />

<h3>Explicação dos loops</h3>
<ul>
    <li>O loop externo percorre as linhas.</li>
    <li>O loop interno percorre os valores da linha atual.</li>
    <li>Os números são exibidos com separação adequada.</li>
</ul>

<hr>

<h2>Exercício 3 – Matriz 5x5: Soma de Ímpares, Soma das Colunas e das Linhas</h2>
<img width="305" height="397" alt="3" src="https://github.com/user-attachments/assets/6aeb6b6d-5fe9-454b-8f3e-ad4399d615bc" />

<h3>Objetivo</h3>
<p>Ler uma matriz 5x5 e realizar três operações: somar os valores ímpares, calcular a soma de cada coluna e a soma de cada linha.</p>

<h3>Explicação das Linhas</h3>
<ul>
    <li>Criação da matriz 5x5 com valores inteiros.</li>
    <li>Declaração de variável usada para acumular a soma dos ímpares.</li>
    <li>Leitura dos valores digitados pelo usuário.</li>
</ul>

<h3>Explicação dos loops</h3>

<h4>Leitura da matriz</h4>
<ul>
    <li>Loop externo controla o índice da linha.</li>
    <li>Loop interno controla o índice da coluna.</li>
    <li>A cada leitura, o programa verifica se o valor é ímpar e soma se for.</li>
</ul>

<h4>Soma das colunas</h4>
<ul>
    <li>O loop externo percorre cada coluna.</li>
    <li>Para cada coluna, o loop interno percorre as 5 linhas.</li>
    <li>A soma é acumulada verticalmente.</li>
</ul>

<h4>Soma das linhas</h4>
<ul>
    <li>O loop externo percorre cada linha.</li>
    <li>O loop interno percorre as colunas daquela linha.</li>
    <li>A soma é acumulada horizontalmente.</li>
</ul>

<hr>

<h2>Exercício 4 – Matriz 3x5: Repetidos, Pares e Ímpares</h2>
<img width="337" height="366" alt="4" src="https://github.com/user-attachments/assets/e471aed4-776a-4686-b31e-536f42af03ed" />

<h3>Objetivo</h3>
<p>Ler 15 valores e identificar se há algum repetido, além de contar quantos deles são pares e quantos são ímpares.</p>

<h3>Explicação das Linhas</h3>
<ul>
    <li>Criação da matriz 3x5 para armazenar os valores.</li>
    <li>Uso de uma estrutura que armazena apenas valores únicos.</li>
    <li>Variáveis para registrar quantos valores são pares e quantos são ímpares.</li>
</ul>

<h3>Explicação dos loops</h3>
<ul>
    <li>Loop externo percorre as 3 linhas.</li>
    <li>Loop interno percorre as 5 colunas.</li>
    <li>A cada leitura, o valor é comparado com a estrutura de valores únicos.</li>
    <li>O programa verifica se o valor é par ou ímpar para atualizar suas contagens.</li>
</ul>

<hr>

<h2>Exercício 5 – Matriz 4x4 de Decimais: Diagonal Principal e Secundária</h2>
<img width="311" height="322" alt="5" src="https://github.com/user-attachments/assets/6537a50d-cf27-49e3-a82f-5f0965262b8d" />

<h3>Objetivo</h3>
<p>Ler uma matriz 4x4 e exibir a diagonal principal e a diagonal secundária da matriz.</p>

<h3>Explicação dos loops</h3>
<ul>
    <li>Os primeiros dois loops percorrem a matriz inteira lendo seus valores.</li>
    <li>A diagonal principal é exibida utilizando apenas um loop (índice da linha igual ao da coluna).</li>
    <li>A diagonal secundária também usa um loop, com a relação coluna = 3 - linha.</li>
</ul>

<hr>

<h2>Exercício 6 – Figuras com Matrizes</h2>

<h3>6A – Matriz completamente preenchida com *</h3>
<img width="243" height="235" alt="6a" src="https://github.com/user-attachments/assets/06b87eb0-36a7-49b5-8751-a99f70bc0921" />

<ul>
    <li>A matriz é criada com 4 linhas e 4 colunas.</li>
    <li>Todos os elementos recebem o símbolo escolhido.</li>
    <li>Um segundo par de loops exibe a figura completa na tela.</li>
</ul>

<h3>Explicação dos loops</h3>
<ul>
    <li>Loop externo percorre cada linha.</li>
    <li>Loop interno percorre cada coluna preenchendo com o símbolo.</li>
    <li>Outro par de loops exibe a matriz já preenchida.</li>
</ul>

<h3>6B – Moldura de * com interior vazio</h3>
<img width="281" height="278" alt="6b" src="https://github.com/user-attachments/assets/2b762646-a897-492e-9707-5bd565b7846f" />

<ul>
    <li>As bordas recebem o símbolo, enquanto o centro fica em branco.</li>
    <li>Condições verificam se a posição atual pertence às bordas.</li>
</ul>

<h3>Explicação dos loops</h3>
<ul>
    <li>Loops percorrem todas as posições.</li>
    <li>Se a linha for a primeira ou última, ou a coluna for a primeira ou última, recebe símbolo.</li>
    <li>Demais posições recebem espaço em branco.</li>
</ul>

<h3>6C – Triângulo formado por *</h3>
<img width="255" height="238" alt="6c" src="https://github.com/user-attachments/assets/deab34ef-f384-4492-92f3-cce65109010d" />

<ul>
    <li>A matriz é preenchida apenas até o limite definido pelo índice da linha.</li>
    <li>O restante das posições fica em branco.</li>
</ul>

<h3>Explicação dos loops</h3>
<ul>
    <li>Loop externo percorre cada linha.</li>
    <li>Loop interno preenche somente até a coluna igual ao índice da linha.</li>
    <li>A exibição é feita com outro par de loops.</li>
</ul>

<hr>

e construção de figuras utilizando estruturas bidimensionais.</p>

