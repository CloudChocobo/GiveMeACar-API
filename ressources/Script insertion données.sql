INSERT INTO `adresse` (`id`, `rue`, `code_postal`, `ville`) VALUES
(1, '3 rue de la paix', '44000', 'Paris'),
(2, '67 rue du Marché', '44000', 'Nantes'),
(4, '67 rue du Marché', '44000', 'Nantes'),
(6, '55 rue du Marc', '44000', 'Nantes'),
(7, '55 rue du Marc', '44000', 'Nantes'),
(9, '67 rue du Marché', '44000', 'Nantes'),
(10, '3 rue boileau', '44000', 'Nantes'),
(12, 'rue des petits pois', '44100', 'Nantes'),
(13, '55 rue du Marc', '44000', 'Nantes'),
(14, 'rue des patates', '44000', 'Nantes');

INSERT INTO `agence` (`id`, `nom`, `adresse_id`) VALUES
(1, 'agence de paris', 1),
(2, 'agence de paris', 10);

INSERT INTO `client` (`id`, `nom`, `numero_compte`, `adresse_mail`, `numero_telephone`, `adresse_id`, `user_id`) VALUES
(1, 'Jean-Pierre Foucault', 423438189, 'jpfoucault@gmail.com', 423438189, 2, 1),
(2, 'Mike Biolo', 45708, 'poissonpasnez@frais.com', 423438189, 6, 1),
(3, 'Mike Biolo', 45708, 'poissonpasnez@frais.com', 423438189, 7, 1),
(5, 'Mike Biolo', 45708, 'poissonpasnez@frais.com', 423438189, 13, 1);

INSERT INTO `location` (`id`, `date_debut`, `fin_estimee`, `fin_reelle`, `voiture_id`, `client_id`) VALUES
(1, '2020-12-17T14:43:11.506Z', '2020-12-17T16:43:11.506Z', '2020-12-17T14:43:11.506Z', 2, 1),
(2, '2020-12-17T14:43:11.506Z', '2020-12-17T16:43:11.506Z', '2020-12-17T14:43:11.506Z', 2, 1),
(3, '2020-12-17T14:43:11.506Z', '2020-12-17T16:43:11.506Z', '2020-12-17T14:43:11.506Z', 2, 1),
(4, '2020-12-17T14:43:11.506Z', '2020-12-17T16:43:11.506Z', '2020-12-17T14:43:11.506Z', 2, 1),
(5, '2020-12-17T14:43:11.506Z', '2020-12-17T16:43:11.506Z', '2020-12-17T14:43:11.506Z', 2, 1),
(6, '2020-12-17T14:43:11.506Z', '2020-12-17T16:43:11.506Z', '2020-12-17T14:43:11.506Z', 2, 1),
(7, '2020-12-17T14:43:11.506Z', '2020-12-17T16:43:11.506Z', '2020-12-17T14:43:11.506Z', 2, 1);

INSERT INTO `role` (`id`, `nom`) VALUES
(1, 'user');

INSERT INTO `user` (`id`, `role_id`) VALUES
(1, 1),
(2, 1);

INSERT INTO `voiture` (`id`, `image`, `marque`, `modele`, `puissance_fiscale`, `boite_vitesse`, `nombre_places`, `carburant`, `immatriculation`, `statut`, `agence_id`) VALUES
(1, '', 'renault', 'C4', '150CV', 0, 2000, 'chocolat', 'JPfoucault@gmail.com', 'mariée', 1),
(2, '', 'Citroën', 'C4', '170CV', 0, 5, 'essance', '2C-345-PA', 'louée', 1),
(3, '', 'Panzani', 'Nouilles Fines', 'Al Dente', 0, 0, 'Eau bouillante', 'Ma que 🤏', 'cuites', 1),
(4, '', 'Renault', 'Twingo', '60CV', 1, 4, 'essance', '345GHT44', 'libre', 1),
(5, '', 'Renault', '4l', '10CV', 1, 5, 'essance', '2C-345-PA', 'louée', 1),
(6, '', 'Peugeot', '208', '170CV', 0, 5, 'essance', '2C-345-PA', 'louée', 1),
(8, '', 'audi', 'C4', '170CV', 0, 5, 'essence', '2C-345-PA', 'louée', 1),
(9, '', 'bmw', 'C4', '170CV', 0, 5, 'essance', '2C-345-PA', 'louée', 1),
(10, '', 'Citroën', 'C4-casée', '170CV', 0, 5, 'diesl', 'JPP- achevez-moi', 'louée', 1);
