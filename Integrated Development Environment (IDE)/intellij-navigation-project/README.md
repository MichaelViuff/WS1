# IntelliJ Navigation – øvelsesprojekt

**Formål:** Træn udelukkende *navigation* i IntelliJ IDEA – uden at ændre koden. Opgaverne er designet til at aktivere genveje som:

- **Go to Declaration / Implementation / Super**: Ctrl+B / Ctrl+Alt+B / Ctrl+U (⌘B / ⌥⌘B / ⌘U)
- **Type/Method/Call Hierarchy**: Ctrl+H / Ctrl+Shift+H / Ctrl+Alt+H (⌘H / ⇧⌘H / ⌥⌘H)
- **Find Usages**: Alt+F7 (⌥F7)
- **Search Everywhere**: Shift Shift
- **Go to Class/File/Symbol**: Ctrl+N / Ctrl+Shift+N / Ctrl+Alt+Shift+N (⌘O / ⇧⌘O / ⌥⌘O)
- **Recent Files**: Ctrl+E (⌘E)
- **Switcher (tabs & tools)**: Ctrl+Tab
- **Project tool window & select current file**: Alt+1, Alt+F1 (⌘1, Alt+F1)
- **Quick Definition / Quick Documentation**: Ctrl+Shift+I / Ctrl+Q (⌘Y / Ctrl+J)
- **Back/Forward**: Ctrl+Alt+Left/Right (⌘[ / ⌘])

---

## Opgaver (navigation only)

### 1) Følg et *borrow* kald igennem lagene
- Åbn testen `LoanFlowTest.borrow_reduces_copies` (Ctrl+Shift+N → skriv navnet).
- Gå til `LoanService.borrow` (Ctrl+B fra testens service-kald).
- Hop videre til `BookRepository.findByIsbn` (Ctrl+B) og se **implementeringerne** (Ctrl+Alt+B). Skift mellem `InMemoryBookRepository` og `SqlBookRepository`.
- Brug **Back/Forward** for at gå mellem dine spor.

### 2) Find usages før du ændrer (uden at ændre!)
- Stå på `Notifier`-interfacet og brug **Alt+F7** for at se alle usages.
- Filtrér i popup’en (skriv for at søge) og åbn en anvendelse i `LoanService`.

### 3) Forstå polymorfi med hierarkier
- Åbn `LoanPolicy` og brug **Type Hierarchy** (Ctrl+H) → find `StandardLoanPolicy` og `ChildrenLoanPolicy`.
- Åbn `LoanService.borrow` og brug **Call Hierarchy** (Ctrl+Alt+H) på metoden for at se hvem der kalder den (fx tests). Brug **Method Hierarchy** (Ctrl+Shift+H) på `maxDays`-metoden.

### 4) Vælg hurtigt i projektet
- Brug **Alt+1** for at fokusere *Project*. Skriv for at søge i træet. Brug **Alt+F1** → *Project View* for at markere den aktuelle fil i træet.
- Åbn *Recent Files* (Ctrl+E) og genbesøg de filer du har haft åbne.

### 5) Søg alt, overalt
- Brug **Shift Shift** til at åbne *Search Everywhere*. Find `ReservationStatus`-enum og `TextUtils`. Brug piletaster og Enter for at åbne.
- Brug **Quick Definition** (Ctrl+Shift+I) på `normalizeTitle`-kaldet i `LoanService` og **Quick Documentation** (Ctrl+Q) på `send`-kaldet i samme klasse.

### 6) Dyk i arv og *super*
- Find klassen `BaseRepository` og åbn dens `findById`-metode. Naviger til **subclasses** (Ctrl+Alt+B fra en abstrakt metode) og tilbage til **super** (Ctrl+U) fra implementeringerne.

### 7) Faner og linjer
- Skift mellem åbne faner med **Alt+Left/Right** og hop til specifik linje (Ctrl+G) i `LoanService`.

**Aflevering (kort note):** Skriv 5–10 linjer om hvilke navigationstricks der hjalp dig mest i denne opgave, og i hvilke situationer du ville bruge dem i et rigtigt projekt.

---

## Ingen kodeændringer i denne øvelse
Du må gerne eksperimentere lokalt, men pensum for denne del er navigation – ikke refaktorering.
