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

#### 04/09/2023

@02-Aplicando layouts para Activities

Agora que aprendemos a colocar comportamentos a mais na nossa Activity, vamos aproveitar esse momento e configurar Views personalizadas para apresentar aos usuários. Então, ao invés de usar o Toast que colocamos no nosso aplicativo, passaremos a colocar uma View específica para apresentar uma mensagem de maneira estática.
Como podemos fazer isso? O primeiro passo é entrar na Activity, e existem até uns atalhos como o "Ctrl + N", utilizada para acessar uma classe. Como vimos, temos o nosso Toast, o qual acabamos utilizando para apresentar a mensagem, e colocaremos uma View específica dentro da Activity.

Para isto, há um método específico na Activity para podermos setar essas duas Views: o Set Content View. Vamos apagar o nosso Toast e escrever esse setContentView(), a partir do qual podemos enviar um argumento do tipo View, então seria uma View que poderíamos colocar. Uma View que representa um texto e é muito comum de ser utilizada é a famosa TextView.

Faremos agora a instância desta View, e aí sim, colocamos o conteúdo esperado. Como vimos, podemos criar a nossa View via código Java mesmo, ela espera um argumento, daremos "Ctrl + P", e teremos quatro opções de sobrecarga, e o que ela exige, pelo menos aqui, é que seja um contexto. Sabe que Activity é um contexto, então poderemos deixar this. Agora podemos atribuir para um objeto, então .var, e precisamos indicar o que ele representa; nesse caso, já que estamos fazendo uma agenda de alunos, ele representará o aluno.

Assim, podemos colocar um aluno, em seguida colocaremos a informação de texto, pois até o momento apenas criamos esta View, e queremos incluir uma informação textual, com setText(). É muito simples criar essa View, então podemos executar o aplicativo e vê-la em nosso layout.

Daremos um "Shift + F10", vamos abrir nossos emulador e ver o Android Studio executando o aplicativo com essa View. Parece que a execução não teve nenhum problema e ele aparece bonitinho para nós. Só que com essa técnica que fizemos, que realmente funciona e não teve nenhum tipo de problema, não é considerada uma boa prática, porque estamos colocando responsabilidades demais para a nossa Activity, e perceberemos durante o curso que isso é uma entidade que tende a crescer bastante no código, e quanto menos responsabilidade mantivermos dentro dela, melhor.

Trata-se de um dos detalhes importantes para tomarmos cuidado quando tentamos criar a View de maneira manual, e veremos também que quando fazemos isso o código tende a ficar complexo, por mais que seja uma View simples. Existe outra técnica, com que fazemos com que essas declarações consideradas estáticas fiquem dentro de um arquivo estático, específico para layout. Então pegaremos toda essa implementação que fizemos e a colocaremos em um arquivo específico para layout, e então pegaremos esse arquivo como referência para o nosso setContentView() ao invés de fazer tudo via código Java.

A própria equipe de desenvolvedores do Android disponibiliza essa técnica e a recomenda para a criação de Views. Vamos fazer isso, mas de que maneira ? Como é que poderemos criar esse arquivo estático, aonde que ele fica, como isso funciona? Voltaremos ao projeto, na aba "Project" e no módulo "app", e na parte de embaixo, nos diretórios, temos o "res", também conhecido como resources, onde manteremos os arquivos estáticos. Por padrão, temos algumas pastinhas, e vamos entender um pouquinho do que elas são e para que servem.

A primeira delas é justamente essa "drawable", em que incluiremos todas as imagens estáticas, então, se formos colocar um ícone novo, ou uma imagem para aparecer em uma View. Existem alguns arquivos que foram inclusos automaticamente assim que criamos o aplicativo, como é o caso do ic_launcher_background.xml, que é o fundo com o nosso ícone para podermos lançar o nosso aplicativo.

Assim como o ic_launcher_foreground.xml, que representa o ícone. Temos esse "mipmap", outra pasta destinada a ícones do nosso Launcher. Temos também a versão arredondada, então terão algumas diferenciações no "mipmap", criado para a inclusão deste ícone automaticamente para nós. Por fim temos o "values", em que teremos a capacidade de criar arquivos diversos com alguns valores específicos, para cores, por exemplo, como colors.xml e strings.xml.

E também temos styles.xml, que representa justamente os estilos que teremos em nosso aplicativo, que possui um tema um pouquinho verde, isto por causa do styles.xml, que usa por padrão esse estilo chamado AppTheme. Poderíamos criar outros sem nenhum problema, a princípio não mexeremos nisso, mas é para isso que ele serve. São esses arquivos padrões que acabamos tendo quando criamos o nosso projeto de maneira manual.

Mas aonde deixamos aquele arquivo estático para o layout?

Dado que não temos um diretório pronto, iremos criá-lo. Acessaremos a pasta "res", usaremos "Alt + Insert" e, dentre as opções, há o "Android Resource Directory", ali são criadas pastas feitas para os resources. Dentro dela temos a opção "Resource type", em que temos algumas opções disponíveis, dentre as quais está layout que, ao ser selecionado, sugere-se que o nome seja esse "layout". Por fim, é indicado onde ficará esse "Source set", isto é, os diretórios que vimos, de código de produção e de teste, e no caso estamos fazendo para produção, então deixaremos main.

Então clicaremos em "OK", agora precisamos criar o arquivo para representar o layout. Para isso usamos também o atalho "Alt + Insert", que nos dará a opção "Layout resource file", em que criaremos o arquivo estático para layout. Após "Enter", precisaremos preencher algumas informações, começando pelo nome. Existe um padrão, que começa com o prefixo "activity", seguido de um underline, e então o nome da nossa Activity.

Como vimos, temos a MainActivity, portanto deixaremos activity_main. É um padrão bem comum, e perceberemos isto quando criarmos activities de maneira automática. Logo abaixo, há outra opção, chamada de "Root Element", que irá representar o elemento raiz do layout, o primeiro elemento de todos. Existe até uma sugestão indicando esse LinearLayout. Não vamos nos preocupar com ele nesse primeiro momento, pois só estamos fazendo esse arquivo para vê-lo funcionando, mas em um segundo momento entenderemos passo a passo o que ele significa.

Feitas as configurações, será criado o arquivo para nós. Agora vem um passo bem importante quando criamos este arquivo de layout: a visualização que estamos vendo aqui. Aumentaremos a tela com "Ctrl + Shift + F12", e agora entenderemos o que isso significa; essa visualização representa um editor visual capaz de modificar o layout que nos é disponibilizado de maneira estática. A partir dele é possível usar uma técnica bem comum entre designers, que é pegar elementos de acordo com sua paleta e ficar arrastando e soltando no layout. Isso é conhecido como Drag and Drop, e aqui à esquerda temos esta aba chamada "Palette".

Trata-se da paleta de opções que temos à disposição, várias Views, até mesmo aquele TextView que usamos no código da Activity. Então, nesse momento, a partir dessa visualização, que é nosso editor visual, podemos clicar no TextView, segurar, arrastar e soltar no nosso layout, e quando fazemos isso, ele já consegue colocá-lo nesse nosso arquivo estático.

Assim, a View é exibida, e o que queremos fazer é colocar um conteúdo diferente, com o nome que esperamos; para isso podemos clicar na View e, à direita, temos os atributos disponíveis, dentre os quais o "text", que modificaremos para Alex Felipe, e daremos um "Enter".

Conseguimos criar o arquivo estático, que irá manter o nosso layout. Precisaremos pegar esse arquivo estático que criamos e colocá-lo no nosso setContentView(). Para podermos entrar direto na nossa Activity — mas tentarmos vir nesse navegador superior, que mostra todos os arquivos abertos, vemos que já está uma bagunça, está bem grande, cheio de arquivos abertos. Podemos fechar todos os arquivos e abrir aqueles que estamos usando. Para isso existe o atalho "Alt + Shift + X", com que tudo será fechado.

E então voltamos ao Activity com "Ctrl + N", e agora sim, a nossa Activity está bonitinha. Agora, não usaremos a View de "maneira Java", programática. Iremos incluir a View a partir do nosso arquivo. Então deletaremos e, dentro de setContentView() teremos acesso àqueles arquivos estáticos que vimos.

Mas como temos acesso a esses resources no Android?

O Android nos fornece uma classe conhecida como classe R, então, se a colocarmos, temos a classe representada no nosso pacote, e ela faz um mapeamento de todos os recursos que temos em nosso projeto. Por exemplo, se queremos o mapeamento de layouts disponíveis do projeto, incluímos o R, que é do nosso pacote, damos "Enter", já que ele também faz parte do pacote raiz, e por isso não foi feito nenhum importe. E colocamos o layout, com que temos acesso a todos os arquivos inclusos no nosso layout.

Incluímos o ponto, e o programa traz uma listinha do que há disponível em nosso projeto. Daremos "Enter", e nesse momento o que fizemos foi pegar o nosso layout estático e estamos colocando-o como View da nossa Activity, então ele vai apresentar exatamente esse arquivo que criamos. Vamos executar e ver o que acontece, com "Shift + F10", abriremos o emulador executando, e aguardaremos o Android Studio finalizar.

O "Alex Felipe" está aparecendo; inclusive, se modificarmos o conteúdo para "Alex", vamos ver se o programa faz essa reflexão automaticamente. Agora, quando modificamos a execução e a repetimos, ele pegará novamente do arquivo de layout e vai mostrá-lo para nós. Essa técnica que acabamos utilizando para podermos colocar layouts na nossa Activity. Iremos sempre pegar a partir de um arquivo estático, a partir do qual será mostrada toda a parte visual, e aí sim colocamos no setContentView(), ao invés de colocarmos via código Java.

A seguir entenderemos mais peculiaridades sobre como podemos montar o layout, entender um pouquinho sobre aquele LinearLayout que vimos, e ver quais são os princípios básicos existentes para montar layout diversos no Android.

@@02
Criando o layout da Activity

Caso você precise do projeto com todas as alterações realizadas na aula passada, você pode baixá-lo neste link.
Implemente o primeiro layout da Activity, para isso, crie o diretório layout na pasta res, em seguida, crie o arquivo de layout com o nome activity_main, nesse arquivo considere o LinearLayout como elemento raiz. Adicione um TextView com o texto indicando o nome de um aluno.

Nesta atividade utilize o editor visual e a técnica de drag and drop (clicar, segurar e arrastar a view).
Ao finalizar a implementação do layout, no onCreate() da MainActivity, chame o método setContentView() enviando a referência do arquivo estático de layout criado.

Lembre-se que para pegar referência dos arquivos estáticos o Android oferece a classe R.
Execute o App e veja se aparece o mesmo layout criado.

https://github.com/alura-cursos/fundamentos-android-parte-1/archive/aula-1.zip

O App deve apresentar a seguinte tela:


Em código temos o seguinte resultado:

package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

@@03
Iniciando a implementação de layout de lista

Aprendemos a implementar layouts no Android por meio de arquivos estáticos de layout, então aproveitaremos esse momento para vermos um pouco sobre a proposta de implementação de layout que teremos durante o curso. Dessa maneira, em vez de implementarmos layouts sem objetivos.
Temos um PDF indicando essa proposta em formato de simulação de uma solicitação de cliente, de uma implementação. Vamos dar uma olhada em como seria a primeira tela que teríamos que implementar, aquela em que estamos trabalhando, com uma lista de alunos exibindo os itens.

Espera-se que tenha uma App bar com o título "Lista de alunos" que, no Android, é a barrinha que fica na parte de cima. Então, é esperado esse tipo de componente nessa tela, da mesma maneira que espera-se que tenha uma lista de alunos. E como podemos ver, há esse aluno, que é o Alex, e a aluna Fran, e a possibilidade de adicionarmos novos alunos, como é o caso do José, do Guilherme, e por aí vai.

O que é esperado também é que exista um botão para adicionar um novo aluno. É indicado o visual desse botão, que seria esse círculo com esse iconezinho indicando que vai ter uma adição.

Então, em relação à implementação de layout, o nosso foco será atingir esse objetivo, considerando o que já aprendemos, técnicas que vimos de implementação de layout, daremos início à implementação desse resultado final. Nesse momento, vamos focar na implementação da adição dessa lista para possibilitarmos a adição desses alunos.

Voltaremos no Android Studio e, com base no que aprendemos e vimos, as formas com as quais acrescentamos componentes que vão representar textos, teríamos que colocar mais Text Views para possibilitar a adição de outros alunos e indicar que seria uma lista. Então vamos fazê-lo embaixo, ele já entrou na parte de baixo daquele primeiro que representa o Alex, e adicionaremos outro Text View.

Adicionaremos só esses três, e agora pegaremos via código Java, e fazer um vínculo com estes Text Views, porque o que irá acontecer é que precisamos colocar de acordo com uma lista que receberemos. De repente receberemos uma lista de alunos de um arquivo, ou de um banco de dados interno, ou vamos puxar de um serviço online. Precisamos pegar de uma lista, de um conjunto de dados que temos no nosso aplicativo para podermos mostrar aqui na lista, e esse é o comportamento esperado.

Agora aprenderemos como podemos pegar os componentes do arquivo estático e fazer o vínculo dos dados com o nosso código-fonte. Para isso, como sabemos, temos que vir na nossa Activity, e simularemos aqueles dados que vão vir, por exemplo, de algum lugar qualquer, resultando em uma lista.

Então faremos essa lista que representará os nossos alunos. Para isso criaremos uma lista, mesmo, então teremos uma List de string, que importaremos, e então precisaremos colocar uma implementação para ele. A implementação que faremos será de um Array list mesmo. Dado que são dados de exemplos, e que ainda não temos, por exemplo, uma fonte de dados concreta, que virá de arquivo ou de um banco de dados, vamos incluir o famoso Array as list, que será uma lista dinâmica que criaremos agora.

Pegaremos o Arrays, aquela classe, as List, para criarmos a nossa lista de maneira dinâmica, e vamos colocar alguns alunos de exemplo: o Alex, Fran, e o José. E agora precisamos pegar essas Views para o vínculo dos dados. Como poderemos fazê-lo?

