J'utilise un arbre abstrait maison ayant pour racine un racineSVGNode.
Dans mon langage la racine est mise en place dans le "Contexte" par la premiere phrase
set frame [width height]
tout les noeuds SVG sont ensuite ses enfants, on peut cependant creer des
ConteneurSVGNode avec la syntaxe suivante, ce conteneur devient le noeud Parent jusqu'a ce qu'il soit ferm�.

container [id] [stroke-color] [stroke-width] " [transform] " [
	rectangle myRectangle 10 15 60 60
]  

je n'ai pas laiss� la possibilit� dans la grammaire � d'autres noeuds d'�tre des noeuds parents
mais mon API le permet.

une fois que le fichier d'entr�e est pass� par le jflex/jcup l'arbre de SVGNode est construit,
l'arbre de ENode ayant deja �t� r�solu � la vol�e (pour g�rer les expressions), les valeurs r�sultats
sont r�cup�r�es dans les SVGNode concern�s.

pour les variables j'ai une map dans le "Contexte"
la factory m'aide � mettre en m�moire les noeuds en cachant un peu la complexit� (pas assez � mon gout)
Enfin j'utilise un pattern visiteur alli� � un printwriter pour g�n�rer le fichier SVG � partir
de l'arbre abstrait en m�moire.

Dans la grammaire j'ai rajout� quelques artifices du type
 myWords |ID
 		 |WORD
 		 |Expression
pour ajouter un peu de souplesse � l'utilisation mais �a alourdit quelque peu la grammaire

mon langage ne permet certainement pas d'utiliser toutes les primitives de SVG,
et encore moins les tous les champs de chaques primitives.
le mieu c'est de regarder la grammaire et les exemples pour savoir comment l'utiliser 
et ce qu'il peut faire.

je suis conscient que le langage se rapproche trop du fait de coder du svg � la main
mais je m'en suis rendu compte trop tard
