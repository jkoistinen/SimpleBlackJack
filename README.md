# SimpleBlackJack
Simplified Java OOP based BlackJack game.

Examinationsuppgift OOP

Ett kortspel

Objektorienterad programmering handlar ofta om att modellera objekt från verkligheten i kod. Tärningar och tärningsspel är ett exempel. Ett annat är spelkort och kortspel. Examinationsuppgiften är att ta fram ett kortspel med objektorienterad programmering i Java som spelas i konsolen.

Du väljer mellan om du vill ta fram en förenklad version av spelet Tjugoett eller ett annat kortspel.

Förenklad Tjugoett

Tjugoett (21) är den svenska versionen av vad som kanske är det populäraste kortspelet på casinon – Black Jack. Spelet går ut på att summan av ens kort ska vara så nära 21 som möjligt men inte över. Till uppgiften använder du dig av något förenklade regler jämfört med Tjugoett och Black Jack.

Regler

Spelet spelas med en vanlig kortlek om 52 spelkort. En spelare (användaren) spelar mot en dealer (datorn). Spelet börjar med att kortleken blandas, därefter delas två kort ut till spelaren och två kort till dealern.

Dealern visar sitt första kort för spelaren.
Spelaren får sedan välja mellan att ta ett nytt kort eller stanna. 
Tar man ett nytt kort och summan är… 
…mindre än 21 så får man på nytt välja mellan att ta ett nytt kort eller stanna.
…21 så vinner spelaren.
…mer än 21 så vinner dealern.
Väljer man att stanna blir det dealerns tur: 
Dealern visar sitt gömda kort för spelaren.
Så länge dealerns summa är mindre än 17 så tar dealern ett nytt kort.
Om summman av dealerns kort blir 21 så vinner dealern.
Om summan av dealerns kort blir mer än 21 så vinner spelaren.
Om båda stannat och ingen fått mer än 21 så vinner den med högst summa.
Har båda lika summa vinner dealern.
Summan av ens kort beräknas som följande:

Ess är värt 1
Korten från 2 till och med 10 är värda sin valör
Knekt, Dam, och Kung är värda 10

Betygsbedömning

G

Spelet kompilerar och går att spela utan buggar 
Onödig kodupprepning ska i största mån undvikas och spelet ska vara uppdelat på lämpliga klasser 
Arv används på lämpligt ställe 
Koden är korrekt indenterad och namn på variabler, metoder och klasser följer rådande riktlinjer 
Kort ska presenteras för användaren med både färg och valör, t.ex: Hjärter 3 
Spelet ska meddela vem som vunnit och tilldela en poäng till vinnaren

VG

Förutom att du uppnått kraven för G har du även följande: 
Spelet börjar om och fortsätter tills spelaren väljer att avsluta det, när spelet avslutas visas spelarens och dealerns poäng 
All felaktig inmatning hanteras av spelet 
Du använder dig av enum i Java för spelkortens färg och valör 
Du implementerar gränssnittet Comparable på lämpliga klasser

Ordlista

Färg (suit)
Kortets kategori: ♥ hjärter (hearts), ♦ ruter (diamonds), ♠ spader (spades), ♣ klöver (clubs)
Kulör
Uppdelning av röda eller svarta kort, ej att förknippa med färg
Svit
Annat ord för färg
Valör (rank)
Egenskap hos kort: ess (ace), 2, 3, 4, 5, 6, 7, 8, 9, 10, knekt (jack), dam (queen), kung (king)
