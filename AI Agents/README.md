# AI-agenter i softwareudvikling

I dette modul vil du lære at bruge en AI-agent til en lille programmeringsopgave, gennemgå dens ændringer og kontrollere resultatet. Agenten må gerne hjælpe med at producere kode. Du skal selv kunne forklare, teste og ændre den kode, du vælger at bruge.

Modulet bygger på basal Java, objektorienteret programmering (OOP) og modulerne om Git, generativ AI, code review og debugging. Du bruger din viden fra undervisningen i analyse, design, implementering og test til at styre arbejdet.

Arbejdet og afleveringen er individuelle; du må gerne drøfte valg med andre.

## Læringsmål

Efter at have gennemført dette modul har du opnået følgende færdigheder:

- Du kan forklare forskellen på en AI-chat og en kodeagent, der kan arbejde med projektets filer.
- Du kan give en agent en lille, tydeligt afgrænset opgave med krav og relevant kontekst.
- Du kan gennemgå agentens kodeændringer og begrunde, hvad du vil beholde eller rette.
- Du kan afprøve koden og sammenligne det faktiske resultat med det forventede.
- Du kan forklare og lave en lille ændring i den færdige kode uden AI-hjælp.
- Du kan beskrive, hvordan du vil bruge agenter som supplement i semesterprojektet.

## Forberedelse

### Start her: En kort introduktion

