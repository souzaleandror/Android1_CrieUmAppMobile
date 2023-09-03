#### 03/09/2023

Curso de Android parte 1: crie um app mobile

@01-Criando o primeiro App 

@@01
Informações do curso

Os 3 cursos de fundamentos de Android fazem parte da atualização dos seguintes cursos:
Android I: Crie sua App fantástica com Android Studio
Android II: Integração com apps e recursos do device
Android III: Aprimore sua app com Fragments, Google Maps e GPS
Isso significa que se você já fez os cursos anteriores, não tem necessidade de fazer os novos cursos, pois teremos abordagem similares com pequenas mudanças como: Explicações teóricas, versão do Android Studio e SDK do Android.

https://cursos.alura.com.br/course/android-studio

https://cursos.alura.com.br/course/android-studio-ii-integracoes-e-recursos

https://cursos.alura.com.br/course/android-studio-iii-fragments-maps-gps

@@02
Introdução

Sou o Alex Felipe, instrutor da Alura, e vou apresentar para vocês a primeira parte do curso de Android Criando seu primeiro App Mobile, mas o que é que vamos aprender durante esse curso ? A ideia é justamente ensinar a criar o nosso primeiro aplicativo. Isso significa que nesse curso veremos toda a introdução necessária para que conheçamos o Android como sistema operacional, sua plataforma, e o que ele acaba atendendo hoje, em aplicativos de smartphones, TVs, automóveis.
Vamos acabar conhecendo um pouquinho mais sobre os benefícios que temos ao desenvolvermos aplicativos para Android; é claro, nesse curso focaremos apenas em smartphones ou tablets. Mas você também pode utilizar esse conteúdo para desenvolver para essas outras plataformas. Então, como projeto, acabaremos desenvolvendo como aplicativo, ao invés de lidarmos só com o conteúdo técnico, uma agenda de alunos.

Uma agenda que listará alunos e fará o cadastro dos mesmos. Então, a princípio seria essa tela inicial que representa a lista de alunos, com esse botãozinho na parte de baixo que, ao ser clicado, abrirá o nosso formulário. E teremos a capacidade de cadastrar um aluno, como o Alex, com um telefone e um e-mail. Assim que finalizarmos o cadastro e clicarmos no botão "Salvar", ele já vai apresentar o Alex na listinha.

Esse é o aplicativo que acabaremos desenvolvendo. É claro, por mais que o fluxo seja bem simples, veremos que há diversos desafios para que consigamos colocar essa implementação funcionando da maneira adequada. E é esse o comprometimento que teremos durante esse curso. Aprenderemos, por exemplo, o que que é uma Activity, e que para podermos desenvolvê-la precisaremos de conhecimentos de Orientação a Objetos, pré-requisito desse curso.

Aqui no Android Framework, que é a ferramenta que iremos utilizar para poder desenvolver, são usadas muitas técnicas de Orientação a Objetos. E além dessa parte, veremos que há muitas peculiaridades, como é o caso de registrar uma Activity para o sistema operacional do Android, de criar esse layout, porque realmente existem técnicas para dividir o código da Activity, que é o código fonte em Java, que é o que veremos no curso, e também o código para o layout que são arquivos estáticos.

Entenderemos essas diferenças entre as boas práticas de implementação, e veremos todo esse desafio, como é o caso também de aplicarmos ações nos nossos botões, de clique. Aprenderemos a colocar aquele botão, e veremos como é possível adicionar esses tipos de comportamentos esperados a partir de Listeners.

Para mantermos esses dados que colocamos, cada vez que cadastramos usaremos uma técnica de persistência, os famosos DAO, caso você nunca tenha ouvido falar, durante o curso teremos uma breve introdução, mas é um padrão de projeto conhecido como Data Access Object, um "objeto de acesso a dados". Também aplicaremos esse padrão para salvarmos os nossos dados.

Veremos, por exemplo, como podemos manter os nossos dados entre as Activities, então salvamos um dado na nossa Activity de formulário, aquela tela que vimos, e ela irá disponibilizar nessa Activity de lista de alunos. Aprenderemos todos esses passos e detalhes, como implementar, seja layout, seja código Java, que é a parte lógica, como também essa parte que envolve o fluxo como um todo, que é abrir a Activity, salvar o dado e manter todos os dados da maneira esperada.

Espero que estejam animados, realmente, é um curso para quem quer aprender a criar o seu primeiro aplicativo, porque o nosso objetivo é passar os fundamentos do que é preciso aprender para utilizar em qualquer tipo de aplicativo, seja em código Java, ou em Kotlin, que é a linguagem da moda.

Vamos começar?

@@03
Atualização do conteúdo

Desde a gravação do curso, houve algumas mudanças em relação ao Android Studio e SDK do Android. O curso, gravado em Janeiro de 2019, utilizou a versão 3.2.1 do Android Studio e o SDK 28 do Android.
Considerando as mudanças ocorridas nesse período, atualizamos o conteúdo do curso com base no que temos hoje. (Janeiro de 2021)

Mudanças no projeto
Isso significa que o projeto, disponibilizado no início das aulas e no final do curso, foi atualizado. Na atualização migramos para a API 30 (Android 11) e migramos as bibliotecas para utilizar o AndroidX (mencionado durante o curso) em vez do Android support.

Mudanças no ambiente de desenvolvimento
Agora temos a versão 4.1 do Android Studio disponível. A revisão e a atualização do conteúdo foram baseadas nesta versão do AS, portanto, você pode utilizar a versão 4.1 sem problemas.

Se preferir, você pode usar uma versão mais recente, caso esteja disponível.
Mudanças no conteúdo do curso
Quando ocorrem essas mudanças, que são diferentes do conteúdo do curso, é muito comum duvidarmos e questionarmos se o que está sendo ensinado no curso é válido para o momento atual.

Não se preocupe! O objetivo da avaliação é manter o conteúdo atualizado sem impactar na sua experiência durante os estudos. É válido ressaltar que, devido à atualização, há mudanças visuais no AS.

Nos casos em que a diferença for muito grande do que é visto em vídeo, no exercício seguinte serão apresentadas as instruções necessárias.

No geral, mudanças não são algo ruim, muito pelo contrário! Elas mostram que o Android framework e o AS estão em constante evolução e isso é excelente, pois indica uma melhoria constante :)

Código-fonte com as mudanças
Caso tenha interesse em verificar todas as mudanças no código, confira o commit de atualização do projeto final.

Se tiver alguma dúvida sobre as mudanças, fique à vontade em entrar em contato com a gente.

