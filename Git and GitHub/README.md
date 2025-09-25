

# Introduction to Git and GitHub

I dette modul vil du lære de mest grundlæggende funktioner ved et versionsstyringsværktøj, i dette tilfælde Git.

Modulet tager udgangspunkt i Git og GitHub, og integration af Git i IntelliJ og VSCode, men andre programmer, såsom GitHub Desktop eller andre IDE's kan også anvendes.

## Læringsmål

Efter at have gennemført dette modul har du opnået følgende færdigheder:

- Du kan oprette et Git-repository og forbinde det til GitHub.
- Du kan udføre meget simpel branching og pull-requests.
- Du kan tilføje, committe og pushe filer til et fjernrepository.
- Du kan pull changes til dit projekt.
- Du kan clone et eksisterende repository og arbejde med det lokalt.

## Forberedelse

Se disse videoer for at få en forståelse for hvad Git og GitHub er.

[What is Git?](https://www.youtube.com/watch?v=2ReR1YJrNOM)\
[What is Git and GitHub?](https://www.youtube.com/watch?v=QzvA7r-WndM)

Installer [Git](https://git-scm.com/downloads)

Opret en konto på [GitHub.com](https://github.com/signup)

Følgende links kan måske være hjælpsomme ifm. løsningen af opgaverne, men det er muligvis nemmere at følge trin-for-trin vejledningen i opgaverne.  
Læs dem efter behov:

https://code.visualstudio.com/docs/sourcecontrol/overview  
https://www.jetbrains.com/help/idea/set-up-a-git-repository.html

## Opgaver

### Opgave 1: Opret et GitHub repository

På https://skills.github.com/ findes mange forskellige opgaver til at blive bedre til GitHub.
Vi starter med den allerførste: [Introduction to GitHub](https://github.com/skills/introduction-to-github).

Følg guiden og udfør alle steps. Vær opmærksom på at navngive ting præcist som instrueret, samt vente ~20 sekunder når opgaven er udført før du refresher siden.

Hvis du har gjort alting rigtigt ender du med et repository der ser ud, cirka ligesom [mit](https://github.com/MichaelViuff/skills-introduction-to-github)
> [!TIP]
> Notér dit link til dette repository, det skal afleveres senere.

### Opgave 2: Lav et nyt projekt i IntelliJ, lav et commit, og send til GitHub

I denne opgave vil vi oprette vores repository fra vores IDE i stedet for via GitHub's web interface som vi gjorde i den forrige opgave.

Opgaven tager udgangspunkt i IntelliJ som IDE, men andre kan også bruges (trin-for-trin vejledningen passer til IntelliJ).

Vi starter med at oprette et nyt projekt i IntelliJ

![Create new project](Images/IntelliJ%20-%20Create%20new%20project.png)

#### Trin-for-trin oprettelse af et nyt Java-projekt i IntelliJ
- Åbn IntelliJ IDEA.
- Klik på "New Project".
- Vælg "Java" som projekt-type.
- Navngiv projektet, fx HelloGitHub.
- Vælg placering på din computer
- Vælg en JDK (hvis du ikke har en, kan du downloade en direkte via IntelliJ).
- Kryds af i "Add sample code"
- Klik "Finish".

Dit projekt burde se cirka sådan her ud nu:

![Upon creation](Images/IntelliJ%20-%20upon%20creation.png)

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

![GitIgnore](Images/IntelliJ%20-%20gitignore.png)

#### Initialiser Git i IntelliJ
Nu hvor vores `.gitignore` er opdateret er vi klar til at lægge vores projekt under versionskontrol.

- Gå til menupunktet VCS > Enable Version Control Integration.
- Vælg Git og klik OK.
- IntelliJ initialiserer nu et Git-repository i projektmappen.

Nu er IntelliJ klar til at bruge Git som vores versionskontrolsoftware.

#### Commit dine ændringer

- Gå til Git (den der før hed VCS) > Commit (eller brug Git-panelet nederst. Alt-9 genvej åbner panelet).
- Vælg alle filer du vil committe.

På billedet herunder kan du se hvordan det burde se ud.  
Jeg har afkrydset de filer jeg gerne vil commit.  
Læg mærke til, at `.iml` filen som dit IntelliJ sikkert har oprettet, ikke er med på listen over foreslåede filer - det er fordi vi tilføjede den til vores `.gitignore`!

![Commit](Images/IntelliJ%20-%20commit.png)

- Skriv en commit-besked, fx "Initial commit with HelloWorld".
- Klik på Commit.

Nu er vores projekt sådan set under **lokal** versionskontrol. Vi vil gerne have det op i skyen, på GitHub.

#### Opret og push til GitHub direkte fra IntelliJ

- Gå til Git > GitHub > Share Project on GitHub.
- Log ind med din GitHub-konto (hvis du ikke allerede er logget ind).
- Vælg et navn til dit repository og evt. en beskrivelse.
- (Remote *burde* du ikke skulle ændre, den hedder nok enten `origin` eller `main` eller `github`)
- Sørg for at "Private" **ikke** er krydset af.
- Klik Share.

![Share on GitHub](Images/IntelliJ%20-%20share%20on%20github.png)

IntelliJ opretter nu et nyt repository på GitHub og pusher dit projekt.  
Du får en bekræftelse og et link til dit repo – klik for at åbne det i browseren.

Nu er dit projekt lagt op i skyen på GitHub, og vi gjorde alting direkte fra vores IDE, helt uden farlige CLI kommandoer :)

> [!TIP]
> Notér dit link til dette repository, det skal afleveres senere.


### Opgave 3: Hent projektet ind i VSCode, lav ændringer, og send til GitHub

I denne opgave vil vi hente et projekt fra GitHub ned til vores computer, og lave et par ændringer og pushe dem tilbage til GitHub.  

Opgaven tager udgangspunkt i Visual Studio Code, for at vise Git integration i begge jeres IDE's.  
Men opgaven kan også løses med IntelliJ eller et andet IDE (trin-for-trin vejledningen passer kun til VSCode).

#### Klon dit GitHub-repository i VSCode

- Åbn Visual Studio Code.
- Klik på Source Control-ikonet i venstre side (Git-ikonet).
- Klik på "Clone Repository".

![VSCode clone](Images/VSCode%20-%20Clone%20Repo.png)

- Vælg "Clone from GitHub" (hvis du er logget ind).
- Find og vælg dit repository fra forrige opgave fra listen.
- Vælg en lokal mappe hvor projektet skal gemmes (**ikke** den samme lokale mappe som forrige opgave).
- VSCode spørger om du vil åbne projektet – klik "Open".

Du burde nu have dit projekt fra forrige opgave åbent i Visual Studio Code, og det burde se cirka sådan her ud:

![VSCode projekt](Images/VSCode%20-%20Project%20view.png)

#### Find og redigér `Main.java`

Hvis du ikke allerede har navigeret til `Main.java` så gør det nu.

- I Explorer-panelet (øverst til venstre), navigér til src-mappen hvor `Main.java` ligger.
- Klik på filen for at åbne den.

Lav en lille ændring, fx:

```java
System.out.println("Hello, GitHub! Now edited in VSCode.");
```

Gem filen (Ctrl+S eller Cmd+S).

#### Commit ændringen

- Klik igen på Source Control-ikonet.
- Du vil se at `Main.java` er ændret og vises som en ændring.
- Skriv en commit-besked i tekstfeltet, fx. "Redigeret Main.java i VSCode"  
(**OBS:** Hvis du glemmer at udfylde feltet, og bare trykker "✓ Commit" popper et nyt vindue op. Her kan du skrive din besked øverst i vinduet, og derefter trykke på fluebenet helt ude til højre i toppen. )
- Klik på "✓ Commit".

![Commit in VSCode](Images/VSCode%20-%20commit.png)

- Efter commit, klik på "…"-menuen i Source Control-panelet.
- Vælg "Push".
- VSCode sender nu ændringen til GitHub.
- Du kan tjekke status nederst i VSCode – der står fx “Pushed to origin/main”.

Du kan også vælge at bruge "Sync Changes" i stedet. Den gør i dette tilfælde præcis det samme.  
Ofte vil "Sync Changes" være at foretrække, da den først laver et pull, og derefter et push med dine ændringer.

#### Tjek ændringen på GitHub

Gå til [GitHub](https://github.com) og log ind.

Find dit repository for denne opgave.

Klik på `Main.java` og se at din ændring er synlig.

Du kan også se din commit-besked under "Commits".

### Opsummering

Du har nu været igennem hele flowet for hvordan Git og GitHub kan bruges til versionskontrol af dine projekter.

De to lokale projekter du lavede i Opgave 2 kan ses som to personer, der arbejder på samme, fælles, projekt.  
Hver person har sin egen udgave (i dit tilfælde en mappe for IntelliJ-projektet og en mappe for VSCode-projektet), og et fælles sted (GitHub repository).

Alting er dejlig nemt, når man kun er èn person på et repository ;)

Men hvad sker der, når flere personer arbejder i den samme fil...

### Opgave 4: Merge conflicts

I denne opgave vil vi skabe en meget simpel [merge conflict](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/addressing-merge-conflicts/about-merge-conflicts) (når to repositories har modstridende data) og løse den.

Opgaven tager igen udgangspunkt i IntelliJ og Visual Studio Code, men andre tilgange kan anvendes.  
Det vigtigste er at der arbejdes med to separate projekter, som deles om ét fælles projekt på GitHub.

Jeg lægger op til at man laver et helt nyt projekt til denne opgave, da man så også får prøvet kloning af et projekt i IntelliJ, og oprettelse og push til GitHub i VSCode.  
Andre tilgange kan også anvendes (trin-for-trin vejledningen passer kun til min tilgang).

#### Opret og push nyt Java-projekt fra VSCode til GitHub

- Åbn VSCode.
- Opret en ny mappe til projektet og åbn den i VSCode.
- Opret en ny fil: HelloWorld.java.
- Skriv fx:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from VSCode!");
    }
}
```

#### Initialiser Git og commit

- Klik på Source Control-ikonet.
- Klik på "Initialize Repository".
- Tilføj filen til staging ved at klikke på "+".
- Skriv en commit-besked: "Initial commit" og klik ✓ Commit.

![VSCode create new project](Images/VSCode%20-%20create%20new%20project.png)

#### Opret og push til GitHub

- Klik på "Publish Branch".
- Vælg "Publish to GitHub public repository".

![VSCode publish to GitHub](Images/VSCode%20-%20publish%20to%20GitHub.png)

- VSCode pusher nu projektet til GitHub.
- Tjek at projektet ligger på GitHub.

På GitHub kan du få linket til dit repository ved at klikke på den grønne "Code" knap:

![GitHub Link from Code](Images/GitHub%20-%20Link.png)

Linket skal bruges til næste del af opgaven.

#### Klon projektet i IntelliJ

- Åbn IntelliJ.
- Vælg "Clone Repository".

![IntelliJ Clone repo](Images/IntelliJ%20Clone%20repo.png)

- (Hvis du ikke ser ovenstående, så har IntelliJ sandsynligvis åbnet et tidligere projekt. Luk først dette, så burde du se ovenstående.)
- Indsæt URL’en til GitHub-repoet og klik Clone.
- Vælg et directory (mappe på din computer) som **ikke** er den samme mappe som den du brugte til VSCode projektet i det forrige trin.
- Tryk "Clone".
- IntelliJ åbner nu projektet.

#### Lav ændring i IntelliJ og push

Åben filen `HelloWorld.java` og lav følgende ændring i filen.  
Skift teksten så det ændres fra:

```java
System.out.println("Hello from VSCode!");
```

til

```java
System.out.println("Hello from IntelliJ!");
```

> [!IMPORTANT]  
> Det er vigtigt at det er præcist denne ændring, da vi skal lave en conflict!

Gå til "Commit".  
Nu ser listen over filer pludselig meget længere ud!

![IntelliJ - new commit](Images/IntelliJ%20-%20new%20commit.png)

Det er fordi vi ikke lavede en `.gitignore` da vi oprettede projektet i Visual Studio Code.

Vi kan oprette en ny `.gitignore` i IntelliJ og commit den, eller vi kan sørge for kun at commit den fil vi arbejder i.

Uanset hvad skal `HelloWorld.java` med i vores commit.  
Tilføj en passende commit message og vælg "Commit and Push".  
(Der dukker muligvis et nyt vindue op - her vælger du bare "Push").

#### Lav konflikt i VSCode

Gå tilbage til Visual Studio Code.  
Hvis du går til "Source Control" kan du se at der er ændringer klar til at blive hentet med et pull.  
**TRYK IKKE PÅ "Sync Changes" ELLER ANDET DER LAVER ET PULL**

I stedet for, gå til filen `HelloWorld.java` og find linjen med 

```java
System.out.println("Hello from VSCode!");
```

Denne linje blev ændret i IntelliJ, og ligger klar på GitHub i sin nyeste udgave (hvor teksten hedder "Hello from IntelliJ").  
Men vi vil gerne lave en merge conflict, så inden vi henter den nyeste udgave, retter vi denne linje.

Skift teksten så det ændres fra:

```java
System.out.println("Hello from VSCode!");
```

til

```java
System.out.println("Ændring fra VSCode, som skaber konflikt!");
```

Gem filen (Ctrl+S eller Cmd+S).

- Gå til "Source Control"
- Commit ændringen med besked: "Konfliktændring fra VSCode".
- Klik Push eller Sync – du får en fejl, fordi GitHub har en nyere version.

![VSCode conflict](Images/VSCode%20conflict.png)

#### Løs konflikten

Du ser noget i stil med dette

```java
<<<<<<< HEAD
System.out.println("Ændring fra VSCode, som skaber konflikt.");
=======
System.out.println("Ændring fra IntelliJ.");
>>>>>>> origin/main

```

Dette er en typisk merge conflict, hvor flere personer har arbejdet i den samme fil, og lavet ændringer i de samme linjer.

Hvordan dette løses afhænger af den specifikke situation.  
I vores situation er der tale om den ene linje, og vi har 3 muligheder:

1. **Accept Current Change** (bruger "vores" linje, altså den med "Ændring fra VSCode, som skaber konflikt.")
2. **Accept Incoming Change** (bruger "deres" linje, altså den med "Ændring fra IntelliJ.")
3. **Accept Both Changes** (bevarer begge linjer, så altså både "Ændring fra VSCode, som skaber konflikt." **og** "Ændring fra IntelliJ.")

Hvad du vælger her er underordnet, bare du løser konflikten.  
Jeg vælger "**Accept Both Changes**".

#### Commit og push

Fix merge conflict, og lav et nyt commit med dit fix.

- Commit med besked: "Løst merge conflict i VSCode".
- Klik Push.
- Tjek GitHub – begge linjer er nu med (hvis du valgte "**Accept Both Changes**").


#### Lav konflikt i IntelliJ og løs konflikten

Gå nu tilbage til IntelliJ.

Inden du puller den seneste ændring vil vi gerne lave en konflikt her også, for at se hvordan man løser merge conflicts i IntelliJ.

Vi laver derfor endnu en ændring i linjen

Skift teksten så det ændres fra:

```java
System.out.println("Hello from IntelliJ!");
```

til

```java
System.out.println("Ændring fra IntelliJ, som skaber konflikt!");
```

- Gå til Commit.
- Skriv en besked, såsom "Konfliktændring fra IntelliJ".
- Tryk "Commit and Push".

Du får denne advarsel:

![IntelliJ merge warning](Images/IntelliJ%20merge%20warning.png)

Vælg "Merge".

Vi har nu igen de samme 3 valg:

![IntelliJ Merge Options](Images/IntelliJ%20Merge%20Options.png)

Hvad du vælger er underordnet.  
Hvis du vælger "Merge" åbner IntelliJ et nyt vindue hvor du kan se ændringerne side-by-side.  
Hvis du er tilfreds med det den foreslår i midten ("Result") kan du bare vælge "Apply".

Uanset hvad du vælger skal løsningen pushes.

- Skriv en commit besked, såsom "Conflict resolved".
- Klik "Commit and Push".
- Tjek GitHub, din valgte løsning burde være synlig.

### Opsummering

Du har nu været igennem oprettelse af projekter, og push til GitHub fra både IntelliJ samt Visual Studio Code.

Ligeledes har du set hvordan man laver commit og pull i begge disse IDE.

Slutteligt har du løst merge conflicts fra begge IDE.

## Aflevering

Aflever følgende links:

1. Link til dit repository du oprettede i opgave 1
2. Link til dit repository du oprettede i opgave 2
3. Link til dit repository du oprettede i opgave 4 (hvis du genbrugte repository fra opgave 2, så bare aflever dette link igen)

Alle 3 links skrives direkte ind i afleveringen på Itslearning.

Deadline og formalia kan ses på Itslearning.
