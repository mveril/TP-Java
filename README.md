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