https://github.com/alura-cursos/fundamentos-android-parte-1/commit/b1f84f6f20a9ae4213aae1e227c3126444b1360f

@@04
Orientações iniciais e organização do curso

Pré-requisitos
Neste curso, esperamos que você já saiba os seguintes assuntos em POO (Programação Orientada a Objetos):

Classes, atributos e métodos
Herança, classe abstrata, membros abstratos e interfaces
Array e coleções
Classes anônimas
Caso você não saiba, você pode aprender esse conteúdo a partir dos seguintes cursos:

Java JRE e JDK
Java OO
Java Polimorfismo: Entenda herança e interfaces
Java Exceções
Java e java.lang
Java e java.util
Os demais cursos da formação Java não são obrigatórios, porém, é recomendada a conclusão dos mesmos para uma melhor compreensão da linguagem Java e suas possibilidades.

Caso você não tenha feito os cursos, mas deseja seguir a partir daqui, fique à vontade para continuar, porém, se tiver algum conteúdo que não for explicado com tanta atenção, muito provavelmente é porque já foi explicado em um desses cursos. De qualquer forma, você pode entrar em contato com a gente por meio do fórum.

Como o curso está organizado
Cada aula vai ter vídeos e exercícios, sendo que cada vídeo vai manter, pelo menos, um exercício.

Esse é um curso classificado como básico, logo, a maioria dos exercícios terão o passo a passo de implementação do que será visto em aula.

Sendo assim, primeiro vamos assistir a aula, prestar atenção no conteúdo e só depois implementar o que foi feito nas aulas nos exercícios posteriores.

Se preferir executar as etapas junto com o instrutor, fique à vontade, porém, saiba que daremos todo auxílio necessário na maioria dos exercícios. Recomendamos fortemente primeiro assistir a aula com atenção para depois praticar :)

https://cursos.alura.com.br/course/java-primeiros-passos

https://cursos.alura.com.br/course/java-introducao-orientacao-objetos

https://cursos.alura.com.br/course/java-heranca-interfaces-polimorfismo

https://cursos.alura.com.br/course/java-excecoes

https://cursos.alura.com.br/course/java-pacotes-e-java-lang

https://cursos.alura.com.br/course/java-util-lambdas

https://cursos.alura.com.br/formacao-java-v235

@@05
Introdução ao Android

Antes de começarmos a escrever o nosso primeiro código para aplicativos Android, vou aproveitar esse momento para esclarecer algumas informações básicas a respeito da plataforma Android.
Isso significa que agora entenderemos o que é um Android, onde ele é executado, e alguns dos pré-requisitos que estaremos considerando no curso para que consigamos prosseguir com o conteúdo. Como primeiro tópico, precisaremos entender o que é o Android. De maneira básica, ele é um sistema operacional open source, de código aberto, baseado em Linux.

Isso significa que ele possui comportamentos similares aos sistemas operacionais famosos do mercado, como é o caso do Windows, do Mac iOS e do próprio Linux. Portanto, temos a capacidade de executar processos e aplicativos que vão ser utilizados pelos nossos usuários, como um aplicativo de uma calculadora, navegador, ou até mesmo jogos.

Temos todas estas disponibilidades no Android. Mas onde ele é executado? Quais são as possíveis plataformas para utilizá-lo ? Existem diversas possibilidades, dentre as quais as principais são smartphones e tablets, que são dispositivos móveis utilizados no nosso dia-a-dia.

Como sabemos, nossos celulares inteligentes, e também os tablets, que são similares a celulares, mas um pouquinho maiores. Temos essas capacidades como principais para executarmos os nossos aplicativos Android.

Também há outras possibilidades, como é o caso dos wears, dispositivos vestíveis: relógios e pulseiras inteligentes, que também podem estar rodando o sistema Android. Também existem TVs, as famosas Smart TVs, notebooks que rodam o Chrome OS, outro sistema operacional, e que também acabam utilizando aplicativos Android. Há automóveis, carros que já vêm com o sistema Android embutido, além de microcomputadores, para trazer aquela ideia de Internet das Coisas, ou então o famoso Internet of Things, recursos domésticos inteligentes. Veja que são várias possibilidades que temos quando entramos nesse mundo do Android.

Dado que temos todas essas possibilidades, quais são as vantagens reais que temos ao considerarmos o desenvolvimento para Android, para além da plataforma, e mais para o lado das funcionalidades? Tratando da parte de funcionalidades e vantagens, a primeira delas, que consta na página oficial de desenvolvedores Android, o tão famoso Android developers é justamente o grande alcance de usuários. Segundo a loja oficial do Android, a Google Play, temos a capacidade de alcançar dois bilhões de usuários, ou seja, dois bilhões de dispositivos ativos na loja.

Então essa é uma das grandes vantagens, que acaba entrando em destaque. Além disso, há maiores possibilidades do que colocar no nosso produto final, por exemplo, uma câmera. Não é qualquer tipo de dispositivo que possui uma câmera, mas a maioria dos dispositivos do Android nos dará esse recurso, e o ofereceremos para o nosso cliente final.

O recurso também pode ser um GPS, pois há muitas aplicações hoje em dia que fazem uso disso, como por exemplo o Waze e Uber. Também temos a capacidade de usar sensores biométricos ou de proximidade, entre outras opções bem comuns em dispositivos Android. Então, se de repente quisermos usar algum tipo de sensor, existe a possibilidade de fazê-lo. Também tem a questão de conectividade; sabemos que podemos usar, por exemplo, o wi-fi, bluetooth, NFC, entre outros protocolos.

É bem bacana aprendermos a desenvolver para Android para conseguirmos entregar mais valor para o produto final do nosso cliente. Vimos todo esse overview do Android, e agora faz todo sentido entendermos do que precisamos saber para começarmos a desenvolver. Como vimos, há pré-requisitos, dado que o Android tem algumas complexidades, regrinhas que precisam ser seguidas.

Como parte principal de requisitos, precisamos de conhecimento sólidos na programação Orientada a Objetos. Isso significa que para esse curso é importante ter conhecimentos sobre o que que é uma classe, métodos, herança, interfaces, entre outros recursos que são comuns em qualquer tipo de linguagem orientada a objetos. Portanto, aqui não ensinaremos, por exemplo, o que que é uma herança, para que ela serve, entre outras peculiaridades, pois iremos supor que esse conteúdo já seja conhecido.

