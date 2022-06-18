# TP algorithmique Java
Ces TP ont été effectué dans le cadre
de la formation M2I Java Sopra Steria
## Bases java
### Ex 1
>Ecrire un algorithme qui demande l'âge d'un enfant. Ensuite, il l'informe de sa catégorie :
>
>« Poussin » de 7 à 9 ans
>
>« Pupille » de 10 à 11 ans
>
>« Benjamin » de 12 à 13 ans
>
>« Minime » de 14 à 15 ans
>
>« Cadet » 16 à 17 ans
#### Pseudo code
```
Si age < 7
  Afficher "Trop jeune"
Sinon si age <= 9
  Afficher "Poussin"
Sinon si age <= 11
  Afficher "Pupille"
Sinon si age <= 13
  Afficher "Benjamin"
Sinon si age <= 15
  Afficher "Minime"
Sinon si age <= 17
  Afficher "Cadet"
Sinon
  Afficher "Trop grand" 
```

### Ex 2
>Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
>
>Surface = Rayon x Rayon x PI;
Rayon = Diamètre / 2
#### Pseudo code
```
 Rayon=Diamètre/2
 Surface = rayon*rayon*PI
```

### Ex 3
>Ecrire un programme Java qui demande à l'utilisateur de saisir son nom, prenom et age, et qui ensuite va afficher le message : "Vous vous appelez &lt;prenom&gt; &lt;nom&gt;, et vous avez &lt;age&gt; ans"
#### Pseudo code
```
Afficher Format("Vous vous appelez %s %s, et vous avez %s ans", prenom, nom, age")
```

### Ex 4
> Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
> Exemple :
> Entrez la première valeur(a) : 51
> Entrez la deuxième valeur(b) : 876
> Entrez la troisième valeur(c) : 235
> Les valeurs entrées sont : a = 51, b = 876 et c = 235
> Permutation: b <== a, c <== b, a <== c
> Les valeurs permutées sont : a = 235, b = 51 et c = 876

#### Pseudo code
```
d=c
c=b
b=a
a=d
Afficher "a=",a
Afficher "b=",b
Afficher "c=",c
```

### Ex 5

> Ecrivez un programme Age.java qui :
> declare l'âge de l'utilisateur ;
> lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
> Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
> affiche l'année de naissance ainsi calculée.
>
> Exemple d'exécution du programme:
> age = 30
> Votre année de naissance est : 1992
#### Pseudo code
```
anneeDeNaissance=annee-age
Afficher "Votre année de naissance est : ", anneeDeNaissance 
```

### Exercice 7
Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
Exemple d'exécution:
Entrez un nombre entier: 5
Le nombre est positif et impair
Entrez un nombre entier: -4
Le nombre est négatif et pair
Entrez un nombre entier: 0

