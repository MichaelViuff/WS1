# Command Line Interface (CLI)
I dette modul lærer du at arbejde med kommandolinjen, som er et af de mest grundlæggende værktøjer i softwareudvikling.

Modulet tager udgangspunkt i Windows' Kommandoprompt (Command Line Promp) eller Windows Powershell. Hvis du arbejder i et andet styresystem er det din egen opgave at finde et tilsvarende program.

## Læringsmål
Efter at have gennemført dette modul har du opnået følgende færdigheder:

 - Du kan navigere i filsystemet via kommandolinjen.
 - Du kan oprette, flytte og slette filer og mapper.
 - Du kan kompilere og køre et Java-program via CLI, inkl. brug af argumenter.
 - Du forstår grundlæggende kommandoer og deres anvendelse i udviklingsarbejde.
 
## Opgaver

#### Opgave 1: Opret og naviger
Brug terminalen i dit styresystem, til at udføre følgende opgave.

1. Åbn terminalen
2. Opret en ny mappe kaldet `cli_test`
3. Naviger ind i mappen

<details>
  <summary>Løsning</summary>
  
  ````bash
  mkdir cli_test
  cd cli_test
  ````
</details>

#### Opgave 2: Filhåndtering
I den nye mappe du har oprettet, udfør følgende opgave.

1. Opret en ny text-fil (i konsolen hvis du kan, og ellers så i dit styresystem)
2. Opret en undermappe med navnet "archieve"
3. Flyt text-filen til undermappen
4. Naviger ind i undermappen
5. Åbn text-filen via konsolen, eller skriv filens indhold ud i konsolen

<details>
  <summary>Løsning</summary>
  
  ````bash
    echo this is some text > textfile.txt
    mkdir archieve
    mv textfile.txt archieve/
    cd archieve
    type textfile.txt
  ````
</details>

#### Opgave 3: Download og kompiler
Download den udleverede fil HelloArgs.java.
Navigér til mappen hvor filen ligger.
kompiler filen:

<details>
  <summary>Løsning</summary>
  
  ````bash
  javac HelloArgs.java
  java HelloArgs Michael Viuff
  ````
</details>

## Aflevering

 - Et skærmbillede der viser terminal med filhåndtering og kompilering/kørsel.
 - En tekstfil med din refleksion.

## Godkendelseskriterier

 - Skærmbillede viser brug af mindst 5 relevante CLI-kommandoer.
 - Java-programmet er korrekt kompileret og kørt med argumenter.
 - Refleksion viser forståelse for kommandoernes funktion og anvendelse.