Além disso, precisaremos de uma ferramenta de desenvolvimento, uma IDE. No Android existe uma ferramenta específica para isso, o Android Studio, que será utilizado para desenvolver os nossos aplicativos. Aqui, usaremos o Android SDK, o kit de desenvolvimento de software para Android, a partir do qual teremos acesso ao Android Framework para desenvolvermos os nossos aplicativos.

Por fim, usaremos uma linguagem, e em específico, utilizaremos o Java, a "linguagem inicial" dos aplicativos Android. Atualmente existem muitos aplicativos que dão suporte para Java, portanto, se de repente você for desenvolver dentro de um projeto de algum time, muito provavelmente terá que lidar com Java, e é por isso que acabamos nos decidindo por essa linguagem, porém, é possível optar pelo Kotlin também.

Como dito anteriormente, acabaremos aprendendo em Java por ser a base para todo tipo de projeto de Android. Eram essas as informações que queria passar para vocês, um overview do que que é o Android, do que é a plataforma, o sistema operacional, e o que vamos acabar utilizando aqui durante o curso.

Então, a seguir começaremos a ver como instalar o Android Studio e também criar nosso primeiro projeto.

@@06
Instalando o Android Studio

Instale o Android Studio no seu computador. Primeiro faça o download a partir da página do Android Developers . Após finalizar o download faça a instalação de acordo com o seu sistema operacional . Ao finalizar todo o procedimento, o Android Studio ficará disponível para ser executado, execute-o e veja se aparece a tela inicial.
Peculiaridades do Android Studio
O Android Studio é uma ferramenta pesada que exige bastante dos recursos do computador. Em outras palavras, para que funcione de uma maneira adequada, é recomendado que utilize um computador mais robusto. Na página de download existe uma seção indicando o hardware sugerido para cada um dos sistemas operacionais, recomendo conferir.

No meu caso, uso um computador com processador Intel i5, 16 GB de memória RAM e um SSD operando com o Linux Ubuntu. Essa configuração me atendeu muito bem, evitando possíveis travamentos, mesmo com outros aplicativos abertos. Isso significa que, mesmo que você tenha um hardware conforme o sugerido, para evitar inconvenientes, recomendo investir num hardware mais potente.

Durante esse procedimento, muito provavelmente vão surgir telas pedindo para baixar dependências necessárias, você pode baixá-las sem nenhum problema.
Se todos os passos forem feitos sem nenhum problema, o Android Studio deve executar normalmente. Caso contrário, entre em contato com a gente por meio do fórum.

@@07
Criando o projeto Android Studio

Vamos dar início ao nosso projeto, para isso primeiro precisaremos rodar a IDE que utilizaremos no curso, o Android Studio. Caso você ainda não o tenha instalado no computador, recomendo que você pause o vídeo, faça o primeiro exercício dessa aula, em que mostro como instalar o programa de acordo com o sistema operacional. Quando tudo estiver funcionando da maneira esperada, continue neste vídeo, e daremos prosseguimento para o nosso primeiro projeto.
Para podermos rodar o Android Studio no ambiente Windows, acessaremos o menu "Iniciar", digitaremos "Android", e é exibido o atalho do Android Studio, em que clicaremos. Teremos essa tela inicial, a tela de carregamento, ou de load. Ao finalizar, aparece uma janelinha caso não haja nenhum tipo de projeto, uma janela também conhecida como launch, com as opções iniciais e as ferramentas para criar um projeto, fazer algum tipo de configuração ou abrir algum projeto existente. Também tem uma informação bem importante: a versão que estamos utilizando; durante esse curso utilizaremos a versão 3.2.1.

Recomenda-se que se utilize essa mesma versão, para que possamos manter os mesmos aspectos visuais, ou uma versão mais recente, com aspecto visual semelhante mas com features mais recentes e atualizações. Isso porque essa é uma ferramenta que se atualiza constantemente, não que isso seja uma abordagem ruim, dado que ela está em constante evolução, é algo bom, então caso haja uma versão um pouquinho além, não tem nenhum problema.

Vamos dar início ao nosso projeto! Para iniciarmos um projeto no Android Studio, notem que há uma opção destacada, "Start a new Android Studio project". Clicaremos nela, e será mostrada a tela inicial para preenchimento de algumas informações relacionadas à configuração do nosso projeto.

A primeira delas é "Application name", que indica o nome da nossa aplicação; durante esse curso faremos uma aplicação relacionada a uma agenda de alunos, então podemos colocar o nome de "Agenda". Essa parte é para identificarmos a sua aplicação no momento em que ela é instalada e utilizada. Agora precisaremos colocar outras informações, sobre o domínio da companhia, o que seria esse domínio? Seria exatamente a empresa para a qual estamos desenvolvendo.

Nesse caso, estamos desenvolvendo para a Alura, então faz todo sentido mantermos o alura.com.br. Se tivéssemos um domínio próprio, poderíamos inclui-lo sem nenhum problema. A ideia desse domínio é, também, definir o pacote raiz do projeto. Logo mais abaixo, temos a informação de Package name, que faz a junção do nome da aplicação com o Company domain, para poder definir o pacote raiz do nosso aplicativo.

Essas duas informações são definidas por padrão, e vamos mantê-las dessa maneira. Depois, tem aonde nosso projeto estará alocado, e podemos deixar onde preferirmos. O local que está configurado por padrão é onde costumo deixar os projetos quando faço algum tipo de projeto nesse computador. Fique à vontade para deixar onde preferir, não tem nenhum problema.

Por fim, há duas opções relacionadas a suportes extras que podemos dar a esse projeto em relação à linguagem utilizada. Lembra que temos a capacidade, por exemplo, de usar Java ou Kotlin? Também existe a opção de utilizarmos C++. Já que consideramos o Java neste curso, não precisamos adicionar nenhuma linguagem a mais, então não precisamos marcar essas opções.

Concluímos a primeira configuração, vamos dar um "Next", e com isso iremos a uma outra tela, que representa uma parte importante do nosso projeto, o suporte que o nosso projeto dará. O que isso significa? Significa que iremos indicar a versão mínima do Android que iremos atender, bem como as plataformas. Vejam que, por padrão, ele marca os smartphones e os tablets, e é justamente a isso que daremos suporte durante esse curso.

As outras opções, como wear, TV, Android Auto, que representa os veículos, Android Things, não daremos suporte aqui, mas, a partir desse momento em que conseguimos fazer essa configuração, e também lidaremos com a parte da API mínima, ou seja, o Android mínimo para o qual daremos suporte. Assim, quando fazemos um projeto Android, temos um alcance de versões do Android a serem suportados e, por padrão, quando entramos nessa opção, ele mostra o Android 4.4 para a versão mínima.

