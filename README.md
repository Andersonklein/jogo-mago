Um jogo simples no java que usa a programação orientado objetos 
Ojetivo é voce "criar um personagem" adicionando um nome a ele, depois acrescenta os atributos magicos nele, poderes, o que você preferir 

O jogo faz com que você equipe o personagem mágico, adaptar um nome, um valor de vida, aumentar um item para ele usar e um poder.

O nome é de escolha do usuario.
A vida é de escolha do usuario.
Quantidade de itens, 2: Mana e Cura.
Quantidade de poderes, 4: Invisibilidade, Voar, Regeneração, Armadura de aço.



##Iniciando O Jogo: 

Ao iniciar o jogo, você verá as seguintes opções:
>Digitar o nome do Mago:  
>Digitar a vida do Mago:

Após preencher as informações, o jogo te mostrará um status inicial:

Status inicial:  
Nome: wizard  
Vida: 100


Dando sequência, a próxima etapa do jogo te mostrará um inventário, lá estarão dois itens que o mago deverá escolher para utilizar, EXEMPLO:
 Você vai escolha um item para usar:  
 Inventário do wizard:
 
Ai você vai escolher qual das opções seria melhor 

0.Poção de Cura  
1.Poção de Mana

Dependendo do número que você escolher, irá aparecer o seguinte status.
1  
wizard usou Poção de Mana.  
Vida atual: 110


0  
wizard usou Poção de Cura.  
Vida atual: 120

dependendo do que esolher, vai atribuir a vida

( A **Mana** aumenta 10 de vida. )  
( A **Cura** aumenta 20 de vida. )


Após isso, o código vai entrar na seleção para escolher poderes e mostrará os poderes disponíveis para uso, EX:

Escolha um poder para usar:  
Poderes de wizard:

0. Bola de Fogo
1. Raio
2. Escudo Mágico
3. Teleporte

Dependendo do poder que você escolher, vai mostrar na tela, que o poder escolhido foi utilizado. EX:  
Invisibilidade foi usado!

Assim, encerrando nosso código.

Estrutura do Projeto 
O projeto é composto pelas seguintes classes:

///Poder\\\:  esta classe possui uma variável de instância privada 'nome', um construtor que inicializa esta variável, um método 'usar', que imprime uma mensagem na tela e um método getter getNome que permite acesso externo à 'nomevariável'.  

---
///Mago\\\: Mago é uma subclasse de Personagem, O construtor Mago inicializa um mago com um nome e quantidade de vida específicos, além de inicializar suas listas de inventário e poderes como listas vazias. Após isso, chama o método salvar() para salvar o mago no banco de dados.  

---
///Item\\\: Esta classe possui duas variáveis ​​de instância privadas nome e efeito, um construtor que inicializa essas variáveis, e dois métodos getter, getNome e getEfeito. Que permitem acesso externo a essas 
variáveis.  

---
///Conexão\\\:  Serve para fazer a conexão do java com a tabela criada no MySQLworkbanch.  

---
////Personagem\\\: Responsável por inicializar um objeto Personagem com um nome e um valor de vida especificados.  


Pré-requisitos  
Java 8 ou superior  
MySQL  
Conector JDBC para MySQL


Configuração do banco de dados

create database dbteste;
use dbteste;

INSERT INTO itens (nome, efeito, mago_nome) VALUES ("cajado",1, "Anderson");
insert into magos (nome,vida) values ("Anderson",15);
desc poderes;


CREATE TABLE magos (
    nome VARCHAR(100) PRIMARY KEY,
    vida INT
);

CREATE TABLE itens (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    efeito INT,
    mago_nome VARCHAR(100),
    FOREIGN KEY (mago_nome) REFERENCES magos(nome)
);

CREATE TABLE poderes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    mago_nome VARCHAR(100),
    FOREIGN KEY (mago_nome) REFERENCES magos(nome)
);

select * from poderes;
select * from itens;
select * from magos;





