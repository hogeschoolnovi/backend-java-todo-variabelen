#TODO Applicatie**

## **Inleiding**  
In deze les hebben we gewerkt met variabelen, arrays, ArrayLists en de Scanner.  
Met deze bouwblokken kan een eenvoudige applicatie worden gemaakt die informatie opslaat en terughaalt van de gebruiker.  

In deze opdracht wordt een TODO-applicatie maken. 
Dit is een handige tool om te hebben aan het begin van je studie, omdat je zo kunt bijhouden wat je allemaal nog wilt leren. 

## **Opdrachtbeschrijving**  
De applicatie is een TODO-lijst waarin de gebruiker:  
- Een nieuwe TODO kan toevoegen.  
- Een datum en beschrijving voor de TODO invult.  
- Een specifieke TODO kan opvragen op basis van een nummer.  

Voorbeeld van de werking van de applicatie:  
```
Wil je nog een todo toevoegen?
Kies 1 voor nee, kies iets anders voor ja
2
Voeg een TODO toe
Geef de datum: 2024-06-12
Geef de inhoud: Boodschappen doen

Welke TODO wil je zien?
Kies een nummer: 1

TODO 1:
Datum: 2024-06-12
Inhoud: Boodschappen doen
```

## **Randvoorwaarden**  
De oplossing moet voldoen aan de volgende eisen:  
- Gebruik alleen Scanner, variabelen, arrays en ArrayLists.  
- Opslag en ophalen van TODO’s gebeurt via een ArrayList.  
- Een TODO wordt weergegeven op basis van een door de gebruiker ingevoerd nummer.  
- De structuur en logica staat in een main methode in een Main class.  

## **Stappenplan**  
1. Maak een Scanner-object om invoer van de gebruiker te verwerken (_tip: noem deze "scanner"_).  
2. Maak een ArrayList om de TODO’s in op te slaan.  
3. Vraag de gebruiker (met behulpt van de scanner) of hij een TODO wil toevoegen.  
4. Vraag om input voor een datum en beschrijving en sla deze op in een String-array.  
5. Voeg de array toe aan de ArrayList.  
6. Vraag de gebruiker welk TODO-nummer hij wil bekijken en haal dit op zonder loop. (_Let hier bij op waar je begint met tellen_)  
7. Druk de gevraagde TODO af in het volgende formaat:  
   ```
   TODO 1:
   Datum: 2025-03-07
   Inhoud: Boodschappen doen
   ```
8. Sluit de Scanner af.  

## **Bonusopdracht**  
Als de basisopdracht is afgerond, kun je proberen om een van de volgende (uitdagende) bonussen te implementeren:  
1. Laat de gebruiker een specifieke TODO verwijderen.
2. Sla TODO’s op in een bestand (`todos.txt`), zodat ze blijven bestaan na het afsluiten van de applicatie.  
Hiervoor zul je gebruik moeten maken van een "FileWriter". Probeer hier een oplossing voor te vinden op het internet.
3. Toon alle TODO’s.  
Hiervoor zul je gebruik moeten maken van een for-loop. Dit behandelen we in een latere les.