Assim, a partir de 4.4 até a versão mais recente atualmente, o Android 9, daremos suporte. Além de Android 4.4, ele indica que essa API representa a 19. Então, é uma nomenclatura um pouquinho diferente do que os usuários comuns estão acostumados a ver, estaremos lidando com esse número de APIs, então quando eu falar 19, representa o Android 4.4.

Caso queiramos ver outras opções e entender quais são as outras possibilidades existentes, basta clicarmos nesse combo box, que ele lista as opções disponíveis que temos para oferecer suporte mínimo. Quando fazemos essas modificações, é importante notar que daremos suporte a esta API, 14, e às demais. Também atenderemos aproximadamente 100% dos dispositivos disponíveis na Google Play. Esta é uma informação importante de considerarmos quando configuramos essa API mínima.

Tentamos atender ao máximo possível de dispositivos, mas às vezes o que acontece é que ao lidarmos com uma API muito antiga, pode ser um pouquinho mais complicado adicionar algumas features. Isto é, isso traz alguns desafios também, e caso queiramos mais informações sobre os impactos dessas escolhas, basta clicar em "Help me choose", que mostra detalhadamente qual dispositivo cada uma das versões acaba atendendo.

Durante esse curso usaremos essa 19, mas fique à vontade para escolher a que você preferir. Daremos um "OK" na tela, e um "Next". Essa última parte representa uma galeria de Activities, que representa uma entidade bem importante no Android, que acabaremos conhecendo de maneira manual, para que entendamos como funciona todo procedimento, o que que é uma Activity, e fica fácil compreendermos quando faz sentido ou não criarmos de maneira manual ou dessa maneira automática do Android Studio, via Activity.

Isso significa que não iremos criar uma Activity por meio dessa galeria, disponível aqui, e não adicionaremos nenhuma Activity nesse primeiro momento. Vamos fazer de maneira manual para entendermos o conceito e todos os passos, e depois podemos até usar essa ferramenta para facilitar esse procedimento.

Então vamos deixar nesta opção, "Add No Activity". Quando clicarmos em "Finish", o Android Studio começará a carregar todos os procedimentos necessários para poder configurar o nosso projeto. Inclusive, ele vai usar uma ferramenta de build chamada de Gradle. Caso haja algum tipo de problema ou tudo funcionar da maneira esperada, ele vai sempre passar um feedback para nós.

Para lidar com os problemas, existe uma aba "Project", e podemos clicar em "Gradle Scripts", que exibe a opção gradle.properties (Project Properties), com algumas configurações padrão quando criamos o projeto via Android Studio, e dentre as opções há org.gradle.jvmargs=-Xmx1536m, uma técnica para otimizar o espaço reservado na memória, que acabou gerando um problema no computador que estou utilizando.

Se você tivesse o mesmo problema, uma maneira de resolvê-lo é o seguinte: comentamos essa instrução que o Android Studio colocou para nós, e tentamos refazer o build. Para tentarmos novamente clicamos no link "Try again", que é o que aconteceria normalmente. Como é que sabemos que ele está rodando sem nenhum problema?

Na aba de "Build: Sync", indica-se que estão sincronizando o projeto, e então começa a rodar diversos procedimentos que são conhecidos como testes, para essa configuração inicial, sejam as dependências, a configuração para poder verificar se tudo funciona da maneira esperada. De repente, quando estivermos fazendo essa configuração, às vezes não teremos uma dependência específica, e aí o Android Studio irá identificá-la e solicitar o download dela.

Por já ter feito isso outras vezes, com outras configurações e outros projetos, ele já tem essas dependências que envolvem o SDK do Android, o kit de desenvolvimento de software para Android e, por isso, ele não apareceu para mim, mas caso apareça para você, pode instalá-lo sem nenhum tipo de problema. Assim que finalizar a execução de todo aquele procedimento, aparecerá essa mensagem nessa linha de build.

Isso significa que o nosso projeto foi criado sem nenhum problema, e se quisermos verificar e ter certeza de que realmente não teve nenhum problema, poderemos acessar novamente a aba com "Project" e clicar no diretório chamado "app". Nele serão mostrados os arquivos que representam este "manifests", este "java", "generatedJava", e este "res".

Vamos fechar esse arquivo de Gradle que abrimos, e esse é o primeiro passo que fazemos para criar o projeto. Agora que o criamos e está tudo bonitinho, a seguir entenderemos quais são os próximos passos para conseguirmos executar o nosso projeto e ter o nosso primeiro aplicativo rodando.

@@08
Criando o projeto

As instruções iniciais de criação de projeto foram feitas para a versão 3.2.1 do Android Studio, caso esteja utilizando a versão 4.1 ou maior, confira a seção Criação de projeto na versão 4.1.
Abra o Android Studio e clique no botão Start a new Android Studio project. Então defina os seguintes campos:

Application name:: Agenda;
Company domain: alura.com.br;
Project location: local onde costuma deixar seus projetos.
Clique em Next.

Definindo suporte para plataformas e versões do Android
Defina a versão mínima que vai dar suporte para a API do Android. Durante o curso vamos utilizar a versão 19 como mínima. Sobre a plataforma, vamos manter suporte apenas para smartphones e tablets, portanto, pode manter apenas a opção Phone and Tablet.

Fique à vontade para escolher a que preferir, porém, é recomendado que você utilize a mesma versão para mantermos as mesmas configurações.
Clique em Next e na tela para definir Activities, escolha a opção Add No Activity para apenas criar o projeto com as configurações mínimas, por fim, clique em Finish e aguarde o Android Studio finalizar as tasks do Gradle.

Criação de projeto na versão 4.1
Durante a gravação do curso, utilizamos a versão 3.2.1 do Android Studio, porém, como eu havia mencionado, é uma ferramenta que atualiza constantemente e, a partir da versão 4.1, mudou um pouco o fluxo de criação do projeto. Ao invés de Start a new Android Studio project agora é Create new project.

Após clicar, acessamos diretamente a tela de galeria de Activities:



A princípio parece a mesma tela de galeria apresentada no final do wizard, mas observe que temos algumas diferenças.

A mais notável é que o Android Studio já realiza a configuração da plataforma que daremos suporte, por padrão ainda é mantida a opção para smartphones e tablets (Phone and Tablet), mas para escolher as demais plataformas, basta clicar nas abas na parte superior e são apresentados alguns modelos disponíveis de Activities para cada plataforma.