Cada vez que adicionamos uma View no Android Studio por meio do editor visual, ele coloca o identificador para elas. Então, ao clicarmos no Alex, ele tem como ID, nessa parte dos atributos à direita, o Text View. No segundo deles, ele tem como ID o Text View 4, e no outro um 5.

Se fossemos colocando outras, ele iria incrementando com um número a mais. É dessa maneira que temos a capacidade de identificar as Views. Além disso, é dessa maneira que conseguimos pegá-la via nosso código Java — e qual seria o comportamento que poderíamos utilizar?

Temos um método chamado Find View By ID, e quando o pegamos, conseguimos pegar a View com base no seu ID, que é o seu identificador. Assim, sabemos que temos que usar a classe R para termos acesso aos nossos resources e, em vez de um layout ou qualquer outro tipo de recurso, podemos usar diretamente o nosso ID, porque ele também faz parte do resources e identifica um recurso com base no que ele teve de identificador.

Quando fazemos essa abordagem, por padrão, o que método vai devolver para nós? Ele vai devolver uma referência de uma View qualquer, pois como sabemos as Views do Android têm como classe base a View. No entanto estaremos lidando com o Text View, e não com uma genérica. Sendo assim, podemos modificar essa referência de View para um Text View, então mudaremos o nome para indicar o primeiro aluno, e logo em seguida, indicaremos que trata-se de um Text View. Dessa maneira, conseguiremos utilizá-la, com base no que implementamos no layout.

Só para tentarmos entender o porquê disso acontecer dessa maneira, e por quê temos a capacidade de mudar para Text View sem nenhum problema, o Find View by ID devolve um Generics que estende de View. Ou seja, qualquer tipo de extensão de View, de classe ou componente que faça herança de View, pode ser colocada como referência.

É por isso que não teve nenhum problema quando fizemos a mudança. Agora, precisamos só pegar as três referências, então vamos usar o "Ctrl + D" para copiarmos três vezes, e mudaremos tanto no ID, que são o Text View 4 e 5. E agora também temos a referência dos outros alunos, então seria o segundo aluno e o terceiro aluno. Aí, o que precisamos fazer é só colocar os dados. Por exemplo, aqui no primeiro aluno, podemos colocar com a informação do nosso primeiro aluno com base na nossa lista.

Na nossa lista de alunos, podemos pegar a primeira posição, que é o 0, e da mesma maneira podemos fazer para os outros alunos com base nos nossos Text Views. Fazemos o mesmo com o terceiro aluno. Assim, pegamos as Views que colocamos no nosso layout, pegamos a nossa lista e fizemos o nosso vínculo.

Agora vamos executar e ver se aparecem os alunos como esperado, vamos abrir o emulador e aguardar o Android Studio finalizar a execução para vermos o resultado. Estão aparecendo os nossos alunos, então conseguimos fazer a parte inicial da implementação da lista de alunos, porém, ela foi proposital para mostrar um problema que acontece se consideramos esse tipo de implementação.

O primeiro problema é a inflexibilidade da nossa solução, pois não sabemos se a nossa solução sempre terá 3, ou 4 alunos, ou o número que for. Já temos esse tipo de problema, que é uma solução que vai ficar sempre suscetível a mudanças, então, se mudarmos para 4 alunos, ou qualquer outro número diferente de 3, teremos que modificar tanto nosso layout como o nosso código.

Não é uma solução ideal para quando queremos lidar com listas, e da mesma maneira percebe-se que o código vai ficando cada vez maior, ou seja, se tivessem 10 alunos, seriam mais linhas que teríamos que colocar para colocar essa solução. Então, é realmente uma solução entre aspas, mas não é ideal para esse tipo de comportamento ou abordagem, considerando esse tipo de necessidade ou problema que acabamos de identificar.

A seguir veremos uma técnica ideal para lidar com esse tipo de situação, quando temos uma coleção de Views. Da mesma maneira em que temos uma lista para colocarmos vários valores, também veremos a seguir de que forma teríamos uma lista para colocar várias Views, e dessa maneira evitamos esse tipo de abordagem, em que, para cada quantidade de dados que temos, temos que ficar modificando nosso código, buscando Views, fazendo vínculos e declarando no nosso layout.

@@04
Criando lista com TextView

Dê início à implementação do layout que vai representar a lista de alunos conforme a imagem abaixo:

Comece implementando as views que vão representar os alunos adicionando 3 TextViews. Em seguida, no código Java, busque as views por meio do método findViewById() enviando os ids via argumento.

Lembre-se que o Android Studio nomeia o id dos TextViews com a técnica de incremento. Isso significa que os ids podem ser diferentes conforme foi visto em vídeo.
Após ter acesso aos TextViews, crie uma lista de String com três alunos de exemplo, adicione cada um dos alunos nos TextViews de acordo com a posição, ou seja, no primeiro TextView adicione o aluno no índice 0, no segundo índice 1 e assim por diante.

Ao finalizar o procedimento de vínculo, execute o App e veja se funciona como esperado.

Dependendo da versão do Android Studio, a utilização do editor visual pode apresentar um resultado diferente do que foi visto em vídeo. Caso esteja com dificuldades para realizar as atividades, não se preocupe, a partir da terceira aula, é apresentada uma alternativa de edição de layout a partir de código fonte.

@@O resultado visual fica da seguinte maneira:


Em código temos o seguinte resultado:

MainActivity.java
package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "Jose"));
        TextView primeiroAluno = findViewById(R.id.textView);
        TextView segundoAluno = findViewById(R.id.textView4);
        TextView terceiroAluno = findViewById(R.id.textView5);
        primeiroAluno.setText(alunos.get(0));
        segundoAluno.setText(alunos.get(1));
        terceiroAluno.setText(alunos.get(2));
    }
}COPIAR CÓDIGO
É válido ressaltar que os números dos ids dos TextViews podem ser diferentes para você.

@@05
Utilizando AdapterViews para coleções de views

Em situações nas quais precisamos de uma solução que tenha uma coleção de Views, ao invés de usarmos essa técnica que vimos agora, temos um componente específico que irá compor outras Views, então o que faremos agora será remover estes Text Views, que colocamos de maneira manual, e vamos usar esse componente que compõe Views.
Vamos primeiro remover esses Text Views selecionando e apertando "Delete", e agora usaremos esse novo componente. Temos várias possibilidades para fazê-lo, dentre as opções, considerando que queremos uma lista de Views, existe um componente bem famoso, conhecido como List View, com capacidade de compor outras Views, que usaremos agora. Como é que podemos adicioná-lo? Podemos usar por meio da paleta, que usamos para poder adicionar o Text View, que podemos usar para adicionar essa List View.

Porém, nessa primeira opção, ele não aparece para nós, então teríamos que vasculhar as opções para ver e achar essa List View, dado que sabemos o nome daquela que esperamos, podemos usar outra técnica: a busca de Views da paleta, então clicamos na lupinha e escrevemos o que esperamos, como é o caso da List View, se só escrevermos "list", ele faz um filtro das possibilidades e identifica o que queremos.

Agora que ele apareceu, podemos usar a mesma técnica, de segurar, arrastar e soltar, o drag and drop. Quando colocamos a List View, o layout fez uma renderização de como seria o exemplo da List View com vários elementos. Então, realmente, é uma solução que espera um valor dinâmico para os elementos da lista, compondo qualquer tipo de elemento, então, se for 1 ele vai colocar para nós, 2, 10, seja lá a quantidade que for.

Quando temos esse tipo de necessidade utilizamos uma View específica para receber esses itens, uma maneira dinâmica de resolver isso. Com isso, precisamos fazer o mesmo procedimento aplicado nos nossos Text Views — precisamos pegar o nosso conjunto de dados, que é nossa lista de alunos em código Java, e vinculá-la com a List View.

Vamos voltar na Activity e, ao invés daquele código do Text View, iremos buscar primeiro a nossa List View e fazer esse vínculo de dados. Para buscarmos uma View, como aprendemos, utilizamos o método Find View by ID, e a nossa classe R. Pegaremos o ID daquela nossa List View, e sabemos que o Android coloca um ID por padrão, vamos ver qual foi colocado para a nossa lista.

Clicamos nela e temos os atributos a que ela teve acesso e foram colocados automaticamente, e de ID foi colocado "_dynamic", um ID bem genérico, sem muito significado com base no que implementaremos. Em situações como essas, faz todo sentido considerarmos um padrão para nomearmos a nossa View, e aí já identificamos o que que ela significa para nós.

E qual seria esse padrão que poderíamos considerar? Nós podemos clicar para podermos editar primeiro, vamos apagar, e o padrão que usaremos será colocar primeiro o nome do layout, então começaríamos da seguinte maneira: "activity_main", que seria realmente o prefixo que iremos colocar para todas as Views que são representadas nesse layout, e em seguida colocamos outro underline, padrão usado de sempre dividir por underline, e colocamos o que ele significa para nós; poderia ser List View, ou então "lista de alunos", que dá muito mais significado.

É um ID bem bacana que podemos colocar para essa View, pois garantimos o significado que ela tem para nós no layout. Agora, sim, estamos pegando a nossa List View. Como vimos, se devolvermos, ele irá devolver uma referência de uma View qualquer, por ser um Generics, portanto inicialmente identificaremos que é uma lista de alunos, e em seguida indicamos que ele é uma List View, e não uma qualquer.

Isso porque passaremos a trabalhar em cima de uma List View. Teremos que fazer em import, e estenderemos o código com "Ctrl + Shift + F12". Aprenderemos a fazer esse vínculo de dados. Nos nossos Text View tínhamos um comportamento, um método que já fazia o vínculo, o Set Text.

Porém, na List View temos um procedimento um pouquinho diferente, porque em nossa lista de alunos não teremos um método do tipo Add ou Set nossa lista de alunos. Teremos outro componente, que é um intermediário responsável em pegar os dados que temos e renderizá-los com uma View desejada, e é dessa maneira que acabamos lidando com a List View.

Esse componente, o intermediário, é conhecido como Adapter, então ao invés de fazermos o vínculo direto, iremos enviar um Adapter que fará esse vínculo para nós por meio do método Set Adapter. Aí, o que ele espera de implementação é uma interface, a List Adapter. Se tentarmos fazê-la por meio de uma implementação de classe anônima, que é fazer diretamente na instância, temos uma implementação bem complexa que não é ideal, mas fazemos justamente para essa configuração mínima.

Ou seja, fazer um vínculo dos dados com base em uma View. Não é ideal, a não ser que quiséssemos fazer um Adapter próprio com base nas regras que a nossa List View emprega, aí realmente teríamos que usá-la. Isto é, existem implementações do próprio Android Framework que implementa o nosso List Adapter e só deixa os métodos necessários para uma implementação objetiva, e jogar os dados na nossa List View.

Dentre as opções que temos, existe o Array Adapter, uma classe que já faz esta implementação, porém ele é muito mais simples e só precisa, por exemplo, enviar os argumentos via construtor, e ele já consegue fazer o vínculo dos dados e apresentar para nós sem nenhum problema. Então, para uma implementação simples e objetiva podemos considerar esse Array Adapter ao invés de um List Adapter.

E como foi comentado, precisamos enviar os argumentos, e ele exige um Generics justamente para saber com qual tipo de dado ele irá lidar no meio do caminho. Temos uma lista de strings, logo, podemos enviar uma string, e indicar que cada elemento com que ele lidará é uma string do Java.

Agora precisamos enviar os argumentos, e para vermos eles podemos usar "Ctrl + P". Temos uma sobrecarga bem grande, na qual o primeiro elemento sempre será um contexto, sendo assim podemos mudar o nosso próprio this, que representaria nossa Activity, que é um contexto. Em seguida, percebemos que ele espera um resources do tipo int, a ser representado por meio do layout que será apresentado no momento em que renderizar os nossos elementos.

Esse layout que temos que enviar tem que ter pelo menos um Text View. Poderíamos estar criando um layout de maneira manual, como fizemos anteriormente, porém podemos usar layouts próprios do Android Framework, que também só possuem um Text View. E como é que podemos usar esses layouts?

Em vez da classe R do nosso pacote, usaremos a classe R do Android, com que acessamos os layouts que vêm prontos do Android Framework, e dentre as opções existe algo que é muito comum quando utilizamos o nosso Array adapter, o Simple List Item, que é um layout disponível para podermos usar apenas Text View.

Inclusive, se apertarmos "Ctrl + B" para irmos direto à implementação, ele mostra que ele é representado aqui por este Text View que vemos aqui. Desse modo, não modificamos esse layout, por ele ser um arquivo estático que o próprio Android mantém, sem a necessidade de ficarmos fazendo de maneira manual um layout que só tem um Text View.

Por fim precisamos enviar, para completar esse nosso exemplo, a nossa própria lista, então teremos uma sobrecarga que recebe uma lista com os nossos alunos. Com essa pequena implementação, conseguimos adicionar os nossos elementos em uma solução de uma coleção de Views.

Agora que colocamos a nossa lista de alunos, ele nem exige mais esse Generics, porque ele já faz aquela técnica de Operador diamante, que já infere o tipo com base nos tipos de dados que enviamos na nossa coleção. Feita a configuração do Adapter, o intermediário que faz o vínculo dos dados e a renderização da View, podemos executar o nosso aplicativo.

O Android Studio conseguiu executar o nosso aplicativo, e agora os nossos elementos estão sendo exibidos. Inclusive, dão um efeito diferente quando clicamos nela, fica bem mais bonito. Além disso, ele é bem mais flexível, e pode-se adicionar outros elementos, uma lista maior, que não dará nenhum problema.

Vamos fazer esse teste e adicionar mais alunos para ver se realmente a solução está sendo feita, como tínhamos comentado, uma solução flexível, então teremos a Maria, a Ana, e vamos ver como é que fica com essa quantidade maior de alunos, e se ele faz essa renderização para nós. Vamos abrir o emulador, e enquanto ele faz a execução, aparentemente ocorre mais rapidamente, porque somente alguns parâmetros foram modificados.

Conseguiu fazer a primeira parte da implementação, de adicionar essa lista, por meio da nossa List View.

