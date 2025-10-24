# Command Line Interface (CLI)

I dette modul vil du lære at arbejde med kommandolinjen, som er et af de mest grundlæggende værktøjer i softwareudvikling.

Modulet tager udgangspunkt i Windows Powershell eller Windows' Kommandoprompt (Command Line Prompt).  
Hvis du arbejder i et andet styresystem er det din egen opgave at finde et tilsvarende program.

## Læringsmål
Efter at have gennemført dette modul har du opnået følgende færdigheder:

 - Du kan navigere i filsystemet via kommandolinjen.
 - Du kan oprette, flytte og slette filer og mapper.
 - Du kan kompilere og køre et Java-program via CLI, inkl. brug af argumenter.
 - Du kan udføre grundlæggende kommandoer for brug af Git via CLI.

## Forberedelse

Se denne video for at få en grundlæggende forståelse for navigation i filsystem via Command Line Interface:

[Command Line Interface (CLI) For Beginners](https://www.youtube.com/watch?v=mUXVBMhr7Xg)

Disse kilder kan bruges til opslag når du arbejder med opgaverne, men det forventes ikke at du har læst dem igennem inden:

[The `javac` Command](https://docs.oracle.com/en/java/javase/17/docs/specs/man/javac.html)  
[The `java` Command](https://docs.oracle.com/en/java/javase/19/docs/specs/man/java.html)
[Git Tutorial](https://www.w3schools.com/git/default.asp)


## Opgaver

Du skal aflevere en hel del screenshots, men du skal ikke aflevere en fil som i [Modul - GAI](<../Generative AI (GAI)/README.md>).  
Du skal derimod uploade alting til GitHub denne gang. Så sørg for at samle alle dine screenshots i een mappe, og giv gerne filerne passende navne.

### Opgave 1: Grundlæggende CLI

I denne opgave skal du udføre grundlæggende kommandoer til at navigere i filsystem, samt oprette mapper, slette filer, osv.

#### Opret ny mappe

1. Start med at oprette en ny mappe til denne workshop. Kald evt. mappen "Modul - CLI".
2. Naviger ind i mappen

`touch` kan bruges til at oprette nye filer, men den er ikke tilgængelig i alle udgaver af Powershell.  
Vi bruger i stedet et lille "hack" til at oprette en ny fil.  

`echo` kan bruges til at udskrive tekst, som udgangspunkt i konsolen, men vi kan overstyre destinationen til en fil således:

```cli
echo "Hello World" > hello.txt
```

3. Opret en ny fil som vist ovenfor
4. Udskriv indholdet af filen
5. Opret en ny undermappe med navnet "Archieve"
6. Flyt filen ind i denne mappe
7. Naviger ind i undermappen
8. Opret en kopi af `hello.txt`
9. Flyt kopien et niveau op, dvs. tilbage til den mappe du kom fra
10. Slet `hello.txt` fra mappen archieve

> [!IMPORTANT]  
> Udfør disse 10 trin, og dokumenter dit arbejde via screenshots.  
> Du kan måske have alle kommandoerne i ét samlet screenshot. Alternativt lav et screenshot for hvert enkelt step. Brug gerne Snipping Tool eller lignende til at lave screenshots.

### Opgave 2: Java

I denne opgave skal du bruge en udleveret `.java` fil.  
Du skal ikke åbne filen, eller på nogen måde redigere i filen. Du skal derfor ikke bruge noget IDE til at køre filen. Alt sker igennem CLI denne gang.

Filen findes [her](CliDemo.java)

1. Start med at bruge `curl` til at hente filen.  
2. Kompiler filen vha. `javac`
3. Kør filen (uden argumenter) vha. `java`

> [!CAUTION]
> Hvis du ikke kan køre filen pga. forskelle i versionering, så kør `javac` med følgende argument
> ```cli
> javac --release 8 CliDemo.java
> ```
> hvor 8-tallet evt. erstattes med din udgave af JRE (Java Runtime Environment)
> som kan findes ved at køre `java -version`

4. Kør filen med -? eller andet argument til at få en liste over mulige input
5. Kør filen så den 

### Opgave 3: Git via CLI

Til disse opgaver antages det at du allerede har været igennem [Modul - Git and GitHub](<../Git and GitHub/README.md>) og at du har gemt dine credentials i dit styresystem (det skete sandsynligvis automatisk da du koblede dit IDE sammen med din GitHub konto).

Hvis det ikke er tilfældet skal du PAT bla bla.

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

### Opgave 2: Filhåndtering
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