Da mesma maneira, mantenha a opção Add No Activity que teremos o mesmo resultado visto em vídeo. A diferença é que ao invés de clicar em Finish agora temos a opção Next:



Nesta tela temos novidades também! Nela atribuímos o nome do projeto, porém, ao invés do domínio da companhia/empresa (Company Domain) definimos o pacote diretamente.

O local do projeto ainda mantém o mesmo comportamento e agora temos um combobox para selecionar a linguagem que o projeto vai dar suporte, mantenha a opção Java.

Em seguida definimos a versão mínima da API do Android e temos o mesmo comportamento quando pedimos ajuda para escolher uma versão (Help me choose).

Por fim temos o campo Use legacy android.support libraries que configura as bibliotecas do Android Support no projeto. Durante o curso foram utilizadas essas bibliotecas, pois estava no processo de migração para o AndroidX.

Porém, a partir da API 29, o AndroidX é o padrão e não temos mais atualizações ao Android Support! Isso significa que não é necessário marcar essa opção e pode manter o uso do AndroidX.

Com essa mudança, qualquer biblioteca do Android Support será do AndroidX.

Durante o curso é feita uma breve introdução do que é o AndroidX em relação ao Android Support Library que é utilizado no curso.
Por fim, basta apenas clicar em Finish que temos o mesmo comportamento visto em aula.

Observações entre as versões
É válido lembrar que o Android Studio 4.1 apresenta alguns aspectos visuais diferentes do 3.2.1, principalmente em relação a aparência de ícones. Porém, a maioria dos comportamentos são mantidos da mesma maneira.

Caso tiver dúvidas, fique à vontade em entrar em contato com gente.

https://developer.android.com/jetpack/androidx/

https://developer.android.com/topic/libraries/support-library/

O projeto deve ser criado sem nenhum problema, apresentando os diretórios iniciais a partir do módulo app.

@@09
Resolvendo possíveis problemas

Em algumas situações o Android Studio pode apresentar problemas de compilação no projeto que, mesmo seguindo as orientações para solução, o problema não é resolvido.
Se você não teve nenhum problema, sugiro apenas que salve este exercício (seja o texto ou via favoritos), lembre-se de consultá-lo quando tiver um problema e prossiga com a.
Para casos como esses ou qualquer situação genérica que apresente um problema, podemos seguir os seguintes passos que geralmente funcionam.

Limpando e recompilando o projeto
Use o atalho Ctrl + Shift + A para abrir a opção Find Action (vai aparecer o título Enter action or option name);
Então digite "Clean Project" até aparecer a opção com o mesmo nome e tecle Enter para executar -> Essa ação vai limpar o projeto;
Em seguida, Find Action novamente com o Ctrl + Shift + A e busque a opção Rebuild Project e a execute -> Nessa opção serão executadas as tasks do Gradle para recompilar o seu projeto.
Com esses dois passos, conseguimos resolver grande parte dos problemas, porém, pode ser que ainda não seja o suficiente!

Sincronizando projeto com o Gradle
Se o problema persistir, use novamente o Find Action, e tente a opção Sync Project with Gradle Files, nessa opção ele vai fazer o processo de sincronização do projeto com os arquivos de configuração de build do Gradle.

Invalidando cache e reiniciando o Android Studio
Se a sincronização não for o suficiente, a última alternativa é invalidar o cache, para isso vá no Find Action novamente e execute a opção Invalidate Caches / Restart... e clique na opção Invalidate and Restart.

Esta opção reinicia o Android Studio, porém, além de reiniciar, no meio do processo ele remove todos os arquivos gerados pela IDE e gera novamente.

Se o mesmo problema for apresentado, sugerimos que entre em contato com a gente por meio do fórum, indicando a mensagem do problema e, se possível, enviando o projeto via GitHub para que seja possível testar e investigar o problema.

https://github.com/

@@10
Implementando a Activity

Agora que temos o nosso projeto criado, podemos executá-lo, e para isso vamos nessas opções de cima e logo aqui, nessa opção com "app" temos um botãozinho que representa um play, que também indica a execução do nosso projeto. Vamos clicar nele e ver o que acontece. A princípio, não aconteceu nada, porém apareceu um balãozinho embaixo, em vermelho, indicando que houve um erro durante a execução do módulo "app".
Além disso, ele indica que não foi encontrada nenhuma Activity padrão. Significa que durante a execução de um projeto Android, diferentemente de executar uma classe com método Main, assim como estamos acostumados em aplicações em Java, vamos ter Activities que serão o ponto de entrada do nosso aplicativo. Então, justamente por isso, durante a criação do projeto, o Android Studio sugere a criação da Activity.

Havia comentado anteriormente sobre fazermos esse procedimento de criar uma Activity de forma manual, para que entendamos todo o conceito por trás, e fique claro o que é uma Activity, como ela funciona e como podemos criá-la. Antes de fazermos todo esse código de maneira prática, vamos entender a parte teórica, pois dessa maneira, partindo da teoria, conseguimos fazer a implementação de acordo com o que faz sentido para nós.

Então, para explicar toda essa parte teórica, fiz uma apresentação para poder indicar passo a passo o que faz sentido sabermos sobre Activity. A primeira parte a ser entendida é que em apps Android não teremos os famosos métodos Main, e sim as Activities, para inicializarmos os nossos aplicativos. Este diagrama nos ajuda a ter um pouquinho de abstração sobre como elas funcionam.

Esse retângulo grandão representa o nosso aplicativo, e esse quadradinho pequeno seria uma Activity dentro do nosso aplicativo, o nosso ponto de entrada. Aí vem a questão: o que existe em uma Activity? O que a compõe, o que precisamos saber sobre ela? O primeiro detalhe importante é que ela terá uma View, uma entidade na qual é mostrado um feedback visual para o nosso usuário. Por exemplo, quando clicamos em um aplicativo para poder abri-lo, na listinha de aplicativos, existe uma tela inicial, justamente esta View.

Além da parte da View teremos lógica, também, dentro da Activity, então quando abrimos a View, teremos uma lista de usuários, então, para podermos adicionar cada um deles, vamos usar a lógica, por exemplo, o nosso código Java, então, toda essa parte "inteligente" da aplicação, que fará algo além de só mostrar alguma informação visual para os nossos usuários é considerada uma lógica.