Um detalhe bem importante ao considerarmos esse tipo de solução é que essas Views, que têm uma coleção delas e utiliza um Adapter, também são conhecidas como Adapter Views. Então, toda vez que você ouvir falar sobre um destes, trata-se realmente de uma View que irá compor outras com uma solução flexível, no sentido de conseguir adicionar uma quantidade de itens de maneira dinâmica sem ser um valor fixo, é preciso fazer a mudança conforme essa quantidade.

Aprendemos sobre o uso da List View, e existem outros Adapter Views. Para finalizar essa parte, a List View é um dos componentes iniciais do Android Framework, o que significa que, com base na evolução do programa, surgiram outras soluções com comportamentos similares, só que de maneira sofisticada. Não comentaremos muito no curso pois isso é para um segundo momento, porém haverá um exercício extra indicando essas soluções sofisticadas, bem como a recomendação usada atualmente como alternativa à List View.

Ela é uma solução simples e objetiva para esse tipo de cenário, que pode ser usada sem nenhum problema, apesar de não ser tão usada quanto antigamente, no começo do Android.

@@06
Utilizando o ListView

Utilize o componente ListView para implementar a lista de alunos no layout. Para isso, remova os TextViews, adicione o componente ListView e no código Java busque-o com o findViewById().
Configure o Adapter a partir da classe ArrayAdapter enviando o contexto, layout do Android Framework (android.R.layout.simple_list_item_1) e a lista de alunos via argumento.

Execute o App e veja se aparece a lista como o esperado.

Dependendo da versão do Android Studio, a utilização do editor visual pode apresentar um resultado diferente do que foi visto em vídeo. Caso esteja com dificuldades para realizar as atividades, não se preocupe, a partir da terceira aula, é apresentada uma alternativa de edição de layout a partir de código fonte.

Após execução deve aparecer a lista de alunos da seguinte maneira:


O código de implementação fica da seguinte maneira:

MainActivity.java
package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "Jose", "Maria", "Ana"));
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));
    }
}COPIAR C

@@07
Sobre layouts no Resources

Aprendemos a implementar layouts para Activities, porém, chegamos a conclusão de que implementar via arquivo estático dentro do Resources é uma abordagem ideal. Por quais motivos a abordagem via arquivo estático é mais benéfica?

Para evitar a complexidade do código da Activity.
 
Exato! Com essa abordagem todo o código destinado a construção de layout fica isolado, fazendo com que seja possível criar um layout complexo sem afetar o código da Activity.
Alternativa correta
Para facilitar a criação de layouts mais complexos.
 
Correto! Ao implementar o layout via arquivo estático conseguimos arrastar as views e atribuir as regras esperadas de maneira intuitiva, como também, ajustar a orientação da tela entre retrato e paisagem, verificar principais propriedades das views e outras opções que estão disponíveis via editor visual.
Alternativa correta
Para verificar o resultado do layout em tempo de compilação.
 
Isso mesmo! Com essa abordagem somos capazes de obter um feedback rápido por conta do editor visual.
Alternativa correta
Para evitar problemas de compilação no código.

@@08
O que aprendemos?

Nesta aula, aprendemos a:
adicionar Views via código Java e via arquivo estático;
implementar layouts que apresentam listas;
utilizar AdapterViews em específico o ListView.

#### 05/09/2023

@03-Entendendo a base de construção de layouts

@@01
Entendendo a teoria básica de construção de layolayouts

Continuando com o desenvolvimento do nosso layout, o próximo passo será implementar o botão na parte de baixo do layout, que representa a ação de adicionar um novo aluno. Para isso voltaremos ao Android Studio, diretamente no nosso arquivo de layout e podemos escolher uma View de acordo com as possibilidades da paleta — temos um elemento, uma View que é o famoso button, que poderíamos estar usando.
Porém, a princípio ele não terá o mesmo aspecto visual que vimos no exemplo de implementação, então, ao invés de usarmos esse button, fazermos um estilo específico para alcançar esse aspecto visual, a própria equipe do Android Developers nos disponibiliza uma View específica para este tipo de comportamento, conhecido como Floating Action Button, em tradução, botão de ação flutuante, que usaremos.

Para isso, podemos vasculhar as possibilidades nas paletas, mas como vimos podemos estar filtrando também. Agora, existem alguns detalhes bem importantes a serem considerados quando utilizamos esse tipo de View. Nas outras Views não havia esse ícone à direita, e se tirarmos esse filtro, o Text View e o button acabam não tendo esse iconezinho à direita.

O Recycler View, que não veremos durante o curso, acaba tendo, mas os outros não, porque o Android Framework tem as Views disponíveis para nós sem termos que fazer nenhum tipo de download, está tudo integrado no SDK, porém existem outras Views, conforme a evolução do Android Framework vai acontecendo, que são adicionadas de maneira extra, sendo uma adição ao programa.

Ou seja, elas são dependências externas, são dependências independentes do Android Framework, que precisamos baixar para o nosso projeto, portanto, todas as Views que tiverem esse ícone à direita indicam que ela precisa ser baixada, adicionada como uma dependência do projeto para que seja acessível.

Então tanto o Recycler View como o button que vimos serão Views a mais do nosso Android Framework do Android SDK, que não estão disponíveis e precisam ser baixados para serem utilizados. Para o download das Views não precisamos fazer nenhum tipo de instrução ou script, e podemos clicar diretamente nesse ícone, que vai aparecer essa mensagem falando que essa operação exige que se tenha a biblioteca, que será adicionada com Android Support Design. Significa que o Float Action Button faz parte dessa biblioteca.

Ele nos pergunta se queremos adicionar agora, então clicamos em OK, e então ele vai fazer uma task do Gradle para pegar aquela dependência que vimos, adicioná-la em nosso projeto e fazer a sincronização, então ele irá baixar e fazer a sincronização, que seria o processo de pegar essa biblioteca que ele adicionará ao projeto e dar acesso a ela. Então, veja que agora o button está acessível em nosso projeto.

Se virmos o Recycler View, muito provavelmente foi adicionado também, porque a biblioteca que foi adicionada para o FloatingActionButton também permite acesso a ele. Se quisermos ver sobre a dependência que foi acionada, podemos vir a parte Gradle Scripts na aba Project, e nesse arquivo build.gradle, bem na parte de baixo, temos em dependecies a seguinte linha:

implementation 'com.android.support:design:28.0.0'COPIAR CÓDIGO
tem muitas configurações do gradle que não serão mostradas nesse curso.

Usaremos a versão 28, que é a versão do Android que estamos usando aqui, e é mais recente, o Android 9, e é dessa maneira que ele acaba adicionando essas dependências externas. Agora que entendemos essa parte de dependências externas, e que existem Views dependentes do nosso projeto, podemos usar o Floating Action Button, que filtramos e adicionamos da maneira como estamos acostumados: segurando, arrastando e soltando.

O que vai acontecer é que ele vai pedir para incluirmos resources para essa View, porque ela exige, no momento da adição via editor visual, que tenha pelo menos uma visualização. Vamos pegar essa opção do Project e colocar qualquer tipo de ícone só para nós adicionarmos, para representar o ícone do launcher.

Trata-se de um botão, ou ícone que fica naquela listinha de aplicativos acessíveis para nós. O nosso Float Action Button foi adicionado na parte superior. Há um detalhe: precisamos colocar esse componente na parte de baixo do nosso layout, e se virmos um pouquinho mais sobre o comportamento que ele tem que ter, ele deveria ficar sobreposto à nossa lista porque se ela tiver muitos elementos, ele ainda terá que ficar na parte de cima, como é comum em diversos aplicativos atualmente.

Vamos usar o nosso editor visual e ver se ele nos permite fazer esse tipo de ação. Clicaremos, seguraremos e vamos tentar arrastar, e não temos nem aquele campo verde para modificarmos. Se soltarmos, ele volta para o mesmo lugar, e da mesma maneira, se soltarmos mais para baixo, onde aparece verde, e não fica na nossa lista, inclusive perdemos acesso a ele.

Podemos até ter acesso a ele usando outra técnica no editor visual, esse Component Tree, que faz a listagem da hierarquia de Views que temos em nosso layout, a que passamos a ter acesso de novo. Poderíamos movê-lo para cima de novo, para onde ela estava, mas mesmo assim não temos o comportamento esperado.

Quando estamos montando layouts no Android, às vezes pode até parecer bem simples trabalhar com editor visual, porém se não tivermos nenhuma base sobre como funciona essa parte de hierarquia, as regras essenciais para montar um layout, não fica tão fácil, conforme o que precisamos implementar, justamente esse objetivo final. Portanto, veremos uma pequena introdução de como é a base para montar layouts no Android, para entendermos o problema que está acontecendo e como podemos resolvê-lo.

Sobre a construção de layout no Android, como vimos, a base de criação é por meio de Views. Toda vez que tivermos que colocar algum componente novo, colocaremos uma View nova. Com base no que temos no layout, um elemento raiz dentro do arquivo de layout, que pode ser apenas um único elemento raiz e foi justamente por isso que só tivemos o Linear Layout. Isso significa que quando tivermos o arquivo de layout, em níveis de hierarquia, não teremos capacidade de colocar dois Text Views, por exemplo.

Essa é uma regra muito importante quando considerarmos a implementação de layouts: existe apenas um único elemento raiz. Além disso, existem tipos de Views diferentes, pois quando consideramos apenas o tipo de View qualquer, que é o genérico, não conseguimos adicionar mais Views nela. Isso é, um Text View não tem a capacidade de incluir outro dentro dele, para isso temos outras Views, específicas para receber Views filhas, conhecidos também como View Groups.

Então, quando queremos fazer um layout com mais de uma View, precisaremos desse tipo de View Group, que seria no caso o Linear Layout, e também o List View, que recebe várias Views. É por isso que colocamos o Linear Layout no começo, que é o que o Android acaba nos sugerindo, e conseguimos incluir mais de um Text View, uma List View, e assim por diante.

Assim, o View Group será uma View cuja responsabilidade é simplesmente ser um contêiner para manter outras Views, então se pegarmos, por exemplo, a criação de um layout mais complexo, teremos o nosso layout, que será, a princípio, uma View Group, e aí vamos ter as Views dentro dela.

Então, por exemplo, a View aqui embaixo poderia ser o nosso Text View, ou List View, ou podemos fazer a adição de outras Views. Inclusive temos a capacidade de, dentro de um View Group, que seria um Linear Layout, colocar outros View Groups, como vimos com a nossa List View.

E dentro desse View Group fomos colocando outras Views, e é dessa maneira que vamos aumentando o que chamamos de níveis de hierarquia do nosso projeto. Se formos montar um layout, começaremos pela View raiz, que geralmente é uma View Group, para que se possa colocar outras Views, e dentro dela podemos ter outras View Groups ou Views.

Mas o que isso tem a ver com o problema que temos?

Dado que a parte básica é uma View Group que irá manter as outras Views, vocês concordam que o possível problema está relacionado a este Linear Layout? E é realmente isso mesmo, pois ele é uma View Group com uma regra específica para compor as suas Views, que é indicar que cada uma de suas Views vai pegar um espaço específico e exclusivo.

Ou seja, essa View, nosso FloatingActionButton está pegando todo o espaço dessa parte horizontal por ter o objetivo de organizar as Views por meio de linhas, então temos essa linha toda para o nosso Floating Action Button, para a nossa List View. Então, as Views dentro do Linear Layout, e elas não vão conseguir sobrepor uma a outra, e é por isso que temos esse tipo de comportamento.

É claro, a List View tem outras formas de trabalhar com isso, ele sempre vai ser linear e pegar uma linha, mas ele consegue mudar a orientação, porque, por padrão, quando foi adicionado, ele usa a orientação vertical, uma em cima da outra, e podemos colocar uma orientação horizontal, que seria uma do lado da outra. Por exemplo, se clicarmos no Linear Layout e mudarmos sua orientação para horizontal.

Não é o comportamento esperado, mas veja que é o Linear Layout, o View Group que acaba organizando, e como as suas Views internas acabam funcionando. Portanto, precisamos usar outro View Group que tenha o comportamento desejado: uma View se sobrepondo à outra e dando mais flexibilidade ao posicionamento de cada uma delas.

Temos outra View Group, também bastante utilizada, hoje em dia bem próximo do legado, isto é, Views que não são utilizadas por conta da evolução do Android, que vai trazendo novas Views para resolver problemas mais complexos. Mas ela é uma das bases, assim como o Linear Layout, também conhecido como Relative Layout. Então, como poderemos usar a nova View Group, que terá essa flexibilidade ?

Podemos usar a técnica de conversão de View, por meio do botão direito no Component Tree, em cima do nosso Linear Layout. E então vamos à opção Convert view... O Constraint Layout não será usado por ser uma biblioteca, um View Group mais recente para podermos resolver esses problemas, mas existe um curso dedicado a isso, e portanto aprenderemos mais a parte base.

Ele nos dá uma listagem de possibilidades, dentre as quais escolheremos o nosso Relative Layout, um dos princípios de View Groups do Android, ao qual temos acesso. Haverá projetos com que você acabará lidando com isso. Clicaremos em cima dele e daremos Apply, e ele já muda um pouquinho o aspecto visual que tínhamos antes.

Ao invés de um espaço dedicado à View, ele colocou uma View sobre outra, e o Floating Action Button acabou ficando em cima da nossa List View. Se por exemplo clicarmos e arrastarmos o botão, clicando primeiro no ComponentTree para selecionar e acessá-lo, conseguiremos movê-lo. E aparentemente ele faz uma modificação da maneira esperada automaticamente. Então, com o Relative Layout colocaremos a nossa View de maneira relativa ao layout, mesmo, e teremos mais liberdade na nossa View.

Perceba que quando precisamos modificar o nosso layout e ter mais flexibilidade, às vezes o que modificará os comportamentos esperados é o View Group que estamos utilizando, que está sendo o contêiner das outras Views e está organizando cada uma delas. Nesse caso, para termos mais flexibilidade e adicionar, por exemplo, um elemento mais para baixo, ou para cima, será outro View Group que teremos que utilizar em vez do nosso Linear Layout.

