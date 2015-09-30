This code is used in the context of my software design courses at ETSMTL.ca. The design is based on the case study presented in the book [Applying UML and Patterns](http://amzn.com/0131489062) by Craig Larman.

[![](http://www.etsmtl.ca/ETS/media/Prive/logo/ETS-web-rouge-devise.jpg)](http://www.etsmtl.ca)

Ce code est utilisé dans le cadre de mes cours en conception logicielle à l'École de technologie supérieure à Montréal. La conception est basée sur l'étude de cas présentée dans le livre [UML 2 et les design patterns](http://www.amazon.ca/dp/2744070904) de Craig Larman.



Plusieurs design patterns (Strategy) sont dans cet exemple, ainsi que plusieurs technologies (Swing, Java Persistence API, Object Relational Mapping, Derby). Il respecte la séparation des couches Présentation et Domaine, selon la conception des diagrammes de séquence système (DSS).

|[![](http://www.plantuml.com/plantuml/png/TLHDZzCm4BtdLunoQHUf4NljeH9Sk6pH2i7UNMUQZjOVmHvN5CJ_8VoD_376Rj9kMRXq7C-Rv-StuyPdShqAoaBaaq7v3QGvMLCniNnlVJl-ajWcQBrLvB1QWCO8XZedeKNGtksfIq4nUGVHEuRUfm01NHiGJ4QHwkGCUowmhpYXDobJHjfbE3hu45H_UABlSbfEgmXgloTzm508uydkV5wKa_926nMZn2Nxn2Bgu2C2HeOazUVaNNMWh9U2DlWVud4mus3HSLPwPJrI_bhs3Nvhm8u37xnitC6I3CI5weYB4nDQ7D7OSq9JRiFWn1ZZEz9KjYOXQ7i-WKMxmn3FMnOpSxNu79A6HwCSVza-m0eUNcXH9zakwXHBjtOfQ_Lq5D4m_cQnl1s7FJdAY2DgK5fxewIWAXJma5ltBZ3fBEz71V0r2INnE5G_9yoJi679jOfHmW5Jm4lwKH5cbmh2Iikb_fBSgav5SYMdP0H4jQoSjuBuvysao6igynCR-DYyRsvQ6fMxtXLwJ2-kcfXaRCPXXkLkJzSluxZtmMRFfISoVjBxbVWGKwnkJQZVDirz3QiLr1AcRLZB90RiI1u5hlAXADMm-RlslcdUN6hFngtp332wj6gpgaqrKzPNv6pJMXwTry_ZC6FdH3qhAloV9Y4JDsKFDjNvkFgg_HOMHQcOCpE_Gb_wk9QdSCf8-JE0pHy0.png)](http://www.plantuml.com/plantuml/form?url=TLHDZzCm4BtdLunoQHUf4NljeH9Sk6pH2i7UNMUQZjOVmHvN5CJ_8VoD_376Rj9kMRXq7C-Rv-StuyPdShqAoaBaaq7v3QGvMLCniNnlVJl-ajWcQBrLvB1QWCO8XZedeKNGtksfIq4nUGVHEuRUfm01NHiGJ4QHwkGCUowmhpYXDobJHjfbE3hu45H_UABlSbfEgmXgloTzm508uydkV5wKa_926nMZn2Nxn2Bgu2C2HeOazUVaNNMWh9U2DlWVud4mus3HSLPwPJrI_bhs3Nvhm8u37xnitC6I3CI5weYB4nDQ7D7OSq9JRiFWn1ZZEz9KjYOXQ7i-WKMxmn3FMnOpSxNu79A6HwCSVza-m0eUNcXH9zakwXHBjtOfQ_Lq5D4m_cQnl1s7FJdAY2DgK5fxewIWAXJma5ltBZ3fBEz71V0r2INnE5G_9yoJi679jOfHmW5Jm4lwKH5cbmh2Iikb_fBSgav5SYMdP0H4jQoSjuBuvysao6igynCR-DYyRsvQ6fMxtXLwJ2-kcfXaRCPXXkLkJzSluxZtmMRFfISoVjBxbVWGKwnkJQZVDirz3QiLr1AcRLZB90RiI1u5hlAXADMm-RlslcdUN6hFngtp332wj6gpgaqrKzPNv6pJMXwTry_ZC6FdH3qhAloV9Y4JDsKFDjNvkFgg_HOMHQcOCpE_Gb_wk9QdSCf8-JE0pHy0)|[![](http://www.plantuml.com/plantuml/img/RLJBRXD14BplLxHoiIqv_e088I4ZSI5H90FtyMp7j9Z7CWyhlkKtaE0Cvi1Fx9_aIwZUtHZokFWnszDLNLMz-Ok4pYJZAPU3OtmciQLwrnGf-B-n_J6O995QfW_9IE54DJ1zub2ucRqr8UC_lTriblfjR8c9E1VYMvIYq5JAXrpwNnxb7rArTErCA1yltzCvtTzzDvdMztS_gEsFDnAaq9fiz9wrMpw460xu3V2BjP6SXTEAdlSHHpUc5l9SIc9odEdi3D0braHjfH3zlmPBiYQHPMT6f631SiyMAFMMkYYXP9fVB9fncBFJHNG4sMQscUQXVIKEL423lbQcRUp_50QO95xHUnvWEr1GtQZ_hTGmyUawfjghZ7G5iTvnK1cQ6P477aMCpo28vrhIFhgAobKpqp6VS2O9hO0B6AbB4ZBOOJukbD4AhdGEp_iZRgfr2WURxMVJYTBBq0kwX5XC4L1e5KBC3Wdn0nf8QNkqXF8DebF4IgSAd5qyi1jqsZJhyzUR2xAfFtAwYdNFpl4KcxLf0TRUttq3SKuGMi5KAahSuKRMkZ5fsrYj6-16b_GCOoI69xYqZT418GIbblRA12nt9hKlv0rvA70URWb6XIdGrCNOgV8QMiYT1Ka4WrCA1nDQcUHGTIP6ytmevfQ7YpdMpl6YqMOO8G-EPHhaWKqDqQX6XhMItep7SnjRddulmGaqfVJ71KpvP1pNDCyBXKmyv1YR10-osJ5XUiijD5hHcorsTX8GN94MbQ230nYW6vC3pgeNwaTNW-XIU6wbUWJLa9DTuF-WTAGROwlJ2tieAvG4KKT4l-cpiIpqnvLEzkhy7ADXNfkaKu0bX2x6FTUVGujUko0tCh32nZ_HjF-9KqwUXrY-59D5WovJk73e9N0QOpKH6R37hAW_kPbTJh8DPxermokl_uN4vySA_akVgkY0t1_tU0MorvNAfyrL7KBHQ8yh4WF461UaCp9M0qHVOhu_MXCaUuqTEuG9Nu-MutgwCVTnm5qyJ98mQPq4mhE0kYKE-v_rBm00.png)](http://www.plantuml.com/plantuml/form?url=RLJBRXD14BplLxHoiIqv_e088I4ZSI5H90FtyMp7j9Z7CWyhlkKtaE0Cvi1Fx9_aIwZUtHZokFWnszDLNLMz-Ok4pYJZAPU3OtmciQLwrnGf-B-n_J6O995QfW_9IE54DJ1zub2ucRqr8UC_lTriblfjR8c9E1VYMvIYq5JAXrpwNnxb7rArTErCA1yltzCvtTzzDvdMztS_gEsFDnAaq9fiz9wrMpw460xu3V2BjP6SXTEAdlSHHpUc5l9SIc9odEdi3D0braHjfH3zlmPBiYQHPMT6f631SiyMAFMMkYYXP9fVB9fncBFJHNG4sMQscUQXVIKEL423lbQcRUp_50QO95xHUnvWEr1GtQZ_hTGmyUawfjghZ7G5iTvnK1cQ6P477aMCpo28vrhIFhgAobKpqp6VS2O9hO0B6AbB4ZBOOJukbD4AhdGEp_iZRgfr2WURxMVJYTBBq0kwX5XC4L1e5KBC3Wdn0nf8QNkqXF8DebF4IgSAd5qyi1jqsZJhyzUR2xAfFtAwYdNFpl4KcxLf0TRUttq3SKuGMi5KAahSuKRMkZ5fsrYj6-16b_GCOoI69xYqZT418GIbblRA12nt9hKlv0rvA70URWb6XIdGrCNOgV8QMiYT1Ka4WrCA1nDQcUHGTIP6ytmevfQ7YpdMpl6YqMOO8G-EPHhaWKqDqQX6XhMItep7SnjRddulmGaqfVJ71KpvP1pNDCyBXKmyv1YR10-osJ5XUiijD5hHcorsTX8GN94MbQ230nYW6vC3pgeNwaTNW-XIU6wbUWJLa9DTuF-WTAGROwlJ2tieAvG4KKT4l-cpiIpqnvLEzkhy7ADXNfkaKu0bX2x6FTUVGujUko0tCh32nZ_HjF-9KqwUXrY-59D5WovJk73e9N0QOpKH6R37hAW_kPbTJh8DPxermokl_uN4vySA_akVgkY0t1_tU0MorvNAfyrL7KBHQ8yh4WF461UaCp9M0qHVOhu_MXCaUuqTEuG9Nu-MutgwCVTnm5qyJ98mQPq4mhE0kYKE-v_rBm00)|
|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|


---

Voici un exemple de l'interface rudimentaire et les sorties à la console:

![https://googledrive.com/host/0B9aAbha28QkabmhyR3Q2aGVXMUk/NextGenTraiterVente.png](https://googledrive.com/host/0B9aAbha28QkabmhyR3Q2aGVXMUk/NextGenTraiterVente.png)

```
Stratégie de tarification trouvée: core.ventes.tarification.StratégiePourcentageRemise
Pourcentage pour tarification: 90
Nouvelle vente
saisirArticle: Beurre d'arachide (@3.00(CD)), quantité = 2 [sous total: 6.00(CD)]
saisirArticle: Banane (@0.80(CD)), quantité = 1 [sous total: 6.80(CD)]
saisirArticle: Pain blé entier (@3.10(CD)), quantité = 1 [sous total: 9.90(CD)]
saisirArticle: Pomme (@1.00(CD)), quantité = 3 [sous total: 12.90(CD)]
fin de saisie d'articles
Total avant remise: 12.90(CD)
Total avec remise : 11.61(CD)
Économie de       : 1.29(CD)
```

---

<img src='http://ecx.images-amazon.com/images/I/71G5XtzzfhL._AA1500_.jpg' height='280'> <img src='http://ecx.images-amazon.com/images/I/51aikMfx9RL.jpg' height='300'>