Traduzindo toda essa abstração para uma execução, seria da seguinte maneira: teríamos essa tela que representa uma lista de usuários, e toda essa parte visual e estática é representada pela nossa View. A parte lógica, que representa por exemplo a adição de um usuário ou de uma ação durante um toque de um botão é representado pela lógica. Basicamente, é dessa maneira que uma Activity se comporta no nosso aplicativo. Partindo desse princípio, podemos começar a criar a nossa Activity.

Para isso, voltaremos no Android Studio e vamos começar a escrever o nosso código. Para criarmos uma Activity, primeiro precisamos criar uma classe que a representará, então clicaremos nesse diretório chamado "java", com os pacotes para escrevermos código fonte, três pacotes raiz.

O primeiro pacote representa o nosso pacote principal, no qual terá o nosso código, que também é considerado como o código de produção: todo o código a ser executado e apresentado para o nosso usuário.

Logo a seguir temos mais dois pacotes, cujos nomes são "test" e "androidTest". Eles representam códigos de teste, caso queiramos fazer um código para testar o nosso aplicativo, é dentro dele que colocaremos.

Durante esse curso, não veremos este assunto de testes, porque há um curso específico falando sobre testes no Android, então não se preocupe com esses pacotes, pode ignorá-los sem nenhum problema. Iremos focar apenas nesse pacote de cima, que representa o nosso código de produção.

Já que vamos usar aquele pacote, vamos criar uma classe. Podemos até usar atalhos do Android Studio, que por debaixo dos panos é o IntelliJ, ou seja, os atalhos que utilizamos nesta IDE também são utilizados no Android Studio.

O atalho para criar algo é o "Alt + Insert", que nos dá diversas opções de criação, dentre as quais "Java Class". Começaremos partindo desse princípio, dado que criaremos a nossa Activity principal, podemos colocar aquela nomenclatura que é comum no Java, que seria um Main, então no caso escreveremos MainActivity.

Criamos a nossa classe para representar a nossa Activity inicial, porém, esta maneira não representa uma Activity do Android Framework. Isto é, temos que fazer um passo a mais, e para isso utilizamos técnicas da programação orientada a objetos, como é o caso da herança.

Herdaremos de uma classe chamada Activity e, se virmos um pouquinho mais sobre ela, perceberemos que ela faz parte do pacote "android.app", e quando damos um "Enter" ele a importa para nós.

Agora tem um detalhe que é bem bacana: simplesmente indicar que trata-se de uma Activity por meio da herança não é o suficiente para que o sistema operacional do Android enxergue como tal, então, mesmo que tentemos executar agora, ele ainda não consegue encontrá-la, porque também precisamos fazer outro registro para o sistema operacional do Android, para podermos identificar esta Activity como verdadeira.

Para isso temos que fazer uma configuração extra, relacionada a um arquivo conhecido como Manifesto do Android, que fica localizado na pasta "manifests" que, ao ser clicado duas vezes abre o arquivo AndroidManifest.xml, dentro do qual teremos a capacidade de fazer a configuração dos componentes principais do nosso aplicativo.

Já há uma configuração inicial que representa esse componente chamado de application, que é o componente principal do nosso aplicativo, e é por meio dele que se mantém o estado global do nosso aplicativo. É por meio dele também que vamos registrar as nossas Activities e qualquer tipo de outra entidade que seja do Android.

Ele até declara o nome do nosso aplicativo, tem a representação do ícone a ser apresentado durante a execução, é ele que tem as informações principais do nosso aplicativo. Já que temos que colocar dentro dele, veja que ele tem a tag fechada por padrão, porque não há nenhum tipo de configuração.

Assim, o primeiro passo quando estamos no Manifest é abrir o nosso application para registrarmos outras entidades do Android. Isso permitirá a capacidade de adicionarmos esses componentes do Android, então, se abrirmos uma tag, o programa irá mostrar as possibilidades de componentes do Android para autocomplete.

A primeira exibida é activity, e quando damos um "Enter" ele já autocompleta indicando o nome da Activity que queremos registrar, fazendo uma identificação com base nas Activities que temos no projeto. Fechar essa tag já é o suficiente para declararmos uma Activity, porém não para que ela seja uma Activity principal durante a execução.

Inclusive, mesmo com essa declaração, não conseguimos executar o nosso aplicativo, e ainda aparece aquela mesma mensagem de erro. Portanto, para fazermos uma Activity principal que irá aparecer na listinha de aplicativos, para ser tocada e abrir, temos que fazer uma configuração extra.

Vamos abri-la novamente da mesma maneira que fizemos com o nosso application, e colocaremos um filtro de intenção, justamente para indicar que a nossa Activity seja principal, que pode ser lançada, isto é, abarcar a ação de tocar a nossa listinha de aplicativos e abrir para nós.

Para isso, adicionaremos o nosso intent-filter, o filtro de intenções, abrimos ele e adicionamos duas tags que representarão a ação de ser a activity principal. Assim, temos o android.intent.action.MAIN, e teremos uma categoria para indicar o seu lançamento, sendo, portanto, um lançador.

Com essa configuração, teremos a capacidade de executar o nosso aplicativo. Antes, havia um xizinho na parte superior do Android Studio, e agora não aparece mais, justamente por conta dessas configurações iniciais para indicar que essa Activity será o ponto de entrada principal do nosso aplicativo.

Agora vamos executar o nosso aplicativo e ver o que acontece, acessando novamente o play. Percebam que até mudou um pouquinho o nosso feedback, antes aparecia a mensagem, e agora aparece essa nova tela, que indica o alvo no qual lançaremos o nosso aplicativo.

Este alvo representa um dispositivo que iremos usar para executarmos, porque no Android, em vez de fazermos a execução via JVM, via compilador do Java, por exemplo, utilizamos um dispositivo real ou simulado.

<category android:name="android.intent.category.LAUNCHER" />COPIAR CÓDIGO
Por exemplo, nessa etapa poderíamos usar o nosso próprio celular para a execução, e ele até diz que não há nenhum tipo de dispositivo via USB ou então algum tipo de emulador detectado.

Então temos essas duas opções — via emulador ou via celular físico. Durante esse curso optaremos por um emulador, que iremos criar a partir de agora. Para tal, iremos à opção "Create New Virtual Device", depois teremos uma galeria de emuladores disponíveis para criarmos. Dentre as opções existentes atualmente temos "Pixel 2", "Pixel XL", "Nexus S", muitas opções.

Escolheremos esse "Pixel 2", sendo possível utilizarmos qualquer versão, não tem nenhum tipo de restrição. Vamos fazer o procedimento: para selecionarmos, clicamos uma vez, damos um "Next", e então temos uma galeria de imagens de versões do Android disponíveis para incluirmos no emulador.