Dessa maneira, conseguimos colocar o nosso FloatingActionButton nessa parte de baixo. Ele deu uma bugada porque tirou o ícone, o que resolveremos logo mais. Queria mostrar essa base de construção de layout, que é entender os níveis de hierarquia, o que é uma View Group, que para colocar Views dentro de outras, precisa necessariamente ser uma View Group, e teremos a capacidade de organizar o nosso layout de acordo com a View Group que contém as nossas Views.

Vamos executar o projeto para ver como é que ficou, e depois faremos uma modificação para deixar conforme a nossa proposta. Abriremos o emulador, vamos aguardar o Android Studio finalizar, para vermos se o layout nos atende de maneira esperada. Claro, vimos que houve modificações, vimos alguns valores de medidas, não se preocupe com isso, logo mais daremos atenção a isso e usaremos medidas que fazem sentido para o nosso projeto.

O importante agora é tentar atingir o nosso objetivo, e conseguimos de fato colocar um botão que, ao ser clicado, já mostra até o efeito. Agora sim, aplicamos um aspecto visual similar ao que temos de proposta. A seguir adicionaremos o que for necessário e finalizar essa implementação.

@@02
Implementando FAB novo aluno

Caso você precise do projeto com todas as alterações realizadas na aula passada, você pode baixá-lo neste link.
Implemente o FloatingActionButton como botão para adicionar novos alunos. Para isso, vá na paleta de View, filtre por FloatingActionButton.

Clique no botão que representa o download da dependência. Assim que finalizar o processo do Gradle, adicione o FAB (FloatingActionButton) no layout.

Caso não aparecer o botão de download, provavelmente significa que o projeto já está configurado para utilizar os componenentes do Material Design
Em seguida converta o LinearLayout para RelativeLayout utilizando o menu Convert View... clicando com o botão direito em cima do LinearLayout a partir da aba Component Tree.

Por fim, mova o FAB para a tela de preview, verifique se é apresentado na tela do preview e se o posicionamento no Component Tree está correto:

Não é necessário alinhar o FAB conforme o vídeo, pois dependendo da versão do Android Studio, não apresenta um resultado esperado.

Os detalhes de alinhamento serão apresentados a seguir.

https://github.com/alura-cursos/fundamentos-android-parte-1/archive/aula-2.zip

Ao finalizar a atividade o FAB deve estar presente no layout, não é necessário executar o App, apenas certifique-se que o componente está abaixo do RelativeLayout e no mesmo nível da ListView.
Não se preocupe com as medidas e posicionamento do FAB, a seguir veremos mais detalhes sobre como podemos configurar de maneira precisa o nosso layout.

@@03
Utilizando código fonte do layout

Temos uma base de construção de layouts no Android utilizando o editor visual do Android Studio, quero falar a respeito do que está por trás dessa implementação que fizemos; por mais que utilizemos o editor visual para montar o nosso layout, por debaixo dos panos ele gera um código fonte que nos define esse layout. Ou seja, tudo que fizemos gerou um código fonte por detrás, portanto faz todo sentido termos conhecimento sobre esse código fonte e entender passo a passo o que ele significa e como podemos utilizá-lo para montar os nossos layouts, uma abordagem muito comum no dia-a-dia do desenvolvedor Android.
Então, se formos criar outro layout, seja mais complexo ou mais simples, ter o conhecimento desse código fonte faz todo o sentido, porque às vezes ao mexermos via editor visual não teremos o resultado esperado, e via código fonte mexemos diretamente, ficando do jeito que queremos. De que forma podemos acessar esse código fonte?

No arquivo de layout, que é o nosso activity_main.xml, por padrão vimos que estávamos tendo acesso ao nosso editor visual, acessível por meio da aba "Design". E para acessarmos o nosso código fonte, temos ao lado a aba Text, que representa justamente o código-fonte.

Então, por meio desses botões existe a possibilidade de alternarmos entre o editor visual e o de código fonte de layout. Quando acessamos o código fonte, há uma estrutura XML, porque, claro, temos um arquivo XML gerado de maneira estática, então, o que precisamos entender é justamente o que chamamos de DSL, domain specific language, ou então a linguagem de domínio específico para montar esses layouts, a DSL que a equipe do Android nos disponibiliza para criarmos os nossos layouts.

Quando abrimos o código fonte, até apareceu aquela janelinha similar ao editor visual, que se refere ao Preview, que é o que montaremos no código fonte e o que aparecerá para nós, então é por isso que é benéfico fazermos os layouts via arquivo estático, já que por mais que façamos via código fonte, temos a capacidade de termos um feedback bem rápido no momento em que estamos criando o nosso código, diferentemente de quando fazíamos via Java, quando tínhamos que fazer o código e depois rodar o aplicativo para termos um resultado visual.

Por mais que seja via código fonte, conseguimos ver o resultado diretamente. Também tem algumas técnicas que podem ser utilizadas, como é o caso do zoom, também podemos mudar o emulador, algumas regalias similares ao editor visual, porém via código fonte apenas. Agora, vamos entender os detalhes de código fonte: uma das primeiras observações a serem consideradas é justamente a base que vimos no vídeo anterior, que está relacionado à hierarquia. O arquivo XML segue muito a ideia da hierarquia, indicado pelo nível de indentação.

Teremos a View Group, que é o nosso elemento raiz, o Relative Layout, e estará logo no começo do arquivo sem nenhuma indentação. E as suas filhas, as Views filhas, acabaram ficando com um único nível de indentação, como é o caso do nosso FloatingActionButton, e como é o caso da nossa ListView. Quando mexemos com código fonte, já temos uma visão bem melhor do que vemos em nosso editor visual, por mais que tenha bastante informação, podemos entender cada uma delas.

É um detalhe bacana de se observar no momento em que se mexe no arquivo XML via código fonte, que é identificar o elemento raiz, e seus filhos, que no caso são o View Group e Relative Layout. Passando os detalhes em relação a esses atributos que estamos vendo, porque há bastante informação que precisamos entender. Vamos entender esses primeiros atributos, esse xmlns:android que mostra o Android indicando essa URL. Esse atributo refere-se ao namespace do Android que dará acesso aos atributos de cada um dos elementos.

Assim, esse Android está sendo acessível para esses outros atributos, destinados às nossas Views em relação ao Android Framework, então, no geral, as Views que acessaremos, para serem acessadas os seus atributos precisaremos deste namespace. Como é o caso desse layout width, height, e assim por diante. Por isso ele é importante e precisa ser declarado na primeira View, o nosso elemento raiz.

No geral, não é preciso decorar todo esse intervalo, porque o Android Studio, ao identificar que não há esse namespace decorado, já sugere para nós o importe. Selecionaremos e apagaremos, e ele não encontra esse namespace android. Daremos "Alt + Enter", e ele fala para criar ou então colocar a setinha para o lado, e ele faz um tracejado, em que daremos "Alt + Enter", porque ele já entende aquele namespace com aquela URL.

Em cima, por padrão, ele já cria outro namespace, esse app, refere-se justamente a atributos específicos de algum componente, então de repente existe algum método de algum componente que não é propriamente do Android Framework, mas precisamos acessá-lo, então a partir deste app temos capacidade, dado que não usamos um atributo que não é do Android Framework em específico, não precisamos utilizar esse namespace. Ou seja, no momento em que precisarmos iremos colocar app, dois pontos, que ele vai importar para nós.

Dado que não vamos precisar, podemos apagar sem nenhum problema. Pense da seguinte maneira: se existe um atributo inutilizado, meio cinza, você pode apagar sem nenhum problema. No momento em que ele for necessário, o programa sugere o import. Conseguimos entender essa parte básica, então vamos para os atributos do Android Framework em relação às nossas Views.

Como vimos, todos os componentes estão tendo a declaração desse layout width e height, e que todos eles estão tendo mesmo. Significa justamente as medidas que serão colocadas em relação à largura (width) e altura (height), e essa medida é obrigatória, portanto, se não declararmos, dá um erro de compilação. Ele sempre vai exigir a largura e a altura, então toda vez que colocávamos um componente via editor visual, ele já colocava isso para nós.

Agora, vamos às questões das medidas, pois temos essa medida chamada de match_parent, que irá preencher o nosso atributo de acordo com o seu pai. Por exemplo, quando lidamos com ele, é para atingir o pai. E quem seria o pai do Relative Layout? A própria tela geral do nosso componente, que representa que o pai do Relative Layout, ou de qualquer View que seja o elemento raiz.

Assim, ele vai preencher toda a nossa tela, e é por isso que está como height e width e o match_parent, para preencher toda a tela, e por padrão vai ser sempre assim quando colocamos o elemento raiz, para que tenhamos acesso a toda ela. É basicamente isso que precisamos entender. Agora vamos para o próximo componente, já que não teve tantas especificações no nosso Relative Layout.

No FloatingActionButton temos bem mais elementos, e vamos entendê-los. O primeiro é o próprio ID, que já vimos como funciona, e a declaração é um pouquinho diferente, porque só colocávamos o valor, que seria por exemplo esse FloatingActionButton. E agora estamos com @+id(esse arroba mais ID).

Significa que toda vez que quisermos incrementar um novo ID para algum componente que temos no Android, via arquivo estático, precisaremos colocar esse padrão que estamos vendo. Se quiséssemos modificar o nome do ID do nosso FloatingActionButton, só precisaríamos modificar exatamente esse valor, para qualquer novo ID que queiramos criar.

Esse é um detalhe bem importante. Nesse caso podemos até modificar com base nesse padrão que vimos embaixo, que é o Activity Main, e depois o nome. Para mantermos o padrão, será Activity, tem o autocomplete, basta mudarmos para o que usaremos para esse Floating Action Button. Deixaremos de maneira resumida, o famoso fab, que geralmente está relacionado ao button, e indicamos mais ou menos a ação que ele terá, que será um novo aluno.

Essa é uma das técnicas que podemos usar para colocar os nossos IDs para Floating Action Buttons, então essa parte de IDs é dessa maneira que funciona. Como vimos, temos o layout_width e também o nosso layout_height. Comentamos que esse match_parent preenche conforme o seu pai, e se observarmos o nosso Floating Action Button, por mais que sua largura seja para preencher de acordo com o seu pai, ele não está preenchendo toda essa largura, isso porque o button, em específico, é uma View bem personalizada do que conhecemos sobre o Material Design, que é um padrão de design implementado pelo Google. Mas o que isso tem a ver?

O button é bloqueado para modificar tanto a sua altura como a largura, pois dessa maneira ele irá manter uma regrinha do Material Design em relação a esse componente, que é sempre manter uma medida específica. Então se quisermos modificar a altura de um FloatingActionButton, teremos um atributo específico, portanto, manter um match_parent não faz tanto sentido.

Inclusive, nessa parte de altura temos um valor diferente, que vamos entender o que significa, e ver qual faz mais sentido, se é manter esse match_parent ou esse segundo valor, conhecido como wrap_content. Vamos agora entender o que ele significa: diferentemente do match_parent, ele indica que irá crescer conforme o seu conteúdo.

Isso quer dizer que, no geral, traduzindo de maneira direta, ele crescerá só o suficiente, de acordo com o seu conteúdo do componente, então, por exemplo, quando colocamos um Text View, lembra que ele preenchia a largura, porém a sua altura era sempre o mínimo necessário. Aquela altura era um wrap_content, porque ela só aumentava de acordo com seu conteúdo interno. Então se colocássemos um conteúdo interno muito grande, e também, é claro, se fosse outro componente, que permitisse alterar o seu tamanho, ele ia crescer de acordo com aquele conteúdo, então manter wrap_content tanto na largura como na altura em um FloatingActionButton faz muito sentido.

Então deixaremos aqui também como um wrap_content, e veremos que não vai aumentar, porque como comentado, esse componente em específico é bloqueado para alteração via layout_width ou layout_height, ele terá outro atributo para modificar. Se quisermos usar outra altura e outra largura, usaremos o atributo que é conhecido como fabSize.

E aqui, sim, utilizamos aquele app, porque ele é um atributo específico do FloatingActionButton que não é acessível via Android Framework. Agora temos outros atributos que faz sentido entendermos, relacionado a esse AlignParentEnd e AlignParentBottom, que indicam os valores de relação ao RelativeLayout, ou seja, esse alinhamento que estamos fazendo é um atributo que vai atingir diretamente o nosso View Group Relative Layout.

Então quando colocamos AlignParentEnd, dizemos que é para ele alinhar de acordo com o seu pai na parte final, que seria essa parte à direita. Da mesma maneira esse Bottom diz que é para alinhar com o pai na parte de baixo. É por meio desses atributos de alinhamento que temos a capacidade de modificar os componentes de acordo com o Relative Layout, e foi por isso que conseguimos colocar o nosso FloatingActionButton na parte de baixo.

Se colocássemos por exemplo um AlignParentTop, seria na parte de cima, e aí sim teríamos esse comportamento de mover para cima. Mas dado que temos na parte de baixo, deixamos um AlignParentBottom, como estava antes. Assim, acabamos alinhando os componentes via Relative Layout; é por meio desse alinhamento de acordo com o pai.

Existem outros alinhamentos relacionados a outras Views, então, por exemplo, se colocássemos um alinhamento, poderíamos colocar um End, e indicar de acordo com outra View. Não vamos explorar muito sobre o Relative Layout, dado que existe outra View, como comentado anteriormente, o ConstraintLayout acaba tendo mais benefício nessa construção, mas entendamos que a parte básica de um Relative Layout é que as Views são posicionadas de acordo com a relação que ela tem entre as próprias Views, ou então de acordo com seu pai, como foi o caso, por padrão, que foi colocado via editor visual.

Então, colocamos o alinhamento com o pai na parte final, a parte da direita, e na parte de baixo. É dessa maneira que conseguimos alinhar.

@@04
Aplicando medidas nas views

Temos outro atributo, que representa a margem, esse espaço invisível que temos em nossas Views. Esse 26dp foi adicionado para modificar o posicionamento, a distância de margem. Mas o que significa esse dp? É uma unidade de medida no Android, no caso, com ela podemos aumentar ou diminuir a distância entre as views, podemos também ajustar o tamanho, para isso acabamos utilizando essa unidade.
Mas por quê utilizamos este dp e não outros valores?

