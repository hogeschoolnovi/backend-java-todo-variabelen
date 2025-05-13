# TODO Applicatie

## **Inleiding**  
In deze les hebben we gewerkt met variabelen, arrays, ArrayLists en de Scanner.  
Met deze bouwblokken kan een eenvoudige applicatie worden gemaakt die informatie opslaat en terughaalt van de gebruiker.  

In deze opdracht wordt een TODO-applicatie maken. 
Dit is een handige tool om te hebben aan het begin van je studie, omdat je zo kunt bijhouden wat je allemaal nog wilt leren. 

Main.java vind je in de `src` map

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

**Let op:**  
Om deze opdracht te maken, moet je de broncode uit deze repository kopieren (Main.java). 
Deze broncode begint met een klein stukje code dat nog niet behandeld is (while en if). 
```java
    while(true) {
            System.out.println("Wil je nog een todo toevoegen?");
            System.out.println("Kies 1 voor nee, kies iets anders voor ja");
            int startKeuze = scanner.nextInt();
            scanner.nextLine();
            if(startKeuze == 1){
                scanner.close();
                return;
            }
```
Dit stuk code hoef je niet aan te raken. 
Het nut van dit stukje code is dat de applicatie blijft runnen totdat je zegt dat het moet stoppen.
Zo wordt het dus een applicatie die je echt al kunt gebruiken. 
Hoe dit werkt, wat het betekend en hoe je dit zelf kunt doen, wordt in een latere les behandeld.

## **Randvoorwaarden**  
De oplossing moet voldoen aan de volgende eisen:  
- Gebruik alleen Scanner, variabelen, arrays en ArrayLists.  
- Opslag en ophalen van TODO’s gebeurt via een ArrayList.  
- Een TODO wordt weergegeven op basis van een door de gebruiker ingevoerd nummer.  
- De structuur en logica staat in een main methode in een Main class.  

## **Stappenplan**  
1. Maak een Scanner-object om invoer van de gebruiker te verwerken (_tip: noem deze "scanner"_).  
2. Maak een ArrayList om de TODO’s in op te slaan.  
3. Vraag de gebruiker (met behulpt van de scanner) of deze een TODO wil toevoegen.  
4. Vraag om input voor een datum en beschrijving en sla deze op in een String-array.  
5. Voeg de array toe aan de ArrayList.  
6. Vraag de gebruiker welk TODO-nummer deze wil bekijken en haal dit op zonder loop. (_Let hier bij op waar je begint met tellen_)  
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
2. Zet het maken van een TODO in een aparte methode en roep deze aan. Hier gaan we het de volgende les over hebben.
3. [Moeilijk] Toon alle TODO’s.  
    Hiervoor zul je gebruik moeten maken van een loop. Dit behandelen we in een latere les pas.