Temos essas duas opções que não oferecem a opção de download. Isso acontece porque já temos essas imagens baixadas, as quais poderemos utilizar sem nenhum problema. Se for a primeira vez, aparecerá essa opção de download, é só clicar que ele vai começar com esse procedimento, e assim que ele finalizar é possível usar a imagem.

Usaremos essa versão da API 28, que representa o Android 9. Depois, daremos um "Next" novamente, e ele indica as opções padrão, que já são o suficiente. Agora, precisamos dar um "Finish", e com isso temos disponível um dispositivo conhecido como emulador ou dispositivo virtual que podemos selecionar para executar o nosso aplicativo. Daremos um "OK", e o Android Studio vai pegar este emulador que criamos e faremos a execução do mesmo.

Então, nesse primeiro momento, é uma execução um pouquinho demorada. Como havia comentado com vocês, durante até mesmo o exercício, para instalarmos o Android Studio, às vezes pode ser que ele demore muito por causa do computador por não ser um hardware com uma configuração potente, e por isso pode demorar muito, até mesmo travar. Esse é o procedimento para executarmos o nosso aplicativo.

Ele criou a nossa Activity, e agora estamos pegando a nossa Activity, nosso ponto de entrada, subindo o emulador e, assim que ele subir, ele pegará tudo que configuramos e fará a execução para nós. Finalizada a execução, o Android conseguiu apresentar o nosso aplicativo, e já que não fizemos nenhum tipo de configuração na nossa View, e não criamos nenhuma, não implementamos nenhuma lógica, essa tela inicial surgiu, representada por uma tela em branco.

Conseguimos fazer a primeira execução do nosso aplicativo, a seguir veremos algumas técnicas iniciais que podemos utilizar para podermos dar um pouquinho mais de vida à nossa tela inicial. Até já!

@@11
Criando a primeira Activity

Implemente a primeira Activity do App. Para isso, crie a MainActivity no pacote raiz e faça extensão da classe Activity. Em seguida, declare a Activity no manifesto do Android (AndroidManifest.xml). Para executar o projeto, adicione a tag <intent-filter> aplicando a action como MAIN e category como LAUNCHER.
A partir do SDK 31, ao declarar Activities com <intent-filter>, é necessário adicionar mais um atributo na tag <activity>, o android:exported. Esse atributo recebe um valor boolean, sendo true para permitir que outros Apps ou o próprio sistema Android consiga abrir a Activity, e false, para que apenas o App consiga abrir a Activity. Considerando que Launcher é um recurso para abrir o App de maneira externa, deixe o valor do android:exported como true. Se tiver dúvidas de como adicionar o atributo, confira a resolução da atividade. Caso queira saber mais detalhes do uso do atributo, confira esta página da documentação.
Com essa configuração vai desaparecer o "x" vermelho na opção app próximo ao botão de execução, isso indica que que é possível executar o App. Rode o App e escolha o dispositivo alvo.

Você pode criar um emulador (dispositivo virtual) da mesma maneira como fizemos em vídeo, ou pode executar via dispositivo físico seguindo o tutorial do Android Developers de execução de App .

Após execução, verifique se tudo funcionou como esperado.

Emulador embutido no Android Studio 4.1
A partir da versão 4.1 do AS, é possível rodar o emulador embutido na IDE:

https://developer.android.com/guide/topics/manifest/activity-element#exported

https://developer.android.com/training/basics/firstapp/running-app?hl=pt-br

https://developer.android.com/studio/run/emulator#run-emulator-studio

O dispositivo deve apresentar a seguinte tela:


Em código temos o seguinte resultado:

AndroidManifest.xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="br.com.alura.agenda">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>
    </application>
</manifest>COPIAR CÓDIGO
Caso utilizar o SDK 31 do Android, o manifest vai apresentar um problema na tag <activity>, apenas adicione o atributo exported="true":

<activity android:name=".MainActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.MAIN"/>
        <category android:name="android.intent.category.LAUNCHER"/>
    </intent-filter>
</activity>COPIAR CÓDIGO
MainActivity.java:
package br.com.alura.agenda;

import android.app.Activity;

public class MainActivity extends Activity {
}COPIAR CÓDIGO
Uma das vantagens em executar o projeto direto no dispositivo físico, é o menor consumo de recurso do computador, ou seja, evita travamentos em relação à execução via emulador.

@@12
Adicionando comportamentos na Activity

Agora que conseguimos rodar o nosso aplicativo, faz todo sentido modificarmos um pouquinho mais essa parte visual do nosso usuário, para adicionarmos algum tipo de elemento a mais para obtermos um feedback diferente, como se fosse uma mensagem, e como é que podemos fazê-lo.
Como vimos na parte teórica básica, teremos que mexer na nossa Activity para adicionarmos comportamentos, ou Views, então vamos voltar para o código da Activity. Precisamos, de alguma maneira, fazer esse tipo de adição, só que agora tem um detalhe, como vimos, não temos nenhum tipo de método Main no qual será feita a inicialização da nossa Activity pelo próprio sistema do Android.

Assim, como podemos adicionar um código no qual será executada a nossa Activity, quando sabemos que isso é possível?

Existe um mecanismo nas entidades do Android, em específico na Activity e em outras, conhecido por ciclo de vida. Significa que essas entidades do Android terão estados, ou seja, existirá um estado que criará a Activity, ou outro estado que vai destruí-la, e é dessa maneira que o Android acaba controlando-as para nós. E também é dessa maneira que temos a capacidade, por exemplo, de adicionar comportamento aos estados, como quando uma Activity é criada — temos a capacidade de sobrescrever esse comportamento.

Dado que estamos fazendo herança da nossa classe Activity, podemos escrever o método, o qual pegará um estado específico, como esse de criação. E qual seria, então, o método para sobrescrever essa ação e adicionar novos comportamentos?

Seria justamente esse onCreate, que quando escrevemos vai sobrescrever o método da Activity no qual será colocado todo tipo de código durante a criação. Vejam que se usa super.onCreate, que é justamente da Activity, inclusive, esse método da classe mãe deve ser executado, pois se comentarmos com "Ctrl + barra", o que acontece é que ele reclama e diz que devemos chamar o método super da nossa classe Activity, porque é a partir dele que ele vai resolver todos os detalhes em relação ao ciclo de vida que o Android como sistema operacional acaba utilizando.