Vamos tentar entender como funciona essa ideia. Tudo que acabamos modificando em nossos componentes, eles acabam crescendo como se fossem pixels. Caso você tenha trabalhado com front end ou qualquer outro tipo de framework ou ferramenta que envolva design, sabe-se que a base para construir layouts ou elementos visuais é por meio de pixels.

Então, por que não utilizamos pixels? Vamos trocar para pixels, e já teremos uma certa mudança. Com isso, por mais que sejam 26, acabamos modificando um pouquinho esse posicionamento, e houve um destaque no próprio XML indicando que evitemos o uso de px, e sugerindo o uso de dp.

Qual seria a diferença entre eles ? Sabe que, ao trabalharmos com Android, há diversos aparelhos que precisam ser atendidos, aparelho de telas pequenas, grandes, e assim por diante. Para fazermos com que o nosso aplicativo tenha um aspecto similar em todos os aparelhos, independente do tamanho da sua tela, o pessoal do Android acaba utilizando um conceito chamado de Densidade por Pixel.

Em vez de usarmos pixels por pixels, utilizamos essa ideia de densidade por pixels, que seria basicamente, de maneira teórica bem básica, mesmo, a área física de pixels que existe em um positivo. Então, em uma tela teremos uma área que vai ter uma quantidade física de pixels, e ela é medida por meio dessa densidade, também conhecida como de dpi.

Então quando você ouvir falar sobre dpi, significa a densidade de pixels dentro de uma tela de um dispositivo. E para conseguirmos fazer com que os aspectos sejam proporcionais para todas as telas, acabamos utilizando o que seria a quantidade de densidade de pixels, independente da tela. Por exemplo, quando utilizamos 26dp, independentemente da tela ser de 4, 5 polegadas, ele irá manter o aspecto visual similar para elas.

Por mais que os tamanhos, visualmente falando, sejam um pouquinho diferentes, eles manterão uma certa proporção. E conseguiremos fazer isso criando outro emulador, em que vamos rodar o nosso aplicativo, e ver essa diferença tanto no px, que é o pixel, como também no nosso dp.

Vamos ver primeiro essa parte do dp, depois mudamos para pixels, e veremos a diferença dessa parte da proporção. Para isso vamos executar o nosso aplicativo, e criar um novo dispositivo. Pegaremos um dispositivo menor, de 4 polegadas, que seria esse Nexus S. Usaremos novamente o nosso Oreo e não modificaremos nada.

Podemos também usar o pai, o que preferirmos. No caso usaremos o Oreo por causa do S, se fosse aquele emulador que estávamos usando antes, ele ia ter o Pie, então usaremos o Oreo só para podermos ser mais rápido e não termos que fazer o download. Mas se fossemos usar o pixel, teríamos o nosso Android 9, já com o download.

O Android Studio conseguiu executar nosso aplicativo no nosso Nexus S, e realmente é o celular com a tela menor. Porém, quando mantemos o nosso dp, ele mantém uma proporção nas telas, então por mais que o tamanho seja um pouquinho diferente, dada a quantidade de polegadas da tela, a proporção é a mesma.

Agora vamos utilizar os nossos pixels diretamente, e ver o que acontece. Teremos os pxs, e executaremos o nosso aplicativo novamente, no Nexus S, e vamos executá-lo também. Às vezes trava, porque manter dois emuladores é complicado, então quando você estiver fazendo esse teste, se não conseguir, tente abrir um por um, ou então rode no seu celular.

Ele rodou, agora vamos rodar no nosso Pixel, e vamos ver como é que fica. E dessa maneira, agora vamos ver como é que fica o posicionamento para o nosso Pixel. Vamos ver, usando a medida em pixels, que vai ter um comportamento diferente de acordo com o seu dispositivo. Então não vai ser uma proporção similar, observe que fica muito mais colado.

Então é realmente uma medida que não é recomendada, porque estaremos lidando com a densidade de pixels em nossos dispositivos. É por isso que o recomendado é usar o dp, uma medida com uma densidade de pixels independente, e o próprio Android ficará responsável em calcular a quantidade de pixels para que se mantenha um aspecto similar para a diversidade de dispositivos existentes no mercado.

Inclusive, essa é a base para que consigamos dar suporte para multitelas. Usaremos essa medida, e é por isso que toda vez que usarmos o px o Android Studio irá reclamar e sugerir o dp, para medidas fixas, pois elas não vão crescer de acordo com o pai , e irão sempre manter o valor

Mais um detalhe: agora que entendemos a parte de dp, temos algumas regrinhas de FloatingActionButton, porque ele é um elemento daquele padrão, o Material Design, e existem algumas regrinhas falando a respeito de como podemos usar os seus valores. Uma delas se relaciona à margem, considerando que queremos deixá-la embaixo, por padrão ela acaba usando uma regra de 16dp.

Se quisermos colocar uma margem para esse FloatingActionButton, o recomendado é usar esse valor para mantê-lo nessa parte de baixo. Isso faz parte de Design, não é específico do Android, é do Material Design. E já que estamos usando sempre o mesmo valor para ambas as margens, dado que só estamos pegando a margem inferior e do final, e que essas margens de cima não afetam tanto, podemos usar só um atributo margin mesmo.

Assim, ele vai pegar de todas as faces da nossa View, então se ela estivesse alinhada com outra View em cima, aí também teria uma margem de 16dp em cima, assim como também no início, que seria a esquerda. Dado que não há tem nenhum tipo de relação, ele acaba pegando na direita e no final, que é onde preferimos mesmo, e isso somente com um único atributo.

No momento em que colocamos o Floating Action Button incluímos outro detalhe, o atributo chamado clickable, para obtermos o efeito de clique que faz umas ondinhas. Quando o colocamos, ele pede que adicionemos o atributo focusable. Por mais que façamos as interações por meio de cliques e toques, também temos capacidade de fazer interações via teclado. Se dermos um TAB, o foco vai mudando de acordo com os elementos.

Isso é bacana para quando usamos ferramentas de acessibilidade, ou quando só temos um teclado para utilizar. Com o focusable no nosso FloatingActionButton, conseguiremos chegar nele por meio do teclado, e é por isso que ele pede para adicioná-lo também, com "Alt + Enter". Vamos executar para vermos a diferença e testarmos com o TAB.

Entendemos os atributos, vamos para a parte da List View, que não terá muita novidade, temos o layout_width e o layout_height com aquelas medidas que vimos, o match_parent, e faz todo sentido, para eles preencherem todo o espaço do Relative Layout, dado que este é o pai dele. Sendo que o pai é sempre quem possui hierarquia superior direta.

Então, voltando, o match_parent acaba crescendo de acordo com que esperamos; sempre considere o seu uso. Se fossemos colocar dentro do List View os 200dp, o FloatingActionButton manteria sua relação com o pai, o RelativeLayout. Manteremos o match_parent para podermos estender com o espaço disponível na nossa tela.

O alinhamento ficou no início, no topo, e não faz sentido manter porque estamos mantendo o match_parent, seja na altura quanto na largura. Inclusive, esse é um dos detalhes bacanas quando utilizamos o nosso XML, ou seja, nosso código fonte. Temos a capacidade de pegar tudo o que foi gerado via editor visual, e avaliar se faz sentido manter ou não.

Toda vez que você for criar um layout, considere o uso do XML. Por mais que o editor visual acabe sendo até mais fácil para o primeiro contato, conhecer sobre o XML é muito importante. Agora que temos essa base do nosso código fonte, exploraremos um pouquinho mais sobre o código fonte nas próximas implementações, para podermos ter mais familiaridade com ele.

A seguir finalizaremos a implementação do nosso layout, com base no que vimos do nosso XML.

@@05
Ajustando o XML do layout

Modifique o código fonte do arquivo de layout activity_main.xml, removendo o código que não é necessário e alterando valores não esperados. Por fim, execute o App e veja se os aspectos visuais esperados estejam funcionando como esperado.
Novas abas no layout do AS 4.1
Com o AS 4.1 temos novas abas pra acessar o código fonte do layout:

Code: acessa o código diretamente
Split: divide a tela entre código fonte e preview
Ambas as abas permitem realizar a mesma edição, a diferença é que o Split apresenta os resultados visuais ao modificar o código. Fique à vontade em experimentar as duas possibilidades.

Com os ajustes o App deve apresentar o seguinte aspecto visual:


activity_main.xml:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.design.widget.FloatingActionButton
        android:id="@+id/activity_main_fab_novo_aluno"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_margin="16dp"
        android:clickable="true"
        android:focusable="true" />

    <ListView
        android:id="@+id/activity_main_lista_de_alunos"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</RelativeLayout>COPIAR CÓDIGO
Dentre os ajustes, temos mais impacto no FAB que agora usa margem de 16dp e mantém os atributos focusable e clickable.

Ao utilizar o AndroidX, o FAB mantém o seguinte nome:

<com.google.android.material.floatingactionbutton.FloatingActionButton
    android:id="@+id/activity_main_fab_novo_aluno"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_alignParentEnd="true"
    android:layout_alignParentBottom="true"
    android:layout_margin="16dp"
    android:clickable="true"
    android:focusable="true" />

@@06
Sobre layouts via código XML

Vimos que é muito comum editar layout no Android usando uma DSL (Domain Specific Language) no formato XML. Porém, diferentemente do editor visual, precisamos conhecer alguns detalhes para manter um aspecto visual esperado.
Com base nos detalhes vistos, marque as alternativas corretas:

Aplicamos nas views indentação cada vez que uma ViewGroup tem uma filha.
 
Isso mesmo! Para manter uma organização no código em relação a hierarquia, a indentação é muito bem vinda.
Alternativa correta
A boa prática de medidas fixas é utilizar a unidade de medida px.
 
Alternativa correta
Todos elementos precisam definir os atributos layout_width e layout_height.
 
Exato! Esse é um dos requisitos mínimos quando declaramos um componente via XML.
Alternativa correta
Utilizamos o wrap_content para esticar o elemento de acordo com o pai.

@@07
Para saber mais - Especificação do Material Design

Durante a aula vimos que o componente FloatingActionButton faz parte do Material Design que sugere algumas regras de implementação, como por exemplo, uma quantidade de margem de 16dp para a parte inferior... Para mais detalhes sobre a especificação, confira a página destinada à implementação do FloatingActionButton. (Ambas as referências são em Inglês)

https://material.io/design/

https://material.io/design/components/buttons-floating-action-button.html#

@@08
Para saber mais - Outras unidades de medida

Aprendemos que o Android framework nos disponibiliza algumas medidas para definir tamanhos fixos de seus elementos, como é o caso de pixel (px) e o pixel independente da densidade (dp). Além dessas opções também temos outras.
Dentre as demais medidas, uma que é importante ter conhecimento é a pixel independente da escala (sp) que tem um comportamento similar ao dp, porém, é destinada ao conteúdo via texto, como é o caso do tamanho de texto de um TextView.

Além dela, temos outras possibilidades que podem ser conferidas diretamente na documentação do Android Developers na seção mais recursos no tópico de dimensões. (em Inglês)

No geral, utilizamos o dp e o sp, portanto, você não precisa se preocupar tanto com as demais unidades.

https://developer.android.com/guide/topics/resources/more-resources#Dimension

@@09
O que aprendemos?

Nesta aula, aprendemos a:
Adicionar um FloatingActionButton;
Implementar o layout via código fonte em XML;
Atributos comuns na implementação de views;
Medidas comuns para suporte de telas distintas.

#### 06/09/2023

@04-Trabalhando com arquivo fonte do layout

@@01
Adicionando ícones no projeto

Para finalizar o nosso layout precisamos adicionar o iconezinho no FloatingActionButton, que representa uma cruzinha com a ideia de ação de adição. Para isso, uma abordagem que poderíamos considerar é a seguinte: teríamos uma equipe de designers que ficaria responsável em mandar essas imagens para colocarmos em nosso projeto. Porém, existem situações nas quais não vamos ter essa capacidade, e teremos que colocar nós mesmos esses ícones. Para isso, o Android Studio acaba nos ajudando.
Vamos colocar primeiro via Android Studio, dessa maneira veremos os arquivos gerados para nós, e também entenderemos como funcionaria caso os designers dessem os ícones para nós. Iremos à nossa linha de projeto, entramos na nossa pastinha de "res", e depois na parte de "drawable", onde colocamos imagens no projeto de maneira estática.

Tentaremos adicionar algo com nosso "Alt + Insert". Das opções que temos, se filtramos por "image", temos a opção chamada de Image Asset, justamente para adicionar assets, arquivos estáticos que representam imagens em nosso projeto. Então vamos dar um "Enter", e aparece outra janela, que nos dá a capacidade de colocar ícones no projeto. Uma das primeiras informações que podemos notar, e também alterar, é o tipo de ícone, o Icon Type.

A princípio ele vai tentar adicionar o ícone que representará o nosso ícone de Launcher, criado por padrão quando criamos o nosso projeto. Não temos interesse em modificar o nosso ícone de Launcher, queremos colocar o ícone nos nossos componentes visuais, como é o caso do nosso FloatingActionButton.

Para isso precisamos modificar o tipo de ícone, e adicionar as outras opções que temos. As primeiras são de Launcher, na terceira opção temos essa ActionBar and TabIcons, que utilizaremos pois ela já faz um ícone capaz de utilizar nesses elementos. Clicaremos nela, e o visual até muda um pouquinho, com outras informações em relação ao ícone de Launcher, dentre elas o nome, o tipo de asset, o clip art, que representa o próprio ícone que usaremos, entre outras informações. Vamos manter essa informação de Asset Type, que é a clip art, e temos que colocar um nome de acordo com a ação que o nosso ícone terá, no caso, uma adição.

Então podemos manter o padrão de "ic", que representa o ícone, "action" que representa ação, e agora só modificamos o nome. Qual seria essa ação que iria executar? Seria a criação de um novo aluno, então podemos colocar "novo aluno" para representar esse novo ícone. Precisaremos adicionar aquele iconezinho que representa uma cruz. Ou seja, temos que ter acesso a uma galeria de possibilidades de ícones. Para isso clicaremos nessa opção do clip art, esse retângulo com um robozinho do Android, e ele vai abrir uma galeria de ícones disponíveis para nós.

