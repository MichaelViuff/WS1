# Forberedelse

Se disse videoer for at få en forståelse for hvad Git og GitHub er.

[What is Git?](https://www.youtube.com/watch?v=2ReR1YJrNOM)\
[What is Git and GitHub?](https://www.youtube.com/watch?v=QzvA7r-WndM)

Installer [Git](https://git-scm.com/downloads)

Opret en konto på (GitHub.com)[https://github.com/signup]

https://code.visualstudio.com/docs/sourcecontrol/overview

https://www.jetbrains.com/help/idea/set-up-a-git-repository.html

# Basic Git

I dette modul vil du lære de mest grundlæggende funktioner ved et versionsstyringsværktøj, i dette tilfælde Git.

Modulet tager udgangspunkt i Git og GitHub, og integration af Git i IntelliJ og VSCode, men andre programmer, såsom GitHub Desktop eller andre IDE's kan også anvendes.

## Læringsmål

Efter at have gennemført dette modul har du opnået følgende færdigheder:

- Du kan oprette et Git-repository og forbinde det til GitHub.
- Du kan oprette og skrive i README.md filer.
- Du kan udføre meget simpel branching og pull-requests.
- Du kan tilføje, committe og pushe filer til et fjernrepository.
- Du kan pull changes til dit projekt.
- Du kan clone et eksisterende repository og arbejde med det lokalt.

## Opgaver

### Opgave 1: Opret et GitHub repository

På https://skills.github.com/ findes mange forskellige opgaver til at blive bedre til GitHub.
Vi starter med den allerførste: [Introduction to GitHub](https://github.com/skills/introduction-to-github).

Følg guiden og udfør alle steps. Vær opmærksom på at navngive ting præcist som instrueret, samt vente ~20 sekunder når opgaven er udført før du refresher siden.

Hvis du har gjort alting rigtigt ender du med et repository der ser ud, cirka ligesom [mit](https://github.com/MichaelViuff/skills-introduction-to-github)
> [!TIP]
> Notér dit link til repository, det skal afleveres senere.

### Opgave 2: Lav et nyt projekt i IntelliJ og commit og send til GitHub

I denne opgave vil vi oprette vores repository fra vores IDE i stedet for via GitHub's web interface som vi gjorde i den forrige opgave.

Her tages udgangspunkt i IntelliJ som IDE, men andre kan også bruges (trin-for-trin vejledningen passer nok kun til IntelliJ).

Vi starter med at oprette et nyt projekt i IntelliJ

![Create new project](IntelliJ%20-%20Create%20new%20project.png)

#### Trin-for-trin oprettelse af et nyt Java-projekt i IntelliJ
- Åbn IntelliJ IDEA.
- Klik på "New Project".
- Vælg "Java" som projekt-type.
- Navngiv projektet, fx HelloGitHub.
- Vælg placering på din computer
- Vælg en JDK (hvis du ikke har en, kan du downloade en direkte via IntelliJ).
- Kryds af i "Add sample code"
- Klik "Finish".


Dit projekt burde se cirka sådan her ud nu_

![Upon creation](IntelliJ%20-%20upon%20creation.png)

#### Gitignore
Læg mærke til, at vores hjælpsomme IDE allerede har genereret en `.gitignore` fil.  
Denne fil fortæller Git, hvilke filer og mapper der skal ignoreres, altså ikke skal under versionskontrol.  
Det kan være nyttigt, for ting som kun er lokale, eller som er specifikke for det IDE du arbejder i.  
Da vi arbejder med IntelliJ som IDE er der nogle ting vi gerne vil have tilføjet til denne fil:

`.idea`  
`*.iml`


Disse er specifikke for IntelliJ.\
Derudover vil vi gerne undgå at vores compilede filer gemmes i repository (da det er unødvendigt, samt de hurtigt bliver outdated).  
Så vi tilføjer følgende, der sørger for at alle filer med `.class` extension ignoreres:

`*.class`

Den opdaterede `.gitignore` burde se cirka sådan her ud.  
(Jeg har tilføjet ###Generated files som comment, men det er ikke nødvendigt. Alt uden ### kommer med, comments kan bare være med til at skabe overblik):

![GitIgnore](IntelliJ%20-%20gitignore.png)

#### Initialiser Git i IntelliJ
Gå til VCS > Enable Version Control Integration.
Vælg Git og klik OK.
IntelliJ initialiserer nu et Git-repository i projektmappen.



#### Opgave 3: Hent projektet ind i VSCode

#### Opgave X: Lav en clone af mit projekt

#### Opgave 4: Hent clone ind i IntelliJ eller VSCode, lav ændringer, og push dem til eget repo i GitHub

## Aflevering

Tag screenshot af opgave 1-4

Upload alting til GitHub projeketet

Send mig et link til dit GitHub WS1 Repository
