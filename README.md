# TP algoritmique Java
Ce TP à été effectué dans le cadre
de la formation M2I Java Sopra Steria
## Ex 1
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
### Pseudo code
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

## Ex 2
>Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
>
>Surface = Rayon x Rayon x PI;
Rayon = Diamètre / 2
### Pseudo code
```
 Rayon=Diamètre/2
 Surface = rayon*rayon*PI
```

## Ex 3
>Ecrire un programme Java qui demande à l'utilisateur de saisir son nom, prenom et age, et qui ensuite va afficher le message : "Vous vous appelez &lt;prenom&gt; &lt;nom&gt;, et vous avez &lt;age&gt; ans"
### Pseudo code
```
Afficher Format("Vous vous appelez %s %s, et vous avez %s ans", prenom, nom, age")
```

## Ex 4
> Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
> Exemple :
> Entrez la première valeur(a) : 51
> Entrez la deuxième valeur(b) : 876
> Entrez la troisième valeur(c) : 235
> Les valeurs entrées sont : a = 51, b = 876 et c = 235
> Permutation: b <== a, c <== b, a <== c
> Les valeurs permutées sont : a = 235, b = 51 et c = 876

### Pseudo code
```
d=c
c=b
b=a
a=d
Afficher "a=",a
Afficher "b=",b
Afficher "c=",c
```

## Ex 5

> Ecrivez un programme Age.java qui :
> declare l'âge de l'utilisateur ;
> lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
> Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
> affiche l'année de naissance ainsi calculée.
>
> Exemple d'exécution du programme:
> age = 30
> Votre année de naissance est : 1992
### Pseudo code
```
anneeDeNaissance=annee-age
Afficher "Votre année de naissance est : ", anneeDeNaissance 
```

# Exercice 7
Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
Exemple d'exécution:
Entrez un nombre entier: 5
Le nombre est positif et impair
Entrez un nombre entier: -4
Le nombre est négatif et pair
Entrez un nombre entier: 0

# Exercice 8
Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
[Principe du fonctionnement d'une équation du 2nd degré](https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf)


Exercice 9
Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.

# Exercice 9
Mois : 4
Résult : Avril

Pour cet exercices, vous devez aussi présenter une version qui utilise le sélecteur de cas(à trouver sur internet)

# Exercice 10
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

# Exercice 11
Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre et qui ensuite va calculer et afficher la factorielle de ce nombre:

## Ex:

Nombre : 3

Factorielle de 3 : 3x2x1 = 6

[Regle de calcul de factorielle](http://villemin.gerard.free.fr/Denombre/Factorie.htm)

# Exercice 11 bis
Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants. Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.

# Exercice 12
Ecrire un programme Javascript qui permet à l'utilisateur de définir une adresse email et un mot de passe.

Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:

Si l'email et le mot de passe ne correspondent pas aux valeurs définies, le message "Identifiants incorrect devra s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.

Sinon, le message "Bienvenu dans votre espace client" devra s'afficher.

# Exercice 13
A l'exercice précédent, s'ajoute un nouveau requirement:

Le nombre de fois que l'utilisateur peut saisir des mauvais identifiants est limité à 5, ensuite le programme va s'arrêter avec un message disant.

"Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué".



Il faut dire à au user le nombre de tentatives restants

# Exercice 14
À l'exercice précédent :

Ajouter une validation de type de donnees pour que le code PIN saisi ne soit compose que des chiffres

# Exercice 15
Ecrire un programme Java qui permet à l'utilisateur de déclarer 3 tableaux d'entiers.
Ces tableaux ne doivent pas forcément avoir la même taille
Le programme doit ensuite fournir afficher les 3 tableaux en format [element1, element2,...,elementN] et la somme de tous les éléments multiples 3 dans les 3 tableaux.
## Ex :
>T1 : [ 2, 6, 8, 15,39,11 ]
> 
>T2 : [ 21, 33, 12, 19,0 ]
> 
>T3 : [ 17, 18, 46 ]
> 
>S = 6+15+39+21+33+12+18 = 144

## Exercice 16
Ecrire un programme Java qui demande à l'utilisateur de remplir un tableau d'entiers à partir du clavier.
Puis le programme devra lui demander d'entrer un nombre à rechercher dans le tableau.
Si nombre existe, le programme lui dira que le nombre existe et le nombre de fois qu'ils se retrouve dans le tableau
Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau
## Ex :
> Tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
> 
> ->Entrer un nombre à rechercher : 6
> 
> ->6 existe et se retrouve 3 fois dans le tableau