E é a partir dessa galeria que teremos a capacidade de modificar o ícone de acordo com a nossa preferência. Então, há muitos ícones, se fosse para ficarmos buscando ia ser até um pouquinho demorado. Portanto a recomendação é que se vasculhe as opções disponíveis à esquerda, com um filtro de categorias de ícones, ou se você tiver mais ou menos a ideia do que o ícone representa, em inglês, você pode usar o filtro.

A ideia daquele ícone é de adição, então se filtrarmos por "add", que seria "adicionar" em inglês, ele já começa a nos dar opções, e mostrar essas três porque colocamos na sessão de Action, então a recomendação no momento de utilizar um filtro é colocar na opção All, que representa todas as categorias disponíveis.

Mais um detalhe importante, é indicado que esses ícones estão disponíveis a partir da nossa licença do Apache, na versão 2.0. Significa que eles estarão licenciados, deixando acessível para nós de maneira gratuita. Ou seja, podemos usar os ícones que são disponibilizados para nós de maneira gratuita, seja na parte de publicação, desenvolvimento, estudos, e assim por diante.

Se usássemos outros ícones de outras fontes, poderíamos ter problemas legais, de direitos autorais. Por isso é uma abordagem bacana de considerar, o uso desse tipo de abordagem via Image Asset do próprio Android Studio, então daremos um "OK", e ele adicionou o nosso ícone.

De detalhes bacanas que podemos considerar, há essas outras opções, como o Trim que, a princípio, ele coloca como "No", justamente para alinhar de acordo com o espaço total. Então se colocarmos "Yes", ele alinha todo o espaço sem deixar nenhum espaço a mais, como se fosse uma margem. A recomendação é de deixarmos o "No", pois geralmente acabamos tendo um aspecto visual esperado.

O Padding também ficará como o padrão, porque se o modificarmos ele irá mudar o espaço entre os nossos ícones, não faz muito sentido nem fica visualmente ok. O que podemos modificar para manter um aspecto visual similar ao que esperamos é a parte desse frame que representa o tema.

Por padrão, ele vai tentar sempre manter esse Holo Dark, que é justamente o tema mais escuro, próximo de um cinza, do preto, e temos outras opções, o Holo Light, próximo ao branco. Estes dois vão sempre manter aspecto visual escuro ou claro de acordo com o dispositivo, a versão do Android.

Caso não quiséssemos estes temas, ou desejássemos uma cor específica por solicitação do cliente, temos esse Custom que seria a personalizada. O Custom color seria a cor personalizada. Clicaremos nele e acabamos tendo acesso a uma paleta de cores. Aqui no curso vamos manter esse Holo Dark, uma cor padrão próxima de dispositivos Android, próxima ao branco. Mas fique à vontade para manter a cor que preferir.

Agora vamos entender a informação final, relacionada a esse Preview. Aqui temos cinco opções de ícones. Dentre essas informações tirando os prefixos temos a informação de dpi's. Quer dizer que esses ícones são criados para atender as diferentes categorias de dpi's que os desenvolvedores do Android acabaram definindo para poder dar suporte às diversas telas. Esse xxxhdpi significa que esse dpi seria o maior dentre os dispositivos.

Portanto o mdpi seria realmente para celulares muito pequenos, para o qual usaríamos esse ícone aqui. Assim, toda vez que criarmos um recurso visual, se quisermos mandar para um projeto Android, a recomendação, a boa prática, é que tenhamos essas variações. Então, se uma equipe de design, ou alguém responsável em manter esses ícones nos mandar, teria que ser dessa maneira, com essas variações respeitando as regras de medidas.

É dessa maneira que teríamos que adicionar, e é por isso que é uma das vantagens, também, utilizarmos essa técnica, porque ela já separa tudo bonitinho para nós. Agora daremos um "Next", e aí ele diz o que vai ser criado no nosso projeto, esses outros diretórios que irão representar as variações de dpi.

E também quais serão as medidas, e os nomes dos arquivos são os mesmos. O que muda é realmente o diretório onde estarão alocados, eles ainda continuarão sendo drawables. A diferença é que eles terão um traço e um sufixo indicando sua categoria em relação ao dpi. Quando estamos lidando com o nosso triplo x temos, de tamanho por pixel, de 96, e dp de 24.

Quando pegamos o nosso duplo x tem um px de 32 mantendo o dp de 24, e assim vão sendo modificados com base na variação. Algo que comprova o que foi dito anteriormente é que se mantém sempre o 24dp para manter uma proporção para as diferentes telas, alterando-se apenas o px, porque ele vai ser calculado com base no dpi.

Daremos um "Finish" nisso, e ele coloca no projeto para nós, fazendo alguns updates e mostrando para nós o nosso ícone, na nossa pastinha "drawable". Então agora nossa pasta, por mais que mostre só um ícone, entre aspas, tem 5 ícones disponíveis para poder atender as categorias. Ele deixa entre parênteses justamente por causa da perspectiva que estamos usando no nosso projeto, de Android.

Se quiséssemos ver toda a estrutura do projeto, poderíamos modificar a perspectiva, ou então acessá-la via explorador de arquivos do próprio sistema operacional. Por exemplo, se modificássemos para Project, aí sim teríamos acesso, e veríamos por meio de hierarquia todos aqueles diretórios que foram criados.

É dessa maneira que adicionamos imagens estáticas no projeto Android. Sempre teremos que nos preocupar com esse suporte de diferentes tamanhos de tela.

@@02
Utilizando o Image Asset

Caso você precise do projeto com todas as alterações realizadas na aula passada, você pode baixá-lo neste link.
Adicione o ícone indicando a ação de "adicionar um aluno" por meio do Android Studio. Para isso, vá até o diretório res/drawable e use a opção New por meio do atalho Alt + Insert, então filtre a opção Image Asset.

Em seguida, defina a opção Icon Type com o valor Action Bar and Tab Icon para que apareça a opção de Clip Art. Então defina o nome como ic_action_novo_aluno e modifique o Clip Art para manter o ícone de cruz que indica a ação de adicionar.

O ícone pode ser filtrado a partir da palavra "add" selecionando a categoria all.
Por fim, modifique o tema para o HOLO_DARK que mantém um aspecto de cor branca e clique em Next e depois Finish. Depois confira se os ícones com os tamanhos diferentes, foram adicionados como esperado.

No AS 4.1 ao invés de xxxhdpi, temos o anydpi.

https://github.com/alura-cursos/fundamentos-android-parte-1/archive/aula-3.zip

Após concluir a atividade, a estrutura de arquivos dentro do diretório drawable deve ficar da seguinte maneira:

No AS 4.1, ao invés de xxxhdpi é adicionado o anydpi que representa um vector drawable capaz de se adequar a qualquer dpi:

O ícone de adição deve apresentar o seguinte aspecto visual.

https://developer.android.com/guide/topics/resources/providing-resources#DensityQualifier:~:text=anydpi,-%3A

https://s3.amazonaws.com/caelum-online-public/1051-android-fundamentos/10-icone-acao-novo-aluno.png

@@03
Inserindo ícone e App Bar

Agora que temos os ícones, vamos voltar para a perspectiva de Android, que é mais enxuta e fácil de se trabalhar, dado que esse projeto tem uma estrutura muito grande, precisamos adicionar aquele ícone. E para isso temos atributos da nossa View que permitem essa adição.
Vamos voltar ao nosso código fonte com "Ctrl + Shift + F12" para aumentá-lo. Clicaremos para abrir o perfil, e agora usaremos um método chamado de src que quando colocamos teremos a capacidade de colocar exatamente aquelas opções com o FloatingActionButton via editor visual, e ele falava que precisávamos colocar um recurso. Temos acesso aos recursos disponíveis via arquivo estático, que seria por exemplo @drawable para conseguirmos acessar os arquivos do drawable, ou então @mipmap, e assim por diante.

Nesse caso queremos o drawable, porque é onde estão os nossos ícones e ele faz um filtro das possibilidades. Por mais que existam aquelas categorias diferentes, ele sempre vai manter só esse único nome que colocamos no ícone, "ic_action_novo_aluno", porque ele vai pegar aquelas variações no momento em que executar o nosso projeto e identificar o dpi.

Por isso que aqui não precisamos definir dpi. A definição será feita via próprio sistema operacional, então não nos preocupamos com qual será utilizado de acordo com a execução, já que o próprio Android se responsabiliza por isso dado que daremos as possibilidades.

Nossa única responsabilidade é de enviar as possibilidades, porque senão ele só vai usar o que tem disponível. Daremos um "Enter", e agora sim, ele adicionou o ícone para nós. Agora precisamos executar, mas antes disso uma observação: cada vez que colocamos resources ele vai dar uma ajuda aqui na parte esquerda indicando mais ou menos qual o recurso que acabamos colocando.

Se de repente não quisermos executar para ter certeza, podemos vir na esquerda, na linha do código fonte, que ele vai mostrar, ou podemos apertar o "Ctrl + B" que ele vai mostrar as possibilidades. Se dermos "Enter" ele vai direto ao arquivo. Assim, acabamos colocando os ícones. Vamos executar o nosso projeto e ver se tudo está funcionando como o esperado. Conseguimos colocar o nosso ícone.

Então, da parte do nosso layout já conseguimos atender aquela parte do nosso botão, agora só falta colocarmos o App bar. E como é que fazemos isso? Existem diversas maneiras de fazermos isso a gente: via layout, ou usando outra técnica bem comum no Android, por meio de outra Activity, então, ao invés de usarmos essa nossa Activity normal usaremos uma ramificação, outra variação dela, que seria esse App Compat Activity.

Ele já coloca o nosso App bar, como estamos vendo no Preview. A diferença é que ele é uma boa prática no Android, por dar suporte a versões anteriores do Android. Significa que se usarmos um recurso recente no Android, por exemplo, que entrou no Android 5.0, e estamos dando suporte para Android 4.4, ele irá conseguir colocar esse comportamento para ele. No geral, ele será recomendado para ser utilizado.

Então quando criarmos uma Activity, ou estivermos em outro projeto, vai ser muito comum usá-lo, justamente por isso. Inclusive, as classes dessa biblioteca, que é o Android Support, no geral vão ter esse tipo de comportamento, de dar suporte às versões antigas, de acordo com o alcance de versões for colocado para atender no projeto. E é dessa maneira que criamos um projeto que dá suporte a diversas versões do Android, utilizando essas classes que estão relacionadas à biblioteca de suporte.

Agora que colocamos, vamos executar para ver como é que fica. A princípio, quando colocamos o AppCompatActivity, ele vai manter a App bar com o título do nosso projeto, que no caso é "Agenda". Ele não vai personalizar por padrão, ele vai manter esse nome, então teremos que personalizar manualmente com o nome que queremos, que é "Lista de alunos".

Não tem complicações, é só colocar o método Set Title. Então, quando colocamos esse App Compat Activity, ele já dá acesso a este Set Title, e colocamos, por exemplo, lista de alunos. E aí sim, conseguiremos modificar da maneira esperada.

Esse AppCompatActivity estende também de Activity. Ele não é algo diferente de uma Activity. Para termos certeza disso, podemos usar o atalho "Ctrl + H", e ele nos mostra que é um AppCompat que estende de Fragment Activity, que estende de Support Activity, e por aí vai.

Realmente é uma classe especializada em dar acesso a esse App bar, e também aos suportes de features novas de Androids mais recentes para os Androids antigos que damos suporte. É claro, nem sempre é tão simples, mas no geral ele vai conseguir atender as necessidades gerais, é por isso que vamos tentar sempre usar o App Compat Activity.

Começamos com a Activity para vermos que funciona, e no geral a maioria das features estará funcionando, mas se de repente formos dar suporte à algo novo, teremos que usar o AppCompatActivity para poder dar esse suporte, e ter acesso à App bar.

Como comentado, existem outras possibilidades, e essa é a maneira mais fácil que temos, não será sempre a melhor dependendo do que for ser implementado, mas no geral acabamos utilizando ela por ser a mais objetiva e a mais fácil. Conseguimos concluir essa primeira implementação. A seguir veremos os próximos desafios.

@@04
Adicionando ícone e App bar

Adicione o ícone indicando a ação de adicionar no FAB, para isso utilize o atributo do android:src.
Faça com que a Activity tenha uma App Bar, para isso altere a extensão de Activity para a AppCompatActivity. Em seguida, modifique o título da App Bar para "Lista de alunos" por meio do método setTitle().

Execute o App e veja se aparece a App Bar com o título e ícone de ação de adição no fab.

Ao executar o App deve aparecer o seguinte aspecto visual:


Em código temos o seguinte resultado:

MainActivity.java:
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de alunos");
        // restante do código
    }
}COPIAR CÓDIGO
activity_main.xml:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.design.widget.FloatingActionButton
        android:id="@+id/activity_main_fab_novo_aluno"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_margin="16dp"
        android:clickable="true"
        android:src="@drawable/ic_action_novo_aluno"
        android:focusable="true" />

    <!-- restante das views -->

</RelativeLayout>COPIAR CÓDIGO
No AS 4.1, utilizando os componentes do Material Design compatíveis com o AndroidX, o FAB possui algumas regras padrões que só podem ser modificadas por meio do namespace app, como por exemplo, se você quiser mudar a cor do ícone, precisa utilizar a propriedade app:tint.

@@05
Criando a Activity via Android Studio

Agora que finalizamos a implementação da tela de lista de alunos, podemos seguir com a próxima tela. Se consultarmos a proposta de implementação percebemos que precisamos implementar uma tela que vai representar um formulário de cadastro de alunos, ou seja, o nosso objetivo é criar um fluxo no qual estaremos na lista de alunos, vamos clicar no nosso Floating Action Button e entrar nesse formulário de cadastro. Dentro dele vamos conseguir cadastrar o aluno com base nas informações de nome, telefone e e-mail.
E teremos um botão para salvar, e dessa maneira vamos clicar nele, salvar o aluno e apresentá-lo na nossa listinha. Então, nosso objetivo final será chegar nesse fluxo, mas para isso teremos que implementar primeiro essa Activity que terá esse layout. Vamos voltar ao Android Studio e começar com essa implementação.

