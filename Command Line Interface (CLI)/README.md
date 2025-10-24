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

[An A-Z Index of Windows PowerShell commands](https://ss64.com/ps/)  
[The `javac` Command](https://docs.oracle.com/en/java/javase/17/docs/specs/man/javac.html)  
[The `java` Command](https://docs.oracle.com/en/java/javase/19/docs/specs/man/java.html)  
[Git Tutorial](https://www.w3schools.com/git/default.asp)

## Opgaver

Du skal aflevere en hel del screenshots, men du skal ikke aflevere en fil som i [Modul - GAI](<../Generative AI (GAI)/README.md>).  
Du skal derimod uploade alting til GitHub denne gang. Så sørg for at samle alle dine screenshots i een mappe løbende, og giv gerne filerne passende navne.

Når du laver opgaverne kommer du sandsynligvis til at opleve, at du ikke kender navnet på den kommando du skal bruge.  
Her kan du enten forsøge at slå kommandoen op i kilderne ovenfor, eller du kan spørge din favorit AI om hjælp.

### Opgave 1: Grundlæggende CLI

I denne opgave skal du udføre grundlæggende kommandoer til at navigere i filsystem, samt oprette mapper, slette filer, osv.

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

### Opgave 2: Java i CLI

I denne opgave skal du bruge en udleveret `.java` fil.  
Du skal ikke åbne filen, eller på nogen måde redigere i filen. Du skal derfor ikke bruge noget IDE til at køre filen. Alt sker igennem CLI denne gang.

Filen findes [her](CliDemo.java)

1. Start med at bruge `curl` til at hente filen (kræver et link til [raw-filen](https://github.com/MichaelViuff/WS1/raw/refs/heads/main/Command%20Line%20Interface%20(CLI)/CliDemo.java)) eller bare download filen og kopier den ind i din mappe.  
2. Kompiler filen vha. `javac`
3. Kør filen (uden argumenter) vha. `java`

> [!CAUTION]
> Hvis du ikke kan køre filen pga. forskelle i versionering, så kør `javac` med følgende argument
> ```cli
> javac --release 8 CliDemo.java
> ```
> hvor 8-tallet evt. erstattes med din udgave af JRE (Java Runtime Environment)
> som kan findes ved at køre `java -version`

4. Kør filen med -? eller andet argument til at få vist en liste over mulige commands
5. Kør filen så den udfører en af de tre commands den skrev ud i forrige trin

> [!IMPORTANT]  
> Udfør disse 5 trin, og dokumenter dit arbejde via screenshots.  
> Du kan måske have alle kommandoerne i ét samlet screenshot. Alternativt lav et screenshot for hvert enkelt step. Brug gerne Snipping Tool eller lignende til at lave screenshots.

### Opgave 3: Git via CLI

Til disse opgaver antages det at du allerede har været igennem [Modul - Git and GitHub](<../Git and GitHub/README.md>) og at du har gemt dine credentials i dit styresystem (det skete sandsynligvis automatisk da du koblede dit IDE sammen med din GitHub konto).

Hvis det ikke er tilfældet så gå tilbage og gennemfør [Modul - Git and GitHub](<../Git and GitHub/README.md>) først.

Hvis du stadig har problemer med credentials, så prøv at lave en [Personal Access Token](https://medium.com/@irfankaraman/how-to-create-a-personal-access-token-pat-for-your-github-account-d686a7890a33) og brug den i dine requests.

Husk at de følgende trin skal udføres fuldstændigt via CLI, altså ikke noget med at bruge GUI!

  1. Clone dit repository fra Opgave 2 i [Modul - Git and GitHub](<../Git and GitHub/README.md>) (eller lav et nyt, tomt repository på GitHub og clone dette)
  2. Opret en ny mappe i dit clonede repository med navnet "Screenshots"
  3. Flyt alle dine screenshots fra Opgave 1 og Opgave 2 i dette modul ind i denne mappe
  4. Commit dine ændringer
  5. Push til GitHub

  > [!IMPORTANT]  
  > Udfør disse 5 trin, og dokumenter dit arbejde via screenshots.  
  > Du kan måske have alle kommandoerne i ét samlet screenshot. Alternativt lav et screenshot for hvert enkelt step. Brug gerne Snipping Tool eller lignende til at lave screenshots.
  > Læg også disse screenshots i din screenshot mappe, og commit og push disse.

#### 
## Aflevering

Saml alle dine screenshots i en mappe som lægges i dit GitHub repository i Opgave 3.  
Send et link til dit repository.

Deadline og formalia kan ses på Itslearning.