# Astah og UML

I dette modul vil du lære at bruge Astah til at tegne og forklare enkle UML-diagrammer til et softwareprojekt.

Du arbejder med en lille del af dit semesterprojekt og samler dine resultater i en kort PDF. Du må gerne drøfte diagrammerne med din gruppe, men du skal selv udføre øvelserne og aflevere dine egne forklaringer.

## Læringsmål

Efter at have gennemført dette modul har du opnået følgende færdigheder:

- Du kan oprette, redigere og eksportere diagrammer i Astah.
- Du kan beskrive en funktion med et use case-diagram, en use case-beskrivelse og et aktivitetsdiagram.
- Du kan skelne mellem en domænemodel og et klassediagram.
- Du kan vise objekters samarbejde i et sekvensdiagram og forbinde det med dit klassediagram.
- Du kan forklare dine valg med udgangspunkt i det system, du modellerer.

## Forberedelse

Hav Astah klar efter anvisningerne fra undervisningen. Du skal kunne oprette og gemme et diagram. Et andet UML-værktøj kan også bruges, men vejledningerne nedenfor viser Astah.

Modulet supplerer undervisningen i analyse og design. Brug begreber og notation fra den undervisning, og brug læringsstierne til at finde ud af, hvordan du tegner dem i værktøjet.

### Læringsstier

