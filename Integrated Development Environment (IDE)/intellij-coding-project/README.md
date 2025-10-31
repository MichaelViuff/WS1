# IntelliJ Coding – refactor & generation øvelser

---

**Formål:** Øv de vigtigste *coding*-genveje i IntelliJ IDEA.

---

## Opgaver

### 1) **Quick Fix (Alt+Enter / ⌥Enter)**  
-   Åbn `PersonTest` og se at kaldet til `printDetailsToConsole` (mangler). Brug *Alt+Enter → Create method* til at generere stub (placering i `Person`-klassen). Lad bare implementationen af metoden have void retur type og ingen body.

### 2) **Generate (Alt+Insert / ⌘N)**  
- Åbn `Person` klassen. 
- Generér en **Constructor** der tager imod alle 3 attributter.
- Generér **getters/setters** for alle 3  attributter.

### 3) **Reformat Code (Ctrl+Alt+L / ⌥⌘L)**  
-   `PersonList` er bevidst dårligt indrykket og med ujævn whitespace. Reformatér filen.

### 4) **Complete Current Statement (Ctrl+Shift+Enter / ⇧⌘⏎)**
-   I `PersonList.addPerson` er der en kommentar. Prøv at skrive samme linje, men brug genvejen, til automatisk at sætte parenteser og semi-kolon.

### 5) **Extract Variable (Ctrl+Alt+V / ⌃⌥V)**  
-   I `PersonList.changePersonName` bruges udtrykket `persons.get(i)` to gange. Træk det ud i en variabel i stedet.

### 6) **Extract Constant (Ctrl+Alt+C / ⌃⌥C)**  
-   I `PersonList.findReallyOldPerson` bruger metoden alderen 100 som definition på "really old". Udtræk denne “magiske værdi” til en `static final` konstant i stedet.

### 7) **Extract Parameter (Ctrl+Alt+P / ⌃⌥P)**  
-   I `PersonList.findPersonByAge` bruger metoden altid alderen 10 som værdi. Træk denne ud til en parameter til metoden i stedet.

### 8) **Extract Method (Ctrl+Alt+M / ⌃⌥M)**  
-   I `PersonListTest` tilføjes 3 `Person` objekter til en `PersonList`. Flyt disse 3 `.add`-kald til en separat metode.

### 9) **Inline (Ctrl+Alt+N / ⌃⌥N)**  
-   I `PersonList.isEmpty` introduceres variablen `listIsEmpty` der derefter bruges i if-statement. Den er overflødig, inline den ved at markere den i if-statement og brug genvejen.
- Udtrykket kan derefter forsimples yderligere, brug Quick Fix (Alt+Enter / ⌥Enter) til det.

### 10) **Rename (Shift+F6 / ⇧F6)**  
-   I `PersonList` findes metoden `printAllThePersonsByCallingTheirToStringMethodForEachOneAndPrintingItToConsole`. Den bliver brugt i `PersonListTest`-klassen. 
- Omdøb metoden, og kontrollér at den også skiftede navn i `PersonListTest`.

**Aflevering (kort note):** Skriv 5–10 linjer om hvilke genveje/funktioner der hjalp dig mest i denne opgave, og i hvilke situationer du ville bruge dem i et rigtigt projekt.