### Exercice 8
Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
[Principe du fonctionnement d'une équation du 2nd degré](https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf)


### Exercice 9
Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.

#### Ex :
>Mois : 4
> 
>Résult : Avril

Pour cet exercices, vous devez aussi présenter une version qui utilise le sélecteur de cas(à trouver sur internet)

### Exercice 10
Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
Votre programme devra produire la sortie suivante à l'écran :

> Tables de multiplication
>
>Table de 2 :
> 
>1 * 2 = 2
> 
>...
> 
>10 * 2 = 20
> 
>...
> 
>Table de 5 :
> 
>1 * 5 = 5
> 
>2 * 5 = 10
> 
>... ...
> 
>Table de 10 :
> 
>1 * 10 = 10…

### Exercice 11
Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:

#### Ex:

> Nombre : 3
>
> Factorielle de 3 : 3x2x1 = 6

[Regle de calcul de factorielle](http://villemin.gerard.free.fr/Denombre/Factorie.htm)

### Exercice 11 bis
Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.

### Exercice 12
Ecrire un programme Javascript qui permet à l'utilisateur de définir une adresse email et un mot de passe.

Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:

Si l'email et le mot de passe ne correspondent pas aux valeurs définies, le message "Identifiants incorrect devra s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.

Sinon, le message "Bienvenu dans votre espace client" devra s'afficher.

### Exercice 13
A l'exercice précédent, s'ajoute un nouveau requirement:

Le nombre de fois que l'utilisateur peut saisir des mauvais identifiants est limité à 5, ensuite le programme va s'arrêter avec un message disant.

"Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué".



Il faut dire à au user le nombre de tentatives restants

### Exercice 14
À l'exercice précédent :

Ajouter une validation de type de donnees pour que le code PIN saisi ne soit compose que des chiffres

### Exercice 15
Ecrire un programme Java qui permet à l'utilisateur de déclarer 3 tableaux d'entiers.
Ces tableaux ne doivent pas forcément avoir la même taille
Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN] et la somme de tous les éléments multiples 3 dans les 3 tableaux.
#### Ex :
>T1 : [ 2, 6, 8, 15,39,11 ]
> 
>T2 : [ 21, 33, 12, 19,0 ]
> 
>T3 : [ 17, 18, 46 ]
> 
>S = 6+15+39+21+33+12+18 = 144

### Exercice 16
Ecrire un programme Java qui demande à l'utilisateur de remplir un tableau d'entiers à partir du clavier.
Puis le programme devra lui demander d'entrer un nombre à rechercher dans le tableau.
Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu'ils se retrouve dans le tableau
Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau
#### Ex :
> Tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
> 
> ->Entrer un nombre à rechercher : 6
> 
> ->6 existe et se retrouve 3 fois dans le tableau
### Exercice 17
Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, retourne la chaine inverse.

#### Ex:

> Votre chaine : mamy
> 
> Résultat : ymam

### Exercice 18.
Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit, renseigne si celui est un palindrome(mot qui se lit de la même dans les 2 sens).

#### Ex :

>Entrez un text : non

>Résultat : non est un palindrome


>Entrez un text : oui

>Résultat : oui n'est pas un palindrome

[C'est quoi un palindrome?](https://www.larousse.fr/dictionnaires/francais/palindrome/57418)

### Exercice 19
Ecrire un programme java qui demande à l'utilisateur de remplir une matrice carré 4 x 4 et qui ensuite va calculer la somme des elements de la diagonale

### Exercice 20.
A partir du TP précédent, ajouter le calcul de la somme de 2 diagonales

### Exercice 21.

Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de programmations à partir du clavier.

Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages qu'il souhaite retirer de liste.

Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant et après la suppression.

### Exercice 22
Ecrire un programme Java qui remplit un tableau avec une liste des adresse email : christian.lisangola@gmail.com, jean.paul@gmail.com, alain@gmail.com, lydie@yahoo.fr, josephine.lajoie@yahoo.com, luise@hotmail.fr, philemon.turion@gmail.com, jules.cesar@hotmail.fr

Ensuite le programme va afficher en % le taux d'adresse gmail, yahoo et hotmail.

Essayer de le résoudre au plus, et essayer approche basé sur le [HMap](https://www.youtube.com/watch?v=FhNJ6aikTVI).

### Exercice 24
Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite retourne un booléen(true/false) selon que le 2ème string est le préfixe du premier ou pas.

#### Ex :

``` Java
isPrefix("banner", "bang")
> false
```
``` Java
isPrefix("hugging", "hug")
> true
```

## POOO (Programmation orienté objet)

### Exercice 1
Ecrire une classe Personne qui est décrit par les données suivantes:
`firstName`

`lastName`

`pays`

`married(booléen)`

`nombreEnfants`

On doit avoir une méthode qui retourne un `String` `nomComplet`

Dans le `main`, vous devez à partir du clavier demander à l'utilisateur de fournir toutes ces données et enfin les afficher dans `main`.

### Exercice 3
Même exercice, mais en utilisant des getters, des setters et un constructeur.

### Exercice 3
Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,et de calculer leur « Indice de Masse Corporelle» (IMC).
- crée un patient,
- affiche les données du patient ainsi que son IMC.
- Avoir la possibilité de connaître la taille du patient, son poids

Pour calculer l’IMC [veuillez lire ceci](https://www.santemagazine.fr/minceur/imc-indice-de-masse-corporelle-267579)
### Exercice 4

#### Objectif:
- Créer une classe abstraite.
- Dériver une classe abstraite.
- Implémenter une méthode abstraite.
#### Énoncé :
Un parc auto se compose des voitures et des camions qui ont des caractéristiques communes regroupées dans la classe `Véhicule`.
Chaque véhicule est caractérisé par son matricule, l’année de son modèle, son prix.
Lors de la création d’un véhicule, son matricule est incrémenté selon le nombre de véhicules créés.
Tous les attributs de la classe véhicule sont supposés privés. ce qui oblige la création des accesseurs (get…) et des mutateurs (set….) ou les propriétés.
La classe `Véhicule` possède également deux méthodes abstraites `démarrer()` et `accélérer()` qui seront définies dans les classes dérivées et qui affichent des messages personnalisés.
La méthode `ToString()` de la classe `Véhicule` retourne une chaîne de caractères qui contient les valeurs du matricule, de l’année du modèle et du prix.
Les classes `Voiture` et `Camion` étendent la classe `Véhicule` en définissant concrètement les méthodes `accélérer()` et `démarrer()` en affichant des messages personnalisés.
#### Travail à faire :
- Créer la classe abstraite Véhicule`.
- Créer les classes `Camion` et `Voiture`.
- Créer une classe `Test`  qui permet de tester la classe `Voiture` et la classe `Camion`.

## TPs de validation des aquis : JAVA & POO

### TP 1

Écrire un programme Java permet de déclarer un tableau d'entiers en
Java, et qui ensuite va afficher le plus grand nombre, sa position; le
plus petit nombre, et sa position.

Dans l'affichage, il faut afficher le tableau en format \[element1,
element2,\...,elementN\], et dans l'affiche du plus grand nombre faire
afficher le text(PG) et pour le plus petit(PP):

#### Ex :

> Tb : [ 12,3,5,6,-3 ]
>
> **Résultat**:
> Tb : [12 **(PG)** , 3, 5, 6, -3 **(PP)**]
>
>Plus grand : 12
>
>Plus petit : -3

### TP2

Écrire un programme Java demande à l'utilisateur de saisir un nombre, et
qui ensuite affiche le nombre inverse.

#### Ex :

>Votre nombre : 17
>
> **Résultat** : 71

>Votre nombre : -89

> **Résultat** : -98
>
> Votre nombre : -20
>
> **Résultat** : -2(Car le zéro devant un nombre n'est pas pris en compte)

### TP 3

Ecrire un programme Java demande à l'utilisateur de saisir 2 chaines de
caractères et qui ensuite renseigne si ce sont des anagrammes.

### Qu'est-ce qu'une anagramme ?

Une anagramme est un mot ou un groupe de mots obtenu en changeant de
place les lettres d'un autre mot ou groupe de mots.

Par exemple, `GARE` est une anagramme de `RAGE`, ou `GARE
MAMAN` est une anagramme de `ANAGRAMME`.

### TP 4

Écrire un programme Java qui demande à l'utilisateur de saisir une
chaîne de caractères et va mettre en majuscule toutes les premières
lettres de chaque mot.

#### Ex :

> **Input** : je suis dans la joie
>
> **Résultat** : Je Suis Dans La Joie

### TP 5

Écrire un programme Java qui demande à l'utilisateur d'entrer une phase
à partir du clavier.

Ensuite, le programme va retirer tous les doublons de la phase, puis à
la fin le programme va afficher:

- La chaîne de départ fournie par l'utilisateur

- La chaîne après suppression des doublons

- Une liste contenant tous les doublons et le nombre de fois que
  ceux-ci figuraient dans l'ancienne chaîne

Après essayer le même exercice en supprimant les mots qui se répètent.

### TP 6

Écrire une méthode Java qui prend en paramètre un tableau 2D, et un
nombre.

La méthode devrait nous retourner la valeur correspond au nombre de fois
que ce nombre se trouve dans le tableau et ses différentes positions.

#### Ex :
```java
maMethode({

{1, 4, 2, 1},

{6, 3, 8, 9},

{1, 5, 1, 0}

},1)
```
> \> 1 se retrouve 4 fois dans les emplacements suivants :
(0,0),(0,3),(2,0),(2,2)

### TP 7

Écrire une méthode Java qui prend en paramètre un tableau de caractères.

Et qui va ensuite retourner un nouveau tableau avec une alternance entre
les lettres en Maj et Min.

Ex :
```java
maMethode({'a', 'b', 'c', 'd', 'e'})
\> {'a', 'B', 'c', 'D', 'e'}
```

### TP 8

On vous donne comme argument un tableau contenant des chaînes de
directions (haut, bas, gauche, droite). Imaginez une personne debout sur
une grille au point 0, 0. Pour chaque direction dans le tableau de
chaînes, déplacez votre personne dans cette direction sur la grille.
Retournez le point final X,Y où se trouve la personne sous la forme
d'un tableau de deux entiers.

#### Exigences

- Doit retourner un tableau de deux entiers

**Exemple:**
```java
maMethode({"haut", "haut", "bas", "gauche", "gauche",
"droite", "haut"])

\> {-1, 2}
```
### TP 9

Recherche de caractères identiques dans une rangée

On vous donne une chaîne de caractères d'un seul mot comme argument.
Vous retournerez `true` si elle contient deux caractères identiques dans
une rangée,c'est-à-dire qui se suivent, sinon elle retournera `false`.

#### Exigences

- Doit retourner `true` ou `false`
- Doit également fonctionner avec les caractères spéciaux

#### Exemple n° 1
```java
maMethode("terrific")

\> true
```

#### Exemple n°2
```java
maMethode("chats")

\> false
```
#### Exemple n°3
```java
maMethode("chats !!")

\> true
```

### TP 10

Le but de cet exercice est de simuler une tirelire dans laquelle on
stocke et retire de l'argent et que l'on souhaite utiliser pour payer un
certain budget (de vacances,par exemple).

Voici les détails de l'exercice :

Les traitements qui lui sont spécifiques sont :

- une méthode `getMontant` retournant le montant de la tirelire;

- une méthode `afficher` affichant les données de la tirelire sous
  le format suivant :
    * *Vous êtes sans le sou.*,si la tirelire ne contient pas d'argent

    * *Vous avez : \<montant\> € dans votre tirelire.*

-   une méthode `secouer` affichant sur le terminal le message *Bing
    bing*,suivi d'un saut de ligne, dans le cas où la tirelire contient
    de l'argent, et qui n'affiche rien sinon;

-   la méthode `remplir` mettant un montant donné en paramètre
    (`double`) dans la tirelire. Seuls les montant positifs seront
    acceptés (dans le cas contraire on ne fait rien);

-   une méthode `vider` (réinitialisant le montant de la tirelire à
    zéro);

-   une méthode `puiser` permettant de puiser dans la tirelire un
    montant donné en paramètre. Si le montant est négatif il sera
    ignoré. Si le montant en argument est plus grand que le montant
    disponible, la tirelire est alors vidée. La méthode puiser ne
    retourne rien.


-   une méthode `calculerSolde` qui retourne la différence entre le
    montant de la tirelire et le budget que l'on souhaite dépenser (un
    `double`). Si le budget est négatif (ou nul), la méthode
    `calculerSolde` doit retourner le montant de la tirelire.

**Ces méthodes feront partie de l'interface d'utilisation de la
classe**.

#### Exemple d'exécution

> Vous êtes sans le sou.
>
> Vous êtes sans le sou.
>
> Bing bing
>
> Vous avez : 550.0 euros dans votre tirelire.
>
> Vous avez : 535.0 euros dans votre tirelire.
>
> Donnez le budget de vos vacances : 450
>
> Vous êtes assez riche pour partir en vacances ! il vous restera 85.0
euros à la rentrée

ou

> Vous etes sans le sou.
>
> Vous êtes sans le sou.

> Bing bing
>
> Vous avez : 550.0 euros dans votre tirelire.
>
> Vous avez : 535.0 euros dans votre tirelire.
>
> Donnez le budget de vos vacances : 1250.0
>
> Il vous manque 715.0 euros pour partir en vacances !

**TP 11**

Le but de cet exercice est de simuler de façon très basique la gestion
d'une bibliothèque. La bibliothèque contient des exemplaires d'œuvres
écrites par des auteurs.

Il s'agira de modéliser chacun de ces éléments dans votre programme.

Le code à fournir doit pouvoir **créer des auteurs**, **des œuvres de
ces auteurs**, **stocke dans la bibliothèque des exemplaires de ces
œuvres**, puis :

- liste tous les exemplaires de la bibliothèque ;

- liste tous les exemplaires écrits en anglais ;

- affiche le nom de tous les auteurs à succès ayant écrit une œuvre
  dont la bibliothèque stocke un exemplaire ;

- et affiche le nombre d'exemplaires d'une œuvre donnée ;

Les définitions des classes `Auteur`, `Oeuvre`, `Exemplaire` et `Bibliothèque`,
décrites ci-dessous, devront être fournies.

#### La classe `Auteur`

Un auteur est caractérisé par **son nom (une `String`)** ainsi

qu'une **indication permettant de savoir s'il a été primé**.

Les méthodes qui sont spécifiques à cette classe et font partie de son
interface d'utilisation sont :

-   des **constructeurs** conformes à la méthode main fournie, avec
    l'ordre suivant pour les paramètres : le nom et l'indication
    permettant de savoir si l'auteur a été primé ;


-   une méthode `getNom` retournant le nom de l'auteur ;

-   une méthode `getPrix` retournant true si l'auteur a été primé.

#### La classe `Oeuvre`

Une `Oeuvre` est caractérisée **par son titre (de type `String`)**,

**(une référence constante à) l'auteur qui l'a rédigée** et la
**langue** dans laquelle elle a été rédigée (de type `String`).

Les méthodes qui sont spécifiques à cette classe et font partie de son
interface d'utilisation sont :

-   des **constructeurs** conformes à la méthode main fournie, avec
    l'ordre suivant pour les paramètres : le titre, l'auteur et la
    langue. Si la langue n'est pas fournie elle vaudra par défaut
    "francais" ;

-   une méthode `getTitre` retournant le titre de l'œuvre ;

-   une méthode `getAuteur` retournant l'auteur (il est toléré ici de
    retourner directement la référence à l'auteur) ;

-   une méthode `getLangue` retournant la langue de l'œuvre ;

-   et une méthode `afficher` affichant les caractéristiques de
    l'œuvre en respectant strictement le format suivant : \<titre\>,
    \<nom de l'auteur\>, en \<langue\> où \<titre\> est à remplacer
    par le titre de l'œuvre, \<nom de l'auteur\>, par le nom de son
    auteur et \<langue\> par sa langue ;

#### La classe `Exemplaire`

La classe `Exemplaire` modélise un exemplaire d'une œuvre. Une
instance de cette classe est caractérisée par (une référence à) l'œuvre
dont elle constitue un exemplaire.

Les méthodes spécifiques à la classe `Exemplaire` et qui doivent faire
partie de son interface d'utilisation sont :

-   un **constructeur** prenant en argument une référence à une œuvre et
    affichant un message respectant strictement le format suivant :
    Nouvel exemplaire -\> \<titre\>, \<nom de l'auteur\>, en
    \<langue\> suivi d'un saut de ligne ;

-   un **constructeur** de copie affichant un message respectant
    strictement le format suivant : Copie d'un exemplaire de -\>
    \<titre\>, \<nom de l'auteur\>, en \<langue\> suivi d'un saut de
    ligne ;

-   une méthode `getOeuvre` retournant l'œuvre ;

-   et une méthode `afficher` affichant une description de
    l'exemplaire respectant strictement le format suivant :Un
    exemplaire de \<titre\>, \<nom de l'auteur\>, en \<langue\>sans
    saut de ligne. La méthode d'affichage de la classe Oeuvre sera
    utilisée pour réaliser cet affichage.

#### La classe `Bibliotheque`

Une bibliothèque est caractérisée par un nom et contient une liste
d'exemplaires.

La liste des exemplaires sera modélisée au moyen d'un tableau dynamique
(`ArrayList`). Cet attribut devra obligatoirement s'appeler `exemplaires`.

Les méthodes spécifiques à la classe `Bibliotheque` et qui font partie de
son interface d'utilisation sont :

-   un **constructeur** conforme à la méthode main fournie et affichant
    le message :\
    La bibliothèque \<nom\> est ouverte ! suivi d'un saut de ligne, où
    \<nom\> est à remplacer par le nom de la bibliothèque ;

-   une méthode `getNom` retournant le nom de la bibliothèque ;

-   une méthode `getNbExemplaires` retournant le nombre d'exemplaires
    contenus dans la liste ;

-   une méthode `stocker` permettant d'ajouter un ou plusieurs
    exemplaires d'une œuvre dans la bibliothèque ; elle doit être
    conforme au `main` fourni, avec l'ordre suivant des paramètres : la
    référence à une œuvre et le nombre n d'exemplaires à ajouter ;
    cette méthode va ajouter à la liste d'exemplaires de la
    bibliothèque n exemplaires de l'œuvre fournie, qu'il s'agit de
    construire. Si le nombre d'exemplaires n'est pas fourni, cela
    signifie que sa valeur par défaut est 1. **Attention, les
    exemplaires devront impérativement être ajoutés à la fin du
    tableau dynamique (méthode `add` des `ArrayList`)** ;

-   une méthode `listerExemplaires` retournant dans un `ArrayList` tous
    les exemplaires d'une œuvre écrite dans une langue donnée ; si
    aucune langue n'est donnée (chaîne vide), tous les exemplaires de
    la bibliothèque seront retournés ; Une méthode utilitaire est
    fournie qui permet ensuite d'afficher le contenu du tableau
    dynamique retourné par `listerExemplaires` (voir l'exemple de
    déroulement fourni plus bas) ;

-   une méthode `compterExemplaires` retournant le nombre
    d'exemplaires d'une œuvre donnée passée en paramètre ;

-   une méthode `afficherAuteur` avec un paramètre de type booléen ou
    sans paramètre, qui affiche les noms des auteurs dont un
    exemplaire est stocké dans la bibliothèque. Si le booléen est
    fourni et qu'il vaut `true`, seuls s'afficheront les noms des
    auteurs avec un prix ; s'il vaut `false` seuls les auteurs sans prix
    s'afficheront. Si le booléen n'est pas fourni, la méthode
    n'affichera que les noms des auteurs à prix. Les noms apparaissent
    autant de fois qu'il y a d'exemplaires d'œuvres écrites par
    l'auteur. Un saut de ligne sera fait après l'affichage de chaque
    nom ;

#### Exemple d'exécution

> La bibliotheque municipale est ouverte !
>
> Nouvel exemplaire -\> Les Miserables, Victor Hugo, en francais
>
> Nouvel exemplaire -\> Les Miserables, Victor Hugo, en francais
>
> Nouvel exemplaire -\> L'Homme qui rit, Victor Hugo, en francais
>
> Nouvel exemplaire -\> Le Comte de Monte-Cristo, Alexandre Dumas, en
francais
>
> Nouvel exemplaire -\> Le Comte de Monte-Cristo, Alexandre Dumas, en
francais
>
> Nouvel exemplaire -\> Le Comte de Monte-Cristo, Alexandre Dumas, en
francais
>
> Nouvel exemplaire -\> Zazie dans le metro, Raymond Queneau, en francais
>
> Nouvel exemplaire -\> The count of Monte-Cristo, Alexandre Dumas, en
anglais
>
> La bibliotheque municipale offre
>
> Un exemplaire de Les Miserables, Victor Hugo, en francais
>
> Un exemplaire de Les Miserables, Victor Hugo, en francais
>
> Un exemplaire de L'Homme qui rit, Victor Hugo, en francais
>
> Un exemplaire de Le Comte de Monte-Cristo, Alexandre Dumas, en francais
>
> Un exemplaire de Le Comte de Monte-Cristo, Alexandre Dumas, en francais
>
>Un exemplaire de Le Comte de Monte-Cristo, Alexandre Dumas, en francais
>
> Un exemplaire de Zazie dans le metro, Raymond Queneau, en francais
>
> Un exemplaire de The count of Monte-Cristo, Alexandre Dumas, en anglais
>
> Les exemplaires en anglais sont
>
> Un exemplaire de The count of Monte-Cristo, Alexandre Dumas, en anglais
>
> Les auteurs a succes sont
>
> Raymond Queneau

> Il y a 3 exemplaires de Le Comte de Monte-Cristo

### TP 12

Pour ce TP, vous devez faire des recherches sur les [constructeurs de
copie](https://waytolearnx.com/2020/03/constructeur-de-copie-en-java.html#:~:text=Comme%20C%2B%2B%2C%20Java,n'%C3%A9crivez%20pas%20le%20v%C3%B4tre.)
:

Le votre va beaucoup ressembler à celui-ci
```
Public VotreConstructeur(Souris s){
    this.attribut1 = s.attribut1;
    this.attribut2 = s.attribut2;
...
}
```

Le but de cet exercice est de créer des « souris » par différents biais
et de les faire « évoluer » au cours du temps.

Le corps de la classe `Souris` manque et c'est ce qu'il vous est
demandé d'écrire.

Une souris est caractérisée par **son poids en grammes (un `int`)**, **sa
couleur (une `String`)**, **son âge en mois (un `int`)**, son **espérance de
vie (un `int`)** et **une indication sur le fait qu'elle soit clonée ou
pas (un booléen)**.

Ces attributs seront nommés respectivement : `poids`, `age`,
`couleur`, `esperanceVie` et `clonee`.

Par ailleurs, les méthodes publiques de la **classe `Souris`** sont :

- des **constructeurs** conformes à la méthode `main` fournie, avec
  l'ordre suivant pour les paramètres : **le poids**, **la
  couleur**, **l'âge** et **l'espérance de vie**. Ces deux derniers
  paramètres ont pour valeur par défaut `0` et 36 respectivement.
  La valeur `36` est stockée dans une constante fournie que vous
  utiliserez en écrivant `ESPERANCE_VIE_DEFAUT`. Les
  constructeurs afficheront le message *Une nouvelle souris !* ;

- un **constructeur de copie** qui doit afficher le message *Clonage*
  d'une souris ! ;\
  une souris clonée a les mêmes caractéristiques que la souris
  d'origine, sauf son espérance de vie qui est moindre : les **4
  cinquième de celle de la souris d'origine** ;

- une méthode `toString()` produisant une représentation d'une
  `Souris` respectant strictement le format suivant :
  >Une souris
  \<couleur\>\[, clonée,\] de \<age\> mois et pesant \<poids\>
  grammes

  (sur une seule ligne) où \<age\> est à remplacer par l'âge
  de la souris et \<poids\> par son poids. Le bout de phrase « ,
  clonée, » ne sera affiché que si la souris a été clonée ;

- une méthode `vieillir` qui augmentera d'une unité l'âge de la
  souris. **Si la souris est clonée, elle doit devenir verte si elle
  atteint un âge supérieur à la moitié de son espérance de vie** ;
  **même si elle n'est pas appelée explicitement dans la méthode
  `main()`**, cette méthode doit être publique ; elle sera testée ;

- et une méthode `évolue` faisant vieillir la souris depuis son âge
  courant jusqu'à son espérance de vie.

Tous les affichages demandés se feront sur le terminal et seront
terminés par un saut de ligne.

#### Exemple d'exécution

>Une nouvelle souris !
>
>Une nouvelle souris !
>
>Clonage d'une souris !
>
>Une souris blanche de 2 mois et pesant 50 grammes
>
>Une souris grise de 0 mois et pesant 45 grammes
>
>Une souris grise, clonée, de 0 mois et pesant 45 grammes
>
>Une souris blanche de 36 mois et pesant 50 grammes
>
>Une souris grise de 36 mois et pesant 45 grammes
>
>Une souris verte, clonée, de 28 mois et pesant 45 grammes