De seks [læringsstier](https://troelsmortensen.github.io/Codelabs2/) er primært værktøjsvejledninger med eksempler. De indeholder ikke i sig selv en samlet projektopgave eller en afsluttende aflevering. **Det er opgaverne i dette modul, du skal løse.** Brug stierne undervejs, og prøv de relevante trin i dit eget diagram.

| Område | Læringssti | Bruges i |
| --- | --- | --- |
| Analyse | [Use case diagrams](https://troelsmortensen.github.io/Codelabs2/article/TroelsMortensen/UML%2FAnalysis%20artefacts%2FUse%20Case%20Diagrams) | Opgave 2 |
| Analyse | [Use case descriptions](https://troelsmortensen.github.io/Codelabs2/article/TroelsMortensen/UML%2FAnalysis%20artefacts%2FUse%20case%20descriptions) | Opgave 2 |
| Analyse | [Activity diagrams](https://troelsmortensen.github.io/Codelabs2/article/TroelsMortensen/UML%2FAnalysis%20artefacts%2FActivity%20diagrams) | Opgave 3 |
| Analyse | [Domain model](https://troelsmortensen.github.io/Codelabs2/article/TroelsMortensen/UML%2FAnalysis%20artefacts%2FDomain%20Model) | Opgave 4 |
| Design | [Class diagrams](https://troelsmortensen.github.io/Codelabs2/article/TroelsMortensen/UML%2FDesign%20artefacts%2FClass%20Diagrams) | Opgave 5 |
| Design | [Sequence diagrams](https://troelsmortensen.github.io/Codelabs2/article/TroelsMortensen/UML%2FDesign%20artefacts%2FSequence%20diagrams) | Opgave 5 |

Du skal arbejde med alle seks typer materiale, men kun bruge de elementer, din lille opgave har behov for. Arv, interfaces, `include` og `extend` er eksempelvis ikke krav til afleveringen.

## Opgaver

Opret et dokument, hvor du løbende indsætter diagrammer og svar under opgavernes overskrifter. Gem også dine redigerbare diagrammer, så du kan rette dem senere.

### Opgave 1: Vælg en lille del af et system

Vælg én funktion fra dit semesterprojekt, eksempelvis at oprette en reservation, udlåne en genstand eller tilmelde en deltager. Funktionen skal have et normalt forløb og mindst én situation, hvor handlingen afvises.

Afgræns arbejdet til cirka 3–5 centrale begreber og 2–3 brugerfunktioner omkring den valgte funktion. Du skal ikke modellere hele semesterprojektet.

**Hvis dit projekt ikke er klar, bruger du denne øvelsescase:**

> Et lille bibliotek har medlemmer og fysiske bogeksemplarer. En bibliotekar bruger systemet til at registrere udlån og afleveringer og se, om et eksemplar er ledigt.
>
> Et udlån forbinder ét medlem med ét bogeksemplar og har en udlånsdato. Et medlem og et eksemplar kan hver have flere udlån over tid. Et eksemplar må højst have ét aktivt udlån ad gangen.
>
> Når bibliotekaren forsøger at udlåne et ledigt eksemplar til et eksisterende medlem, registreres udlånet. Hvis eksemplaret allerede er udlånt, afvises handlingen. Antag i øvelsen, at medlem og eksemplar allerede er oprettet.
>
> Brug **Registrer udlån** som den funktion, du følger gennem opgaverne.

> [!IMPORTANT]
> Skriv 4–6 linjer om systemet, den valgte funktion og de regler, der bestemmer, om handlingen lykkes eller afvises. Angiv, om du bruger eget projekt eller øvelsescasen.

### Opgave 2: Use case-diagram og beskrivelse

Brug læringsstierne om use case-diagrammer og use case-beskrivelser.

1. Tegn et use case-diagram med en navngivet systemgrænse, mindst én aktør uden for grænsen og 2–3 use cases inden for grænsen.
2. Forbind aktørerne med de use cases, de deltager i.
3. Skriv en beskrivelse af den funktion, du valgte i opgave 1. Brug denne struktur:

| Punkt | Det skal du skrive |
| --- | --- |
| Navn | Samme navn som i diagrammet |
| Primær aktør | Hvem starter handlingen? |
| Forudsætninger | Hvad skal være opfyldt, inden handlingen starter? |
| Normalt forløb | Nummererede trin med aktørens handlinger og systemets svar |
| Alternativt forløb | Hvornår afvises handlingen, og hvad sker der så? Henvis til det relevante trin. |
| Resultat | Hvad er ændret efter succes, og hvad er uændret efter afvisning? |

Beskriv brugerens og systemets handlinger uden Java-metoder eller detaljer om knapper. Beskrivelsen må gerne skrives direkte i dit dokument; den behøver ikke ligge i Astah.

> [!IMPORTANT]
> Indsæt diagrammet og use case-beskrivelsen i dit dokument.

### Opgave 3: Aktivitetsdiagram

Brug læringsstien om aktivitetsdiagrammer til at tegne forløbet fra din use case-beskrivelse.

- Vis start, aktiviteter, pile og afslutning.
- Vis mindst én beslutning med tydelige betingelser på pilene, fx `[ledigt]` og `[allerede udlånt]`.
- Vis både det normale forløb og afvisningen. Begge skal kunne følges frem til en afslutning.

> [!IMPORTANT]
> Indsæt diagrammet. Skriv 2–3 linjer om, hvor dit alternative forløb fra opgave 2 findes i diagrammet.

### Opgave 4: Domænemodel

Brug læringsstien om domænemodeller.

1. Tegn 3–5 centrale begreber fra dit valgte område med relevante attributter.
2. Forbind begreberne med navngivne relationer og angiv multiplicitet i begge ender. Multiplicitet fortæller, hvor mange der kan være knyttet til hinanden, fx `1` eller `0..*`.
3. Vis begreber fra det område, systemet handler om. Java-typer, metoder, `public`/`private` og tekniske klasser som en controller hører ikke hjemme her.

I bibliotekscasen skal modellen kunne vise sammenhængen mellem medlem, bogeksemplar og udlån. Skeln mellem udlån over tid og reglen om højst ét aktivt udlån; en forretningsregel kan tilføjes som en note.

> [!IMPORTANT]
> Indsæt modellen. Vælg én relation, og forklar begge multipliciteter i almindeligt sprog med et konkret eksempel.

### Opgave 5: Klassediagram og sekvensdiagram

Brug læringsstierne om klasse- og sekvensdiagrammer.

**Klassediagram:** Tegn et lille designudsnit med cirka 3–5 klasser, som kan understøtte din valgte funktion. Vis relevante felter med typer og synlighed, metoder med parametre og returtyper samt relationer mellem klasserne. Du må tilføje en klasse, der koordinerer handlingen, hvis dit design har brug for det.

**Sekvensdiagram:** Vis det normale forløb for den samme funktion som et samarbejde mellem mindst to objekter fra klassediagrammet. Navngiv livslinjer som fx `eksemplar:BookCopy`. Vis metodekald i rækkefølge og relevante retursvar. En eventuel aktør kan vises som den, der starter forløbet.

Kontrollér, at de metoder, der kaldes i sekvensdiagrammet, findes på modtagerens klasse i klassediagrammet. Afvisningen er allerede vist i aktivitetsdiagrammet; du behøver ikke også vise den i sekvensdiagrammet.

Du skal ikke implementere Java-kode til denne aflevering.

> [!IMPORTANT]
> Indsæt begge diagrammer. Forklar med 3–5 linjer og eksempler fra dine egne diagrammer, hvad domænemodellen viser, og hvad klassediagrammet tilføjer.

### Opgave 6: Afsluttende kontrol

Gennemgå selv dine resultater, og ret eventuelle uoverensstemmelser.

1. Udpeg den samme funktion i use case-diagrammet, beskrivelsen, aktivitetsdiagrammet og sekvensdiagrammet. Kontrollér, at navnene og handlingerne passer sammen.
2. Vælg ét metodekald fra sekvensdiagrammet. Angiv afsender, modtager og metoden på modtagerens klasse i klassediagrammet.
3. Besvar uden AI: Hvilken fejl i systemets opførsel kan opstå, hvis kontrollen ved din beslutning i aktivitetsdiagrammet fjernes? Brug din konkrete case.

> [!IMPORTANT]
> Skriv tre korte svar i dokumentet. Angiv også én uoverensstemmelse, du rettede. Hvis du ikke fandt nogen, skal du i stedet beskrive én konkret sammenhæng, du kontrollerede.

## Aflevering

Aflever én individuel PDF på Itslearning.
Brug overskrifterne fra opgaverne. 

Diagrammer skal være læselige; eksportér dem gerne som SVG og indsæt dem i dokumentet før PDF-eksport. Kontrollér den færdige PDF.

PDF'en skal indeholde din casebeskrivelse, de fem diagrammer, use case-beskrivelsen og dine korte svar fra opgaverne. Du skal ikke vedlægge screenshots af alle trin i læringsstierne. Gem dine redigerbare diagrammer selv; PDF'en skal kunne vurderes uden at åbne Astah eller dit projekt.

Deadline og formalia kan ses på Itslearning.

