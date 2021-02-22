# GiveMeACar-API
API Java Spring Boot développée pour le projet GiveMeACar, dans le cadre de notre formation Simplon.

**Equipe**
- Aurélie Hubert
- Noémie Bezzaz
- Donnat Moussavou
- Joseph Allain

## Documentation

### Endpoints

Pour les objets `adresses`, `agences`, `clients`, `locations`, `roles`, `users`, `voitures`, ces endpoints fonctionnent :

- `/{typeObjet}` **GET** : retourne toutes les entrées du type {typeObjet} (voitures par exemple)

- `/{typeObjet}` **POST** : ajoute un nouvelle entrée du type {typeObjet}

- `/{typeObjet}/{id}` **GET** : retourne l'entrée {id} du type {typeObjet}

- `/{typeObjet}/{id}` **DELETE** : supprime l'entrée {id} du type {typeObjet}

*Nous avons également l'endpoint:*

- `/agences/{id}/voitures` **GET** : retourne toutes les voitures de l'agence {id}

### Modèle de données et documentation

Le modèle des données peut être retrouvé dans les documents présents dans le dossier "ressources", qui regroupe:

- Le diagramme des classes (.pdf)
- Le schéma de la base de donnée MySQL Workbench(.mwb)
- Le script de création de la BDD (.sql)
- Un script d'insertion de données