Aprendemos como criamos uma Activity por meio de uma classe fazendo herança da Activity do Android, o registro no Manifest e criando um layout. Vimos que é um processo manual que tende a ser trabalhoso, e por isso temos recursos do programa que acabam automatizando essa tarefa. Como vimos no começo do curso, no momento em que estávamos criando nosso projeto tínhamos uma galeria de Activities.

É por meio daquela opção que teremos capacidade de automatizar essa tarefa, e exploraremos um pouquinho dela. Para isso entramos no nosso pacote "java", "br.com.alura.agenda", que é o nosso código de produção, dentro dele apertamos o atalho "Alt + insert" para adicionarmos algo. Podemos fazer filtros para achar a nossa Activity, apertamos a setinha para a direita e ele mostra as diversas opções que temos. Se formos só pelos nomes é um pouco abstrato porque não sabemos a que tipo de Activities se refere cada um desses nomes.

Portanto, qual opção escolheremos? Será essa primeira, a Gallery, e dessa maneira abrimos novamente aquela galeria de opções de Activities disponíveis, e diferentemente de quando estávamos criando, agora não aparece mais a opção Add Activity, justamente porque agora vamos adicionar uma Activity por meio da galeria.

Teremos que escolher realmente um desses templates, que são exemplos prontos para criarmos as Activities. Temos muitas opções, que mostram quais são consideradas comuns quando queremos criar uma Activity, dentre as quais escolheremos essa Empty Activity, porque ela irá manter um layout bem clean, o que chamamos de layout vazio, que vai permitir com que criemos o nosso layout sem termos que ficar removendo o código fonte.

Um aviso importante: dependendo da versão do Android Studio que é utilizado, pode ser que a galeria seja bem diferente, ou até mesmo similar, portanto, se a versão for muito mais distante dessa que estamos usando, que é 3.2.1, e não aparecer nenhuma dessas Activities durante a galeria, a recomendação é que se implemente uma Activity com a ideia de ser vazia, sem nenhum componente.

Durante o curso, nessa versão 3.6.1, usaremos a Empty Activity. Agora que selecionamos, temos a capacidade de selecionar qualquer uma delas, vamos selecionar a Empty e dar um "Next". Feito isso, temos que preencher as informações das Activities; como sabemos ela vai ter uma classe, um arquivo de layout, e as opções para poder indicar o pacote, se é um Launcher ou não.

Vamos definir o nome da Activity, ele tenta a seguir o mesmo padrão feito para a primeira, ele coloca Main, e depois o número 2 para fazer a boa prática, a recomendação quando criamos Activities é colocar um nome que faça sua definição, por exemplo, queremos uma Activity para uma tela de formulário de cadastro de alunos, então poderíamos colocar o nome próximo de formulário aluno, pois assim, só lendo o nome dela já sabemos o que ela representa para o nosso aplicativo.

Vamos pedir para ele gerar o arquivo de layout, pois como sabemos a boa prática é manter um arquivo de layout, ele coloca o padrão que é o prefixo Activity, colocando formulário aluno, e em seguida, temos a opção deixar como Launcher. Dado que vamos desenvolver essa tela, e quando executarmos queremos essa tela, vamos deixar como Launcher, e dessa maneira, aparece a tela para nós, e não termos que fazer de outra maneira, que ainda não investigamos nem mexemos.

Então a princípio vamos deixar como Launcher, e em seguida ele já sugere a opção de adicionar a App Compat Activity justamente pela ideia de mantermos a compatibilidade entre as versões anteriores do Android que estamos dando suporte, que são as versões mínimas. Em seguida, ele sugere a opção de pacote que deixaremos. Por padrão, quando estamos fazendo a primeira Activity deixamos no pacote raiz para não termos essa parte de organização do código.

Dado que é a segunda Activity que estamos criando, e a ideia é de fazer em um padrão esperado, a ideia de pacotes também é deixar um pacote específico de Activities, uma abordagem inicial seria colocar pacotes destinados à Activity. Uma técnica que costumo usar é adicionar mais um subpacote para ficar acima da Activity, que vai representar a interface do usuário, chamado UI. Dessa maneira todos os pacotes que estiverem dentro de UI irão definir e indicar que serão classes representadas de telas, ou seja, Activity representa uma tela, e por isso ela fica dentro desse pacote.

Se colocássemos qualquer outra entidade que fosse uma tela, que representasse uma interface de usuário, faria todo sentindo mantê-la dentro também, então, por isso eu costumo manter dessa maneira. De código fonte usaremos o Java, e aí é só darmos um "Finish". Assim, o Android Studio começa a fazer um procedimento, a criar uma classe para nós, um arquivo XML que vai representar o nosso layout, e também a registrar no Manifest.

Por isso ele já faz o procedimento, que às vezes não vai ser tão rápido, pode ser que demore um pouquinho, justamente porque ele já está fazendo todo o procedimento que teríamos que fazer manualmente. Já ganhamos tempo não tendo que escrever todo esse código. A recomendação para quando estivermos fazendo esse procedimento é que ele provavelmente vai abrir essa abinha de Build, e assim que terminar, começamos a mexer no código, porque enquanto isso ele está fazendo todo o procedimento e sincronizando tudo para poder compilar da maneira esperada.

Vamos fechar a parte do build, e quando criamos essa Activity, um pacote específico, a classe R não veio importada ou acessível, porque a classe R está no pacote raiz, ou seja, lá naquela nossa primeira Activity, ela nem precisa fazer import, já que ela estava tendo acesso. Então precisamos fazer o importe, e ele até sugere "Alt + Enter", que importa para nós.

Conseguimos criar a nossa Activity, executar o aplicativo e ver o que está acontecendo, porém, aproveitando que estamos fazendo tudo no padrão esperado, vamos aproveitar esse momento para deixar a nossa Activity inicial que criamos no padrão esperado, pois ela ainda está mantendo o nome que não dá significado real para ela, que seria uma lista de alunos. E também está em um pacote que não faz muito sentido para ela, que é o pacote raiz. Então agora faremos todos os passos considerados como técnicas de refatoração.

Faremos a modificação, seja no código da estrutura do projeto, para deixar conforme o esperado, de maneira ideal. O primeiro passo é organizar o pacote, e para isso temos várias técnicas: do Android Studio, o IntelliJ por baixo, manualmente da maneira que preferirmos. Uma das abordagens mais diretas seria segurar e arrastar até o pacote que esperamos, e dessa maneira ele já indica que irá mandar para esse pacote e tentar fazer uma refatoração inteira.

Significa fazer com que todos os pontos do nosso projeto, que utilizem a referência dessa Activity também sejam modificadas. Por exemplo, no nosso arquivo de Manifest, que está usando a nossa Activity, vai tentar fazer a modificação automaticamente. Então vamos usar essa opção com Refactor. Vamos investigar os detalhes, então, o primeiro deles é que ele não mostra mais a perspectiva do pacote raiz, e sim somente esse único pacote UI, em que há apenas classes. Isso não é um problema, podemos adicionar depois, mas esse é o primeiro impacto.

Em seguida, precisamos ver se teve algum problema de importe; a princípio, dado que fizemos a opção de Refactor, ele já tentou fazer o importe, até mesmo da classe R. Outra opção que podemos estar considerando é a remoção dessas classes que não estão sendo usadas, dado que estamos fazendo a refatoração. Para isso utilizamos o atalho "Ctrl + Alt + O", que faz a otimização removendo quatro importes. Se formos ao Manifest veremos que está tudo certo.

Feita essa primeira modificação, a próxima é modificar o nome da Activity, para isso também temos técnicas que fazem essa refatoração, seja modificando direto no Manifest ou no arquivo. Modificaremos no Manifest para vermos que essa opção também funciona para outros pontos que estão referenciando a Activity. A técnica é chamada de Rename, que usamos por meio do "Shift + F6".

E aí ele diz que podemos modificar o nome, pois ele cuidará da parte refatoração; apagamos o Main colocando ListaAlunosActivity, e em todos os pontos que tiverem referência a esta lista, ele vai fazer a modificação. O arquivo de lista de alunos já foi modificado, antes era Main, só que aqueles arquivos estáticos que referenciam os layouts não são modificados, então toda vez que modificarmos o nome de uma Activity, podemos ter um trabalho muito grande nos arquivos estáticos.

Sempre, desde o começo, é bom tentar manter um nome padronizado para evitar retrabalho em arquivos estáticos. Aproveitando, vamos pegar os nomes estáticos. Temos Activity Main, usamos "Shift + F6" para renomear no nosso arquivo XML também. Poderíamos fazer isso lá mesmo, ou aqui no código. Dessa maneira, conseguimos refletir no arquivo de layout, e como podemos ver, em coisas estáticas ele não mexe, então em IDs também vamos ter que mexer. Faremos isso agora diretamente no arquivo de layout, mas poderíamos modificar via código Java.

Com "Ctrl + B" conseguimos modificar, e quando estávamos modificando o nosso Floating Action Button, não usamos o "Shift + F6" porque não tínhamos nenhuma referência, mas mesmo assim, a recomendação é que sempre se utilize o "Shift + F6", porque por mais que às vezes pareça que não está sendo utilizado, às vezes, por debaixo dos panos algo está usando essa referência, e podemos ter algum problema caso façamos manualmente, pois ele tentará modificar em apenas um lugar.

Conseguimos aplicar a refatoração esperada, e temos uma organização da maneira esperada, precisamos executar o projeto para ver se aparece a nossa tela para representar o formulário. E aí depois que conseguirmos executar, iremos começar a implementação do nosso formulário com base na proposta que temos.

Vamos abrir o nosso emulador, o Android Studio conseguiu executar o nosso projeto, porém, ainda aparece a nossa lista de alunos. Isso acontece porque se formos ao nosso Manifest, ambas as Activities estão sendo declaradas como Launcher. Ou seja, a primeira que estiver declarada no Android Manifests vai acabar sendo executada. Se formos ao nosso dispositivo percebemos que na bandeja de aplicativos ele criou dois atalhos para acesso ao nosso projeto.

Se clicarmos em um deles, ele vai abrir uma das Activities, neste caso da lista de alunos, e se abrirmos o outro ele abre a nossa tela que será representada com o formulário. Então os dois atalhos foram criados para poder abrir as Launcher. Temos a capacidade de criar várias delas em nosso projeto, porém a primeira que foi cadastrada, e que o Android irá executar, e conseguimos executar a segunda manualmente via própria bandeja de aplicativos.

Considerando que vamos estar desenvolvendo essa tela, e que queremos que ela apareça, vamos fazer o seguinte: comentar o intent-filter da nossa lista de alunos. E dessa maneira, quando executarmos o nosso projeto, teoricamente é para abrir o nosso formulário, pois estaremos desenvolvendo-o, e assim que o fizermos o tiramos como Launcher e fazemos aquele fluxo clicando no Floating Action Button e entrando no formulário.

Deixaremos assim por enquanto para podermos estar desenvolvendo o nosso projeto. Agora sim, conseguimos colocar uma nova Activity utilizando o Android Studio, e o nosso próximo passo vai ser realmente desenvolver essa telinha. Até já.

@@06
Nova Activity e refatoração

Crie a Activity para o formulário de aluno. Para isso, utilize o procedimento do Android Studio entrando no pacote raiz (local onde está a MainActivity) e usando a opção New (Alt + Insert). Filtre pela opção "activity" então navegue até a opção Gallery....
Escolha o template Empty Activity e clique em Next.

É válido ressaltar que dependendo da versão do Android Studio podem surgir outros templates. Caso não tenha o Empty Activity, escolha um template que apresenta um layout vazio.
Em seguida, preencha os campos solicitados, defina o nome da Activity como FormularioAlunoActivity, marque a opção Launcher Activity e deixe as opções Generate Layout File e Backwards Compatibility (AppCompat) marcadas.

Confira se o nome do arquivo de layout está mantendo o padrão esperado.
Defina um pacote específico para a Activity, vimos que podemos deixar dentro de activity ou ui.activity, escolha a maneira que preferir, porém, certifique-se que vai ficar em um pacote reservado para Activities. Então clique em Finish.

Após o Gradle finalizar o procedimento de sincronização do projeto. Altere o arquivo de manifesto para que somente a Activity de formulário seja executada durante o launch.

Após realizar todos os ajustes, execute o App e veja se aparece a Activity para o formulário de aluno.

06
Nova Activity e refatoração

Crie a Activity para o formulário de aluno. Para isso, utilize o procedimento do Android Studio entrando no pacote raiz (local onde está a MainActivity) e usando a opção New (Alt + Insert). Filtre pela opção "activity" então navegue até a opção Gallery....
Escolha o template Empty Activity e clique em Next.

É válido ressaltar que dependendo da versão do Android Studio podem surgir outros templates. Caso não tenha o Empty Activity, escolha um template que apresenta um layout vazio.
Em seguida, preencha os campos solicitados, defina o nome da Activity como FormularioAlunoActivity, marque a opção Launcher Activity e deixe as opções Generate Layout File e Backwards Compatibility (AppCompat) marcadas.

Confira se o nome do arquivo de layout está mantendo o padrão esperado.
Defina um pacote específico para a Activity, vimos que podemos deixar dentro de activity ou ui.activity, escolha a maneira que preferir, porém, certifique-se que vai ficar em um pacote reservado para Activities. Então clique em Finish.

Após o Gradle finalizar o procedimento de sincronização do projeto. Altere o arquivo de manifesto para que somente a Activity de formulário seja executada durante o launch.

Após realizar todos os ajustes, execute o App e veja se aparece a Activity para o formulário de aluno.

@@07
Refatorando a MainActivity