Læs de udvalgte afsnit i GitHubs artikel [Agent mode 101: All about GitHub Copilot’s powerful mode](https://github.blog/ai-and-ml/github-copilot/agent-mode-101-all-about-github-copilots-powerful-mode/).

1. Læs afsnittet **“But first, what is GitHub Copilot agent mode?”**, herunder listen over, hvad agenten kan gøre. Det giver et overblik over, hvordan en kodeagent kan arbejde med en opgave.
2. Spring derefter til **“Take this with you”** nederst i artiklen. Her beskrives betydningen af tydelige instruktioner, relevant kontekst og din egen gennemgang af resultatet.

Resten af artiklen er valgfri. Eksemplerne tager udgangspunkt i VS Code; her skal du blot forstå arbejdsformen, så du behøver ikke installere noget eller følge eksemplerne trin for trin.

Tænk over disse to spørgsmål, før du går videre:

- Hvad kan en kodeagent gøre med projektets filer, som et almindeligt chatsvar ikke gør?
- Hvorfor skal du stadig læse og afprøve koden, selvom agenten siger, at opgaven er løst?

Du skal ikke aflevere svarene; brug dem til at kontrollere, at du har forstået hovedidéen.

### Hvad er en kodeagent?

En AI-chat kan give dig forklaringer og kodeforslag. En kodeagent har også adgang til værktøjer: Den kan eksempelvis læse projektfiler, redigere kode og køre programmet eller tests. Den kan bruge resultaterne til at forsøge en rettelse. Hvad den faktisk kan gøre, afhænger af værktøjet og de tilladelser, du giver den.

Du giver opgaven, følger arbejdet og vurderer resultatet. En besked fra agenten om, at den er færdig, er ikke i sig selv dokumentation for, at koden virker.

I dette modul øver du denne arbejdsgang:

**Beskriv opgaven → vurder planen → lad agenten kode → gennemgå ændringerne → test selv → forklar og tilpas.**

### Værktøj og adgang

Modulet tager udgangspunkt i **GitHub Copilot med Agent i IntelliJ IDEA**. VS Code eller en anden kodeagent kan også bruges, hvis den kan læse og ændre Java-filer i dit projekt. Du skal bruge en egentlig kodeagent til opgaven.

**Microsoft 365 Copilot og GitHub Copilot har forskellig adgang.** Microsoft 365 Copilot kan blandt andet bruges til at oprette tilpassede agenter via Agent Builder, afhængigt af skolens indstillinger. Den adgang giver ikke automatisk GitHub Copilot i dit IDE. Her bruger vi en agent, som arbejder direkte med Java-projektet.

1. Kontrollér din adgang til GitHub Copilot med din GitHub-konto. GitHub har en gratis ordning for verificerede studerende og en begrænset gratis plan. Se de aktuelle muligheder under [GitHub Copilot-planer](https://docs.github.com/en/copilot/get-started/plans). Få afklaret adgangen inden modulet; studieverifikation kan kræve behandlingstid.
2. Følg [GitHubs installationsvejledning](https://docs.github.com/en/copilot/how-tos/set-up/install-copilot-extension?tool=jetbrains), og vælg JetBrains IDEs, hvis du bruger IntelliJ. Log ind med den GitHub-konto, der har adgang.
3. Åbn GitHub Copilot Chat i dit IDE, og find **Agent**. Placering og navne kan variere med versionen. Brug [vejledningen til Copilot i dit IDE](https://docs.github.com/en/copilot/how-tos/chat-with-copilot/chat-in-ide?tool=jetbrains), hvis du ikke kan finde funktionen.
4. Kontrollér, at du kan køre et almindeligt Java-program i dit IDE. Brug den JDK, du allerede bruger i undervisningen.

> [!IMPORTANT]
> Hvis Agent mangler, eller du rammer en adgangs- eller forbrugsgrænse, så oplys underviseren om problemet, så adgang eller et tilsvarende værktøj kan afklares. Du skal ikke købe et abonnement for at følge vejledningen. Almindelig chat med kopiering af kode opfylder ikke i sig selv øvelsen i at bruge en kodeagent.

Du behøver ikke bygge din egen agent eller sætte flere agenter op.

### Gør arbejdet overskueligt

- Brug en separat Git-branch, fx `workshop-agent`, og lav et commit af udgangspunktet, før agenten ændrer filer. Brug eventuelt et lille selvstændigt øvelsesprojekt.
- Lad værktøjet spørge, før det kører kommandoer, hvor denne indstilling findes. Læs handlingen før du godkender den. En prompt erstatter ikke værktøjets indstillinger for tilladelser.
- Giv agenten den relevante kode og kravene. Del kun materiale, du må bruge i værktøjet; undlad fx adgangskoder og personoplysninger.
- Bed agenten holde sig til få filer og simple Java-konstruktioner. Stop den, hvis opgaven vokser ud over det aftalte.

## Opgaver

Opret et dokument til din aflevering. Gem kun de få uddrag og screenshots, opgaverne beder om. Du skal ikke aflevere hele samtalen med agenten.

### Opgave 1: Beskriv opgaven, før du spørger agenten

Vælg **én lille ændring** i semesterprojektet, fx en metode til at afvise en ugyldig reservation, en beregning eller en søgning i en liste. Afgræns den til 1–3 klasser, og vælg noget, du selv forstår reglerne for. Du skal kunne køre og teste ændringen uden at bygge resten af projektet færdigt.

Hvis du mangler en passende opgave, så brug denne case i et nyt Java-projekt med en almindelig `Main`-klasse:

> Lav en klasse `BookCopy`, som repræsenterer ét fysisk bogeksemplar. Den har en titel og en status for, om den er udlånt. Et nyt eksemplar er ledigt.
>
> Metoden `borrow()` returnerer `true` og markerer eksemplaret som udlånt, hvis det er ledigt. Hvis det allerede er udlånt, returnerer metoden `false`, og tilstanden er uændret.
>
> Metoden `returnBook()` gør eksemplaret ledigt og har i denne første version returtypen `void`. Metoden `isBorrowed()` giver den aktuelle status. Lav en simpel `Main`, som demonstrerer handlingerne. Der skal ikke være database, brugergrænseflade eller eksterne biblioteker.

**Skriv selv, inden du bruger AI:**

1. Opgavens formål med 2–3 sætninger og navnene på de klasser, der er relevante.
2. Tre konkrete krav, som resultatet skal opfylde, og hvad agenten ikke skal ændre.
3. Mindst tre afprøvninger med forventet resultat: et normalt tilfælde, en afvisning eller ugyldig handling og et grænsetilfælde eller et forløb med flere kald.

I bibliotekscasen kan du afprøve første udlån, gentaget udlån samt aflevering efterfulgt af et nyt udlån. Beskriv også objektets forventede tilstand, så kontrollen ikke kun handler om tekst i konsollen.

> [!IMPORTANT]
> Gem kravene og de forventede resultater i dokumentet, før du går videre. De skal bruges til at vurdere agentens løsning.

### Opgave 2: Giv agenten en afgrænset opgave

Åbn dit projekt i agentværktøjet. Start med at bede om en kort plan. Hvis værktøjet har en særskilt Plan-funktion, kan du bruge den; ellers kan du bede om planen i chatten.

Tilpas dette eksempel med dine egne krav og filnavne:

```text
Jeg er på 1. semester og arbejder i Java. Jeg kender klasser, objekter,
konstruktører, indkapsling, metoder, if/else og løkker.

Min opgave er: [beskriv den lille ændring].
Relevante filer og klasser: [angiv dem].
Krav og forventede resultater: [indsæt dine krav og afprøvninger].

Brug projektets eksisterende stil og simple Java-konstruktioner.
Tilføj ikke eksterne biblioteker, og ændr ikke andre dele af projektet.
Læs den relevante kode, og giv mig først en plan på højst fem punkter.
Skriv dine antagelser, og spørg, hvis et krav er uklart.
Vent med at ændre filer, til jeg har vurderet planen.
```

Læs planen: Passer den til dine krav? Foreslår den unødvendige klasser eller noget, I ikke har lært? Ret eventuelle misforståelser med en opfølgende besked.

Vælg derefter **Agent**, og bed den udføre den afgrænsede plan. Følg dens arbejde, og se, hvilke filer den læser og ændrer. Hvis den forsøger at løse mere end aftalt, skal du stoppe og præcisere opgaven.

> [!IMPORTANT]
> Gem din opgaveprompt som tekst, et kort uddrag af planen og ét screenshot, der viser agentens arbejde med projektfilerne. Skriv 2–3 linjer om, hvorfor du accepterede eller ændrede planen, og nævn én handling, agenten udførte med et værktøj ud over at skrive et chatsvar.

### Opgave 3: Gennemgå og afprøv koden

Åbn oversigten over ændrede filer i dit IDE eller Git. Sammenlign før og efter; denne sammenligning kaldes en **diff**.

1. Læs alle ændringer i de berørte klasser. Kontrollér kravene, og se efter ændringer uden for opgaven.
2. Vælg to konkrete steder i koden. Forklar, hvorfor de opfylder et krav, skal rettes eller skal fjernes. Hvis alt ser korrekt ud, er to begrundede godkendelser nok; du skal ikke opfinde fejl.
3. Kør selv programmet med afprøvningerne fra opgave 1. Brug en simpel `main`-metode eller JUnit, hvis du allerede kender det. Se både på returværdier og ændringer i objektets tilstand, hvor det er relevant.
4. Hvis noget fejler, så beskriv forventet og faktisk resultat. Ret selv, eller giv agenten en præcis besked om fejlen. Gennemgå rettelsen, og kør afprøvningerne igen.

Udfyld denne tabel med dine egne resultater:

| Afprøvning | Starttilstand og input/metodekald | Forventet resultat | Faktisk resultat | Bestået? |
| --- | --- | --- | --- | --- |
| Normalt tilfælde | ... | ... | ... | ... |
| Afvisning eller ugyldig handling | ... | ... | ... | ... |
| Grænsetilfælde eller flere kald | ... | ... | ... | ... |

Behold din egen vurdering af kravene. Hvis agenten også laver tests, skal du kontrollere deres forventninger mod kravene, før du bruger dem som dokumentation.

> [!IMPORTANT]
> Gem tabellen, dine to kodevurderinger og ét screenshot af en faktisk kørsel med tydelige resultater. Angiv, om fejl blev rettet af dig eller agenten. Lav et commit af den gennemgåede løsning, før du fortsætter.

### Opgave 4: Afsluttende kontrol uden AI

Luk agentchatten, og slå AI-kodeforslag fra under denne opgave. Du må se din egen kode og bruge almindelig Java-dokumentation.

**A. Forklar en metode**

Vælg en metode, som agenten har skrevet eller ændret. Indsæt metoden i dokumentet som tekst, og forklar med egne ord:

- Hvad metoden modtager og returnerer.
- Hvilke felter eller objekter den læser og ændrer.
- Hvordan et normalt kald og en afvisning eller et grænsetilfælde forløber med konkrete værdier.

**B. Lav selv en lille ændring**

Vælg en ændring i en regel eller metodens opførsel, og skriv det nye forventede resultat, før du koder. Det skal være en reel ændring i funktionaliteten; omdøbning eller en kommentar er ikke nok.

I bibliotekscasen ændrer du `returnBook()`, så den returnerer en `boolean`: `true`, når et udlånt eksemplar afleveres, og `false`, når eksemplaret allerede var ledigt. Kontrollér også, at eksemplaret er ledigt efter begge kald.

Bruger du semesterprojektet, kan du fx ændre en øvre grænse og håndhæve den eller lade en metode returnere, om en handling faktisk blev udført. Hold ændringen lille.

1. Lav ændringen selv, og tilpas eventuelle kald til metoden.
2. Afprøv både den ændrede og den afviste situation. Kør også de tidligere afprøvninger, så du opdager utilsigtede ændringer.
3. Gem et kort før/efter-udsnit, dine forventede og faktiske resultater og en forklaring på 3–5 linjer. Lav et separat commit.

> [!IMPORTANT]
> Begge dele udføres uden AI-hjælp og dokumenteres individuelt. Hvis du går i stå, kan du vende tilbage til opgave 3 for at lære mere. Vælg derefter en ny tilsvarende lille ændring til kontrollen, og angiv, hvad du fik hjælp til undervejs.

### Opgave 5: Brug i semesterprojektet

Skriv 5–8 linjer med udgangspunkt i dit eget semesterprojekt:

- Nævn en konkret, afgrænset opgave, du vil lade en agent hjælpe med, og den kontekst, du vil give den.
- Beskriv, hvordan du og gruppen vil kontrollere kode og tests, inden ændringen kommer ind i jeres fælles kode.
- Forklar, hvad du gør, hvis agenten skriver noget, du ikke kan forklare.

Har du brugt øvelsescasen, skal du her overføre arbejdsformen til en mulig opgave i semesterprojektet.

## Aflevering

Aflever **én individuel PDF** på Itslearning. 
PDF'en skal kunne læses og vurderes uden adgang til din agentchat eller dit repository.

Brug denne rækkefølge:

1. **Opgave og krav:** Kort kontekst, relevante klasser, tre krav og navnet på dit agentværktøj.
2. **Samarbejdet med agenten:** Din prompt, et kort planuddrag, din vurdering og ét screenshot af agentens arbejde med filer.
3. **Kodegennemgang og test:** To konkrete kodevurderinger, den udfyldte testtabel og ét screenshot af din kørsel.
4. **Egen forståelse:** Metoden med din forklaring, din ændring uden AI med før/efter-udsnit og de tilhørende testresultater.
5. **Semesterprojektet:** Dine 5–8 linjer om fremtidig brug.

Indsæt korte kodeudsnit som læselig tekst. Gem kode og commits i dit repository; et link kan medtages som supplement, men de nødvendige uddrag og resultater skal stå i PDF'en.

Deadline og formalia kan ses på Itslearning.

### Kilder til værktøj og adgang

Værktøjsoplysningerne er kontrolleret den 15. september 2026. Adgang, forbrugsgrænser og menuer kan ændre sig; se de officielle vejledninger ved opsætning.

- [Microsoft: Agent Builder i Microsoft 365 Copilot](https://learn.microsoft.com/en-us/microsoft-365-copilot/extensibility/agent-builder)
- [Microsoft: Copilot-produkter og separat licensering](https://learn.microsoft.com/en-us/microsoft-365/copilot/microsoft-365-copilot-overview#other-copilot-products)
- [GitHub: Planer og studenteradgang](https://docs.github.com/en/copilot/get-started/plans)
- [GitHub: Installation i dit IDE](https://docs.github.com/en/copilot/how-tos/set-up/install-copilot-extension?tool=jetbrains)
- [GitHub: Brug Copilot og Agent i dit IDE](https://docs.github.com/en/copilot/how-tos/chat-with-copilot/chat-in-ide?tool=jetbrains)
