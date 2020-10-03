J'utilise un arbre abstrait maison ayant pour racine un racineSVGNode.
Dans mon langage la racine est mise en place dans le "Contexte" par la premiere phrase
set frame [width height]
tout les noeuds SVG sont ensuite ses enfants, on peut cependant creer des
ConteneurSVGNode avec la syntaxe suivante, ce conteneur devient le noeud Parent jusqu'a ce qu'il soit fermé.

container [id] [stroke-color] [stroke-width] " [transform] " [
	rectangle myRectangle 10 15 60 60
]  

je n'ai pas laissé la possibilité dans la grammaire à d'autres noeuds d'être des noeuds parents
mais mon API le permet.

une fois que le fichier d'entrée est passé par le jflex/jcup l'arbre de SVGNode est construit,
l'arbre de ENode ayant deja été résolu à la volée (pour gérer les expressions), les valeurs résultats
sont récupérées dans les SVGNode concernés.

pour les variables j'ai une map dans le "Contexte"
la factory m'aide à mettre en mémoire les noeuds en cachant un peu la complexité (pas assez à mon gout)
Enfin j'utilise un pattern visiteur allié à un printwriter pour générer le fichier SVG à partir
de l'arbre abstrait en mémoire.

Dans la grammaire j'ai rajouté quelques artifices du type
 myWords |ID
 		 |WORD
 		 |Expression
pour ajouter un peu de souplesse à l'utilisation mais ça alourdit quelque peu la grammaire

mon langage ne permet certainement pas d'utiliser toutes les primitives de SVG,
et encore moins les tous les champs de chaques primitives.
le mieu c'est de regarder la grammaire et les exemples pour savoir comment l'utiliser 
et ce qu'il peut faire.

je suis conscient que le langage se rapproche trop du fait de coder du svg à la main
mais je m'en suis rendu compte trop tard
