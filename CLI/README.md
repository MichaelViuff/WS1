# Command Line Interface (CLI)
I dette modul lærer du at arbejde med kommandolinjen – et af de mest grundlæggende og kraftfulde værktøjer i softwareudvikling. 

Du vil få praktisk erfaring med at navigere i filsystemet, oprette og håndtere filer og mapper, samt kompilere og køre Java-programmer direkte fra terminalen.

## Læringsmål
Efter at have gennemført dette modul har du opnået følgende færdigheder:

 - Du kan navigere i filsystemet via kommandolinjen.
 - Du kan oprette, flytte og slette filer og mapper.
 - Du kan kompilere og køre et Java-program via CLI, inkl. brug af argumenter.
 - Du forstår grundlæggende kommandoer og deres anvendelse i udviklingsarbejde.
 
## Opgaver

#### Opgave 1: Opret og navigér
1. Åbn terminalen
2. Opret en ny mappe kaldet `cli_test`
3. Navigér ind i mappen

<details>
  <summary>Løsning</summary>
  
  ````bash
  mkdir cli_test
  cd cli_test
  ````
</details>

#### Opgave 2: Filhåndtering
1. Opret en tom fil:
2. Opret en undermappe:
3. Flyt filen til undermappen:
4. Slet undermappen og dens indhold:

<details>
  <summary>Løsning</summary>
  
  ````bash
    touch info.txt
    mkdir archive
    mv info.txt archive/
    rm -r archive
  ````
</details>

#### Opgave 3: Download og compile
Download den udleverede fil HelloArgs.java.
Navigér til mappen hvor filen ligger.
Compile filen:

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