Por isso que ele será sempre chamado, e o que temos capacidade de fazer é adicionar novos comportamentos, como uma View diferente, ou qualquer outra coisa. Tem outro detalhe bem importante: no momento em que fizemos essa sobrescrita, ele adicionou essa anotação indicando um Nullable, que esse parâmetro, o Bundle, uma classe que nos envia informações entre as Activities a partir do ciclo de vida, e informando que pode ser nulo, para que o compilador tenha essa informação e consiga nos ajudar no momento em que utilizarmos este Bundle e dizer que pode ser algo nulo, para que se tome cuidado e para garantirmos que ele não seja.

Mas ele não conseguiu achar, por estar tentando colocar a partir do módulo androidx, uma nova biblioteca que a equipe do Android Developers (a equipe de desenvolvedores do Android) está fazendo para substituir uma outra, conhecida como Android Support, e é por isso que ele não conseguiu achar; porque não foi adicionada como dependência do nosso projeto.

Portanto, ao invés de usarmos androidx, optaremos pelo Android Support, para isso podemos apagá-lo e usar o "Alt + Enter" para ele fazer um import com a biblioteca que já vem configurada para nós; pode ser que no momento em que você estiver criando o projeto, ele já esteja usando android.support, colocando tudo da maneira esperada e você não tenha esse problema.

Agora que estamos sobrescrevendo o onCreate, temos capacidade de adicionar comportamentos, e começaremos adicionando uma mensagem qualquer, algum tipo de mensagem inicial, similar àqueles "hello world", para que seja exibida na nossa tela. Vamos usar uma das técnicas iniciais de apresentação de mensagem, que é a partir de um componente denominado Toast por ser similar a uma torrada, aparecendo e desaparecendo.

Para colocá-lo podemos usar técnicas do próprio Android Studio, então começaremos escrevendo Toast, e ele tem duas opções: a primeira usará a classe e a de baixo, um template pronto no qual se colocará tudo o que for necessário do Toast e só modificaremos os parâmetros, os argumentos necessários. Sendo assim, usaremos essa segunda de baixo, daremos um "Enter", e ele já completa para nós.

Vamos tentar entender esses argumentos iniciais para tornar facilitar o entendimento deles. O primeiro destes argumentos representa uma classe chamada context, uma classe base para qualquer tipo de entidade do Android, a partir da qual conseguiremos indicar de onde vem a ação, então quando enviamos this, estamos indicando que ele está vindo a partir da nossa Activity, porque ela também é representada por um context.

Então, toda Activity herdará de context para indicar que faz parte daquele contexto, daquela situação do nosso aplicativo. Por isso, estamos mandando o this. Logo a seguir temos o texto em string, a mensagem que aparecerá. Colocar o nome Alex Felipe, e em seguida temos o terceiro argumento, que representa o tempo de duração da mensagem. Já temos algumas constantes do Toast, esse LENGTH_SHORT, que significa um tamanho curto, que aparecerá rapidamente. O outro se chama LENGTH_LONG, que vai demorar um pouquinho mais para o Toast desaparecer.

Por fim, ele chama o método show(), que mostra o nosso Toast. Então, primeiro se chama esse makeText() que é o estático e receberá aqueles argumentos, e o show() para mostrar. Com isso, conseguimos colocar o nosso Toast no momento em que a nossa Activity é criada.

Então vamos executar novamente o nosso aplicativo e ver isso acontecendo. Daremos um "Shift + F10" para ele vir nesse botãozinh, trata-se de um atalho de execução, e escolheremos novamente o nosso emulador, já que ele já está sendo executado, ele reaparece, inclusive, essa é a recomendação: não feche o emulador assim que você o executa pela primeira vez, pois como vimos, ele demora para subir na primeira vez.

Iremos mantê-lo aberto para podermos executá-lo posteriormente, e o feedback de execução ser mais rápido. Daremos "Enter" e vamos aguardar o Android Studio fazer a execução. Feito isso, nosso aplicativo é aberto, e é exibida a mensagem "Alex Felipe". Podemos até executar diretamente no nosso emulador, dado que colocamos a Activity Launcher.

Podemos acessar a nossa listinha de aplicativos, dentre os quais temos a agenda, que quando abrimos faz a mesma execução da nossa Activity, e o textinho é exibido embaixo. É dessa maneira que conseguimos adicionar comportamentos na nossa Activity. Não teremos mais um método Main, mas teremos o nosso ciclo de vida para alterarmos os comportamentos padrão que o Android, como sistema operacional, acaba atribuindo à Activity.

Agora que aprendemos esses detalhes, logo mais veremos outras técnicas nas quais conseguiremos implementar um layout, ver as partes básicas de como fazê-lo, quais são as boas práticas neste tipo de implementação.

@@13
Mostrando mensagem na tela

Modifique o estado de criação (onCreate()) da Activity para que apareça um Toast com a mensagem indicando o nome do primeiro aluno. Você pode usar o seu nome para isso.
Dica: Ao implementar o Toast, utilize o template do Android Studio a partir da segunda opção.
Execute o App e veja se tudo funciona como esperado.

O App deve apresentar o seguinte aspecto visual:


Em código ficamos com o seguinte resultado:

MainActivity.java

package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Alex Felipe", Toast.LENGTH_LONG).show();
    }
}

@@14
Sobre alterações na Activity

Aprendemos que no Android framework, temos as Activities como ponto de entrada do App e que permite a adição de views e lógica. Como adicionamos novos comportamentos para as Activities?

Sobrescrevendo métodos de estados do ciclo de vida da Activity.
 
Isso mesmo! Para adicionar comportamentos nas Activities, exploramos o conceito de ciclo de vida da Activity que é a forma na qual somos capazes de modificar os comportamentos padrões controlados pelo Android.
Alternativa correta
Utilizando a técnica de herança, tornando a nossa Activity uma Activity do Android Framework.
 
Fazer a extensão não é o suficiente para aplicar novos comportamentos para uma Activity.
Alternativa correta
Escrevemos um método main que é executado assim que a Activity é criada.
 
Activities são entidades controladas pelo SO Android, logo, não possuem um método main assim como vemos em aplicações Java comuns.
Alternativa correta
Implementamos um método novo com o comportamento esperado.
 
Criar um novo método não é o suficiente, pois o Android não executa comportamentos da Activity apenas fazendo a sua declaração.

@@15
O que aprendemos?

Nesta aula, aprendemos:
o que é o Android e onde é utilizado;
a instalar o Android Studio;
a criar um projeto Android;
a criar uma Activity;
a adicionar comportamentos na Activity.