Refatore o código da MainActivity para que ela tenha mais significado com a tela que representa. Para isso, renomeie o nome da classe para ListaAlunosActivity replicando essa mudança em todos os pontos que faziam referência à "main Activity".
Para facilitar o processo, utilize a técnica de rename do Android Studio, por meio do atalho Shift + F6.
Lembre-se que mudanças feitas na classe geralmente não replicam em arquivos estáticos do resources, portanto, mesmo que use o rename, vai ser necessário mudar o nome do arquivo de layout e as referências dos ids. Durante essa mudança, considere o rename para replicar em todos os pontos que fazem uso das referência estáticas.

Por fim, modifique o pacote para que fique no mesmo pacote da FormularioAlunoActivity.java.

Uma técnica boa é clicar e arrastar a classe até o pacote desejado.
Após aplicar a refatoração, execute o projeto e veja se tudo funciona como antes.

O App deve funcionar da mesma maneira como ficou no exercício anterior, a diferença é que o código deve apresentar o seguinte resultado:
activity_main.xml -> activity_lista_alunos.xml:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <android.support.design.widget.FloatingActionButton
        android:id="@+id/activity_lista_alunos_fab_novo_aluno"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_margin="16dp"
        android:clickable="true"
        android:src="@drawable/ic_action_novo_aluno"
        android:focusable="true" />

    <ListView
        android:id="@+id/activity_lista_alunos_listview"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</RelativeLayout>COPIAR CÓDIGO
MainActivity.java -> ListaAlunosActivity:
package br.com.alura.agenda.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.agenda.R;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);
        setTitle("Lista de alunos");
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "Jose", "Maria", "Ana"));
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));
    }
}COPIAR CÓDIGO
AndroidManifest.xml:
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="br.com.alura.agenda">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".ui.activity.ListaAlunosActivity">
            <!--<intent-filter>-->
                <!--<action android:name="android.intent.action.MAIN" />-->

                <!--<category android:name="android.intent.category.LAUNCHER" />-->
            <!--</intent-filter>-->
        </activity>
        <activity android:name=".ui.activity.FormularioAlunoActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>

@@08
Implementando o layout do formulário

Vamos implementar o layout do nosso formulário. Voltaremos no Android Studio na nossa Activity que representa o formulário, e clicaremos no identificador do arquivo estático do layout, e dessa maneira, apertando o "Ctrl + B" conseguimos entrar diretamente no layout criado para essa Activity. O primeiro passo que faremos será estender o código com "Ctrl + Shift + F12" e abrir o Preview, para termos todo o ambiente preparado para construir o nosso layout via XML, já que já vimos como é que funciona via editor visual.
Esse layout não foi criado por nós, e sim via Android Studio usando a técnica da galeria de Activities, portanto ele já colocou uma View Root sem termos tomado essa decisão. E dentre as opções existentes dentro do Android Framework, ele utilizou o Constraint Layout. Por padrão, atualmente falando, ele está considerando essa View Root, que no caso é uma View Group também.

Como foi comentado, o Constraint Layout tem um curso explicando sobre ele, portanto nesse curso inicial exploraremos mais os recursos iniciais do Android Framework mesmo, que também são conhecidos como legados, seja o Linear Layout ou então Relative Layout. Vamos converter via XML para Linear Layout, e vamos fazer a implementação em cima dele.

Para fazermos essa conversão, selecionamos todo o código que faz a identificação do Constraint Layout, e escrevemos o nosso Linear Layout. Se colocarmos apenas o "Li" ele tenta fazer um autocomplete das possibilidades, basta dar um "Enter" e ele faz essa conversão para nós.

Então precisamos ver os atributos que foram declarados, o primeiro deles é o namespace, que já vimos, do Android, que vamos manter, o segundo está mantendo o namespace do app, portanto podemos apagar, em seguida ele vem com novo namespace que é o tools. Significa que ele terá o mesmo comportamento que tem o namespace de Android e o namespace app. A diferença é que ele vai colocar todos os componentes visível apenas no Preview, então é realmente uma ferramenta para fazer o desenvolvimento dos nossos layouts via Preview.

Não conseguiremos executar e manter as informações que colocávamos via tools. Como se fosse uma ferramenta apenas para o design, para termos via Preview, porque de repente teremos uma informação estática que não queremos apresentar durante a execução, então o tools será utilizado nesse tipo de situação, inclusive nesse momento para colocar esse context que representa justamente uma situação na qual podemos ter um tema diferente para esse tipo de formulário. Neste caso, ele vai carregar no Preview para nós. Dado que não fazemos uso desse recurso, não vamos utilizá-lo.

Por isso apagaremos o tools. Existem outras situações em que ele vai ser necessário, entre aspas, pela utilidade, para ajudar, mas não nesse momento. No curso de Constraint Layout falamos um pouquinho sobre ele, já dando um pouco de spoiler, mas nesse momento não precisaremos utilizar.

Então deixamos o nosso layout limpo, e podemos conversar com a implementação. Como vimos, o Linear Layout é uma View Group na qual trabalha via linhas, também precisamos definir a orientação, para que essas linhas sejam disponibilizadas para cada uma das Views, seja de maneira vertical ou horizontal.

Nesse caso, com a implementação que queremos fazer, utilizaremos a vertical, por meio desse orientation do Android. Dessa maneira cada View que entrar dentro dele pegará um espaço exclusivo para ela. Agora, precisamos colocar esses componentes que recebem texto, edição de texto. No Android trabalhamos com um componente chamado de Edit Text, que colocaremos.

Começaremos a colocar o nível de hierarquia abaixo do Linear Layout, o Edit Text. Como sabemos, precisamos obrigatoriamente colocar o width e também o height. Como ocuparemos todo o espaço da tela, o máximo que conseguirmos, deixaremos como width com match_parent. A parte da altura pegaremos conforme o necessário, por isso colocaremos wrap_content.

Teremos um esboço de como ficará esse Edit Text, só precisamos colocar mais alguns argumentos, atributos, e aí sim, ele vai colocar conforme o esperado. A primeira boa prática que faz todo sentido mantermos é justamente o ID, pois vamos precisar dele para podermos pegar essa View dentro da Activity.

Colocaremos o ID, por meio daquele padrão que é o arroba mais ID barra. Precisamos representar por meio do que ele será, de acordo com o nosso layout. Como sabemos, o primeiro componente representa o nome do aluno. Por enquanto deixaremos só o nome porque só ele vai ser indicado com o nome, se tivesse outra View com essa ideia de algum tipo de referência ao nome, poderíamos mudar um pouquinho e colocar input nome, algo do gênero.

Definimos o ID, e agora faremos uma estilização para deixar próximo a esse layout, porque, por padrão, o que acontece é que temos um espaçozinho que não existe no layout, ele está bem grudado com essa View, com o nosso parent, o Linear Layout, então precisamos colocar uma margem também, para isso utilizamos o atributo margin, e um valor mínimo bem comum de ser utilizado, 8dp, mas poderíamos usar outro valor.

Agora precisamos inlcuir essa informação via texto justamente para dar uma dica do que representa essa entrada de texto. Para isso temos um atributo do Edit Text, que indica essa ideia de dica, o hint, se você vem do front end, é o que costumamos chamar de placeholder, então colocaremos a dica, que vai ser Nome. Conseguimos fazer esse nosso primeiro Edit Text, agora precisamos colocá-lo mais duas vezes com argumentos diferentes.

Selecionaremos todo o Edit Text, e daremos um "Ctrl + D" duas vezes, que copia toda a linha e cola embaixo automaticamente. Ele deixa tudo alinhado na parte de baixo por usar o Linear Layout, essa também é uma das vantagens de usarmos o Linear Layout, porque ele é bem fácil de fazer Views nas quais cada componente vai permanecer no seu espaço, mandando para frente o próximo componente de acordo com a orientação.

Agora só precisamos modificar os argumentos; como o segundo argumento incluiremos o telefone e e-mail. Conseguimos colocar esses componentes de entrada de texto, os Edit Text. O que precisamos fazer para finalizar essa implementação de layout é colocar esse botãozinho embaixo, que irá representar o comportamento de salvar um aluno. Isso é bem simples, temos outro componente destinado ao botão, então embaixo do último Edit Text colocamos o componente chamado Button.

Ele terá um comportamento similar ao que vimos no nosso layout, a diferença é que temos que colocar tanto width quanto height, para preencher tudo com match_parent e a altura crescer o suficiente, e ele mostra um esboço de como está ficando a nossa implementação com esses dois argumentos. Precisamos de um ID para usarmos esse componente, então será uma Activity. Deixamos bem definido o que ele representa, depois colocamos uma margem, a mesma que aplicamos para os outros.

Se você quiser colocar uma margem tanto na parte do início quando na parte final, fique à vontade, mas dado que usaremos essa margem normal, não tem nenhum tipo de impacto, então manteremos dessa forma. Precisamos colocar esse texto, indicando o seu comportamento, que é salvar. Para isso, temos o atributo text, e escrevemos "Salvar".

A implementação desse layout foi bem simples, usando o XML. Vimos exatamente as mesmas técnicas vistas anteriormente, respeitando a ideia de uma View Root, de um View Group, colocando suas Views filhas e conseguimos implementar o layout. Nesse momento precisamos executar o nosso projeto e ver se ele está funcionando da maneira esperada, e se tudo estiver funcionando conseguimos prosseguir com o próximo passo. Daremos um "Shift + F10" para executar o projeto.

Abriremos o emulador, aguardaremos o Android Studio finalizar a execução, e se tudo der certo daremos continuidade a seguir. Ele apresentou o formulário como esperado, vamos clicar em cima deles, por exemplo no nome, aparece o teclado e conseguimos fazer o preenchimento. Mas ao clicarmos no telefone, esperamos preencher informações com o número, e não texto.

Seria bem interessante se houvesse uma opção que já colocasse o arroba para facilitar. Em outras palavras, quando trabalhamos com Edit Text, existe outro atributo que nos ajuda e irá representar o tipo de entrada. Faz todo sentido trabalharmos em cima dele, então vamos modificar esse atributo para finalizar o nosso layout. Voltaremos ao nosso Edit Text e colocamos o atributo chamado inputType, com que teremos a capacidade de colocar um tipo específico de entrada para aquele Edit Text.

Inclusive, podemos até colocar um tipo específico ao incluirmos o nome, pois se apagarmos todo o nome, ele já começa com inputType, com o tipo de teclado, de entrada com letra minúscula, sendo que para nomes normalmente temos letra maiúscula no começo. Portanto, o que iremos colocar será a opção chamada de textCapWords, para que para cada palavra do Edit Text ele vai deixar em letra maiúscula.

Para o telefone deixaremos phone mesmo, e para e-mails vamos colocar a entrada textEmailAdress, e agora sim, teremos um tipo de teclado específico para o campo que está sendo preenchido. Vamos dar um "Shift + F10" para executarmos o nosso projeto. Vamos testar os teclados, para ver se fazem uma ajuda ao nosso usuário, à experiência que ele terá em relação a como ele vai usar nosso aplicativo.

Ficou bem mais bonito, né?

Consegue colocar um e-mail bem mais fácil do que ter que ficar modificando o teclado para poder achar o arroba, temos um comportamento esperado. Precisaremos nos preocupar com o comportamento de salvar, porque se clicarmos no botão, ele faz a ação via efeito visual, só que a lógica por trás, o que nossa Activity precisa fazer ela ainda não faz. É justamente nisso que iremos focar logo a seguir.

@@09
Layout do formulário

Implemente o layout do formulário de aluno. Faça com que ele tenha o mesmo aspecto visual de acordo com o a proposta de implementação de layout:


Para essa implementação considere as seguintes views:

LinearLayout como elemento raiz aplicando orientação vertical;
EditText para as views de entrada de texto;
Button para o botão salvar.
Lembre-se de aplicar as dicas em cada um dos EditText utilizando o atributo android:hint, e também, o tipo de entrada de acordo com o campo, como por exemplo, para o campo nome todas as palavras devem apresentar letra maiúscula no começo.

Ao finalizar a implementação do layout, execute o App e veja se apresenta um aspecto visual similar ao da proposta.

Ao executar o App deve apresentar o seguinte aspecto visual para o layout:


Perceba que para cada campo temos um teclado específico. O código fonte do layout ficou da seguinte maneira:

activity_formulario_aluno.xml:
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <EditText android:id="@+id/activity_formulario_aluno_nome"
        android:layout_width="match_parent"
        android:layout_margin="8dp"
        android:hint="Nome"
        android:inputType="textCapWords"
        android:layout_height="wrap_content" />

    <EditText android:id="@+id/activity_formulario_aluno_telefone"
        android:layout_width="match_parent"
        android:layout_margin="8dp"
        android:hint="Telefone"
        android:inputType="phone"
        android:layout_height="wrap_content" />

    <EditText android:id="@+id/activity_formulario_aluno_email"
        android:layout_width="match_parent"
        android:layout_margin="8dp"
        android:hint="E-mail"
        android:inputType="textEmailAddress"
        android:layout_height="wrap_content" />

    <Button android:id="@+id/activity_formulario_aluno_botao_salvar"
        android:layout_width="match_parent"
        android:layout_margin="8dp"
        android:text="Salvar"
        android:layout_height="wrap_content" />

</LinearLayout>

@@10
Uso do AppCompatActivity

Nesta aula, modificamos a herança de Activity para AppCompatActivity em nossas Activities. Por quais motivos fizemos essa mudança?

Para adicionar a App Bar no layout da Activity.
 
Isso mesmo! O AppCompatActivity aplica uma App Bar por padrão apenas realizando a herança.
Alternativa correta
Para dar suporte a versões antigas do Android.
 
Exato! A ideia do AppCompat é permitir o uso de features do Android de versões recentes em versões antigas, como é o caso das versões mínimas que o projeto suporta.
Alternativa correta
Para possibilitar o uso de ViewGroups diferentes no layout.
 
Alternativa correta
Para possibilitar o uso de arquivos de layout na view da Activity.

@@11
O que aprendemos?

Nesta aula, aprendemos a:
Adicionar ícones no projeto;
Implementar layout via XML;
Implementar layouts com o LinearLayout;
Implementar layout de formulário;
Refatorar Activities em relação ao pacote e nomes;
Implementar App Bar e uso do AppCompatActivity.