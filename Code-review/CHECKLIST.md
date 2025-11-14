
# Kodereview-tjekliste

## Kørbarhed
- Projektet kører uden fejl (ingen exceptions ved normal brug)
- Ingen åbenlyse runtime-fejl (fx null-pointer, index out of bounds)

## Forståelighed
- Variabel- og metodenavne er meningsfulde og beskriver formålet
- Ingen død kode (ubrugte variabler, metoder eller kommentarer)
- Ingen overflødige eller misvisende kommentarer
- Koden er konsistent indrykket og formatteret

## Korrekthed
- Edge cases håndteres (fx tom liste, null-værdier, 0, negative tal)
- Ingen off-by-one fejl i loops
- Betingelser er korrekte (fx >= vs >)
- Input valideres, hvor det giver mening (fx undgå invalid data)

## Kvalitet
- Duplikeret kode er fjernet eller samlet i en metode
- Magic numbers er erstattet med navngivne konstanter
- Simpel fejlhåndtering er tilføjet (fx try/catch ved filadgang)
- Ingen hardcodede værdier, hvor konfiguration er oplagt